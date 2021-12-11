/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.EmergencyDistressOrg;

/**
 *
 * @author sujay
 */
public class EmergencyService {
    private String serviceName;
    private String serviceType;
    private String serviceDescription;

    public EmergencyService(String itemName, String itemDescription, String itemType) {
        this.serviceName = itemName;
        this.serviceType = itemType;
        this.serviceDescription = itemDescription;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
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
