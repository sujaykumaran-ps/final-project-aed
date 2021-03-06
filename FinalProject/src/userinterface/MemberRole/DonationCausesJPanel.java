/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MemberRole;

import Business.EcoSystem;
import Business.FundRaising.FundRaising;
import Business.FundRaising.Funds;
import Business.Member.Member;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class DonationCausesJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    FundRaising org;
    EcoSystem system;
    ArrayList<Funds> causes = new ArrayList<Funds>();
    int donationAmt = 0;
    int total = 0;
    /**
     * Creates new form DonationCausesJPanel
     */
    public DonationCausesJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, FundRaising org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.system = system;
        this.account = account;
        populateCausesTable();
        titleOrgName.setText(org.getFundRaisingName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleOrder = new javax.swing.JLabel();
        titleOrgName = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCauses = new javax.swing.JTable();
        lblCauses = new javax.swing.JLabel();
        btnDonate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDonation = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnPlaceDonation = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtPhNum = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleOrder.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        titleOrder.setText("Donation to");
        add(titleOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, -1, 20));

        titleOrgName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        add(titleOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 331, 20));

        btnBack.setBackground(new java.awt.Color(133, 211, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 30, -1, -1));

        tblCauses.setBackground(new java.awt.Color(133, 211, 255));
        tblCauses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Cause", "Descripion", "Funds Required", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCauses);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 524, 91));

        lblCauses.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblCauses.setText("Causes");
        add(lblCauses, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        btnDonate.setBackground(new java.awt.Color(133, 211, 255));
        btnDonate.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDonate.setText("Donate to Selected Cause");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });
        add(btnDonate, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        tblDonation.setBackground(new java.awt.Color(133, 211, 255));
        tblDonation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Cause", "Descripion", "Funds Required", "Type", "Amount Donated"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblDonation);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, 524, 91));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Donation Summary");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, -1));

        btnPlaceDonation.setBackground(new java.awt.Color(133, 211, 255));
        btnPlaceDonation.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnPlaceDonation.setText("Donate");
        btnPlaceDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceDonationActionPerformed(evt);
            }
        });
        add(btnPlaceDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 610, -1, -1));

        btnRemove.setBackground(new java.awt.Color(133, 211, 255));
        btnRemove.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRemove.setText("Remove Request");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, -1, -1));

        lblAddress.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        lblAddress.setText("Member Phone Number :");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 570, -1, -1));

        txtPhNum.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtPhNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 570, 201, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Donation.png"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1350, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCauses.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Item to Add !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Funds donation = (Funds)tblCauses.getValueAt(selectedRow, 0); 
            String donationAmount = JOptionPane.showInputDialog("Enter Amount to Donate :");
            donationAmt = Integer.parseInt(donationAmount);
            total = total+donationAmt;
            donation.setFundCollected(donationAmt);
            donation.setFundPerCause(donationAmt);
            populateAddedDonationTable(donation);
        }
    }//GEN-LAST:event_btnDonateActionPerformed

    private void btnPlaceDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceDonationActionPerformed
        // TODO add your handling code here:
       String donorPhNum = txtPhNum.getText();
       try {

            if(donorPhNum==null || donorPhNum.isEmpty()){
                throw new NullPointerException("Fund Raising Org Phone Number Field cannot be Empty !!!");
            }else if(Pattern.matches("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$", donorPhNum) == false){
                throw new Exception("Enter a Valid Phone number !!!");
            }
        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Member Phone Number Field cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Enter a Valid Phone number !!!");
            return;
        }
        

        org.newFundDonation(org.getFundRaisingName(), account.getUsername(), causes, donorPhNum, total);
        for(Member mem:system.getMemberDirectory().getMemberList()){
            if(account.getUsername().equals(mem.getMemUsername())){
                mem.newFundDonation(org.getFundRaisingName(), account.getUsername(), causes, donorPhNum, total);
            }
        }
        
        

        JOptionPane.showMessageDialog(null,"Your Donation is placed Successfully !!!", "Thank You", JOptionPane.PLAIN_MESSAGE);

    }//GEN-LAST:event_btnPlaceDonationActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDonation.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a service to Remove from Added Requests !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Funds donation = (Funds)tblDonation.getValueAt(selectedRow, 0);
            causes.remove(donation);
            DefaultTableModel model = (DefaultTableModel) tblDonation.getModel();
            model.setRowCount(0);
            Object[] row = new Object[5];
            for(Funds don:causes){
                row[0] = don;
                row[1] = don.getFundDescription();
                row[2] = don.getFundAmount();
                row[3] = don.getFundType();
                row[4] = don.getFundCollected();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void populateCausesTable() {
        DefaultTableModel model = (DefaultTableModel) tblCauses.getModel();
        model.setRowCount(0);
            Object[] row = new Object[4];
            for(Funds donation:org.getFundList()){
                if(donation.getFundOpen()==true){
                 row[0] = donation;
                 row[1] = donation.getFundDescription();
                 row[2] = donation.getFundAmount();
                 row[3] = donation.getFundType();
                 model.addRow(row);
                }
            }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnPlaceDonation;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCauses;
    private javax.swing.JTable tblCauses;
    private javax.swing.JTable tblDonation;
    private javax.swing.JLabel titleOrder;
    private javax.swing.JLabel titleOrgName;
    private javax.swing.JTextField txtPhNum;
    // End of variables declaration//GEN-END:variables

    private void populateAddedDonationTable(Funds donation) {
       DefaultTableModel model = (DefaultTableModel) tblDonation.getModel();
        model.setRowCount(0);

        causes.add(donation);
        
        Object[] row = new Object[5];
        for(Funds don:causes){
            row[0] = don;
            row[1] = don.getFundDescription();
            row[2] = don.getFundAmount();
            row[3] = don.getFundType();
            row[4] = don.getFundCollected();
            model.addRow(row);
        }
            
        
    }
}
