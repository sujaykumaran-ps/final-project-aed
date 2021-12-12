/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class EmergencyWorkQueue {
    private ArrayList<EmergencyWorkRequest> emergencyWorkRequestList;

    public ArrayList<EmergencyWorkRequest> getEmergencyWorkRequestList() {
        return emergencyWorkRequestList;
    }

    public void setEmergencyWorkRequestList(ArrayList<EmergencyWorkRequest> emergencyWorkRequestList) {
        this.emergencyWorkRequestList = emergencyWorkRequestList;
    }
    
    
}
