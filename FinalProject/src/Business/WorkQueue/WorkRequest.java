/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.EmergencyDistressOrg.EmergencyService;
import Business.LeafClearingOrg.LeafService;
import Business.SnowClearingOrg.Service;
import Business.SoupKitchenOrg.SoupKitchenService;
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
    private String soupOrgName;
    private String emergencyOrgName;

    public String getEmergencyOrgName() {
        return emergencyOrgName;
    }

    public void setEmergencyOrgName(String emergencyOrgName) {
        this.emergencyOrgName = emergencyOrgName;
    }

    private String fieldWorkerName;
    private String serviceAddress;
    private ArrayList<Service> request;
    private ArrayList<LeafService> leafRequest;
    private ArrayList<SoupKitchenService> soupRequest;
    private ArrayList<EmergencyService> emergencyRequest;

    public ArrayList<EmergencyService> getEmergencyRequest() {
        return emergencyRequest;
    }

    public void setEmergencyRequest(ArrayList<EmergencyService> emergencyRequest) {
        this.emergencyRequest = emergencyRequest;
    }

    public ArrayList<SoupKitchenService> getSoupRequest() {
        return soupRequest;
    }

    public void setSoupRequest(ArrayList<SoupKitchenService> soupRequest) {
        this.soupRequest = soupRequest;
    }

    public String getSoupOrgName() {
        return soupOrgName;
    }

    public void setSoupOrgName(String soupOrgName) {
        this.soupOrgName = soupOrgName;
    }

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

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }


    public ArrayList<Service> getRequest() {
        return request;
    }

    public void setRequest(ArrayList<Service> request) {
        this.request = request;
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
        return requestId;
    }
}
