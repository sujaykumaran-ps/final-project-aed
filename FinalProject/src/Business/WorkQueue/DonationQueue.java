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
public class DonationQueue {
    private ArrayList<DonationRequest> donationRequestList;

    public ArrayList<DonationRequest> getDonationRequestList() {
        return donationRequestList;
    }

    public void setDonationRequestList(ArrayList<DonationRequest> donationRequestList) {
        this.donationRequestList = donationRequestList;
    }
    
}
