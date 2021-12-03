/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Restaurant.Menu;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raunak
 */
public class WorkRequest {
    
    private String requestId;
    private String snowOrgName;
    private String memName;
    private String fieldWorkerName;
    private String fieldWorkerAddress;
    private ArrayList<Menu> request;
    private String cost;
    private String status;
    private String message;
    private UserAccount sender;
    private UserAccount receiver;
    private Date requestDate;
    private Date resolveDate;
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
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

    public String getFieldWorkerAddress() {
        return fieldWorkerAddress;
    }

    public void setFieldWorkerAddress(String fieldWorkerAddress) {
        this.fieldWorkerAddress = fieldWorkerAddress;
    }

    public ArrayList<Menu> getRequest() {
        return request;
    }

    public void setRequest(ArrayList<Menu> request) {
        this.request = request;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
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
        return requestId;
    }
}
