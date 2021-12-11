/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.SoupKitchenOrg.Meal;
import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class SoupWorkRequest {
    private String soupRequestId;
    private String soupKitchenName;
    private String memName;
    private String delManName;
    private String serviceAddress;
    private ArrayList<Meal> mealRequest;
    private String personName;
    private String message;
    private String status;

    public String getSoupRequestId() {
        return soupRequestId;
    }

    public void setSoupRequestId(String soupRequestId) {
        this.soupRequestId = soupRequestId;
    }

    public String getSoupKitchenName() {
        return soupKitchenName;
    }

    public void setSoupKitchenName(String soupKitchenName) {
        this.soupKitchenName = soupKitchenName;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getDelManName() {
        return delManName;
    }

    public void setDelManName(String delManName) {
        this.delManName = delManName;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }

    public void setServiceAddress(String serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public ArrayList<Meal> getMealRequest() {
        return mealRequest;
    }

    public void setMealRequest(ArrayList<Meal> mealRequest) {
        this.mealRequest = mealRequest;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
    @Override
    public String toString() {
        return soupRequestId;
    }
}
