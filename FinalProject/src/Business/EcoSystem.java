/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Member.MemberDirectory;
import Business.FieldWorker.FieldWorkerDirectory;
import Business.FundRaising.FundRaisingDirectory;
import Business.SnowClearingOrg.SnowClearingOrgDirectory;
import Business.LeafClearingOrg.LeafClearingOrgDirectory;

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
    private LeafClearingOrgDirectory leafClearingOrgDirectory;

    private FieldWorkerDirectory fieldWorkerDirectory;
    private FundRaisingDirectory fundRaisingDirectory;
    
    public EcoSystem(SnowClearingOrgDirectory snowClearingOrgDirectory, MemberDirectory memberDirectory, FieldWorkerDirectory fieldWorkerDirectory, FundRaisingDirectory fundRaisingDirectory,LeafClearingOrgDirectory leafClearingOrgDirectory) {
        this.fundRaisingDirectory = fundRaisingDirectory;
        this.leafClearingOrgDirectory = leafClearingOrgDirectory;

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

    public void setFundRaisingDirectory(FundRaisingDirectory fundRaisingDirectory) {
        this.fundRaisingDirectory = fundRaisingDirectory;
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
