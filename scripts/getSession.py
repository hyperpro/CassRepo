import sys
import numpy as np

def QoECurve(loading_time, data):

    # loading_time = loading_time
    bin_num = len(data)

    for i in range(0, bin_num): #21 for desktop-SR, 29 for mobile-SR, 90 for desktop-GAMEPDP, 56 for mobile-GAMEPDP, #20 for qoe_curve_final, #15 for qoe_bins
        if(data[i][0] > int(loading_time)):
            break
    diffXTotal = data[i][0] - data[i-1][0]
    diffYTotal = data[i-1][1] - data[i][1]
    diffX = int(loading_time) - data[i-1][0]
    session = data[i-1][1] - (diffX/diffXTotal*diffYTotal) + 0.0

    return session



def QoESlope(loading_time, data):


    bin_num = len(data)
    for i in range(0, bin_num): #21 for desktop-SR, 29 for mobile-SR, 90 for desktop-GAMEPDP, 56 for mobile-GAMEPDP, #20 for qoe_curve_final, #15 for qoe_bins
        if(data[i][0] > int(loading_time)):
            break
    diffXTotal = data[i][0] - data[i-1][0]
    diffYTotal = data[i-1][1] - data[i][1]
    diffX = int(loading_time) - data[i-1][0]
    session = data[i-1][1] - (diffX/diffXTotal*diffYTotal) + 0.0
    return diffYTotal/diffXTotal

