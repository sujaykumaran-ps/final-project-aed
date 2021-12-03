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
    
    public SnowClearingOrg createRestaurantInfo(String resName){
        snowClearingOrg= new SnowClearingOrg(resName);
        snowClearingOrgList.add(snowClearingOrg);
        return snowClearingOrg;
    }
    
    public void deleteRestaurent(String username){
        for(int i=0;i<snowClearingOrgList.size();i++){
            if(snowClearingOrgList.get(i).getUserName().equals(username)){
                snowClearingOrgList.remove(i);
            }
        }
    }
    
    public void updateRestaurantInfo(SnowClearingOrg res, String name, String number, String address, String cuisine){
        res.setSnowOrgName(name);
        res.setSnowOrgNameAddress(address);
        res.setSnowOrgNamePhNum(number);
        res.setSnowOrgNameEmail(cuisine);
    }
    
    public Service addMenuDishes(SnowClearingOrg res, String name, String desc, String amount){
        service = new Service(name, desc, amount);
        res.addServices(service);
        return service;
    }
    
    public void DeleteDishes(SnowClearingOrg res, Service dishes){
        res.removeServices(dishes); 
    }
    
}