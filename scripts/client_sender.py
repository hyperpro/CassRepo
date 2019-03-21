import random
import time
from sender import Sender


class ClientSender:

    def __init__(self, hosts):
        self.num_async_request = 0
        self.senders = {}
        # self.latencies = []
        self.latencies = {}
        self.latencies_array = []
        self.hosts = hosts
        for host in hosts:
            self.senders[host] = Sender(host)


    def executeQuerySync(self, host, query, param=[]):
        return self.senders[host].executeQuerySync(query, param)

    def executeQueryAsync(self, host, type, req_id):
        if host in self.hosts:
            self.num_async_request = self.num_async_request + 1
            return self.senders[host].executeRequest(type, self.nonBlockCallback, req_id)

    def nonBlockCallback(self, time, req_id):
        self.latencies[req_id] = time
        self.latencies_array.append(time)

    def getHosts(self):
        return self.hosts

    def getSenders(self):
        return self.senders


    def getLatencies(self):

        while len(self.latencies) < self.num_async_request - 10:
            time.sleep(0.0001)

        return self.latencies

    def getLatencies_array(self):

        while len(self.latencies_array) < self.num_async_request:
            time.sleep(0.0001)

        return self.latencies_array

    def sendOneRequest(self, host, type, interval, req_id):
        latency = self.executeQueryAsync(host, type, req_id)
        time.sleep(interval)


    def sendMultipleRequest(self, num_request, type, interval = 0, next_host_policy = None):
        next_host =  next_host_policy if next_host_policy != None else self.defaultNextPolicy
        num_requested = 0
        consumed_time = 0
        while num_requested < num_request:
            start_time = time.time()
            host = next_host()
            latency = self.executeQueryAsync(host, type)
            num_requested = num_requested + 1
            consumed_time = consumed_time + time.time() - start_time
            time.sleep(interval)

    def defaultNextPolicy(self):
        return random.sample(self.hosts, 1)[0]

    def clearLatencyTable(self):
        self.latencies.clear()
        self.latencies_array.clear()
        self.num_async_request = 0

    def shutdown(self):
        self.clearLatencyTable()
        for host in self.hosts:
            self.senders[host].shutdown()
