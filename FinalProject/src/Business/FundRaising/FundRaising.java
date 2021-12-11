/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaising;


import Business.WorkQueue.DonationRequest;
import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class FundRaising {
    private String userName;
    int id = 1;
    private ArrayList<Funds> fundList;
    private ArrayList<DonationRequest> donationRequestList;
    private String fundRaisingName;
    private String fundRaisingAddress;
    private String fundRaisingPhNum;
    private String fundRaisingEmail;
    
    public FundRaising(String name) {
        this.userName = name;
        fundList = new ArrayList<Funds>();
        donationRequestList = new ArrayList<DonationRequest>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public ArrayList<Funds> getFundList() {
        return fundList;
    }

    public void setFundList(ArrayList<Funds> fundList) {
        this.fundList = fundList;
    }

    public ArrayList<DonationRequest> getDonationRequestList() {
        return donationRequestList;
    }

    public void setDonationRequestList(ArrayList<DonationRequest> donationRequestList) {
        this.donationRequestList = donationRequestList;
    }
    
    

    public String getFundRaisingName() {
        return fundRaisingName;
    }

    public void setFundRaisingName(String fundRaisingName) {
        this.fundRaisingName = fundRaisingName;
    }

    public String getFundRaisingAddress() {
        return fundRaisingAddress;
    }

    public void setFundRaisingAddress(String fundRaisingAddress) {
        this.fundRaisingAddress = fundRaisingAddress;
    }

    public String getFundRaisingPhNum() {
        return fundRaisingPhNum;
    }

    public void setFundRaisingPhNum(String fundRaisingPhNum) {
        this.fundRaisingPhNum = fundRaisingPhNum;
    }

    public String getFundRaisingEmail() {
        return fundRaisingEmail;
    }

    public void setFundRaisingEmail(String fundRaisingEmail) {
        this.fundRaisingEmail = fundRaisingEmail;
    }
    
     public void addFunds(Funds fund){
        fundList.add(fund);
    }
    
    public void removeFunds(Funds fund){
        fundList.remove(fund);
    }
    
    public void newFundDonation(String fundRaisingName, String memName, ArrayList<Funds> donation, String donorPhNum, int total) {
        DonationRequest newDonation = new DonationRequest();
        newDonation.setDonationId(String.valueOf(id));
        newDonation.setMemName(memName);
        newDonation.setFundOrgName(fundRaisingName);
        newDonation.setDonation(donation);
        newDonation.setMemberPhNum(donorPhNum);
        newDonation.setTotalDonation(total);
        donationRequestList.add(newDonation);
        id++;
    }
    
    @Override
    public String toString() {
        return fundRaisingName;
    }
    
}
