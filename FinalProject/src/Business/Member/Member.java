/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import Business.SnowClearingOrg.Service;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Member {
    private String memName;
    private String memUsername;
    private ArrayList<WorkRequest> requestList;
    private String memAddress;
    private String memPhNum;
    int id = 1;

    public Member(String cusUsername) {
        this.memUsername = memUsername;
        requestList = new ArrayList<WorkRequest>();
    }
    
    

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemUsername() {
        return memUsername;
    }

    public void setMemUsername(String memUsername) {
        this.memUsername = memUsername;
    }

    
    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<WorkRequest> requestList) {
        this.requestList = requestList;
    }

    public String getMemAddress() {
        return memAddress;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress;
    }

    public String getMemPhNum() {
        return memPhNum;
    }

    public void setMemPhNum(String memPhNum) {
        this.memPhNum = memPhNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void newRequest(String snowOrgName, String memName, String fieldWorker, ArrayList<Service> request, String cost, String deliveryAddress, String instructions) {
        WorkRequest newWork = new WorkRequest();
        newWork.setRequestId(String.valueOf(id));
        newWork.setMemName(memName);
        newWork.setSnowOrgName(snowOrgName);
        newWork.setFieldWorkerName(fieldWorker);
        newWork.setRequest(request);
        newWork.setCost(cost);
        newWork.setServiceAddress(deliveryAddress);
        newWork.setMessage(instructions);
        newWork.setStatus("New Request");
        requestList.add(newWork);
        id++;
    }
    
    @Override
    public String toString() {
        return memName;
    }

    
}
