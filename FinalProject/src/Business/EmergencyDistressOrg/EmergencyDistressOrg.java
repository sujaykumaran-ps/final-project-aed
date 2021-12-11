/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyDistressOrg;

import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class EmergencyDistressOrg {
    private String userName;
    int id = 1;
    private ArrayList<EmergencyService> serviceList;
    private ArrayList<WorkRequest> requestList;
    private String emergencyOrgName;
    private String emergencyOrgAddress;
    private String emergencyOrgPhNum;
    private String emergencyOrgEmail;
    
    public EmergencyDistressOrg(String name) {
        this.userName = name;
        serviceList = new ArrayList<EmergencyService>();
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

    public ArrayList<EmergencyService> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<EmergencyService> serviceList) {
        this.serviceList = serviceList;
    }


    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<WorkRequest> requestList) {
        this.requestList = requestList;
    }

    public String getEmergencyOrgName() {
        return emergencyOrgName;
    }

    public void setEmergencyOrgName(String emergencyOrgName) {
        this.emergencyOrgName = emergencyOrgName;
    }

    public String getEmergencyOrgAddress() {
        return emergencyOrgAddress;
    }

    public void setEmergencyOrgAddress(String leafOrgAddress) {
        this.emergencyOrgAddress = leafOrgAddress;
    }

    public String getEmergencyOrgPhNum() {
        return emergencyOrgPhNum;
    }

    public void setEmergencyOrgPhNum(String leafOrgPhNum) {
        this.emergencyOrgPhNum = emergencyOrgPhNum;
    }

    public String getEmergencyOrgEmail() {
        return emergencyOrgEmail;
    }

    public void setEmergencyOrgEmail(String emergencyOrgEmail) {
        this.emergencyOrgEmail = emergencyOrgEmail;
    }

    
    
    
    
    public void addServices(EmergencyService dish){
        serviceList.add(dish);
    }
    
    public void removeServices(EmergencyService dish){
        serviceList.remove(dish);
    }
    
    public void newRequest(String emergencyOrgName, String memName, String fieldWorker, ArrayList<EmergencyService> request, String serviceAddress, String instructions) {
        WorkRequest newWork = new WorkRequest();
        newWork.setRequestId(String.valueOf(id));
        newWork.setMemName(memName);
        newWork.setEmergencyOrgName(emergencyOrgName);
        newWork.setFieldWorkerName(fieldWorker);
        newWork.setEmergencyRequest(request);
        newWork.setServiceAddress(serviceAddress);
        newWork.setMessage(instructions);
        newWork.setStatus("New Request");
        requestList.add(newWork);
        id++;
    }
    @Override
    public String toString() {
        return emergencyOrgName;
    }
    
}
