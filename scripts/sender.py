from cassandra import ProtocolVersion
from cassandra.cluster import Cluster
from  cassandra.policies import (HostFilterPolicy, RoundRobinPolicy, HostDistance)
from constant import QueryType
import constant
import random
import string
import time


class Sender:

    def __init__(self, host_address):
        self.host_address = host_address
        self.cluster = self.generateCluster()
        self.session = self.cluster.connect()
        self.ids = []
        self.session.set_keyspace(constant.KEY_SPACE)
        self.session.execute('use ' + constant.KEY_SPACE)
        self.initIds()


    def isAddressAccepted(self, host):
        return host.address == self.host_address


    def generateCluster(self):
        filter_policy = HostFilterPolicy(
            child_policy=RoundRobinPolicy(),
            predicate=self.isAddressAccepted
        )

        cluster = Cluster(
            [self.host_address],
            load_balancing_policy = filter_policy
            #protocol_version=ProtocolVersion.V3
        )
        # cluster.set_max_requests_per_connection(HostDistance.LOCAL, 10)
        # cluster.set_core_connections_per_host(HostDistance.LOCAL, 2)
        return cluster


    def getSession(self):
        return self.session


    def initIds(self):
        rows = self.executeQuerySync('select y_id from usertable limit 1')
        self.ids = []
        for row in rows:
            self.ids.append(row.y_id)


    def getRandomId(self):
        return random.sample(self.ids, 1)[0]

    def executeRequest(self, type, callback, req_id):
        if (type == QueryType.READ):
            self.sendReadRequest(callback)
        elif (type == QueryType.SCAN):
            self.sendScanReqest(callback, req_id)
        elif (type == QueryType.UPDATE):
            self.sendUpdateReqest(callback)
        elif (type == QueryType.INSERT):
            self.sendInsertReqest(callback)

    
    def executeQuerySync(self, query, param=[]):
        if len(param) == 0:
            return self.session.execute(query)
        else:
            return self.session.execute(query, param)


    def sendAsyncRequest(self, query, callback, req_id, param = []):
        if len(param) == 0:
            future = self.session.execute_async(query)
        else:
            future = self.session.execute_async(query, param)
        ResultHandler(future, callback, time.time(), req_id)


    def sendReadRequest(self, callback):
        id = self.getRandomId()
        query = "select * from usertable where y_id=%s limit 1"
        self.sendAsyncRequest(query, callback, [id])


    def sendScanReqest(self, callback, req_id):
        id = self.getRandomId()
        query = "select * from usertable where token(y_id) >= token(%s) limit 20"
        self.sendAsyncRequest(query, callback, req_id, [id])


    def sendUpdateReqest(self, callback):
        id = self.getRandomId()
        value = ''.join(random.choice(string.ascii_uppercase + string.digits) for x in range(100))
        query = "update usertable set field0=%s where y_id=%s"
        self.sendAsyncRequest(query, callback, [value, id])

    def sendInsertReqest(self, callback):
        query = """
            insert into usertable (y_id, field0, field1, field2, field3, field4, field5, field6, field7, field8, field9)
            values(%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s)
        """
        
        id = 'user'.join(random.choice(string.ascii_uppercase + string.digits) for x in range(19))
        param = [id]
        value = ''.join(random.choice(string.ascii_uppercase + string.digits) for x in range(100))
        idx = 0
        while idx < 10:
            param.append(value)
            idx = idx + 1
        self.sendAsyncRequest(query, callback, param)

    def shutdown(self):
        self.cluster.shutdown()

class ResultHandler:

    def __init__(self, future, callback, start_time, req_id):
        self.callback = callback
        self.future = future
        self.start_time = start_time
        self.req_id = req_id
        self.future.add_callbacks(callback=self.handle_success, errback=self.handle_error)

    def handle_success(self, rows):
        self.callback(time.time() - self.start_time, self.req_id)
        self.callback(time.time() - self.start_time, self.req_id)


    def handle_error(self, exception):
        print(exception)
        self.callback(-1)
        log.error("Failed to fetch user info")
