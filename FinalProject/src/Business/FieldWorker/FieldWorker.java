/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FieldWorker;

import Business.LeafClearingOrg.LeafService;
import Business.SnowClearingOrg.Service;
import Business.WorkQueue.LeafWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class FieldWorker {
    private String fieldWorkerName;
    private String fieldWorkerUsername;
    private ArrayList<WorkRequest> requestList;
    private ArrayList<LeafWorkRequest> leafRequestList;
    private String fieldWorkerAddress;
    private String fieldWorkerPhNum;
    private Boolean availability = true;
    
    public FieldWorker(String name, String userName){
        this.fieldWorkerName = name;
        this.fieldWorkerUsername = userName;
        requestList = new ArrayList<WorkRequest>();
        leafRequestList = new ArrayList<LeafWorkRequest>();
    }

    public String getFieldWorkerName() {
        return fieldWorkerName;
    }

    public void setFieldWorkerName(String fieldWorkerName) {
        this.fieldWorkerName = fieldWorkerName;
    }

    public String getFieldWorkerUsername() {
        return fieldWorkerUsername;
    }

    public void setFieldWorkerUsername(String fieldWorkerUsername) {
        this.fieldWorkerUsername = fieldWorkerUsername;
    }

    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<WorkRequest> requestList) {
        this.requestList = requestList;
    }
    
    

    public String getFieldWorkerAddress() {
        return fieldWorkerAddress;
    }

    public void setFieldWorkerAddress(String fieldWorkerAddress) {
        this.fieldWorkerAddress = fieldWorkerAddress;
    }

    public String getFieldWorkerPhNum() {
        return fieldWorkerPhNum;
    }

    public void setFieldWorkerPhNum(String fieldWorkerPhNum) {
        this.fieldWorkerPhNum = fieldWorkerPhNum;
    }

    public ArrayList<LeafWorkRequest> getLeafRequestList() {
        return leafRequestList;
    }

    public void setLeafRequestList(ArrayList<LeafWorkRequest> leafRequestList) {
        this.leafRequestList = leafRequestList;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
       
    
    public void addRequest(String snowOrgName, String memName, String fieldWorkerName, ArrayList<Service> request, String cost, String fieldWorkerAddress) {
       WorkRequest newWork = new WorkRequest();
     
       newWork.setFieldWorkerName(fieldWorkerName);
       newWork.setSnowOrgName(snowOrgName);
       newWork.setMemName(memName);
       newWork.setRequest(request);
       newWork.setType(cost);
       newWork.setServiceAddress(fieldWorkerAddress);
       newWork.setStatus("New Request");
       requestList.add(newWork);
    }
    
    public void addLeafRequest(String leafOrgName, String memName, String fieldWorkerName, ArrayList<LeafService> request, String cost, String fieldWorkerAddress) {
       LeafWorkRequest newWork = new LeafWorkRequest();
       newWork.setFieldWorkerName(fieldWorkerName);
       newWork.setSnowOrgName(leafOrgName);
       newWork.setMemName(memName);
       newWork.setLeafRequest(request);
       newWork.setType(cost);
       newWork.setServiceAddress(fieldWorkerAddress);
       newWork.setStatus("New Request");
       leafRequestList.add(newWork);
    }
    
    @Override
    public String toString() {
        return fieldWorkerName;
    }
    
    
}
