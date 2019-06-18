/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.cs7125hw1.part2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.cloudbus.cloudsim.Cloudlet;
import org.cloudbus.cloudsim.CloudletScheduler;
import org.cloudbus.cloudsim.CloudletSchedulerTimeShared;
import org.cloudbus.cloudsim.Datacenter;
import org.cloudbus.cloudsim.DatacenterBroker;
import org.cloudbus.cloudsim.DatacenterCharacteristics;
import org.cloudbus.cloudsim.Host;
import org.cloudbus.cloudsim.Log;
import org.cloudbus.cloudsim.Pe;
import org.cloudbus.cloudsim.UtilizationModel;
import org.cloudbus.cloudsim.UtilizationModelFull;
import org.cloudbus.cloudsim.Vm;
import org.cloudbus.cloudsim.VmAllocationPolicySimple;
import org.cloudbus.cloudsim.VmSchedulerTimeShared;
import org.cloudbus.cloudsim.core.CloudSim;
import org.cloudbus.cloudsim.provisioners.BwProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.PeProvisionerSimple;
import org.cloudbus.cloudsim.provisioners.RamProvisionerSimple;

/**
 *
 * Run 40 VMs with 80 cloudlets
 */
public class main {
    static int nextBrokerNumber = 0;
    static int nextDatacenterNumber = 0;
    static int nextVMId = 0;
    static int nextCloudletId = 0;
    static int nextHostId = 0;
    
    public static void main(String[] args) {
        CloudSim.init(1, Calendar.getInstance(), false);
        
        Datacenter dc1 = createDatacenter();
        
        DatacenterBroker broker1 = createBroker();
        
        //setup datacenter
        //Map<String, String> vm1Options = new HashMap<String, String>() {{ put("mips", "10"); }};
        ArrayList<Vm> vmList = new ArrayList<>();
        for (int i=0; i<40; i++) {
            vmList.add(createVM(broker1.getId(), new HashMap<>(), new CloudletSchedulerTimeShared()));
        }
        
        ArrayList<Cloudlet> cloudLetList = new ArrayList<>();
        for (int i=0; i<80; i++) {
            cloudLetList.add(createCloudlet(broker1.getId(), -1, new UtilizationModelFull()));
        }
        broker1.submitVmList(vmList);
        broker1.submitCloudletList(cloudLetList);
                
        CloudSim.startSimulation();
        List<Cloudlet> output1 = broker1.getCloudletReceivedList();
        CloudSim.stopSimulation();
        
        printCloudletList(output1);
    }
    
    private static Vm createVM(int brokerId, Map<String, String> options, CloudletScheduler scheduler) {
        double mips = 1000;
        
        if (options.containsKey("mips")) {
            mips = Double.parseDouble(options.get("mips"));
        }
        
        return new Vm(
            nextVMId++,
            brokerId,
            mips,
            1,
            512,
            1000,
            10000,
            "Xen",
            new CloudletSchedulerTimeShared()
        );
    }
    
    private static Cloudlet createCloudlet(int brokerId, int vmId, UtilizationModel model) {
        Cloudlet retVal = new Cloudlet(
                                nextCloudletId++,
                                400000,
                                1,
                                300,
                                300,
                                model,
                                model,
                                model
                            );
        
        retVal.setUserId(brokerId);
        
        if (vmId != -1) {
            retVal.setVmId(vmId);
        }
        
        return retVal;
    }
    
    private static DatacenterBroker createBroker() {
        DatacenterBroker broker = null;
        
        try {
            broker = new DatacenterBroker("Broker"+(nextBrokerNumber++));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return broker;
    }
    
    private static Datacenter createDatacenter() {
        Datacenter dc = null;
        
        Pe pe = new Pe(0, new PeProvisionerSimple(10000));
        List peList = Arrays.asList(pe);
        
        Host host = new Host(
                nextHostId++,
                new RamProvisionerSimple(64 * 1024),
                new BwProvisionerSimple(10000),
                1000000,
                peList,
                new VmSchedulerTimeShared(peList)
        );
        List hostList = Arrays.asList(host);
        
        DatacenterCharacteristics chars = new DatacenterCharacteristics(
                "x86",
                "Linux",
                "Xen",
                Arrays.asList(host),
                6,
                3,
                0.05,
                0.001,
                0.0
        );
        
        try {
            dc = new Datacenter("Datacenter"+(nextDatacenterNumber++), chars, new VmAllocationPolicySimple(hostList), Arrays.asList(), 0);
        } catch (Exception ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dc;
    }
    
    private static void printCloudletList(List<Cloudlet> list) {
        int size = list.size();
        Cloudlet cloudlet;

        String indent = "    ";
        Log.printLine();
        Log.printLine("========== OUTPUT ==========");
        Log.printLine("Cloudlet ID" + indent + "STATUS" + indent
                        + "Data center ID" + indent + "VM ID" + indent + "Time" + indent
                        + "Start Time" + indent + "Finish Time");

        DecimalFormat dft = new DecimalFormat("###.##");
        for (int i = 0; i < size; i++) {
            cloudlet = list.get(i);
            Log.print(indent + cloudlet.getCloudletId() + indent + indent);

            if (cloudlet.getCloudletStatus() == Cloudlet.SUCCESS) {
                    Log.print("SUCCESS");

                    Log.printLine(indent + indent + cloudlet.getResourceId()
                                    + indent + indent + indent + cloudlet.getVmId()
                                    + indent + indent
                                    + dft.format(cloudlet.getActualCPUTime()) + indent
                                    + indent + dft.format(cloudlet.getExecStartTime())
                                    + indent + indent
                                    + dft.format(cloudlet.getFinishTime()));
            }
        }
    }    
}
