/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaising;

/**
 *
 * @author sujay
 */
public class Funds {
    private String fundName;
    private String fundType;
    private String fundDescription;
    private int fundAmount;
    private int fundCollected = 0;
    private int fundPerCause = 0;
    private Boolean fundOpen = true;
    private String fundStatus = "Open";
    private int totalOrgFunds = 0;
    
    public Funds(String itemName, String itemDescription, String itemType, int itemAmount) {
        this.fundName = itemName;
        this.fundType = itemType;
        this.fundDescription = itemDescription;
        this.fundAmount = itemAmount;
    }

    public String getFundName() {
        return fundName;
    }

    public void setFundName(String fundName) {
        this.fundName = fundName;
    }

    public String getFundType() {
        return fundType;
    }

    public void setFundType(String fundType) {
        this.fundType = fundType;
    }

    public String getFundDescription() {
        return fundDescription;
    }

    public void setFundDescription(String fundDescription) {
        this.fundDescription = fundDescription;
    }

    public int getFundAmount() {
        return fundAmount;
    }

    public void setFundAmount(int fundAmount) {
        this.fundAmount = fundAmount;
    }

    public int getFundCollected() {
        return fundCollected;
    }

    public void setFundCollected(int fundCollected) {
        this.fundCollected = fundCollected;
    }

    public int getTotalOrgFunds() {
        return totalOrgFunds;
    }

    public void setTotalOrgFunds(int totalOrgFunds) {
        this.totalOrgFunds = totalOrgFunds;
    }

    public Boolean getFundOpen() {
        return fundOpen;
    }

    public void setFundOpen(Boolean fundOpen) {
        this.fundOpen = fundOpen;
    }

    public String getFundStatus() {
        return fundStatus;
    }

    public void setFundStatus(String fundStatus) {
        this.fundStatus = fundStatus;
    }

    public int getFundPerCause() {
        return fundPerCause;
    }
    

    public void setFundPerCause(int fundCollected) {
        this.fundPerCause = fundPerCause + fundCollected;
        if(fundPerCause>=fundAmount){
            setFundOpen(false);
            setFundStatus("Closed");
        }
    }

    
    
    @Override
    public String toString() {
        return fundName;
    }
}
