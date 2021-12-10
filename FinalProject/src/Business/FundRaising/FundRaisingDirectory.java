/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.FundRaising;

import java.util.ArrayList;

/**
 *
 * @author sujay
 */
public class FundRaisingDirectory {
    private ArrayList<FundRaising> fundRaisingList;
    private FundRaising fundRaising;
    private Funds funds;
    
    public FundRaisingDirectory(){
        this.fundRaisingList = new ArrayList<FundRaising>();
    }

    public ArrayList<FundRaising> getFundRaisingList() {
        return fundRaisingList;
    }

    public void setFundRaisingList(ArrayList<FundRaising> fundRaisingList) {
        this.fundRaisingList = fundRaisingList;
    }
    
    public FundRaising createFundRaisingInfo(String fundRaiseName){
        fundRaising= new FundRaising(fundRaiseName);
        fundRaisingList.add(fundRaising);
        return fundRaising;
    }
    
    public void deleteFundRaising(String username){
        for(int i=0;i<fundRaisingList.size();i++){
            if(fundRaisingList.get(i).getUserName().equals(username)){
                fundRaisingList.remove(i);
            }
        }
    }
    
    public void updateFundRaisingInfo(FundRaising fundRaise, String name, String number, String address, String email){
        fundRaise.setFundRaisingName(name);
        fundRaise.setFundRaisingAddress(address);
        fundRaise.setFundRaisingPhNum(number);
        fundRaise.setFundRaisingEmail(email);
    }
    
    public Funds addFundsTypes(FundRaising fundRaise, String name, String desc, String type, int amount){
        funds = new Funds(name, desc, type, amount);
        fundRaise.addFunds(funds);
        return funds;
    }
    
    public void DeleteServices(FundRaising fundRaise, Funds funds){
        fundRaise.removeFunds(funds); 
    }
}
