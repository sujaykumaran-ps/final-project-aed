/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SnowClearingOrgRole;

import Business.EcoSystem;
import Business.SnowClearingOrg.SnowClearingOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sujay
 */
public class ManageSnowClearingInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSnowClearingInfoJPanel
     */
    EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    
    public ManageSnowClearingInfoJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        
        txtOrgName.setEnabled(false);
        txtOrgAddress.setEnabled(false);
        txtOrgPhNum.setEnabled(false);
        //txtOrgType.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        populateFields();
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        lblSnowClearningName = new javax.swing.JLabel();
        lblSnowClearingAddress = new javax.swing.JLabel();
        lblSnowClearingPhone = new javax.swing.JLabel();
        txtOrgName = new javax.swing.JTextField();
        txtOrgAddress = new javax.swing.JTextField();
        txtOrgPhNum = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        titleSnowClearingOrg = new javax.swing.JLabel();
        lblType = new javax.swing.JLabel();
        txtOrgType = new javax.swing.JTextField();

        setBackground(new java.awt.Color(252, 156, 52));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblSnowClearningName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSnowClearningName.setText("SnowClearing Name :");

        lblSnowClearingAddress.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSnowClearingAddress.setText("SnowClearning Address :");

        lblSnowClearingPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblSnowClearingPhone.setText("SnowClearing Phone Number :");

        txtOrgPhNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgPhNumActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        titleSnowClearingOrg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleSnowClearingOrg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleSnowClearingOrg.setText("Manage SnowClearningOrg Info");

        lblType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblType.setText("Type :");

        txtOrgType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrgTypeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addContainerGap(295, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblSnowClearingPhone)
                                    .addComponent(lblSnowClearingAddress)
                                    .addComponent(lblSnowClearningName)
                                    .addComponent(lblType))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtOrgName)
                                    .addComponent(txtOrgAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtOrgPhNum, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtOrgType))))
                        .addGap(0, 260, Short.MAX_VALUE))
                    .addComponent(titleSnowClearingOrg, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnBack)
                .addGap(43, 43, 43)
                .addComponent(titleSnowClearingOrg)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrgPhNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSnowClearningName)
                            .addComponent(txtOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSnowClearingAddress)
                            .addComponent(txtOrgAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblSnowClearingPhone)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblType)
                    .addComponent(txtOrgType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnUpdate))
                .addContainerGap(217, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtOrgPhNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgPhNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgPhNumActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String name = txtOrgName.getText();
        String address = txtOrgAddress.getText();
        String number = txtOrgPhNum.getText();
       String type = txtOrgType.getText();
        
        try {
             if(name==null || name.isEmpty()){
                throw new NullPointerException("SnowClearingOrg Name Field cannot be Empty !!!");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "SnowClearing Organizations Name Field cannot be Empty !!!");        
            return;   
        }
        
        try {
             if(address==null || address.isEmpty()){
                throw new NullPointerException("SnowClearing Organization Field cannot be Empty !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "SnowClearing Organization Field cannot be Empty !!!");          
            return;   
        }
        
         try {
             
            if(number==null || number.isEmpty()){
                throw new NullPointerException("SnowClearingOrg Phone Number Field cannot be Empty !!!");
            }else if(Pattern.matches("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", number) == false){
                throw new Exception("Enter a Valid Phone number !!!");
            }     
        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "SnowClearingOrg Phone Number Field cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a Valid Phone number !!!");
            return;
        }
         
        try {
             if(type==null || type.isEmpty()){
                throw new NullPointerException("SnowClearing Org Service Field cannot be Empty !!!");

            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "SnowClearing Org Service Field cannot be Empty !!!");        
            return;   
        }
        
        for(SnowClearingOrg org:system.getSnowClearingOrgDirectory().getSnowClearingOrgList()){
           if(org.getUserName().equals(account.getUsername())){
                system.getSnowClearingOrgDirectory().updateSnowClearingOrgInfo(org, name, number, address, type);
            }
        }
        
        txtOrgName.setEnabled(false);
        txtOrgAddress.setEnabled(false);
        txtOrgPhNum.setEnabled(false);
        //txtOrgType.setEnabled(false);
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        txtOrgName.setEnabled(true);
        txtOrgAddress.setEnabled(true);
        txtOrgPhNum.setEnabled(true);
       // txtOrgType.setEnabled(true);
        btnSave.setEnabled(true);
        btnUpdate.setEnabled(false);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtOrgTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrgTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrgTypeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblSnowClearingAddress;
    private javax.swing.JLabel lblSnowClearingPhone;
    private javax.swing.JLabel lblSnowClearningName;
    private javax.swing.JLabel lblType;
    private javax.swing.JLabel titleSnowClearingOrg;
    private javax.swing.JTextField txtOrgAddress;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JTextField txtOrgPhNum;
    private javax.swing.JTextField txtOrgType;
    // End of variables declaration//GEN-END:variables

    private void populateFields() {
        for(SnowClearingOrg org:system.getSnowClearingOrgDirectory().getSnowClearingOrgList()){
           if(org.getUserName().equals(account.getUsername())){
               txtOrgName.setText(org.getSnowOrgName());
               txtOrgAddress.setText(org.getSnowOrgAddress());
               txtOrgPhNum.setText(org.getSnowOrgPhNum());
              // txtOrgType.setText(org.get);
            }
    }
}
}
