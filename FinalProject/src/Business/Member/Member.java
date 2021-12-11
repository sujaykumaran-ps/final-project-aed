/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Member;

import Business.FundRaising.Funds;
import Business.SnowClearingOrg.Service;
import Business.LeafClearingOrg.LeafService;
import Business.WorkQueue.DonationRequest;
import Business.WorkQueue.LeafWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Member {
    private String memName;
    private String memUsername;
    private ArrayList<WorkRequest> requestList;
    private ArrayList<LeafWorkRequest> leafRequestList;
    private ArrayList<DonationRequest> donationList;
    private String memAddress;
    private String memPhNum;
    int id = 1;
    int leafid = 1;
    int donationid = 1;

    public Member(String memUsername) {
        this.memUsername = memUsername;
        requestList = new ArrayList<WorkRequest>();
        donationList = new ArrayList<DonationRequest>();
        leafRequestList = new ArrayList<LeafWorkRequest>();
    }
    
    

    public String getMemName() {
        return memName;
    }

    public void setMemName(String memName) {
        this.memName = memName;
    }

    public String getMemUsername() {
        return memUsername;
    }

    public void setMemUsername(String memUsername) {
        this.memUsername = memUsername;
    }

    
    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<WorkRequest> requestList) {
        this.requestList = requestList;
    }

    public ArrayList<LeafWorkRequest> getLeafRequestList() {
        return leafRequestList;
    }

    public void setLeafRequestList(ArrayList<LeafWorkRequest> leafRequestList) {
        this.leafRequestList = leafRequestList;
    }
    
    
    public ArrayList<DonationRequest> getDonationList() {
        return donationList;
    }

    public void setDonationList(ArrayList<DonationRequest> donationList) {
        this.donationList = donationList;
    }
    
    

    public String getMemAddress() {
        return memAddress;
    }

    public void setMemAddress(String memAddress) {
        this.memAddress = memAddress;
    }

    public String getMemPhNum() {
        return memPhNum;
    }

    public void setMemPhNum(String memPhNum) {
        this.memPhNum = memPhNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void newRequest(String snowOrgName, String memName, String fieldWorker, ArrayList<Service> request, String serviceAddress, String instructions) {
        WorkRequest newWork = new WorkRequest();
        newWork.setRequestId(String.valueOf(id));
        newWork.setMemName(memName);
        newWork.setSnowOrgName(snowOrgName);
        newWork.setFieldWorkerName(fieldWorker);
        newWork.setRequest(request);
        newWork.setServiceAddress(serviceAddress);
        newWork.setMessage(instructions);
        newWork.setStatus("New Request");
        requestList.add(newWork);
        id++;
    }
    
    public void newLeafRequest(String leafOrgName, String memName, String fieldWorker, ArrayList<LeafService> request, String serviceAddress, String instructions) {
        LeafWorkRequest newWork = new LeafWorkRequest();
        newWork.setLeafRequestId(String.valueOf(id));
        newWork.setMemName(memName);
        newWork.setLeafOrgName(leafOrgName);
        newWork.setFieldWorkerName(fieldWorker);
        newWork.setLeafRequest(request);
        newWork.setServiceAddress(serviceAddress);
        newWork.setMessage(instructions);
        newWork.setStatus("New Request");
        leafRequestList.add(newWork);
        leafid++;
    }
    
    public void newFundDonation(String fundRaisingName, String memName, ArrayList<Funds> donation, String donorPhNum, int total) {
        DonationRequest newDonation = new DonationRequest();
        newDonation.setDonationId(String.valueOf(id));
        newDonation.setMemName(memName);
        newDonation.setFundOrgName(fundRaisingName);
        newDonation.setDonation(donation);
        newDonation.setMemberPhNum(donorPhNum);
        newDonation.setTotalDonation(total);
        donationList.add(newDonation);
        donationid++;
    }
    
    @Override
    public String toString() {
        return memName;
    }

    
}
