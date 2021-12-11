/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.LeafClearingOrg.LeafService;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sujay
 */
public class LeafWorkRequest {
    private String leafRequestId;
    private String snowOrgName;
    private String memName;
    private String fieldWorkerName;
    private String serviceAddress;
    private ArrayList<LeafService> leafRequest;

    public ArrayList<LeafService> getLeafRequest() {
        return leafRequest;
    }

    public void setLeafRequest(ArrayList<LeafService> leafRequest) {
        this.leafRequest = leafRequest;
    }

    private String type;
    private String status;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private Date requestDate;
    private Date resolveDate;
    private String leafOrgName;

    public String getLeafOrgName() {
        return leafOrgName;
    }

    public void setLeafOrgName(String leafOrgName) {
        this.leafOrgName = leafOrgName;
    }

    
    public LeafWorkRequest(){
        requestDate = new Date();
    }

    public String getLeafRequestId() {
        return leafRequestId;
    }

    public void setLeafRequestId(String leafRequestId) {
        this.leafRequestId = leafRequestId;
    }

    
    public String getSnowOrgName() {
        return snowOrgName;
    }

    public void setSnowOrgName(String snowOrgName) {
        this.snowOrgName = snowOrgName;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getFieldWorkerName() {
        return fieldWorkerName;
    }

    public void setFieldWorkerName(String fieldWorkerName) {
        this.fieldWorkerName = fieldWorkerName;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }
    
     
    
    @Override
    public String toString() {
        return leafRequestId;
    }
}
