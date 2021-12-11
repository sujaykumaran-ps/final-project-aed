/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.FundRaising.Funds;
import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class DonationRequest {
    private String donationId;
    private String fundOrgName;
    private String memName;
    private String memberPhNum;
    private ArrayList<Funds> donation;
    private int totalDonation = 0;

    public String getDonationId() {
        return donationId;
    }

    public void setDonationId(String donationId) {
        this.donationId = donationId;
    }

    public String getFundOrgName() {
        return fundOrgName;
    }

    public void setFundOrgName(String fundOrgName) {
        this.fundOrgName = fundOrgName;
    }

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemberPhNum() {
        return memberPhNum;
    }

    public void setMemberPhNum(String memberPhNum) {
        this.memberPhNum = memberPhNum;
    }

    public ArrayList<Funds> getDonation() {
        return donation;
    }

    public void setDonation(ArrayList<Funds> donation) {
        this.donation = donation;
    }

    public int getTotalDonation() {
        return totalDonation;
    }

    public void setTotalDonation(int totalDonation) {
        this.totalDonation = totalDonation;
    }
    
    @Override
    public String toString() {
        return donationId;
    }
}
