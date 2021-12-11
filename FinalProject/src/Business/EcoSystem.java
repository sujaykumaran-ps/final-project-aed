/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.DeliveryVolunteer.DeliveryVolunteerDirectory;
import Business.Member.MemberDirectory;
import Business.FieldWorker.FieldWorkerDirectory;
import Business.FundRaising.FundRaisingDirectory;
import Business.SnowClearingOrg.SnowClearingOrgDirectory;
import Business.LeafClearingOrg.LeafClearingOrgDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.SoupKitchenOrg.SoupKitchenOrgDirectory;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private SnowClearingOrgDirectory snowClearingOrgDirectory;
    private MemberDirectory memberDirectory;
    private LeafClearingOrgDirectory leafClearingOrgDirectory;
    private SoupKitchenOrgDirectory soupKitchenOrgDirectory;
    private DeliveryVolunteerDirectory deliveryVolunteerDirectory;
    private FieldWorkerDirectory fieldWorkerDirectory;
    private FundRaisingDirectory fundRaisingDirectory;
    
    public EcoSystem(SnowClearingOrgDirectory snowClearingOrgDirectory, MemberDirectory memberDirectory, FieldWorkerDirectory fieldWorkerDirectory, FundRaisingDirectory fundRaisingDirectory,LeafClearingOrgDirectory leafClearingOrgDirectory, SoupKitchenOrgDirectory soupKitchenOrgDirectory, DeliveryVolunteerDirectory deliveryVolunteerDirectory) {
        this.fundRaisingDirectory = fundRaisingDirectory;
        this.leafClearingOrgDirectory = leafClearingOrgDirectory;
        this.soupKitchenOrgDirectory = soupKitchenOrgDirectory;
        this.snowClearingOrgDirectory = snowClearingOrgDirectory;
        this.memberDirectory = memberDirectory;
        this.fieldWorkerDirectory = fieldWorkerDirectory;
        this.deliveryVolunteerDirectory = deliveryVolunteerDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business = new EcoSystem();
        }
        return business;
    }

    public SnowClearingOrgDirectory getSnowClearingOrgDirectory() {
        if(snowClearingOrgDirectory == null)
        {
            snowClearingOrgDirectory = new SnowClearingOrgDirectory();
        }
        return snowClearingOrgDirectory;
    }
    
    public LeafClearingOrgDirectory getLeafClearingOrgDirectory() {
        if(leafClearingOrgDirectory == null)
        {
            leafClearingOrgDirectory = new LeafClearingOrgDirectory();
        }
        return leafClearingOrgDirectory;
    }
    
    public void setSnowClearingOrgDirectory(SnowClearingOrgDirectory snowClearingOrgDirectory) {
        this.snowClearingOrgDirectory = snowClearingOrgDirectory;
    }
    
    public void setLeafClearingOrgDirectory(LeafClearingOrgDirectory leafClearingOrgDirectory) {
        this.leafClearingOrgDirectory = leafClearingOrgDirectory;
    }

    public MemberDirectory getMemberDirectory() {
        if(memberDirectory == null)
        {
            memberDirectory = new MemberDirectory();
        }
        return memberDirectory;
    }

    public void setMemberDirectory(MemberDirectory memberDirectory) {
        this.memberDirectory = memberDirectory;
    }

    public FieldWorkerDirectory getFieldWorkerDirectory() {
        if(fieldWorkerDirectory == null)
        {
            fieldWorkerDirectory = new FieldWorkerDirectory();
        }
        return fieldWorkerDirectory;
    }

    public void setFieldWorkerDirectory(FieldWorkerDirectory fieldWorkerDirectory) {
        this.fieldWorkerDirectory = fieldWorkerDirectory;
    }

    public FundRaisingDirectory getFundRaisingDirectory() {
        if(fundRaisingDirectory == null)
        {
            fundRaisingDirectory = new FundRaisingDirectory();
        }
        return fundRaisingDirectory;
    }  

    public DeliveryVolunteerDirectory getDeliveryVolunteerDirectory() {
        if(deliveryVolunteerDirectory == null)
        {
            deliveryVolunteerDirectory = new DeliveryVolunteerDirectory();
        }
        return deliveryVolunteerDirectory;
    }

    public void setDeliveryVolunteerDirectory(DeliveryVolunteerDirectory deliveryVolunteerDirectory) {
        this.deliveryVolunteerDirectory = deliveryVolunteerDirectory;
    }
    
    

    public void setFundRaisingDirectory(FundRaisingDirectory fundRaisingDirectory) {
        this.fundRaisingDirectory = fundRaisingDirectory;
    }

    public SoupKitchenOrgDirectory getSoupKitchenOrgDirectory() {
        if(soupKitchenOrgDirectory == null)
        {
            soupKitchenOrgDirectory = new SoupKitchenOrgDirectory();
        }
        return soupKitchenOrgDirectory;
    }

    public void setSoupKitchenOrgDirectory(SoupKitchenOrgDirectory soupKitchenOrgDirectory) {
        this.soupKitchenOrgDirectory = soupKitchenOrgDirectory;
    }
    
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }

    private EcoSystem(){
        super(null);
    }
    
    public boolean checkIfUserIsUnique(String userName){
       return false;
    }
}
