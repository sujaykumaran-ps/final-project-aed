/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryVolunteer;

import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class DeliveryVolunteerDirectory {
    private ArrayList<DeliveryVolunteer> volunteerList;
    private DeliveryVolunteer volunteer;
    
    public DeliveryVolunteerDirectory() {
        volunteerList = new ArrayList<DeliveryVolunteer>();
    }

    public ArrayList<DeliveryVolunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<DeliveryVolunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }

    public DeliveryVolunteer getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(DeliveryVolunteer volunteer) {
        this.volunteer = volunteer;
    }
    
    public DeliveryVolunteer createVolunteer(String name, String username){
        volunteer = new DeliveryVolunteer(name, username);
        volunteerList.add(volunteer);
        return volunteer;
    }
    
    public void deleteVolunteer(String username){
         for(int i=0; i < volunteerList.size(); i++){
            if(volunteerList.get(i).getVolunteerName().equals(username)){
                volunteerList.remove(i);
            }
        }
    }
}
