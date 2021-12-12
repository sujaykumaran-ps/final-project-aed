/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SnowClearingOrgRole;

import Business.EcoSystem;
import Business.SnowClearingOrg.Service;
import Business.SnowClearingOrg.SnowClearingOrg;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class ManageServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageServiceJPanel
     */
    
    EcoSystem system;
    Service service;
    JPanel userProcessContainer;
    UserAccount ua;
    
    public ManageServiceJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.ua = ua;
        this.system = system;
        this.userProcessContainer = userProcessContainer;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblServiceDesc = new javax.swing.JLabel();
        txtServiceType = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServices = new javax.swing.JTable();
        lblServiceName = new javax.swing.JLabel();
        txtServiceName = new javax.swing.JTextField();
        lblType = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtServiceDesc = new javax.swing.JTextField();
        btnAddService = new javax.swing.JButton();
        titleManageService = new javax.swing.JLabel();
        lblImageIcon3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1350, 780));

        lblServiceDesc.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblServiceDesc.setText("Description :");

        txtServiceType.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        txtServiceType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tblServices.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
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
        jScrollPane1.setViewportView(tblServices);

        lblServiceName.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblServiceName.setText("Service Name :");

        txtServiceName.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        txtServiceName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblType.setFont(new java.awt.Font("Verdana", 1, 13)); // NOI18N
        lblType.setText("Type :");

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtServiceDesc.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        txtServiceDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnAddService.setBackground(new java.awt.Color(133, 211, 255));
        btnAddService.setText("Add Service");
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });

        titleManageService.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleManageService.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageService.setText("Manage Services");

        lblImageIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snowShovel.png"))); // NOI18N
        lblImageIcon3.setText("jLabel2");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plow_ice.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(titleManageService, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblType)
                                    .addComponent(lblServiceDesc))
                                .addGap(47, 47, 47)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtServiceName)
                            .addComponent(txtServiceType)
                            .addComponent(txtServiceDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnAddService))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnBack)
                        .addGap(83, 83, 83)
                        .addComponent(lblImageIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 907, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(125, 125, 125)
                .addComponent(titleManageService)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImageIcon3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtServiceName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblServiceName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblServiceDesc)
                    .addComponent(txtServiceDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblType)
                    .addComponent(txtServiceType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(btnAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtServiceDesc, txtServiceName, txtServiceType});

    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceActionPerformed
        // TODO add your handling code here:
        String name = txtServiceName.getText();
        String desc = txtServiceDesc.getText();
        String type = txtServiceType.getText();

        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Service Name field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Service Name field cannot be Empty !!!");
            return;
        } 

        try {
            if(desc==null || desc.isEmpty()){
                throw new NullPointerException("Description field cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Description field cannot be Empty !!!");
            return;
        }

        try {
            if(type==null || type.isEmpty()){
                throw new NullPointerException("Type Field cannot be empty !!!");
            }
        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Type Field cannot be empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Type !!!");
            return;
        }

        for(SnowClearingOrg org:system.getSnowClearingOrgDirectory().getSnowClearingOrgList()){
            if(org.getUserName().equals(ua.getUsername())){
                service = system.getSnowClearingOrgDirectory().addServiceTypes(org, name, desc, type);
            }
        }

        txtServiceName.setText("");
        txtServiceDesc.setText("");
        txtServiceType.setText("");
        populateTable();

    }//GEN-LAST:event_btnAddServiceActionPerformed

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblServices.getModel();
        model.setRowCount(0);

        for (SnowClearingOrg org:system.getSnowClearingOrgDirectory().getSnowClearingOrgList()) {
            if (org.getUserName().equals(ua.getUsername())) {
               for(Service service: org.getServiceList()){
                Object[] row = new Object[3];
                row[0] = service.getServiceName();
                row[1] = service.getServiceDescription();
                row[2] = service.getServiceType();
                model.addRow(row);
               } 
            } 
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImageIcon3;
    private javax.swing.JLabel lblServiceDesc;
    private javax.swing.JLabel lblServiceName;
    private javax.swing.JLabel lblType;
    private javax.swing.JTable tblServices;
    private javax.swing.JLabel titleManageService;
    private javax.swing.JTextField txtServiceDesc;
    private javax.swing.JTextField txtServiceName;
    private javax.swing.JTextField txtServiceType;
    // End of variables declaration//GEN-END:variables
}
