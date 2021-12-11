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
public class SoupWorkQueue {
    private ArrayList<SoupWorkRequest> soupRequestList;

    public SoupWorkQueue() {
        soupRequestList = new ArrayList();
    }

    public ArrayList<SoupWorkRequest> getSoupRequestList() {
        return soupRequestList;
    }
}
