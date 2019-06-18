The below results are produced running a simulation with :
* 2 Datacenters
    * 1 Host per datacenter
* 2 VMs
    * VM #1 with 10 MIP capacity
    * VM #2 with 1000 MIP capacity
* 4 Cloudlets

VM #1 fails to be created on Datacenter0 because there are not enough MIPS left on the single host in Datacetner0 after the allocation of VM #0.  Datacenter0's host only has a 1000 MIPS and 10 of them have been used by VM #0 leaving only 900 left when VM #1 which needs 1000 MIPS starts spin up.

Then in the output you can see that the run of the Cloudlets on Datacenter 2 take 100 times longer than on Datacenter 3.  This is because the VM available in Datacenter 2 only have 10 MIPs capacity while the VM on Datacenter 3 has 1000 MIPs capacity.

```
Initialising...
Starting CloudSim version 3.0
Datacenter0 is starting...
Datacenter1 is starting...
Broker0 is starting...
Broker1 is starting...
Entities started.
0.0: Broker0: Cloud Resource List received with 2 resource(s)
0.0: Broker1: Cloud Resource List received with 2 resource(s)
0.0: Broker0: Trying to Create VM #0 in Datacenter0
0.0: Broker1: Trying to Create VM #1 in Datacenter0
[VmScheduler.vmCreate] Allocation of VM #1 to Host #0 failed by MIPS
0.1: Broker0: VM #0 has been created in Datacenter #2, Host #0
0.1: Broker0: Sending cloudlet 0 to VM #0
0.1: Broker0: Sending cloudlet 1 to VM #0
0.1: Broker1: Creation of VM #1 failed in Datacenter #2
0.1: Broker1: Trying to Create VM #1 in Datacenter1
0.2: Broker1: VM #1 has been created in Datacenter #3, Host #0
0.2: Broker1: Sending cloudlet 2 to VM #1
0.2: Broker1: Sending cloudlet 3 to VM #1
800.2: Broker1: Cloudlet 2 received
800.2: Broker1: Cloudlet 3 received
800.2: Broker1: All Cloudlets executed. Finishing...
800.2: Broker1: Destroying VM #1
Broker1 is shutting down...
80000.1: Broker0: Cloudlet 0 received
80000.1: Broker0: Cloudlet 1 received
80000.1: Broker0: All Cloudlets executed. Finishing...
80000.1: Broker0: Destroying VM #0
Broker0 is shutting down...
Simulation: No more future events
CloudInformationService: Notify all CloudSim entities for shutting down.
Datacenter0 is shutting down...
Datacenter1 is shutting down...
Broker0 is shutting down...
Broker1 is shutting down...
Simulation completed.
Simulation completed.

========== OUTPUT ==========
Cloudlet ID    STATUS    Data center ID    VM ID    Time    Start Time    Finish Time
    0        SUCCESS        2            0        80000        0.1        80000.1
    1        SUCCESS        2            0        80000        0.1        80000.1

========== OUTPUT ==========
Cloudlet ID    STATUS    Data center ID    VM ID    Time    Start Time    Finish Time
    2        SUCCESS        3            1        800        0.2        800.2
    3        SUCCESS        3            1        800        0.2        800.2
```