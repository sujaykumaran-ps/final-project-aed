/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.DonationQueue;
import Business.WorkQueue.EmergencyWorkQueue;
import Business.WorkQueue.LeafWorkQueue;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.SoupWorkQueue;
import java.util.ArrayList;

/**
 *
 * @author raunak
 */
public abstract class Organization {

    private String name;
    private WorkQueue workQueue;
    private SoupWorkQueue soupWorkQueue;
    private LeafWorkQueue leafWorkQueue;
    private DonationQueue donationQueue;
    private EmergencyWorkQueue emergencyQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
    public enum Type{
        SnowClearingOrg("SnowClearingOrg"),
        Member("Member"),
        FieldWorker("FieldWorker"),
        DeliveryVolunteer("DeliveryVolunteer"),
        EmergencyDistressOrg("EmergencyDistressOrg"),
        FundRaising("FundRaising"),
        LeafClearingOrg("LeafClearingOrg"),
        Ambulance("Ambulance"),
        SoupKitchenOrg("SoupKitchenOrg"),
        SysAdmin("Sysadmin");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }
    }

    public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        soupWorkQueue = new SoupWorkQueue();
        leafWorkQueue = new LeafWorkQueue();
        donationQueue = new DonationQueue();
        emergencyQueue = new EmergencyWorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
    public Organization(){
        
    }
    public abstract ArrayList<Role> getSupportedRole();
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }
    
    public String getName() {
        return name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
