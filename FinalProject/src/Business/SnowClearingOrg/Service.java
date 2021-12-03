/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.SnowClearingOrg;

/**
 *
 * @author sujay
 */
public class Service {
    private String serviceName;
    private String servicePrice;
    private String serviceDescription;

    public Service(String itemName, String itemDescription, String itemPrice) {
        this.serviceName = itemName;
        this.servicePrice = itemPrice;
        this.serviceDescription = itemDescription;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServicePrice() {
        return servicePrice;
    }

    public void setServicePrice(String servicePrice) {
        this.servicePrice = servicePrice;
    }

    public String getServiceDescription() {
        return serviceDescription;
    }

    public void setServiceDescription(String serviceDescription) {
        this.serviceDescription = serviceDescription;
    }
    
    @Override
    public String toString() {
        return serviceName;
    }
}
