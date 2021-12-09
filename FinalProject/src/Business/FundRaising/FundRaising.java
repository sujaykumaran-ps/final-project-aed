/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaising;

import Business.SnowClearingOrg.Service;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class FundRaising {
    private String userName;
    int id = 1;
    private ArrayList<WorkRequest> requestList;
    private String fundRaisingName;
    private String fundRaisingAddress;
    private String fundRaisingPhNum;
    private String fundRaisingEmail;
    
    public FundRaising(String name) {
        this.userName = name;
        requestList = new ArrayList<WorkRequest>();
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

    public ArrayList<WorkRequest> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<WorkRequest> requestList) {
        this.requestList = requestList;
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
    
    
}
