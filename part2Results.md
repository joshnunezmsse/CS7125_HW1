# PART 2 RESULTS
The below results are produced running a simulation with:
* 1 Datacenter
    * 1 Host : 64 GB Ram, 1 CPU x 10000 MIPS
* 40 VMs : with 1 CPU x 1000 MIPS
* 80 Cloudlets

10 of the 40 requested VMs are created because there is enough resources available for them (RAM, MIPS, Bandwidth).  Starting with VM #10 the BandWidth (BW) capacity of the datacenter has been exhausted so no more VMs can be created.

All of the cloudlets run in the same amount of time because the VMs all have the same specs.  The Cloudlets are devided between the 10 allocated VMs in a round robin fashion.

```
Initialising...
Starting CloudSim version 3.0
Datacenter0 is starting...
Broker0 is starting...
Entities started.
0.0: Broker0: Cloud Resource List received with 1 resource(s)
0.0: Broker0: Trying to Create VM #0 in Datacenter0
0.0: Broker0: Trying to Create VM #1 in Datacenter0
0.0: Broker0: Trying to Create VM #2 in Datacenter0
0.0: Broker0: Trying to Create VM #3 in Datacenter0
0.0: Broker0: Trying to Create VM #4 in Datacenter0
0.0: Broker0: Trying to Create VM #5 in Datacenter0
0.0: Broker0: Trying to Create VM #6 in Datacenter0
0.0: Broker0: Trying to Create VM #7 in Datacenter0
0.0: Broker0: Trying to Create VM #8 in Datacenter0
0.0: Broker0: Trying to Create VM #9 in Datacenter0
0.0: Broker0: Trying to Create VM #10 in Datacenter0
0.0: Broker0: Trying to Create VM #11 in Datacenter0
0.0: Broker0: Trying to Create VM #12 in Datacenter0
0.0: Broker0: Trying to Create VM #13 in Datacenter0
0.0: Broker0: Trying to Create VM #14 in Datacenter0
0.0: Broker0: Trying to Create VM #15 in Datacenter0
0.0: Broker0: Trying to Create VM #16 in Datacenter0
0.0: Broker0: Trying to Create VM #17 in Datacenter0
0.0: Broker0: Trying to Create VM #18 in Datacenter0
0.0: Broker0: Trying to Create VM #19 in Datacenter0
0.0: Broker0: Trying to Create VM #20 in Datacenter0
0.0: Broker0: Trying to Create VM #21 in Datacenter0
0.0: Broker0: Trying to Create VM #22 in Datacenter0
0.0: Broker0: Trying to Create VM #23 in Datacenter0
0.0: Broker0: Trying to Create VM #24 in Datacenter0
0.0: Broker0: Trying to Create VM #25 in Datacenter0
0.0: Broker0: Trying to Create VM #26 in Datacenter0
0.0: Broker0: Trying to Create VM #27 in Datacenter0
0.0: Broker0: Trying to Create VM #28 in Datacenter0
0.0: Broker0: Trying to Create VM #29 in Datacenter0
0.0: Broker0: Trying to Create VM #30 in Datacenter0
0.0: Broker0: Trying to Create VM #31 in Datacenter0
0.0: Broker0: Trying to Create VM #32 in Datacenter0
0.0: Broker0: Trying to Create VM #33 in Datacenter0
0.0: Broker0: Trying to Create VM #34 in Datacenter0
0.0: Broker0: Trying to Create VM #35 in Datacenter0
0.0: Broker0: Trying to Create VM #36 in Datacenter0
0.0: Broker0: Trying to Create VM #37 in Datacenter0
0.0: Broker0: Trying to Create VM #38 in Datacenter0
0.0: Broker0: Trying to Create VM #39 in Datacenter0
[VmScheduler.vmCreate] Allocation of VM #10 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #11 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #12 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #13 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #14 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #15 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #16 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #17 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #18 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #19 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #20 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #21 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #22 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #23 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #24 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #25 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #26 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #27 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #28 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #29 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #30 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #31 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #32 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #33 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #34 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #35 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #36 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #37 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #38 to Host #0 failed by BW
[VmScheduler.vmCreate] Allocation of VM #39 to Host #0 failed by BW
0.1: Broker0: VM #0 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #1 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #2 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #3 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #4 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #5 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #6 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #7 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #8 has been created in Datacenter #2, Host #0
0.1: Broker0: VM #9 has been created in Datacenter #2, Host #0
0.1: Broker0: Creation of VM #10 failed in Datacenter #2
0.1: Broker0: Creation of VM #11 failed in Datacenter #2
0.1: Broker0: Creation of VM #12 failed in Datacenter #2
0.1: Broker0: Creation of VM #13 failed in Datacenter #2
0.1: Broker0: Creation of VM #14 failed in Datacenter #2
0.1: Broker0: Creation of VM #15 failed in Datacenter #2
0.1: Broker0: Creation of VM #16 failed in Datacenter #2
0.1: Broker0: Creation of VM #17 failed in Datacenter #2
0.1: Broker0: Creation of VM #18 failed in Datacenter #2
0.1: Broker0: Creation of VM #19 failed in Datacenter #2
0.1: Broker0: Creation of VM #20 failed in Datacenter #2
0.1: Broker0: Creation of VM #21 failed in Datacenter #2
0.1: Broker0: Creation of VM #22 failed in Datacenter #2
0.1: Broker0: Creation of VM #23 failed in Datacenter #2
0.1: Broker0: Creation of VM #24 failed in Datacenter #2
0.1: Broker0: Creation of VM #25 failed in Datacenter #2
0.1: Broker0: Creation of VM #26 failed in Datacenter #2
0.1: Broker0: Creation of VM #27 failed in Datacenter #2
0.1: Broker0: Creation of VM #28 failed in Datacenter #2
0.1: Broker0: Creation of VM #29 failed in Datacenter #2
0.1: Broker0: Creation of VM #30 failed in Datacenter #2
0.1: Broker0: Creation of VM #31 failed in Datacenter #2
0.1: Broker0: Creation of VM #32 failed in Datacenter #2
0.1: Broker0: Creation of VM #33 failed in Datacenter #2
0.1: Broker0: Creation of VM #34 failed in Datacenter #2
0.1: Broker0: Creation of VM #35 failed in Datacenter #2
0.1: Broker0: Creation of VM #36 failed in Datacenter #2
0.1: Broker0: Creation of VM #37 failed in Datacenter #2
0.1: Broker0: Creation of VM #38 failed in Datacenter #2
0.1: Broker0: Creation of VM #39 failed in Datacenter #2
0.1: Broker0: Sending cloudlet 0 to VM #0
0.1: Broker0: Sending cloudlet 1 to VM #1
0.1: Broker0: Sending cloudlet 2 to VM #2
0.1: Broker0: Sending cloudlet 3 to VM #3
0.1: Broker0: Sending cloudlet 4 to VM #4
0.1: Broker0: Sending cloudlet 5 to VM #5
0.1: Broker0: Sending cloudlet 6 to VM #6
0.1: Broker0: Sending cloudlet 7 to VM #7
0.1: Broker0: Sending cloudlet 8 to VM #8
0.1: Broker0: Sending cloudlet 9 to VM #9
0.1: Broker0: Sending cloudlet 10 to VM #0
0.1: Broker0: Sending cloudlet 11 to VM #1
0.1: Broker0: Sending cloudlet 12 to VM #2
0.1: Broker0: Sending cloudlet 13 to VM #3
0.1: Broker0: Sending cloudlet 14 to VM #4
0.1: Broker0: Sending cloudlet 15 to VM #5
0.1: Broker0: Sending cloudlet 16 to VM #6
0.1: Broker0: Sending cloudlet 17 to VM #7
0.1: Broker0: Sending cloudlet 18 to VM #8
0.1: Broker0: Sending cloudlet 19 to VM #9
0.1: Broker0: Sending cloudlet 20 to VM #0
0.1: Broker0: Sending cloudlet 21 to VM #1
0.1: Broker0: Sending cloudlet 22 to VM #2
0.1: Broker0: Sending cloudlet 23 to VM #3
0.1: Broker0: Sending cloudlet 24 to VM #4
0.1: Broker0: Sending cloudlet 25 to VM #5
0.1: Broker0: Sending cloudlet 26 to VM #6
0.1: Broker0: Sending cloudlet 27 to VM #7
0.1: Broker0: Sending cloudlet 28 to VM #8
0.1: Broker0: Sending cloudlet 29 to VM #9
0.1: Broker0: Sending cloudlet 30 to VM #0
0.1: Broker0: Sending cloudlet 31 to VM #1
0.1: Broker0: Sending cloudlet 32 to VM #2
0.1: Broker0: Sending cloudlet 33 to VM #3
0.1: Broker0: Sending cloudlet 34 to VM #4
0.1: Broker0: Sending cloudlet 35 to VM #5
0.1: Broker0: Sending cloudlet 36 to VM #6
0.1: Broker0: Sending cloudlet 37 to VM #7
0.1: Broker0: Sending cloudlet 38 to VM #8
0.1: Broker0: Sending cloudlet 39 to VM #9
0.1: Broker0: Sending cloudlet 40 to VM #0
0.1: Broker0: Sending cloudlet 41 to VM #1
0.1: Broker0: Sending cloudlet 42 to VM #2
0.1: Broker0: Sending cloudlet 43 to VM #3
0.1: Broker0: Sending cloudlet 44 to VM #4
0.1: Broker0: Sending cloudlet 45 to VM #5
0.1: Broker0: Sending cloudlet 46 to VM #6
0.1: Broker0: Sending cloudlet 47 to VM #7
0.1: Broker0: Sending cloudlet 48 to VM #8
0.1: Broker0: Sending cloudlet 49 to VM #9
0.1: Broker0: Sending cloudlet 50 to VM #0
0.1: Broker0: Sending cloudlet 51 to VM #1
0.1: Broker0: Sending cloudlet 52 to VM #2
0.1: Broker0: Sending cloudlet 53 to VM #3
0.1: Broker0: Sending cloudlet 54 to VM #4
0.1: Broker0: Sending cloudlet 55 to VM #5
0.1: Broker0: Sending cloudlet 56 to VM #6
0.1: Broker0: Sending cloudlet 57 to VM #7
0.1: Broker0: Sending cloudlet 58 to VM #8
0.1: Broker0: Sending cloudlet 59 to VM #9
0.1: Broker0: Sending cloudlet 60 to VM #0
0.1: Broker0: Sending cloudlet 61 to VM #1
0.1: Broker0: Sending cloudlet 62 to VM #2
0.1: Broker0: Sending cloudlet 63 to VM #3
0.1: Broker0: Sending cloudlet 64 to VM #4
0.1: Broker0: Sending cloudlet 65 to VM #5
0.1: Broker0: Sending cloudlet 66 to VM #6
0.1: Broker0: Sending cloudlet 67 to VM #7
0.1: Broker0: Sending cloudlet 68 to VM #8
0.1: Broker0: Sending cloudlet 69 to VM #9
0.1: Broker0: Sending cloudlet 70 to VM #0
0.1: Broker0: Sending cloudlet 71 to VM #1
0.1: Broker0: Sending cloudlet 72 to VM #2
0.1: Broker0: Sending cloudlet 73 to VM #3
0.1: Broker0: Sending cloudlet 74 to VM #4
0.1: Broker0: Sending cloudlet 75 to VM #5
0.1: Broker0: Sending cloudlet 76 to VM #6
0.1: Broker0: Sending cloudlet 77 to VM #7
0.1: Broker0: Sending cloudlet 78 to VM #8
0.1: Broker0: Sending cloudlet 79 to VM #9
3200.1: Broker0: Cloudlet 0 received
3200.1: Broker0: Cloudlet 10 received
3200.1: Broker0: Cloudlet 20 received
3200.1: Broker0: Cloudlet 30 received
3200.1: Broker0: Cloudlet 40 received
3200.1: Broker0: Cloudlet 50 received
3200.1: Broker0: Cloudlet 60 received
3200.1: Broker0: Cloudlet 70 received
3200.1: Broker0: Cloudlet 1 received
3200.1: Broker0: Cloudlet 11 received
3200.1: Broker0: Cloudlet 21 received
3200.1: Broker0: Cloudlet 31 received
3200.1: Broker0: Cloudlet 41 received
3200.1: Broker0: Cloudlet 51 received
3200.1: Broker0: Cloudlet 61 received
3200.1: Broker0: Cloudlet 71 received
3200.1: Broker0: Cloudlet 2 received
3200.1: Broker0: Cloudlet 12 received
3200.1: Broker0: Cloudlet 22 received
3200.1: Broker0: Cloudlet 32 received
3200.1: Broker0: Cloudlet 42 received
3200.1: Broker0: Cloudlet 52 received
3200.1: Broker0: Cloudlet 62 received
3200.1: Broker0: Cloudlet 72 received
3200.1: Broker0: Cloudlet 3 received
3200.1: Broker0: Cloudlet 13 received
3200.1: Broker0: Cloudlet 23 received
3200.1: Broker0: Cloudlet 33 received
3200.1: Broker0: Cloudlet 43 received
3200.1: Broker0: Cloudlet 53 received
3200.1: Broker0: Cloudlet 63 received
3200.1: Broker0: Cloudlet 73 received
3200.1: Broker0: Cloudlet 4 received
3200.1: Broker0: Cloudlet 14 received
3200.1: Broker0: Cloudlet 24 received
3200.1: Broker0: Cloudlet 34 received
3200.1: Broker0: Cloudlet 44 received
3200.1: Broker0: Cloudlet 54 received
3200.1: Broker0: Cloudlet 64 received
3200.1: Broker0: Cloudlet 74 received
3200.1: Broker0: Cloudlet 5 received
3200.1: Broker0: Cloudlet 15 received
3200.1: Broker0: Cloudlet 25 received
3200.1: Broker0: Cloudlet 35 received
3200.1: Broker0: Cloudlet 45 received
3200.1: Broker0: Cloudlet 55 received
3200.1: Broker0: Cloudlet 65 received
3200.1: Broker0: Cloudlet 75 received
3200.1: Broker0: Cloudlet 6 received
3200.1: Broker0: Cloudlet 16 received
3200.1: Broker0: Cloudlet 26 received
3200.1: Broker0: Cloudlet 36 received
3200.1: Broker0: Cloudlet 46 received
3200.1: Broker0: Cloudlet 56 received
3200.1: Broker0: Cloudlet 66 received
3200.1: Broker0: Cloudlet 76 received
3200.1: Broker0: Cloudlet 7 received
3200.1: Broker0: Cloudlet 17 received
3200.1: Broker0: Cloudlet 27 received
3200.1: Broker0: Cloudlet 37 received
3200.1: Broker0: Cloudlet 47 received
3200.1: Broker0: Cloudlet 57 received
3200.1: Broker0: Cloudlet 67 received
3200.1: Broker0: Cloudlet 77 received
3200.1: Broker0: Cloudlet 8 received
3200.1: Broker0: Cloudlet 18 received
3200.1: Broker0: Cloudlet 28 received
3200.1: Broker0: Cloudlet 38 received
3200.1: Broker0: Cloudlet 48 received
3200.1: Broker0: Cloudlet 58 received
3200.1: Broker0: Cloudlet 68 received
3200.1: Broker0: Cloudlet 78 received
3200.1: Broker0: Cloudlet 9 received
3200.1: Broker0: Cloudlet 19 received
3200.1: Broker0: Cloudlet 29 received
3200.1: Broker0: Cloudlet 39 received
3200.1: Broker0: Cloudlet 49 received
3200.1: Broker0: Cloudlet 59 received
3200.1: Broker0: Cloudlet 69 received
3200.1: Broker0: Cloudlet 79 received
3200.1: Broker0: All Cloudlets executed. Finishing...
3200.1: Broker0: Destroying VM #0
3200.1: Broker0: Destroying VM #1
3200.1: Broker0: Destroying VM #2
3200.1: Broker0: Destroying VM #3
3200.1: Broker0: Destroying VM #4
3200.1: Broker0: Destroying VM #5
3200.1: Broker0: Destroying VM #6
3200.1: Broker0: Destroying VM #7
3200.1: Broker0: Destroying VM #8
3200.1: Broker0: Destroying VM #9
Broker0 is shutting down...
Simulation: No more future events
CloudInformationService: Notify all CloudSim entities for shutting down.
Datacenter0 is shutting down...
Broker0 is shutting down...
Simulation completed.
Simulation completed.

========== OUTPUT ==========
Cloudlet ID    STATUS    Data center ID    VM ID    Time    Start Time    Finish Time
    0        SUCCESS        2            0        3200        0.1        3200.1
    10        SUCCESS        2            0        3200        0.1        3200.1
    20        SUCCESS        2            0        3200        0.1        3200.1
    30        SUCCESS        2            0        3200        0.1        3200.1
    40        SUCCESS        2            0        3200        0.1        3200.1
    50        SUCCESS        2            0        3200        0.1        3200.1
    60        SUCCESS        2            0        3200        0.1        3200.1
    70        SUCCESS        2            0        3200        0.1        3200.1
    1        SUCCESS        2            1        3200        0.1        3200.1
    11        SUCCESS        2            1        3200        0.1        3200.1
    21        SUCCESS        2            1        3200        0.1        3200.1
    31        SUCCESS        2            1        3200        0.1        3200.1
    41        SUCCESS        2            1        3200        0.1        3200.1
    51        SUCCESS        2            1        3200        0.1        3200.1
    61        SUCCESS        2            1        3200        0.1        3200.1
    71        SUCCESS        2            1        3200        0.1        3200.1
    2        SUCCESS        2            2        3200        0.1        3200.1
    12        SUCCESS        2            2        3200        0.1        3200.1
    22        SUCCESS        2            2        3200        0.1        3200.1
    32        SUCCESS        2            2        3200        0.1        3200.1
    42        SUCCESS        2            2        3200        0.1        3200.1
    52        SUCCESS        2            2        3200        0.1        3200.1
    62        SUCCESS        2            2        3200        0.1        3200.1
    72        SUCCESS        2            2        3200        0.1        3200.1
    3        SUCCESS        2            3        3200        0.1        3200.1
    13        SUCCESS        2            3        3200        0.1        3200.1
    23        SUCCESS        2            3        3200        0.1        3200.1
    33        SUCCESS        2            3        3200        0.1        3200.1
    43        SUCCESS        2            3        3200        0.1        3200.1
    53        SUCCESS        2            3        3200        0.1        3200.1
    63        SUCCESS        2            3        3200        0.1        3200.1
    73        SUCCESS        2            3        3200        0.1        3200.1
    4        SUCCESS        2            4        3200        0.1        3200.1
    14        SUCCESS        2            4        3200        0.1        3200.1
    24        SUCCESS        2            4        3200        0.1        3200.1
    34        SUCCESS        2            4        3200        0.1        3200.1
    44        SUCCESS        2            4        3200        0.1        3200.1
    54        SUCCESS        2            4        3200        0.1        3200.1
    64        SUCCESS        2            4        3200        0.1        3200.1
    74        SUCCESS        2            4        3200        0.1        3200.1
    5        SUCCESS        2            5        3200        0.1        3200.1
    15        SUCCESS        2            5        3200        0.1        3200.1
    25        SUCCESS        2            5        3200        0.1        3200.1
    35        SUCCESS        2            5        3200        0.1        3200.1
    45        SUCCESS        2            5        3200        0.1        3200.1
    55        SUCCESS        2            5        3200        0.1        3200.1
    65        SUCCESS        2            5        3200        0.1        3200.1
    75        SUCCESS        2            5        3200        0.1        3200.1
    6        SUCCESS        2            6        3200        0.1        3200.1
    16        SUCCESS        2            6        3200        0.1        3200.1
    26        SUCCESS        2            6        3200        0.1        3200.1
    36        SUCCESS        2            6        3200        0.1        3200.1
    46        SUCCESS        2            6        3200        0.1        3200.1
    56        SUCCESS        2            6        3200        0.1        3200.1
    66        SUCCESS        2            6        3200        0.1        3200.1
    76        SUCCESS        2            6        3200        0.1        3200.1
    7        SUCCESS        2            7        3200        0.1        3200.1
    17        SUCCESS        2            7        3200        0.1        3200.1
    27        SUCCESS        2            7        3200        0.1        3200.1
    37        SUCCESS        2            7        3200        0.1        3200.1
    47        SUCCESS        2            7        3200        0.1        3200.1
    57        SUCCESS        2            7        3200        0.1        3200.1
    67        SUCCESS        2            7        3200        0.1        3200.1
    77        SUCCESS        2            7        3200        0.1        3200.1
    8        SUCCESS        2            8        3200        0.1        3200.1
    18        SUCCESS        2            8        3200        0.1        3200.1
    28        SUCCESS        2            8        3200        0.1        3200.1
    38        SUCCESS        2            8        3200        0.1        3200.1
    48        SUCCESS        2            8        3200        0.1        3200.1
    58        SUCCESS        2            8        3200        0.1        3200.1
    68        SUCCESS        2            8        3200        0.1        3200.1
    78        SUCCESS        2            8        3200        0.1        3200.1
    9        SUCCESS        2            9        3200        0.1        3200.1
    19        SUCCESS        2            9        3200        0.1        3200.1
    29        SUCCESS        2            9        3200        0.1        3200.1
    39        SUCCESS        2            9        3200        0.1        3200.1
    49        SUCCESS        2            9        3200        0.1        3200.1
    59        SUCCESS        2            9        3200        0.1        3200.1
    69        SUCCESS        2            9        3200        0.1        3200.1
    79        SUCCESS        2            9        3200        0.1        3200.1
```