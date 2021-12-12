/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.EmergencyDistressOrg.EmergencyService;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sujay
 */
public class EmergencyWorkRequest {
    private String requestId;
    private String emgOrgName;
    private String memName;
    private String ambulanceDriverName;
    private String pickupAddress;
    private ArrayList<EmergencyService> service;
    private String status;
    private String issue; 

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getEmgOrgName() {
        return emgOrgName;
    }

    public void setEmgOrgName(String emgOrgName) {
        this.emgOrgName = emgOrgName;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getAmbulanceDriverName() {
        return ambulanceDriverName;
    }

    public void setAmbulanceDriverName(String ambulanceDriverName) {
        this.ambulanceDriverName = ambulanceDriverName;
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress;
    }

    public ArrayList<EmergencyService> getService() {
        return service;
    }

    public void setService(ArrayList<EmergencyService> service) {
        this.service = service;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }
    
    
    @Override
    public String toString() {
        return requestId;
    }
}
