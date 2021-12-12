/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ambulance;
import java.util.ArrayList;

/**
 *
 * @author mohitdaswani
 */
public class AmbulanceDirectory {
    private ArrayList<Ambulance> volunteerList;
    private Ambulance volunteer;
    
    public AmbulanceDirectory() {
        volunteerList = new ArrayList<Ambulance>();
    }

    public ArrayList<Ambulance> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Ambulance> volunteerList) {
        this.volunteerList = volunteerList;
    }

    public Ambulance getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(Ambulance volunteer) {
        this.volunteer = volunteer;
    }
    
    public Ambulance createVolunteer(String name, String username){
        volunteer = new Ambulance(name, username);
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
