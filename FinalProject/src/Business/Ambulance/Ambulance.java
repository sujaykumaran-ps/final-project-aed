package Business.Ambulance;

import Business.EmergencyDistressOrg.EmergencyService;
import Business.WorkQueue.EmergencyWorkRequest;
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
public class Ambulance {
    private String ambulanceName;
    private String ambulanceUsername;
    private ArrayList<EmergencyWorkRequest> emgRequestList;
    private String ambulanceAddress;
    private String ambulancePhNum;
    private Boolean availability = true;
            
    public Ambulance(String name, String userName){
        this.ambulanceName = name;
        this.ambulanceUsername = userName;
        emgRequestList = new ArrayList<EmergencyWorkRequest>();
    }

    public String getAmbulanceName() {
        return ambulanceName;
    }

    public void setAmbulanceName(String ambulanceName) {
        this.ambulanceName = ambulanceName;
    }

    public String getAmbulanceUsername() {
        return ambulanceUsername;
    }

    public void setAmbulanceUsername(String ambulanceUsername) {
        this.ambulanceUsername = ambulanceUsername;
    }

    public ArrayList<EmergencyWorkRequest> getEmgRequestList() {
        return emgRequestList;
    }

    public void setEmgRequestList(ArrayList<EmergencyWorkRequest> emgRequestList) {
        this.emgRequestList = emgRequestList;
    }

    public String getAmbulanceAddress() {
        return ambulanceAddress;
    }

    public void setAmbulanceAddress(String ambulanceAddress) {
        this.ambulanceAddress = ambulanceAddress;
    }

    public String getAmbulancePhNum() {
        return ambulancePhNum;
    }

    public void setAmbulancePhNum(String ambulancePhNum) {
        this.ambulancePhNum = ambulancePhNum;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
    public void newEmgRequest(String emergencyOrgName, String memName, String ambulanceDriver, ArrayList<EmergencyService> request, String serviceAddress, String problem) {
        EmergencyWorkRequest newWork = new EmergencyWorkRequest();
        newWork.setMemName(memName);
        newWork.setEmgOrgName(emergencyOrgName);
        newWork.setAmbulanceDriverName(ambulanceDriver);
        newWork.setService(request);
        newWork.setPickupAddress(serviceAddress);
        newWork.setIssue(problem);
        newWork.setStatus("New Request");
        emgRequestList.add(newWork);
    }
    
    @Override
    public String toString() {
        return ambulanceName;
    }
}
