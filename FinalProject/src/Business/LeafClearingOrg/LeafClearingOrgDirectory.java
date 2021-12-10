/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.LeafClearingOrg;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class LeafClearingOrgDirectory {
    
    private ArrayList<LeafClearingOrg> leafClearingOrgList;
    private LeafClearingOrg leafClearingOrg;
    private LeafService service;
    

    public LeafClearingOrgDirectory(){
        this.leafClearingOrgList = new ArrayList<LeafClearingOrg>();
    }

    public ArrayList<LeafClearingOrg> getLeafClearingOrgList() {
        return leafClearingOrgList;
    }

    public void setLeafClearingOrgList(ArrayList<LeafClearingOrg> leafClearingOrgList) {
        this.leafClearingOrgList = leafClearingOrgList;
    }
    
    public LeafClearingOrg createLeafClearingOrgInfo(String orgName){
        leafClearingOrg= new LeafClearingOrg(orgName);
        leafClearingOrgList.add(leafClearingOrg);
        return leafClearingOrg;
    }
    
    public void deleteLeafClearingOrg(String username){
        for(int i=0;i<leafClearingOrgList.size();i++){
            if(leafClearingOrgList.get(i).getUserName().equals(username)){
                leafClearingOrgList.remove(i);
            }
        }
    }
    
    public void updateLeafClearingOrgInfo(LeafClearingOrg org, String name, String number, String address, String cuisine){
        org.setLeafOrgName(name);
        org.setLeafOrgAddress(address);
        org.setLeafOrgPhNum(number);
        org.setLeafOrgEmail(cuisine);
    }
    
    public LeafService addServiceTypes(LeafClearingOrg org, String name, String desc, String type){
        service = new LeafService(name, desc, type);
        org.addServices(service);
        return service;
    }
    
    public void DeleteServices(LeafClearingOrg res, LeafService service){
        res.removeServices(service); 
    }
    
}
