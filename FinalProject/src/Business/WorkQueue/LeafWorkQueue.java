/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class LeafWorkQueue {
    private ArrayList<LeafWorkRequest> leafWorkRequestList;

    public ArrayList<LeafWorkRequest> getLeafWorkRequestList() {
        return leafWorkRequestList;
    }

    public void setLeafWorkRequestList(ArrayList<LeafWorkRequest> leafWorkRequestList) {
        this.leafWorkRequestList = leafWorkRequestList;
    }
    
    
    
}
