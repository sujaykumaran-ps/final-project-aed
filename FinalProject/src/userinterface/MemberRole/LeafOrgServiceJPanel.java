/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MemberRole;

import Business.Member.Member;
import Business.EcoSystem;
import Business.Organization;
import Business.LeafClearingOrg.LeafService;
import Business.LeafClearingOrg.LeafClearingOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mohitdaswani
 */
public class LeafOrgServiceJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    LeafClearingOrg org;
    EcoSystem system;
    ArrayList<LeafService> works = new ArrayList<LeafService>();
    /**
     * Creates new form LeafOrgServiceJPanel
     */
    public LeafOrgServiceJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, LeafClearingOrg org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.system = system;
        this.account = account;
        populateMenuTable();
        titleResName.setText(org.getLeafOrgName());
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
        btnRemove = new javax.swing.JButton();
        titleOrder = new javax.swing.JLabel();
        btnPlaceRequest = new javax.swing.JButton();
        titleResName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblMenu = new javax.swing.JTable();
        txtAddress = new javax.swing.JTextField();
        lblInstructions = new javax.swing.JLabel();
        lblMenu = new javax.swing.JLabel();
        txtInstructions = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack.setBackground(new java.awt.Color(133, 211, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnBack.setText("<< ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 33, -1, -1));

        btnRemove.setBackground(new java.awt.Color(133, 211, 255));
        btnRemove.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRemove.setText("Remove Request");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 470, -1, -1));

        titleOrder.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        titleOrder.setText("Request from");
        add(titleOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 88, -1, 20));

        btnPlaceRequest.setBackground(new java.awt.Color(133, 211, 255));
        btnPlaceRequest.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnPlaceRequest.setText("Place Request");
        btnPlaceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceRequestActionPerformed(evt);
            }
        });
        add(btnPlaceRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, -1));

        titleResName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        add(titleResName, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 88, 331, 20));

        lblAddress.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblAddress.setText("Service Address :");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 510, -1, -1));

        tblMenu.setBackground(new java.awt.Color(133, 211, 255));
        tblMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Service Name", "Descripion", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblMenu);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, -1, 91));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 510, 390, 30));

        lblInstructions.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblInstructions.setText("Special Instructions :");
        add(lblInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 550, 130, -1));

        lblMenu.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblMenu.setText("Service");
        add(lblMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        txtInstructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInstructionsActionPerformed(evt);
            }
        });
        add(txtInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 550, 390, 30));

        btnAdd.setBackground(new java.awt.Color(133, 211, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAdd.setText("Add Request");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 270, -1, -1));

        tblCart.setBackground(new java.awt.Color(133, 211, 255));
        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Service Name", "Description", "Type"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCart);

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 91));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Service Summary");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LeafClearingOrg.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 890));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a service to Remove from Added Requests !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            LeafService work = (LeafService)tblCart.getValueAt(selectedRow, 0);
            works.remove(work);
            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for(LeafService req:works){
                row[0] = req;
                row[1] = req.getServiceDescription();
                row[2] = req.getServiceType();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnPlaceRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlaceRequestActionPerformed
        // TODO add your handling code here:
        String address = txtAddress.getText();
        String ins = txtInstructions.getText();

        try {
            if(address==null || address.isEmpty()){
                throw new NullPointerException("Please Enter Service Address !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please Enter Service Address !!!");
            return;
        }

        org.newRequest(org.getLeafOrgName(), account.getUsername(), null, works , address, ins);
        for(Member mem:system.getMemberDirectory().getMemberList()){
            if(account.getUsername().equals(mem.getMemUsername())){
                mem.newLeafRequest(org.getLeafOrgName(), account.getUsername(), null, works , address, ins);
            }
        }

        JOptionPane.showMessageDialog(null,"Your Request is placed Successfully !!!", "Thank You", JOptionPane.PLAIN_MESSAGE);
        

    }//GEN-LAST:event_btnPlaceRequestActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMenu.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Item to Add !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            LeafService work = (LeafService)tblMenu.getValueAt(selectedRow, 0);
            populateCartTable(work);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void txtInstructionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInstructionsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInstructionsActionPerformed
 private void populateMenuTable() {
        DefaultTableModel model = (DefaultTableModel) tblMenu.getModel();
        model.setRowCount(0);
            Object[] row = new Object[3];
            for(LeafService req:org.getServiceList()){
                 row[0] = req;
                 row[1] = req.getServiceDescription();
                 row[2] = req.getServiceType();
                 model.addRow(row);
            }  
    }
  private void populateCartTable(LeafService work) {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        works.add(work);
        
        Object[] row = new Object[3];
        for(LeafService req:works){
            row[0] = req;
            row[1] = req.getServiceDescription();
            row[2] = req.getServiceType();
            
            model.addRow(row);
        }  
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnPlaceRequest;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblMenu;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblMenu;
    private javax.swing.JLabel titleOrder;
    private javax.swing.JLabel titleResName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtInstructions;
    // End of variables declaration//GEN-END:variables
}
