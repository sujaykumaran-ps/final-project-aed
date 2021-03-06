/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MemberRole;

import Business.Member.Member;
import Business.EcoSystem;
import Business.Organization;
import Business.SnowClearingOrg.Service;
import Business.SnowClearingOrg.SnowClearingOrg;
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
 * @author raunak
 */
public class SnowOrgServiceJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount account;
    SnowClearingOrg org;
    EcoSystem system;
    ArrayList<Service> works = new ArrayList<Service>();
    /**
     * Creates new form RequestLabTestJPanel
     */
    public SnowOrgServiceJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, SnowClearingOrg org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.system = system;
        this.account = account;
        populateServicesTable();
        titleOrgName.setText(org.getSnowOrgName());
       
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServices = new javax.swing.JTable();
        lblServices = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnPlaceRequest = new javax.swing.JButton();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblInstructions = new javax.swing.JLabel();
        txtInstructions = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleOrder.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        titleOrder.setText("Request from");
        add(titleOrder, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 88, -1, 20));

        titleOrgName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        add(titleOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 88, 331, 20));

        tblServices.setBackground(new java.awt.Color(133, 211, 255));
        tblServices.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tblServices);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 166, -1, 91));

        lblServices.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblServices.setText("Service");
        add(lblServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 126, -1, -1));

        btnAdd.setBackground(new java.awt.Color(133, 211, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAdd.setText("Add Request");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 362, -1, 91));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel1.setText("Service Summary");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 322, -1, -1));

        btnBack.setBackground(new java.awt.Color(133, 211, 255));
        btnBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnBack.setText("<<");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        btnRemove.setBackground(new java.awt.Color(133, 211, 255));
        btnRemove.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRemove.setText("Remove Request");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        add(btnRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        btnPlaceRequest.setBackground(new java.awt.Color(133, 211, 255));
        btnPlaceRequest.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnPlaceRequest.setText("Place Request");
        btnPlaceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceRequestActionPerformed(evt);
            }
        });
        add(btnPlaceRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 560, -1, -1));

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Service Address :");
        add(lblAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 522, -1, -1));
        add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(373, 518, 201, -1));

        lblInstructions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstructions.setText("Special Instructions :");
        add(lblInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 488, -1, -1));
        add(txtInstructions, new org.netbeans.lib.awtextra.AbsoluteConstraints(601, 513, 694, 31));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ManageSnowClearingOrg.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 1410, 780));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblServices.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select an Service to Add !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Service work = (Service)tblServices.getValueAt(selectedRow, 0); 
            populateCartTable(work);          
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a service to Remove from Added Requests !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            Service work = (Service)tblCart.getValueAt(selectedRow, 0);
            works.remove(work);
            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);
            Object[] row = new Object[3];
                for(Service req:works){
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
        
        org.newRequest(org.getSnowOrgName(), account.getUsername(), null, works , address, ins);
        for(Member mem:system.getMemberDirectory().getMemberList()){
            if(account.getUsername().equals(mem.getMemUsername())){
                mem.newRequest(org.getSnowOrgName(), account.getUsername(), null, works , address, ins);
            }
        }
        
        JOptionPane.showMessageDialog(null,"Your Request is placed Successfully !!!", "Thank You", JOptionPane.PLAIN_MESSAGE);
        
    }//GEN-LAST:event_btnPlaceRequestActionPerformed

    private void populateServicesTable() {
        DefaultTableModel model = (DefaultTableModel) tblServices.getModel();
        model.setRowCount(0);
            Object[] row = new Object[3];
            for(Service req:org.getServiceList()){
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
    private javax.swing.JLabel lblServices;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblServices;
    private javax.swing.JLabel titleOrder;
    private javax.swing.JLabel titleOrgName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtInstructions;
    // End of variables declaration//GEN-END:variables

    private void populateCartTable(Service work) {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        works.add(work);
        
        Object[] row = new Object[3];
        for(Service req:works){
            row[0] = req;
            row[1] = req.getServiceDescription();
            row[2] = req.getServiceType();
            
            model.addRow(row);
        }  
    }
}
