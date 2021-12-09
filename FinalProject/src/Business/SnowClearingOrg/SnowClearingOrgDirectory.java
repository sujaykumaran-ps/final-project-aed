/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SnowClearingOrg;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class SnowClearingOrgDirectory {
    
    private ArrayList<SnowClearingOrg> snowClearingOrgList;
    private SnowClearingOrg snowClearingOrg;
    private Service service;
    

    public SnowClearingOrgDirectory(){
        this.snowClearingOrgList = new ArrayList<SnowClearingOrg>();
    }

    public ArrayList<SnowClearingOrg> getSnowClearingOrgList() {
        return snowClearingOrgList;
    }

    public void setSnowClearingOrgList(ArrayList<SnowClearingOrg> snowClearingOrgList) {
        this.snowClearingOrgList = snowClearingOrgList;
    }
    
    public SnowClearingOrg createSnowClearingOrgInfo(String resName){
        snowClearingOrg= new SnowClearingOrg(resName);
        snowClearingOrgList.add(snowClearingOrg);
        return snowClearingOrg;
    }
    
    public void deleteSnowClearingOrg(String username){
        for(int i=0;i<snowClearingOrgList.size();i++){
            if(snowClearingOrgList.get(i).getUserName().equals(username)){
                snowClearingOrgList.remove(i);
            }
        }
    }
    
    public void updateSnowClearingOrgInfo(SnowClearingOrg org, String name, String number, String address, String cuisine){
        org.setSnowOrgName(name);
        org.setSnowOrgAddress(address);
        org.setSnowOrgPhNum(number);
        org.setSnowOrgEmail(cuisine);
    }
    
    public Service addServiceTypes(SnowClearingOrg res, String name, String desc, String amount){
        service = new Service(name, desc, amount);
        res.addServices(service);
        return service;
    }
    
    public void DeleteServices(SnowClearingOrg res, Service dishes){
        res.removeServices(dishes); 
    }
    
}
