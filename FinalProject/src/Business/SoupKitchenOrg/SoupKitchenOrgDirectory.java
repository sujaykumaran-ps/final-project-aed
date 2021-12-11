/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SoupKitchenOrg;

import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class SoupKitchenOrgDirectory {
    private ArrayList<SoupKitchenOrg> soupKitchenList;
    private SoupKitchenOrg soup;
    private Meal mealOfTheDay;
    
    public SoupKitchenOrgDirectory(){
        this.soupKitchenList = new ArrayList<SoupKitchenOrg>();
    }

    public ArrayList<SoupKitchenOrg> getSoupKitchenList() {
        return soupKitchenList;
    }

    public void setSoupKitchenList(ArrayList<SoupKitchenOrg> soupKitchenList) {
        this.soupKitchenList = soupKitchenList;
    }
    
    public SoupKitchenOrg createSoupInfo(String soupName){
        soup = new SoupKitchenOrg(soupName);
        soupKitchenList.add(soup);
        return soup;
    }
    
    public void deleteSoup(String username){
        for(int i=0;i<soupKitchenList.size();i++){
            if(soupKitchenList.get(i).getUserName().equals(username)){
                soupKitchenList.remove(i);
            }
        }
    }
    
    public void updateSoupInfo(SoupKitchenOrg soup, String name, String number, String location){
        soup.setSoupName(name);
        soup.setSoupLocation(location);
        soup.setSoupPhNum(number);
    }
    
    public Meal addSoupMeal(SoupKitchenOrg soup, String name, String desc, String beverage){
        mealOfTheDay = new Meal(name, desc, beverage);
        soup.addMeal(mealOfTheDay);
        return mealOfTheDay;
    }
    
    public void DeleteSoupMeal(SoupKitchenOrg soup, Meal mealOfTheDay){
        soup.removeMeal(mealOfTheDay); 
    }
    
}
