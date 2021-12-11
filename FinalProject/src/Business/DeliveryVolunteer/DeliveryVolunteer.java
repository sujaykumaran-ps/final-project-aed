/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryVolunteer;

import Business.WorkQueue.SoupWorkRequest;
import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class DeliveryVolunteer {
    private String volunteerName;
    private String volunteerUsername;
    private ArrayList<SoupWorkRequest> soupRequestList;
    private String volunteerAddress;
    private String volunteerPhNum;
    private Boolean availability = true;
    
    public DeliveryVolunteer(String name, String userName){
        this.volunteerName = name;
        this.volunteerUsername = userName;
        soupRequestList = new ArrayList<SoupWorkRequest>();
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVolunteerUsername() {
        return volunteerUsername;
    }

    public void setVolunteerUsername(String volunteerUsername) {
        this.volunteerUsername = volunteerUsername;
    }

    public ArrayList<SoupWorkRequest> getSoupRequestList() {
        return soupRequestList;
    }

    public void setSoupRequestList(ArrayList<SoupWorkRequest> soupRequestList) {
        this.soupRequestList = soupRequestList;
    }

    public String getVolunteerAddress() {
        return volunteerAddress;
    }

    public void setVolunteerAddress(String volunteerAddress) {
        this.volunteerAddress = volunteerAddress;
    }

    public String getVolunteerPhNum() {
        return volunteerPhNum;
    }

    public void setVolunteerPhNum(String volunteerPhNum) {
        this.volunteerPhNum = volunteerPhNum;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }
    
    
}
