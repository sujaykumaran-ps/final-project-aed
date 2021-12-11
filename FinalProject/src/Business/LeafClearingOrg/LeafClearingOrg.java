/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LeafClearingOrg;

import Business.WorkQueue.LeafWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class LeafClearingOrg {
    private String userName;
    int id = 1;
    private ArrayList<LeafService> serviceList;
    private ArrayList<LeafWorkRequest> leafRequestList;
    private String leafOrgName;
    private String leafOrgAddress;
    private String leafOrgPhNum;
    private String leafOrgEmail;
    
    public LeafClearingOrg(String name) {
        this.userName = name;
        serviceList = new ArrayList<LeafService>();
        leafRequestList = new ArrayList<LeafWorkRequest>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<LeafService> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<LeafService> serviceList) {
        this.serviceList = serviceList;
    }

    public ArrayList<LeafWorkRequest> getLeafRequestList() {
        return leafRequestList;
    }

    public void setLeafRequestList(ArrayList<LeafWorkRequest> leafRequestList) {
        this.leafRequestList = leafRequestList;
    }


    public String getLeafOrgName() {
        return leafOrgName;
    }

    public void setLeafOrgName(String leafOrgName) {
        this.leafOrgName = leafOrgName;
    }

    public String getLeafOrgAddress() {
        return leafOrgAddress;
    }

    public void setLeafOrgAddress(String leafOrgAddress) {
        this.leafOrgAddress = leafOrgAddress;
    }

    public String getLeafOrgPhNum() {
        return leafOrgPhNum;
    }

    public void setLeafOrgPhNum(String leafOrgPhNum) {
        this.leafOrgPhNum = leafOrgPhNum;
    }

    public String getLeafOrgEmail() {
        return leafOrgEmail;
    }

    public void setLeafOrgEmail(String leafOrgEmail) {
        this.leafOrgEmail = leafOrgEmail;
    }

    
    
    
    
    public void addServices(LeafService dish){
        serviceList.add(dish);
    }
    
    public void removeServices(LeafService dish){
        serviceList.remove(dish);
    }
    
    public void newRequest(String leafOrgName, String memName, String fieldWorker, ArrayList<LeafService> request, String serviceAddress, String instructions) {
        LeafWorkRequest newWork = new LeafWorkRequest();
        newWork.setLeafRequestId(String.valueOf(id));
        newWork.setMemName(memName);
        newWork.setLeafOrgName(leafOrgName);
        newWork.setFieldWorkerName(fieldWorker);
        newWork.setLeafRequest(request);
        newWork.setServiceAddress(serviceAddress);
        newWork.setMessage(instructions);
        newWork.setStatus("New Request");
        leafRequestList.add(newWork);
        id++;
    }
    @Override
    public String toString() {
        return leafOrgName;
    }
    
}
