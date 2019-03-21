from client_sender import ClientSender
from constant import QueryType
import time
import numpy as np
import workloadprofile as wlp
import testcasegenerator as tcg
import getexplatency as gpl
import bipartitegraph as bipart
import getSession as gs
import test
import sys
import math
import random


# you should put the IPs of replicas in the hosts
hosts = ['155.98.39.107', '155.98.39.108', '155.98.39.118']
sender = ClientSender(hosts)

replica_num = 3


def get_expected_qoe(qoecurve, burst_array, burst_latencies, workload, nbk_latency):

    bk_latency = gpl.get_avg_delay(workload, burst_array, burst_latencies)
    expected_qoe = gs.QoECurve(bk_latency + nbk_latency, qoecurve)

    return expected_qoe


def make_graph(nb_delay, qoe_curve, burst_array, burst_latencies, task_allocation):

    task_num = int(np.sum(task_allocation))
    b_workload = []
    b_replica_id = []

    for t_index in range(0, len(task_allocation)):
        wk = task_allocation[t_index]
        for i in range(0, wk):
            b_workload.append(wk)
            b_replica_id.append(t_index)

    w = []
    for i in range(0, task_num):
        w.append([])
        for j in range(0, task_num):
            w[i].append(0.0)

    for i in range(0, task_num):
        for j in range(0, task_num):
            w[i][j] = get_expected_qoe(qoecurve=qoe_curve, burst_array=burst_array, burst_latencies=burst_latencies, workload=b_workload[j], nbk_latency=nb_delay[i])

    matchx, answer_qoe_optimal = bipart.bipartite_graph(w)

    return matchx, b_replica_id, answer_qoe_optimal


def percentage_to_tasknum(task_percentage, workload):

    reqs_num = []

    for index in range(0, len(task_percentage) - 1):
        wl = math.floor(workload * task_percentage[index] / 100.0)
        reqs_num.append(wl)

    reqs_num = np.array(reqs_num)
    reqs_num = np.append(reqs_num, workload - np.sum(reqs_num))

    return reqs_num


def build_match_table(time_array):

    print('Start building match table.')

    qoe_filename = 'qoe_bins'
    qoe_curve = bipart.getcurve(qoe_filename)
    burst_array, burst_latencies = gpl.intialize_data()

    '''
        workload partition
    '''
    print('Start workload partition')
    percentage_step = 0.3
    workload = len(time_array)

    best_matching_qoe = 0.0

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


            matching, bk_id, t_matching_qoe = make_graph(time_array, qoe_curve, burst_array, burst_latencies, task_allocation)

            print('Expected our QoE:', t_matching_qoe, task_allocation, workload_allocation_percentage)

            if t_matching_qoe < best_matching_qoe:
                current_percentage += percentage_step
                # print('Start Next Replica')
                break
            else:
                best_matching_qoe = t_matching_qoe
                current_percentage -= percentage_step

        workload_allocation_percentage[para_index] = current_percentage

    workload_allocation_percentage[replica_num - 1] = 100 - np.sum(workload_allocation_percentage[0: (replica_num - 1)])
    task_allocation = percentage_to_tasknum(workload_allocation_percentage, workload)
    matching, bk_id, t_matching_qoe = make_graph(time_array, qoe_curve, burst_array, burst_latencies, task_allocation)

    match_table = {}
    for i in range(0, len(time_array)):
        match_table[time_array[i]] = bk_id[matching[i]]

    return match_table


def sys_main(thr):

    # wlp.build_profile(sender = sender, hosts=hosts)
    filename = 'time_interval_'+str(thr)+'.txt'
    time_array = np.loadtxt(filename)
    filename_table = 'table_' + str(thr) + '.txt'
    table_array = np.loadtxt(filename_table)

    match_table = build_match_table(table_array)
    # print(match_table)

    answer_qoe_gain = []
    real_answer_qoe_gain = []

    repeat_time = 100
    for times in range(0, repeat_time):
        print('Start our replica selection')
        for i in range(0, len(time_array)):
            nbk_delay = time_array[i][0]
            interval = time_array[i][1]
            host_id = match_table[nbk_delay]
            sender.sendOneRequest(hosts[host_id], QueryType.SCAN, interval, nbk_delay)

        our_latency = sender.getLatencies().copy()
        sender.clearLatencyTable()

        time.sleep(2)

        print('Start equal replica selection')
        random.seed(time.time())
        for i in range(0, len(time_array)):
            nbk_delay = time_array[i][0]
            interval = time_array[i][1]
            host_id = random.randint(0, 2)
            sender.sendOneRequest(hosts[host_id], QueryType.SCAN, interval, nbk_delay)

        equal_latency = sender.getLatencies().copy()
        sender.clearLatencyTable()

        print('Start qoe stat:')
        qoe_filename = 'qoe_bins'
        qoe_curve = bipart.getcurve(qoe_filename)

        equal_qoe = 0.0
        our_qoe = 0.0
        for i in range(0, len(time_array)):
            nbk_delay = time_array[i][0]
            equal_qoe += gs.QoECurve(equal_latency[nbk_delay] * 1000 + nbk_delay, qoe_curve)
            our_qoe += gs.QoECurve(our_latency[nbk_delay] * 1000 + nbk_delay, qoe_curve)

        # print(our_latency - equal_latency)
        print('Cases:', times, 'Ours:', our_qoe, 'Default:', equal_qoe, 'Gain:', (our_qoe/equal_qoe - 1.0)*100, '%')
        real_answer_qoe_gain.append((our_qoe/equal_qoe - 1.0)*100)
        if our_qoe > equal_qoe:
            answer_qoe_gain.append((our_qoe/equal_qoe - 1.0)*100)

    answer_qoe_gain = np.array(answer_qoe_gain)
    real_answer_qoe_gain = np.array(real_answer_qoe_gain)
    print('averge gain', np.mean(answer_qoe_gain))
    print('median gain', np.median(answer_qoe_gain))

    print('averge real gain', np.mean(real_answer_qoe_gain))
    print('median real gain', np.median(real_answer_qoe_gain))

    sender.shutdown()
    return 0


if __name__ == '__main__':

    para = sys.argv[1]
    if para == 'overall':
        thr = 120
    else:
        thr = int(para)

    sys_main(para)

    print('Processing ends.')


