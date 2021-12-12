/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmergencyDistressOrgRole;

import Business.EcoSystem;
import Business.EmergencyDistressOrg.EmergencyService;
import Business.EmergencyDistressOrg.EmergencyDistressOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mohitdaswani
 */
public class ManageEmergencyRequestsJPanel extends javax.swing.JPanel {
    EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    /**
     * Creates new form ManageEmergancyRequestsJPanel
     */
    public ManageEmergencyRequestsJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
               this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateRequestsTable();
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
        titleManageRequest = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        btnRefresh = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnView = new javax.swing.JButton();

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        titleManageRequest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleManageRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRequest.setText("Manage Requests");

        tblRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Request ID", "Member Name", " Request Address", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblRequests);

        btnRefresh.setText("Refresh Table");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign for Request");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnView.setText("View Request");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleManageRequest, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnBack)
                        .addGap(0, 1234, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRefresh)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnAssign, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(356, 356, 356))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(btnBack)
                .addGap(37, 37, 37)
                .addComponent(titleManageRequest)
                .addGap(81, 81, 81)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh)
                .addGap(56, 56, 56)
                .addComponent(btnAssign)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnView)
                .addContainerGap(265, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateRequestsTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            EmergencyWorkRequest request  = (EmergencyWorkRequest)tblRequests.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("Assigned Field Worker") || request.getStatus().equals("Completed") || request.getStatus().equals("In Progress")){
                JOptionPane.showMessageDialog(null,"Already Assigned for Request !!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }else if(request.getStatus().equals("Request Cancelled")){
                JOptionPane.showMessageDialog(null,"Request Cancelled !!! Cannot Assign.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                EmergencyFieldWorkRequestJPanel assignDelivery = new EmergencyFieldWorkRequestJPanel(userProcessContainer, account, request, system);
                userProcessContainer.add("Assign Field Worker", assignDelivery);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            EmergencyWorkRequest request  = (EmergencyWorkRequest)tblRequests.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("In Progress") || request.getStatus().equals("Completed")){
                JOptionPane.showMessageDialog(null, "Request Completed or In Progress !!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }else{
                ViewEmergencyRequestJPanel viewRequest=new ViewEmergencyRequestJPanel(userProcessContainer, account, request, system);
                userProcessContainer.add("View Request", viewRequest);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnViewActionPerformed

private void populateRequestsTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();        
        model.setRowCount(0);               
        for (EmergencyDistressOrg org:system.getEmergencyDistressOrgDirectory().getEmergencyDistressOrgList()) {          
            if (org.getUserName().equals(account.getUsername())) {
               for(EmergencyWorkRequest service:org.getRequestList()){
                Object[] row = new Object[4];
                row[0] = service;
                row[1] = service.getMemName();
                row[2] = service.getPickupAddress();
                row[3] = service.getStatus();
                model.addRow(row);
               }                
            }            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    private javax.swing.JLabel titleManageRequest;
    // End of variables declaration//GEN-END:variables
}
