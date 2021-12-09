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
    private String fundAmount;
    
    public Funds(String itemName, String itemDescription, String itemType, String itemAmount) {
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

    public String getFundAmount() {
        return fundAmount;
    }

    public void setFundAmount(String fundAmount) {
        this.fundAmount = fundAmount;
    }
    
    @Override
    public String toString() {
        return fundName;
    }
}
