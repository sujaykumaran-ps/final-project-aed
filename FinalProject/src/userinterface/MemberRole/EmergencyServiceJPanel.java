/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MemberRole;

import Business.EcoSystem;
import Business.EmergencyDistressOrg.EmergencyDistressOrg;
import Business.EmergencyDistressOrg.EmergencyService;
import Business.Member.Member;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class EmergencyServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form EmergencyServiceJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    EmergencyDistressOrg org;
    EcoSystem system;
    ArrayList<EmergencyService> services = new ArrayList<EmergencyService>();
    
    public EmergencyServiceJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, EmergencyDistressOrg org) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.org = org;
        this.system = system;
        this.account = account;
        populateServicesTable();
        titleOrgName.setText(org.getEmergencyOrgName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblServices = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnCallAmbulance = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        titleOrder = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        titleOrgName = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServices = new javax.swing.JTable();
        txtIssue = new javax.swing.JTextField();
        lblPer = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Service Summary");

        lblServices.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblServices.setText("Meal Details");

        btnBack.setText("<< ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnAdd.setText("Add Service");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove Service");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnCallAmbulance.setText("Call Ambulance");
        btnCallAmbulance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCallAmbulanceActionPerformed(evt);
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
                "Meal Name", "Description", "Type"
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

        titleOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleOrder.setText("Request from");

        lblAddress.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblAddress.setText("Pick Up Address :");

        titleOrgName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        tblServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Meal Name", "Descripion", "Type"
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

        lblPer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPer.setText("Issue :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(276, 276, 276)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(titleOrder)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(titleOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAddress)
                            .addComponent(lblPer))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRemove)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(txtIssue, javax.swing.GroupLayout.Alignment.TRAILING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(458, 458, 458)
                        .addComponent(lblServices))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(233, 233, 233)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(459, 459, 459)
                        .addComponent(btnCallAmbulance)))
                .addContainerGap(575, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(423, 423, 423))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titleOrgName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblServices)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAdd)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRemove)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPer)
                    .addComponent(txtIssue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAddress)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnCallAmbulance)
                .addContainerGap(168, Short.MAX_VALUE))
        );
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
            JOptionPane.showMessageDialog(null, "Please Select a Meal to Add !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            EmergencyService service = (EmergencyService)tblServices.getValueAt(selectedRow, 0);
            populateCartTable(service);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCart.getSelectedRow();
        if(selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Please select a Meal to Remove from Cart !!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            EmergencyService service = (EmergencyService)tblCart.getValueAt(selectedRow, 0);
            services.remove(service);
            DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
            model.setRowCount(0);
            Object[] row = new Object[3];
            for(EmergencyService req:services){
                row[0] = req;
                row[1] = req.getServiceDescription();
                row[2] = req.getServiceType();
                model.addRow(row);
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCallAmbulanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCallAmbulanceActionPerformed
        // TODO add your handling code here:
        String address = txtAddress.getText();
        String issue = txtIssue.getText();

        try {
            if(address==null || address.isEmpty()){
                throw new NullPointerException("Please Enter Pickup Address !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Please Enter Pickup Address !!!");
            return;
        }

        org.newEmgRequest(org.getEmergencyOrgName(), account.getUsername(), null, services , address, issue);
        for(Member mem:system.getMemberDirectory().getMemberList()){
            if(account.getUsername().equals(mem.getMemUsername())){
                mem.newEmgRequest(org.getEmergencyOrgName(), account.getUsername(), null, services , address, issue);
            }
        }

        JOptionPane.showMessageDialog(null,"Your Request is placed Successfully !!!", "Thank You", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_btnCallAmbulanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCallAmbulance;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblPer;
    private javax.swing.JLabel lblServices;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblServices;
    private javax.swing.JLabel titleOrder;
    private javax.swing.JLabel titleOrgName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtIssue;
    // End of variables declaration//GEN-END:variables

    private void populateServicesTable() {
        DefaultTableModel model = (DefaultTableModel) tblServices.getModel();
        model.setRowCount(0);
            Object[] row = new Object[3];
            for(EmergencyService req:org.getServiceList()){
                 row[0] = req;
                 row[1] = req.getServiceDescription();
                 row[2] = req.getServiceType();
                 model.addRow(row);
            }  
    }

    private void populateCartTable(EmergencyService service) {
        DefaultTableModel model = (DefaultTableModel) tblCart.getModel();
        model.setRowCount(0);

        services.add(service);
        
        Object[] row = new Object[3];
        for(EmergencyService req:services){
            row[0] = req;
            row[1] = req.getServiceDescription();
            row[2] = req.getServiceType();
            
            model.addRow(row);
        }  
    }
}
