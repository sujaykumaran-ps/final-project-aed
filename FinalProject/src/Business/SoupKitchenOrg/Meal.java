/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SoupKitchenOrg;

/**
 *
 * @author sujay
 */
public class Meal {
    private String mealName;
    private String beverage;
    private String mealDescription;
    
    public Meal(String mealName, String mealDescription, String beverage) {
        this.mealName = mealName;
        this.beverage = beverage;
        this.mealDescription = mealDescription;
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getMealDescription() {
        return mealDescription;
    }

    public void setMealDescription(String mealDescription) {
        this.mealDescription = mealDescription;
    }
    
    
    
    @Override
    public String toString() {
        return mealName;
    }
}
