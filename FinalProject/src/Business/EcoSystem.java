/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Member.MemberDirectory;
import Business.FieldWorker.FieldWorkerDirectory;
import Business.SnowClearingOrg.SnowClearingOrgDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private SnowClearingOrgDirectory snowClearingOrgDirectory;
    private MemberDirectory memberDirectory;
    private FieldWorkerDirectory fieldWorkerDirectory;
    
    public EcoSystem(SnowClearingOrgDirectory snowClearingOrgDirectory, MemberDirectory memberDirectory, FieldWorkerDirectory fieldWorkerDirectory) {

        this.snowClearingOrgDirectory = snowClearingOrgDirectory;
        this.memberDirectory = memberDirectory;
        this.fieldWorkerDirectory = fieldWorkerDirectory;
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

    public void setSnowClearingOrgDirectory(SnowClearingOrgDirectory snowClearingOrgDirectory) {
        this.snowClearingOrgDirectory = snowClearingOrgDirectory;
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

    public void setDeliveryManDirectory(FieldWorkerDirectory fieldWorkerDirectory) {
        this.fieldWorkerDirectory = fieldWorkerDirectory;
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
