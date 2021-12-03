/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SnowClearingOrg;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class SnowClearingOrg {
    private String userName;
    int id = 1;
    private ArrayList<Service> serviceList;
    private ArrayList<WorkRequest> requestList;
    private String snowOrgName;
    private String snowOrgNameAddress;
    private String snowOrgNamePhNum;
    private String snowOrgNameEmail;
    
    public SnowClearingOrg(String name) {
        this.userName = name;
        serviceList = new ArrayList<Service>();
        requestList = new ArrayList<WorkRequest>();
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

    public ArrayList<Service> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<Service> serviceList) {
        this.serviceList = serviceList;
    }


    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<WorkRequest> requestList) {
        this.requestList = requestList;
    }

    public String getSnowOrgName() {
        return snowOrgName;
    }

    public void setSnowOrgName(String snowOrgName) {
        this.snowOrgName = snowOrgName;
    }

    public String getSnowOrgNameAddress() {
        return snowOrgNameAddress;
    }

    public void setSnowOrgNameAddress(String snowOrgNameAddress) {
        this.snowOrgNameAddress = snowOrgNameAddress;
    }

    public String getSnowOrgNamePhNum() {
        return snowOrgNamePhNum;
    }

    public void setSnowOrgNamePhNum(String snowOrgNamePhNum) {
        this.snowOrgNamePhNum = snowOrgNamePhNum;
    }

    public String getSnowOrgNameEmail() {
        return snowOrgNameEmail;
    }

    public void setSnowOrgNameEmail(String snowOrgNameEmail) {
        this.snowOrgNameEmail = snowOrgNameEmail;
    }
    
    
    
    public void addServices(Service dish){
        serviceList.add(dish);
    }
    
    public void removeServices(Service dish){
        serviceList.remove(dish);
    }
    
public void newRequest(String snowOrgName, String memName, String fieldWorker, ArrayList<Service> request, String cost, String deliveryAddress, String instructions) {
WorkRequest newWork = new WorkRequest();
newWork.setRequestId(String.valueOf(id));
newWork.setMemName(memName);
newWork.setSnowOrgName(snowOrgName);
newWork.setFieldWorkerName(fieldWorker);
newWork.setRequest(request);
newWork.setCost(cost);
newWork.setDelAddress(deliveryAddress);
newWork.setMessage(instructions);
newWork.setStatus("New Request");
requestList.add(newWork);
id++;
}
    @Override
    public String toString() {
        return snowOrgName;
    }
    
}
