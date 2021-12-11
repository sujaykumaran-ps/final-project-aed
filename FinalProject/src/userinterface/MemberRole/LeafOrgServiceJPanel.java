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

        setPreferredSize(new java.awt.Dimension(900, 900));

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove Request");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        titleOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleOrder.setText("Request from");

        btnPlaceRequest.setText("Place Request");
        btnPlaceRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlaceRequestActionPerformed(evt);
            }
        });

        titleResName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Service Address :");

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

        lblInstructions.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblInstructions.setText("Special Instructions :");

        lblMenu.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblMenu.setText("Service");

        btnAdd.setText("Add Request");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Service Summary");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(btnAdd))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(388, 388, 388)
                        .addComponent(lblMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(titleOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titleResName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(184, 184, 184)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addComponent(btnRemove))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(52, 52, 52)
                                        .addComponent(lblAddress)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInstructions)
                                    .addComponent(txtInstructions, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(51, 51, 51))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(btnPlaceRequest)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnBack)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titleResName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMenu)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdd)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAddress)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblInstructions)
                        .addGap(10, 10, 10)
                        .addComponent(txtInstructions, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnPlaceRequest)
                .addContainerGap(219, Short.MAX_VALUE))
        );
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
