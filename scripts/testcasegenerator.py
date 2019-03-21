import numpy as np
import pandas as pd
import sys
import random
import time
import bipartitegraph as bipart
import matplotlib.pyplot as plt
import math


def investigate_dataset():

    qoe_filename = 'qoe_bins'
    qoe_curve = bipart.getcurve(qoe_filename)

    dataset_name = 'AM_12'
    ori_data = pd.read_csv(dataset_name)
    ori_data = bipart.filterData(ori_data, 'APPGAMEPDP')
    o_data_sample = ori_data.sample(n=500, random_state=int(time.time()), axis=0)

    nbk_delays = []
    for index, row in o_data_sample.iterrows():
        nbk_delays.append(row['non_backend'])

    nbk_delays.sort()
    cdf_y_axis = np.arange(1, len(nbk_delays) + 1)/len(nbk_delays)

    plt.plot(nbk_delays, cdf_y_axis, linestyle='-', linewidth=1.5)

    plt.title('CDF of external delay')
    plt.legend(['external delay'])
    plt.xlabel('Delay (ms)')
    plt.ylabel('CDF')
    plt.show()

    return 0


def case_generator(burst_size):

    repeat_num = 1
    random.seed(time.time())
    # percents = [33, 33, 34]
    # percents = [27, 20, 53]
    # percents = [20, 20, 60]
    # percents = [20, 25, 55]
    percents = [22, 20, 58]
    interval_between_burst = 5
    numofreqs = []
    for per in percents:
        numofreq = int(math.floor(burst_size * per/100))
        numofreqs.append(numofreq)

    numofreqs[2] = burst_size - numofreqs[0] - numofreqs[1]

    scales = [[10, 238], [238, 690], [690, 1900]]
    nbk_delays = []

    for i in range(0, 3):
        low_bound = scales[i][0]
        high_bound = scales[i][1]
        for j in range(0, numofreqs[i]):
            gen_delay = random.randint(low_bound, high_bound)
            nbk_delays.append(gen_delay)

    intervals=[]
    for i in range(0, len(nbk_delays)-1):
        intervals.append(0)
    intervals.append(interval_between_burst)

    real_interval = []
    real_nbk = []

    for i in range(0, repeat_num):
        random.shuffle(nbk_delays)
        real_interval.extend(intervals)
        real_nbk.extend(nbk_delays)

    file_to_save_table = 'table_' + str(burst_size) + '.txt'
    file_to_save_time_interval = 'time_interval_' + str(burst_size) + '.txt'

    data_to_save_table = np.array(nbk_delays)
    data_to_save_time_interval = np.array([real_nbk, real_interval])
    data_to_save_time_interval = data_to_save_time_interval.transpose()

    np.savetxt(file_to_save_table, data_to_save_table)
    np.savetxt(file_to_save_time_interval, data_to_save_time_interval)

    return nbk_delays

if __name__ == '__main__':
    print('This is the test case generator.')
    # investigate_dataset()
    case_generator(90)
    case_generator(100)
    case_generator(110)
    case_generator(120)
    case_generator(130)
    case_generator(140)
    case_generator(150)


