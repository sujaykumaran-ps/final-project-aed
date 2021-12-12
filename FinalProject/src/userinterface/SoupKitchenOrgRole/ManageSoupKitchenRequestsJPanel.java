/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SoupKitchenOrgRole;

import Business.EcoSystem;
import Business.SoupKitchenOrg.SoupKitchenOrg;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.SoupWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class ManageSoupKitchenRequestsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSoupKitchenRequestsJPanel
     */
    EcoSystem system;
    JPanel userProcessContainer;
    UserAccount account;
    public ManageSoupKitchenRequestsJPanel(JPanel userProcessContainer,UserAccount account, EcoSystem system) {
        initComponents();
        this.account=account;
        this.system=system;
        this.userProcessContainer=userProcessContainer;
        populateSoupRequestsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnView = new javax.swing.JButton();
        btnAssign = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequests = new javax.swing.JTable();
        titleManageRequest = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        btnView.setText("View Order");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAssign.setText("Assign for Delivery");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        btnRefresh.setText("Refresh Table");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

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

        titleManageRequest.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleManageRequest.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRequest.setText("Manage Soup Orders");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
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
                .addGap(382, 382, 382))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnBack)
                .addGap(37, 37, 37)
                .addComponent(titleManageRequest)
                .addGap(126, 126, 126)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRefresh)
                .addGap(34, 34, 34)
                .addComponent(btnView)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAssign)
                .addContainerGap(332, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            SoupWorkRequest request  = (SoupWorkRequest)tblRequests.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("In Progress")){
                JOptionPane.showMessageDialog(null, "Order Accepted Already !!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Order Cancelled")){
                JOptionPane.showMessageDialog(null,"Order Cancelled !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Delivered")){
                JOptionPane.showMessageDialog(null,"Order Completed Already !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                ViewSoupRequestJPanel viewRequest=new ViewSoupRequestJPanel(userProcessContainer, account, request, system);
                userProcessContainer.add("View Soup Request", viewRequest);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblRequests.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Please select a row from the table to view details", "Warning",JOptionPane.WARNING_MESSAGE);
        }
        else{
            SoupWorkRequest request  = (SoupWorkRequest)tblRequests.getValueAt(selectedRow, 0);
            if(request.getStatus().equals("New Order")){
                JOptionPane.showMessageDialog(null,"Accept the Order First", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Order Cancelled")){
                JOptionPane.showMessageDialog(null,"Request Cancelled !!! Cannot Assign.", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Delivered")){
                JOptionPane.showMessageDialog(null,"Order Delivered Already !!! ", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else if(request.getStatus().equals("Assigned Volunteer")){
                JOptionPane.showMessageDialog(null,"Already Assigned Field Worker !!!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                DeliveryRequestJPanel assignDelivery = new DeliveryRequestJPanel(userProcessContainer, account, request, system);
                userProcessContainer.add("Assign Delivery Volunteer", assignDelivery);
                CardLayout layout=(CardLayout)userProcessContainer.getLayout();
                layout.next(userProcessContainer);
            }
        }
    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        populateSoupRequestsTable();
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblRequests;
    private javax.swing.JLabel titleManageRequest;
    // End of variables declaration//GEN-END:variables

    private void populateSoupRequestsTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequests.getModel();        
        model.setRowCount(0);               
        for (SoupKitchenOrg org:system.getSoupKitchenOrgDirectory().getSoupKitchenList()) {          
            if (org.getUserName().equals(account.getUsername())) {
               for(SoupWorkRequest req:org.getSoupRequestList()){
                Object[] row = new Object[4];
                row[0] = req;
                row[1] = req.getMemName();
                row[2] = req.getServiceAddress();
                row[3] = req.getStatus();
                model.addRow(row);
               }                
            }            
        }
    }
}
