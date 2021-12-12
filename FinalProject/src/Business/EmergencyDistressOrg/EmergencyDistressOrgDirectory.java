/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyDistressOrg;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class EmergencyDistressOrgDirectory {
    
    private ArrayList<EmergencyDistressOrg> emergencyDistressOrgList;
    private EmergencyDistressOrg emergencyDistressOrg;
    private EmergencyService service;
    

    public EmergencyDistressOrgDirectory(){
        this.emergencyDistressOrgList = new ArrayList<EmergencyDistressOrg>();
    }

    public ArrayList<EmergencyDistressOrg> getEmergencyDistressOrgList() {
        return emergencyDistressOrgList;
    }

    public void setEmergencyDistressOrgList(ArrayList<EmergencyDistressOrg> emergencyDistressOrgList) {
        this.emergencyDistressOrgList = emergencyDistressOrgList;
    }
    
    public EmergencyDistressOrg createEmergencyDistressOrgInfo(String orgName){
        emergencyDistressOrg= new EmergencyDistressOrg(orgName);
        emergencyDistressOrgList.add(emergencyDistressOrg);
        return emergencyDistressOrg;
    }
    
    public void deleteEmergencyDistressOrg(String username){
        for(int i=0;i<emergencyDistressOrgList.size();i++){
            if(emergencyDistressOrgList.get(i).getUserName().equals(username)){
                emergencyDistressOrgList.remove(i);
            }
        }
    }
    
    public void updateEmergencyDistressOrgInfo(EmergencyDistressOrg org, String name, String number, String address, String cuisine){
        org.setEmergencyOrgName(name);
        org.setEmergencyOrgAddress(address);
        org.setEmergencyOrgPhNum(number);
        org.setEmergencyOrgEmail(cuisine);
    }
    
    public EmergencyService addServiceTypes(EmergencyDistressOrg org, String name, String desc, String type){
        service = new EmergencyService(name, desc, type);
        org.addServices(service);
        return service;
    }
    
    public void DeleteServices(EmergencyDistressOrg res, EmergencyService service){
        res.removeServices(service); 
    }
    
}
