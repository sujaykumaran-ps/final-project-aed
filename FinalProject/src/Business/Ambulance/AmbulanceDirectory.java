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
    private ArrayList<Ambulance> ambulanceList;
    private Ambulance ambulance;
    
    public AmbulanceDirectory() {
        ambulanceList = new ArrayList<Ambulance>();
    }

    public ArrayList<Ambulance> getAmbulanceList() {
        return ambulanceList;
    }

    public void setAmbulanceList(ArrayList<Ambulance> ambulanceList) {
        this.ambulanceList = ambulanceList;
    }

    public Ambulance getAmbulance() {
        return ambulance;
    }

    public void setAmbulance(Ambulance ambulance) {
        this.ambulance = ambulance;
    }

   
    public Ambulance createAmbulance(String name, String username){
        ambulance = new Ambulance(name, username);
        ambulanceList.add(ambulance);
        return ambulance;
    }
    
    public void deleteAmbulance(String username){
         for(int i=0; i < ambulanceList.size(); i++){
            if(ambulanceList.get(i).getAmbulanceName().equals(username)){
                ambulanceList.remove(i);
            }
        }
    }
}
