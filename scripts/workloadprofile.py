from client_sender import ClientSender
from constant import QueryType
import numpy as np
import pandas as pd
import sys
import time
import os


def test_burst(burst_size, sender, hosts):
    repeat_times = 60

    t_id = 0
    for j in range(0, repeat_times):
        time.sleep(5)
        for i in range(0, burst_size):
            t_id += 1
            sender.sendOneRequest(hosts[0], QueryType.SCAN, 0, t_id)
            t_id += 1
            sender.sendOneRequest(hosts[1], QueryType.SCAN, 0, t_id)
            t_id += 1
            sender.sendOneRequest(hosts[2], QueryType.SCAN, 0, t_id)

    latency = sender.getLatencies_array()
    latency = np.array(latency)

    return latency


def warm_up(sender, hosts):

    print('Start system warming up')
    burst_array = [5, 10, 30, 50, 60, 70, 75, 80, 85, 90, 100]

    for burst_size in burst_array:
        test_burst(burst_size=burst_size, sender=sender, hosts=hosts)
        sender.clearLatencyTable()

    print('Warming up complete!')

    return 0

def build_profile(sender, hosts):

    if os.path.exists('latency_files') == False:
        os.mkdir('latency_files')
    warm_up(sender=sender, hosts=hosts)

    print('Start building workload profile')
    burst_array = [5, 10, 15, 20, 25, 30, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 110, 120, 130, 140, 150]

    for burst_size in burst_array:
        latency = test_burst(burst_size=burst_size,sender=sender, hosts=hosts)
        latency = np.array(latency)
        filename = 'latency_files/latency_'+str(burst_size)+'.txt'
        np.savetxt(filename, latency)
        sender.clearLatencyTable()

    return 0


if __name__ == '__main__':
    print('This file helps you build workload-latency profile.')
