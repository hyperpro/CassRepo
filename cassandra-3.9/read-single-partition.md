### compiling cassandra
```
cd cassandra
ant
```

### Config: Read from local only
To run read request in coordinator replica only, you have to add this following line in `config/cassandra.yaml` :
```
read_from_local_only: true`
```

### Client request
Python cassandra driver from datastax has load balancer by default. You have to override the default policy. This is the example

```
// primary host should be IP address, if it is an url it won't work.
primary_host = ['127.0.0.1']
def is_address_accepted(host):
	return host.address in primary_host

filter_policy = HostFilterPolicy(
    child_policy=RoundRobinPolicy(),
    predicate=is_address_accepted
)

cluster = Cluster(
    primary_host,
    load_balancing_policy=filter_policy,
)

session = cluster.connect()
```
