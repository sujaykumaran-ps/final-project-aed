/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LeafClearingOrgRole;

import Business.EcoSystem;
import Business.LeafClearingOrg.LeafService;
import Business.LeafClearingOrg.LeafClearingOrg;
import Business.LeafClearingOrg.LeafService;
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
public class ManageLeafServiceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageLeafServiceJPanel
     */
    
    EcoSystem system;
    LeafService service;
    JPanel userProcessContainer;
    UserAccount ua;
    
    public ManageLeafServiceJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
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
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblServiceDesc.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        lblServiceDesc.setText("Description :");
        add(lblServiceDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(204, 514, -1, -1));

        txtServiceType.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtServiceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 558, 194, 31));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 339, 638, 107));

        lblServiceName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        lblServiceName.setText("Service Name :");
        add(lblServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 473, -1, -1));

        txtServiceName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 464, 194, 31));

        lblType.setFont(new java.awt.Font("Segoe UI Semibold", 1, 13)); // NOI18N
        lblType.setText("Type :");
        add(lblType, new org.netbeans.lib.awtextra.AbsoluteConstraints(252, 564, -1, -1));

        btnBack.setBackground(new java.awt.Color(255, 204, 102));
        btnBack.setText("<< ");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 35, -1, 30));

        txtServiceDesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtServiceDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(328, 507, 194, 32));

        btnAddService.setBackground(new java.awt.Color(255, 204, 102));
        btnAddService.setText("Add Service");
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });
        add(btnAddService, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, -1, 30));

        titleManageService.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        titleManageService.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageService.setText("Manage Leaf Clearance Org");
        add(titleManageService, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 526, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/LeafClearingOrg.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, -10, 1390, 790));
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

        for(LeafClearingOrg org:system.getLeafClearingOrgDirectory().getLeafClearingOrgList()){
            if(org.getUserName().equals(ua.getUsername())){
                service = system.getLeafClearingOrgDirectory().addServiceTypes(org, name, desc, type);
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

        for (LeafClearingOrg org:system.getLeafClearingOrgDirectory().getLeafClearingOrgList()) {
            if (org.getUserName().equals(ua.getUsername())) {
               for(LeafService service: org.getServiceList()){
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
