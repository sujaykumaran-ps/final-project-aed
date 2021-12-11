/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SoupKitchenOrg;
import java.util.ArrayList;

/**
 *
 * @author mohitdaswani
 */
public class SoupKitchenOrgDirectory {
    
    private ArrayList<SoupKitchenOrg> soupKitchenOrgList;
    private SoupKitchenOrg soupKitchenOrg;
    private Service service;
    

    public SoupKitchenOrgDirectory(){
        this.snowClearingOrgList = new ArrayList<SoupKitchenOrg>();
    }

    public ArrayList<SoupKitchenOrg> getSoupKitchenOrgList() {
        return soupKitchenOrgList;
    }

    public void setSoupKitchenOrgList(ArrayList<SoupKitchenOrg> soupKitchenOrgList) {
        this.soupKitchenList = soupKitchenOrgList;
    }
    
    public SoupKitchenOrg createSoupKitchenOrgInfo(String orgName){
        soupKitchenOrg= new SoupKitchenOrg(orgName);
       soupKitchenOrgList.add(soupKitchenOrg);
        return soupKitchenOrg;
    }
    
    public void deleteSoupKitchenOrg(String username){
        for(int i=0;i<soupKitchenOrgList.size();i++){
            if(soupKitchenOrgList.get(i).getUserName().equals(username)){
                soupKitchenOrgList.remove(i);
            }
        }
    }
    
    public void updateSnowClearingOrgInfo(SoupKitchenOrg org, String name, String number, String address, String cuisine){
        org.setSoupOrgName(name);
        org.setSoupOrgAddress(address);
        org.setSoupOrgPhNum(number);
        org.setSoupOrgEmail(cuisine);
    }
    
    public SoupKitchenService addServiceTypes(SoupKitchenOrg org, String name, String desc, String type){
        service = new SoupKitchenService(name, desc, type);
        org.addServices(service);
        return service;
    }
    
    public void DeleteServices(SoupKitchenOrg res, SoupKitchenService service){
        res.removeServices(service); 
    }
    
}
