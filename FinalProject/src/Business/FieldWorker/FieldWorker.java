/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FieldWorker;

import Business.SnowClearingOrg.Service;
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
    private String fieldWorkerAddress;
    private String fieldWorkerPhNum;
    
    public FieldWorker(String name, String userName){
        this.fieldWorkerName = name;
        this.fieldWorkerUsername = userName;
        requestList = new ArrayList<WorkRequest>();
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

       
    
    public void addRequest(String snowOrgName, String memName, String fieldWorkerName, ArrayList<Service> request, String cost, String fieldWorkerAddress) {
       WorkRequest newWork = new WorkRequest();
     
       newWork.setFieldWorkerName(fieldWorkerName);
       newWork.setSnowOrgName(snowOrgName);
       newWork.setMemName(memName);
       newWork.setRequest(request);
       newWork.setCost(cost);
       newWork.setServiceAddress(fieldWorkerAddress);
       newWork.setStatus("New Request");
       requestList.add(newWork);
    }
    
    @Override
    public String toString() {
        return fieldWorkerName;
    }
    
    
}
