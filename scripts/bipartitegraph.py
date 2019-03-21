import sys
import pandas as pd
import numpy as np
import time
import random


inf = 1e10
eps = 1e-6
qoe_curve_filename = 'qoe_bins'


def dfs(x, matchx, matchy, lx, ly, visx, visy, slack, weight):
    visx[x] = True
    for y in range(0, len(ly)):
        if visy[y]:
            continue
        tmp = lx[x] + ly[y] - weight[x][y]
        if abs(tmp) <= eps:
            visy[y] = True
            if matchy[y] == -1 or dfs(matchy[y], matchx, matchy, lx, ly, visx, visy, slack, weight):
                matchx[x] = y
                matchy[y] = x
                return True
        else:
            slack[y] = min(slack[y], tmp)
    return False


def bipartite_graph(weight):
    num = len(weight)
    answer_qoe = 0
    matchx = [-1] * num
    matchy = [-1] * num

    lx = []
    ly = [0] * num

    slack = []

    for i in range(0, num):
        lx.append(-inf)
        for j in range(0, num):
            # print(i, j, weight[0][0])
            lx[i] = max(lx[i], weight[i][j])

    for i in range(0, num):
        for j in range(0, num):
            if len(slack) >= j+1:
                slack[j] = inf
            else:
                slack.append(inf)
        while True:
            visx = [False] * num
            visy = [False] * num
            if dfs(i, matchx, matchy, lx, ly, visx, visy, slack, weight) == True:
                break
            temp = inf
            for j in range(0, num):
                if visy[j] == False:
                    temp = min(temp, slack[j])
            for j in range(0, num):
                if visx[j] == True:
                    lx[j] -= temp
            for j in range(0, num):
                if visy[j] == True:
                    ly[j] += temp
                else:
                    slack[j] -= temp

    for i in range(0, num):
        answer_qoe += weight[i][matchx[i]]

    return matchx, answer_qoe


def filterData(ori, pagetype):
    # pages = ['SearchResults', 'Apps/Games PDP', 'PDP', 'SFW Category Page Template', 'RefineList']
    filter_type = pagetype
    if pagetype=='APPGAMEPDP':
        pagetype = 'Apps/Games PDP'

    pages = [pagetype]
    # ori = ori[ori['TTOL'] <200000]
    ori = ori[ori['TTOL'] < 10000]
    ori = ori[ori['non_backend'] > 10]

    ori = ori[(ori['pageType'].isin(pages))]
    return ori


def getcurve(filename):

    '''
    QoE curve manipulation goes here
    :param filename:
    :return:
    '''
    load_data = np.genfromtxt(filename, delimiter='\t')
    bin_num = len(load_data)
    min_qoe_scale = 1.3
    min_qoe = 0.01
    x_scale = 0.119
    y_scale = 1.9

    for xx in range(0, bin_num):
        load_data[xx][1] = (load_data[xx][1] - min_qoe_scale) * y_scale + min_qoe
        load_data[xx][0] = load_data[xx][0] * x_scale

    return load_data

if __name__ == '__main__':
    print('This is the whole class of graph matching operation.')
    qoe_curve = getcurve(qoe_curve_filename)

