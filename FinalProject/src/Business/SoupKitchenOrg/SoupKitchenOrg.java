/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SoupKitchenOrg;

import Business.WorkQueue.SoupWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class SoupKitchenOrg {
    private String userName;
    int orderid = 1;
    private ArrayList<Meal> mealList;
    private ArrayList<SoupWorkRequest> soupRequestList;
    private String soupName;
    private String soupLocation;
    private String soupPhNum;
    
    public SoupKitchenOrg(String name) {
        this.userName = name;
        mealList = new ArrayList<Meal>();
        soupRequestList = new ArrayList<SoupWorkRequest>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getOrderid() {
        return orderid;
    }

    public void setOrderid(int orderid) {
        this.orderid = orderid;
    }

    public ArrayList<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(ArrayList<Meal> mealList) {
        this.mealList = mealList;
    }

    public ArrayList<SoupWorkRequest> getSoupRequestList() {
        return soupRequestList;
    }

    public void setSoupRequestList(ArrayList<SoupWorkRequest> soupRequestList) {
        this.soupRequestList = soupRequestList;
    }

    public String getSoupName() {
        return soupName;
    }

    public void setSoupName(String soupName) {
        this.soupName = soupName;
    }

    public String getSoupLocation() {
        return soupLocation;
    }

    public void setSoupLocation(String soupLocation) {
        this.soupLocation = soupLocation;
    }

    public String getSoupPhNum() {
        return soupPhNum;
    }

    public void setSoupPhNum(String soupPhNum) {
        this.soupPhNum = soupPhNum;
    }
    
    public void addMeal(Meal mealOfTheDay){
        mealList.add(mealOfTheDay);
    }
    
    public void removeMeal(Meal mealOfTheDay){
        mealList.remove(mealOfTheDay);
    }
    
    public void newOrder(String soupName, String memName, String delMan, ArrayList<Meal> order, String deliveryAddress, String personName, String instructions) {
        SoupWorkRequest newReq = new SoupWorkRequest();
        newReq.setSoupRequestId(String.valueOf(orderid));
        newReq.setMemName(memName);
        newReq.setSoupKitchenName(soupName);
        newReq.setDelManName(delMan);
        newReq.setMealRequest(order);
        newReq.setServiceAddress(deliveryAddress);
        newReq.setPersonName(personName);
        newReq.setMessage(instructions);
        newReq.setStatus("New Order");
        soupRequestList.add(newReq);
        orderid++;
    }
    
    @Override
    public String toString() {
        return soupName;
    }
}
