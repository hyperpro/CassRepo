import numpy as np
import pandas as pd
import sys
import time

def intialize_data():

    # for clientsimulator
    # folder_name = 'latency_test_file/'
    # burst_array = [10, 20, 30, 40, 50, 55, 60, 70, 75, 80, 85, 90, 100]

    # for real replica selector
    folder_name = 'latency_files/'
    # burst_array = [5, 10, 15, 20, 25, 30, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 110, 120, 130, 140, 150]
    burst_array = [5, 10, 20, 30, 40, 50, 55, 60, 70, 75, 80, 85, 90, 100]
    burst_latencies = []

    for latency in burst_array:
        filename = folder_name + 'latency_'+str(latency)+'.txt'
        t_burst_latencies = np.loadtxt(filename)
        t_burst_latencies = t_burst_latencies * 1000.0
        burst_latencies.append(t_burst_latencies)

    burst_latencies = np.array(burst_latencies)
    return burst_array, burst_latencies


def get_avg_delay(burst_size, burst_array, burst_latencies):

    ans_delay = 0.0
    for i in range(0, len(burst_array)):
        if (burst_size >= burst_array[i]) and (burst_size <= burst_array[i+1]):
            avg_i_minus = np.mean(burst_latencies[i])
            avg_i_plus = np.mean(burst_latencies[i+1])
            diff_size = burst_array[i+1] - burst_array[i]
            ans_delay = avg_i_minus * (burst_array[i+1] - burst_size)/diff_size + avg_i_plus * (burst_size - burst_array[i])/diff_size
            break

    return ans_delay


def test_case():

    burst_array, burst_latencies = intialize_data()
    print('burst size 10', get_avg_delay(10, burst_array, burst_latencies))
    print('burst size 15', get_avg_delay(15, burst_array, burst_latencies))
    print('burst size 30', get_avg_delay(30, burst_array, burst_latencies))
    print('burst size 35', get_avg_delay(35, burst_array, burst_latencies))
    print('burst size 44', get_avg_delay(44, burst_array, burst_latencies))
    print('burst size 98', get_avg_delay(98, burst_array, burst_latencies))
    return 0


if __name__ == '__main__':

    print('This is to fit the load-latency curve for different queue lengths.')
    test_case()