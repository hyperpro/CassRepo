# from client_sender import ClientSender
# from constant import QueryType
import time
import numpy as np
# import workloadprofile as wlp
import testcasegenerator as tcg
import getexplatency as gpl
import bipartitegraph as bipart
import getSession as gs
import test
import sys
import math

replica_num = 3


def get_expected_qoe(qoecurve, burst_array, burst_latencies, workload, nbk_latency):

    bk_latency = gpl.get_avg_delay(workload, burst_array, burst_latencies)
    expected_qoe = gs.QoECurve(bk_latency + nbk_latency, qoecurve)

    return expected_qoe


def GreedySLOPE(nbk_delay, bk_workload, burst_array, burst_latencies, qoe_curve):

    nbk_delay_copy = nbk_delay.copy()
    bk_workload_copy = bk_workload.copy()

    nbk_delay_copy.sort(key = lambda ele: gs.QoESlope(ele, qoe_curve), reverse = True)
    bk_workload_copy.sort()

    answer_qoe = 0.0
    for i in range(0, len(nbk_delay_copy)):
        bk_delay = gpl.get_avg_delay(bk_workload_copy[i], burst_array, burst_latencies)
        answer_qoe += gs.QoECurve(nbk_delay_copy[i] + bk_delay, qoe_curve)

    return answer_qoe


def make_graph(nb_delay, qoe_curve, burst_array, burst_latencies, task_allocation):

    task_num = int(np.sum(task_allocation))
    b_workload = []

    for t_index in range(0, len(task_allocation)):
        wk = task_allocation[t_index]
        for i in range(0, wk):
            b_workload.append(wk)

    w = []
    for i in range(0, task_num):
        w.append([])
        for j in range(0, task_num):
            w[i].append(0.0)

    for i in range(0, task_num):
        for j in range(0, task_num):
            w[i][j] = get_expected_qoe(qoecurve=qoe_curve, burst_array=burst_array, burst_latencies=burst_latencies, workload=b_workload[j], nbk_latency=nb_delay[i])

    answer_qoe_slope = GreedySLOPE(nbk_delay=nb_delay, bk_workload =b_workload, burst_array=burst_array, burst_latencies=burst_latencies, qoe_curve = qoe_curve)
    answer_qoe_slope = answer_qoe_slope/task_num

    matchx, answer_qoe_optimal = bipart.bipartite_graph(w)
    answer_qoe_optimal = answer_qoe_optimal/task_num

    return answer_qoe_slope, matchx, nb_delay, b_workload, answer_qoe_optimal


def percentage_to_tasknum(task_percentage, workload):

    reqs_num = []

    for index in range(0, len(task_percentage) - 1):
        wl = math.floor(workload * task_percentage[index] / 100.0)
        reqs_num.append(wl)

    reqs_num = np.array(reqs_num)
    reqs_num = np.append(reqs_num, workload - np.sum(reqs_num))

    return reqs_num


def equal_allocation(task_num, nbd_delay, qoe_curve, burst_array, burst_latencies):
    answer_qoe = 0.0
    workload = int(task_num/3)
    for nbd in nbd_delay:

        bd = gpl.get_avg_delay(workload, burst_array, burst_latencies)
        answer_qoe += gs.QoECurve(nbd+bd, qoe_curve)

    answer_qoe = answer_qoe/task_num
    return answer_qoe


def build_match_table(time_array):

    qoe_filename = 'qoe_bins'
    qoe_curve = bipart.getcurve(qoe_filename)
    burst_array, burst_latencies = gpl.intialize_data()


    '''
        workload partition
    '''
    percentage_step = 0.3
    workload = len(time_array)

    best_matching_qoe = 0.0
    best_slope_qoe = 0.0

    workload_allocation_percentage = np.array([0.0] * replica_num)

    for para_index in range(0, replica_num - 1):

        # minimal percentage for replica #para_index
        min_percentage = 1.0
        if para_index > 0:
            min_percentage = workload_allocation_percentage[para_index - 1]

        # maximal percentage for replica #para_index
        max_percentage = (100 - np.sum(workload_allocation_percentage[0:para_index])) / (replica_num - para_index)
        max_percentage = math.floor(max_percentage * 1000) / 1000

        current_percentage = max_percentage

        while current_percentage >= min_percentage:

            workload_allocation_percentage[para_index] = current_percentage
            rest_share = (100 - np.sum(workload_allocation_percentage[0: para_index + 1])) / (
                        replica_num - para_index - 1)

            for w_index in range(para_index + 1, replica_num):
                workload_allocation_percentage[w_index] = rest_share
            task_allocation = percentage_to_tasknum(workload_allocation_percentage, workload)

            t_slope_qoe, matching, nbk_delay, bk_workload, t_matching_qoe = make_graph(time_array, qoe_curve, burst_array, burst_latencies, task_allocation)

            print(t_matching_qoe, t_slope_qoe, task_allocation, workload_allocation_percentage)

            if best_slope_qoe < t_slope_qoe:
                best_slope_qoe = t_slope_qoe

            if t_matching_qoe < best_matching_qoe:
                current_percentage += percentage_step
                print('Start Next Replica')
                break
            else:
                best_matching_qoe = t_matching_qoe
                current_percentage -= percentage_step

        workload_allocation_percentage[para_index] = current_percentage

    workload_allocation_percentage[replica_num - 1] = 100 - np.sum(workload_allocation_percentage[0: (replica_num - 1)])

    equal_qoe = equal_allocation(workload, time_array, qoe_curve, burst_array, burst_latencies)

    print('Default Allocation:', equal_qoe, 'Slope allocation:', best_slope_qoe, 'Our QoE',best_matching_qoe, 'Slope gain over default', (best_slope_qoe-equal_qoe)/equal_qoe, 'Our gain over default', (best_matching_qoe-equal_qoe)/equal_qoe)

    return 0


def sys_main(thr):

    '''
    DEBUG
    need to print out the performance gain
    '''

    time_array = tcg.case_generator(150)
    build_match_table(time_array)

    '''
    DEBUG
    '''

    # sender.shutdown()
    return 0


if __name__ == '__main__':

    para = sys.argv[1]
    if para == 'overall':
        thr = 120
    else:
        thr = int(para)

    sys_main(para)

    sys_main(0)
    print('Processing ends.')


