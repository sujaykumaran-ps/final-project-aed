/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FieldWorker;

import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class FieldWorkerDirectory {
    
    private ArrayList<FieldWorker> FieldWorkerList;
    private FieldWorker FieldWorker;
    
    public FieldWorkerDirectory() {
        FieldWorkerList = new ArrayList<FieldWorker>();
    }

    public ArrayList<FieldWorker> getDeliveryManList() {
        return FieldWorkerList;
    }

    public void setDeliveryManList(ArrayList<FieldWorker> deliveryManList) {
        this.FieldWorkerList = deliveryManList;
    }

    public FieldWorker getDeliveryMan() {
        return FieldWorker;
    }

    public void setDeliveryMan(FieldWorker deliveryMan) {
        this.FieldWorker = FieldWorker;
    }
    
    public FieldWorker createFieldWorker(String name, String username){
        FieldWorker = new FieldWorker(name, username);
        FieldWorkerList.add(FieldWorker);
        return FieldWorker;
    }
    
    public void deleteDeliveryMan(String username){
         for(int i=0; i < FieldWorkerList.size(); i++){
            if(FieldWorkerList.get(i).getFieldWorkerName().equals(username)){
                FieldWorkerList.remove(i);
            }
        }
    }
    
    
    
}
