# Cassandra Client

## Installation
### Java8

    sudo apt-get update
    printf "Y" | sudo apt-get install software-properties-common
    printf "\n" | sudo add-apt-repository ppa:webupd8team/java
    sudo apt-get update
    sudo apt-get install oracle-java8-set-default

    sudo apt-get update
    printf "Y" | sudo apt-get install software-properties-common
    sudo apt install oracle-java8-set-default
### Cassandra's Python Client
    sudo dpkg-reconfigure dash
    sudo apt-get install python3-tk
    sudo apt-get update
    bash
    export LC_ALL=C
    sudo apt-get install python3-pip
    pip3 install cassandra-driver
    pip3 install Faker

    pip3 install pandas
    pip3 install numpy
    pip3 install matplotlib
    pip3 install datetime
  
### Get Cassandra Database (on client and replicas)
    cd /tmp/
    git clone https://github.com/hyperpro/CassRepo.git
    
    #client 1
    cd /tmp/CassRepo/cassandra-3.9/
    cp conf/cassandra1.yaml conf/cassandra.yaml
    cd bin
    sudo chmod 777 cassandra
    cd /tmp/CassRepo/cassandra-3.9/bin
    ./cassandra -f

    #client 2
    cd /tmp/CassRepo/cassandra-3.9/
    cp conf/cassandra2.yaml conf/cassandra.yaml
    cd bin
    sudo chmod 777 cassandra
    cd /tmp/CassRepo/cassandra-3.9/bin
    ./cassandra -f
    
    #client 3
    cd /tmp/CassRepo/cassandra-3.9/
    cp conf/cassandra3.yaml conf/cassandra.yaml
    cd bin
    sudo chmod 777 cassandra
    cd /tmp/CassRepo/cassandra-3.9/bin
    ./cassandra -f

### Cassndra Interface
    cd /tmp/CassRepo/cassandra-3.9/bin
    chmod 777 cqlsh
    ./cqlsh $thisIP 

### Download tools

    sudo apt-get install lrzsz
    sz <filename>
 
## Location
The client script can be found in `/script/client_sender.py`

## How to use

### Setup Cassandra
To make cassandra read from local only, we have to add `read_from_local_only: true` to `cassandra-3.9/conf/cassandra.yaml`

### Setup KeySpace
We use same keyspace with YCSB, so we have to run YCSB once before use this client workload generator.

In Cassandra interface, we set

    create keyspace ycsb with replication = {'class':'SimpleStrategy', 'replication_factor':3};
    use ycsb;
    create table usertable (y_id varchar primary key,field0 varchar,field1 varchar,field2 varchar,field3 varchar,field4 varchar,field5 varchar,field6 varchar,field7 varchar,field8 varchar,field9 varchar);

Clear old database

    #in cqlsh
    use ycsb;
    truncate usertable;
    drop keyspace ycsb;
    
    #in linux command line
    ./nodetool -h localhost -p 7199 clearsnapshot

Insert data

    cd /tmp/CassRepo/ycsb-0.15.0
    ./bin/ycsb load cassandra-cql -P workloads/workload_test -p hosts=IP -threads 10



### Create Client
ClientSender constructor receive list of hosts. The hosts is IP address of cassandra replicas
```python
from client_sender import ClientSender
from constant import QueryType

hosts = ['127.0.0.1', '127.0.0.2']
sender = ClientSender(hosts)
```

### Send A Request
To send a request we use this method `sendOneRequest(host, type, interval, req_id)`. `host` is IP address of target cassandra replica that we want to send a request, `type` is type of request (read, scan, insert, update) we use defined type from QueryType in constants.py, `interval` is interval between request, and `req_id` is the request id which is unique. 
```python
from client_sender import ClientSender
from constant import QueryType

hosts = ['127.0.0.1', '127.0.0.2']
sender = ClientSender(hosts)
#next line instruction will be sent after 0.01 second, 20-23 are the IDs of requests.
sender.sendOneRequest(hosts[0], QueryType.READ, 0.01, 20) 
sender.sendOneRequest(hosts[1], QueryType.SCAN, 0.01, 21)
sender.sendOneRequest(hosts[0], QueryType.INSERT, 0.01, 22)
sender.sendOneRequest(hosts[1], QueryType.UPDATE, 0.01, 23)
```

### Get Latency
ClientSender class save latency of each requests. ClientSender class will wait until all request is finished. The result is array latency for each request.
```python
from client_sender import ClientSender
from constant import QueryType

hosts = ['127.0.0.1', '127.0.0.2']
sender = ClientSender(hosts)

sender.sendOneRequest(hosts[0], QueryType.READ, 0.01, 20) 
sender.sendOneRequest(hosts[1], QueryType.SCAN, 0.01, 21)
sender.sendOneRequest(hosts[0], QueryType.INSERT, 0.01, 22)
sender.sendOneRequest(hosts[1], QueryType.UPDATE, 0.01, 23)
latency = sender.getLatencies()
print(latency[20], latency[21], latency[22], latency[23])
'''
latency is a dictionary, where key is req_id and value is the latency.
'''
```
For the code above, we sent 4 requests so we will get 4 latency in an array.

## Run experiments

All the programs are inside the `scripts` folder.

Run a full experiment

    python3 ourclient.py THROUGHPUT
    
The parameter `THROUGHPUT` is the target throughput which ranges from [90, 150].

### Fast run

If you already build the workload-latency profile by `wlp.build_profile(sender = sender, hosts=hosts)` in `scripts/ourclient.py`.
When running the next experiment just after the previous one, you don't have to re-build the profile. Just comment it is OK.

### Use emulator

The above 'fast run' method is still not fast enough, since it has to go through all the traces. Our simulator output the similar (actually is the same)
as the real client. Its usage is also similar to run the real experiment.

    python3 clientsimulator.py THROUGHPUT


