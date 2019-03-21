from client_sender import ClientSender
from constant import QueryType

hosts = ['127.0.0.1', '127.0.0.2']
sender = ClientSender(hosts)

sender.sendOneRequest(hosts[0], QueryType.READ)
sender.sendOneRequest(hosts[1], QueryType.SCAN)
sender.sendOneRequest(hosts[0], QueryType.INSERT)
sender.sendOneRequest(hosts[1], QueryType.UPDATE)
latency = sender.getLatencies()
print(latency)
sender.shutdown()
