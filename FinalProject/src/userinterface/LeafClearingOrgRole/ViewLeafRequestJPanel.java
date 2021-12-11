/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LeafClearingOrgRole;

import Business.Member.Member;
import Business.EcoSystem;
import Business.LeafClearingOrg.LeafService;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class ViewLeafRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLeafRequestJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    WorkRequest request;
    EcoSystem system;
    public ViewLeafRequestJPanel(JPanel userProcessContainer, UserAccount account, WorkRequest request, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.request = request;
        this.system = system;
        populateTable();
        txtIns.setEnabled(false);
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
        titleOrderDetails = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRequestDetails = new javax.swing.JTable();
        btnReady = new javax.swing.JButton();
        lblIns = new javax.swing.JLabel();
        txtIns = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();

        setBackground(new java.awt.Color(252, 156, 52));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        titleOrderDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleOrderDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleOrderDetails.setText("Request Details");

        tblRequestDetails.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblRequestDetails);

        btnReady.setText("Request Ready ");
        btnReady.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadyActionPerformed(evt);
            }
        });

        lblIns.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblIns.setText("Special Instructions");

        btnCancel.setText("Cancel Request");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(titleOrderDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btnBack))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblIns)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtIns))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 125, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(366, 366, 366)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReady, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnBack)
                .addGap(28, 28, 28)
                .addComponent(titleOrderDetails)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIns)
                    .addComponent(txtIns, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(btnReady)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCancel)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnReadyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadyActionPerformed
        // TODO add your handling code here:
        if(request.getStatus().equals("New Request")) {
            JOptionPane.showMessageDialog(null, "Please Assign a Field Worker at first !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
        request.setStatus("In Progress");
        for(Member mem:system.getMemberDirectory().getMemberList()){
            if(request.getMemName().equals(mem.getMemUsername())){
                for(WorkRequest request : mem.getRequestList()){
                    if(request.getStatus().equals("Assigned Field Worker")) {
                        request.setStatus("In Progress");
                    }
                    
                }
            }
        }
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        }
    }//GEN-LAST:event_btnReadyActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        if(request.getStatus().equals("New Request")) {
            request.setStatus("Request Cancelled");
            for(Member mem:system.getMemberDirectory().getMemberList()){
            if(request.getMemName().equals(mem.getMemUsername())){
                for(WorkRequest req : mem.getRequestList()){
                    if(req.getStatus().equals("New Request")) {
                        req.setStatus("Request Cancelled");
                    }   
                }
            }
        }
        }
        else{
            JOptionPane.showMessageDialog(null, "Request is Accepted already. Cannot cancel Request !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
    }//GEN-LAST:event_btnCancelActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblRequestDetails.getModel();
        model.setRowCount(0);

        Object[] row = new Object[3];
                for(LeafService serv:request.getLeafRequest()){
                     row[0] = serv;
                     row[1] = serv.getServiceDescription();
                     row[2] = serv.getServiceType();
                     model.addRow(row);
                }
        txtIns.setText(request.getMessage());
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnReady;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblIns;
    private javax.swing.JTable tblRequestDetails;
    private javax.swing.JLabel titleOrderDetails;
    private javax.swing.JTextField txtIns;
    // End of variables declaration//GEN-END:variables
}