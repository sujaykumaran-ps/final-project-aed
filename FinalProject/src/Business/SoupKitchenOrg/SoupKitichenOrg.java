package Business.SoupKitchenOrg;

import Business.SoupKitchenOrg.SoupKitchenService;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohitdaswani
 */
public class SoupKitichenOrg {
    private String userName;
    int id = 1;
    private ArrayList<SoupKitchenService> serviceList;
    private ArrayList<WorkRequest> requestList;
    private String soupOrgName;
    private String soupOrgAddress;
    private String soupOrgPhNum;
    private String soupOrgEmail;
    
    public SoupKitichenOrg(String name) {
        this.userName = name;
        serviceList = new ArrayList<SoupKitchenService>();
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

    public ArrayList<SoupKitchenService> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<SoupKitchenService> serviceList) {
        this.serviceList = serviceList;
    }


    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<WorkRequest> requestList) {
        this.requestList = requestList;
    }

    public String getSoupOrgName() {
        return soupOrgName;
    }

    public void setSoupOrgName(String soupOrgName) {
        this.soupOrgName = soupOrgName;
    }

    public String getSoupOrgAddress() {
        return soupOrgAddress;
    }

    public void setSoupOrgAddress(String soupOrgAddress) {
        this.soupOrgAddress = soupOrgAddress;
    }

    public String getSoupOrgPhNum() {
        return soupOrgPhNum;
    }

    public void setSoupOrgPhNum(String soupOrgPhNum) {
        this.soupOrgPhNum = soupOrgPhNum;
    }

    public String getSoupOrgEmail() {
        return soupOrgEmail;
    }

    public void setSoupOrgEmail(String soupOrgEmail) {
        this.soupOrgEmail = soupOrgEmail;
    }

    
    
    
    
    public void addServices(SoupKitchenService dish){
        serviceList.add(dish);
    }
    
    public void removeServices(SoupKitchenService dish){
        serviceList.remove(dish);
    }
    
    public void newRequest(String soupOrgName, String memName, String fieldWorker, ArrayList<SoupKitchenService> request, String serviceAddress, String instructions) {
        WorkRequest newWork = new WorkRequest();
        newWork.setRequestId(String.valueOf(id));
        newWork.setMemName(memName);
        newWork.setSoupOrgName(soupOrgName);
        newWork.setFieldWorkerName(fieldWorker);
        newWork.setSoupRequest(request);
        newWork.setServiceAddress(serviceAddress);
        newWork.setMessage(instructions);
        newWork.setStatus("New Request");
        requestList.add(newWork);
        id++;
    }
    @Override
    public String toString() {
        return soupOrgName;
    }
}
