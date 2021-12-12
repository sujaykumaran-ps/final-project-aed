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
import java.awt.CardLayout;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mohitdaswani
 */
public class ManageEmergencyServiceJPanel extends javax.swing.JPanel {

    EcoSystem system;
    EmergencyService service;
    JPanel userProcessContainer;
    UserAccount ua;
    /**
     * Creates new form ManageEmergencyServiceJPanel
     */
    public ManageEmergencyServiceJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
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

        btnBack1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblServices = new javax.swing.JTable();
        txtServiceName = new javax.swing.JTextField();
        lblServiceName1 = new javax.swing.JLabel();
        lblServiceDesc1 = new javax.swing.JLabel();
        txtServiceDesc = new javax.swing.JTextField();
        lblType1 = new javax.swing.JLabel();
        txtServiceType = new javax.swing.JTextField();
        btnAddService1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBack1.setBackground(new java.awt.Color(133, 211, 255));
        btnBack1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnBack1.setText("<< Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });
        add(btnBack1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 35, -1, -1));

        tblServices.setBackground(new java.awt.Color(133, 211, 255));
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
        jScrollPane2.setViewportView(tblServices);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 638, 107));
        add(txtServiceName, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 150, -1));

        lblServiceName1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        lblServiceName1.setText("Service Name :");
        add(lblServiceName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, -1, -1));

        lblServiceDesc1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        lblServiceDesc1.setText("Description :");
        add(lblServiceDesc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, -1, -1));
        add(txtServiceDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 400, 150, -1));

        lblType1.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        lblType1.setText("Type :");
        add(lblType1, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 440, -1, -1));
        add(txtServiceType, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 440, 150, -1));

        btnAddService1.setBackground(new java.awt.Color(133, 211, 255));
        btnAddService1.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        btnAddService1.setText("Add Service");
        btnAddService1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddService1ActionPerformed(evt);
            }
        });
        add(btnAddService1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        jLabel1.setText("Manage Emergency Services");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ambulance.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 170, 900, 610));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void btnAddService1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddService1ActionPerformed
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
                throw new NullPointerException("Beverage Field cannot be empty !!!");
            }
        }  catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Beverage Field cannot be empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Beverage !!!");
            return;
        }

        for(EmergencyDistressOrg org:system.getEmergencyDistressOrgDirectory().getEmergencyDistressOrgList()){
            if(org.getUserName().equals(ua.getUsername())){
                service = system.getEmergencyDistressOrgDirectory().addServiceTypes(org, name, desc, type);
            }
        }

        txtServiceName.setText("");
        txtServiceDesc.setText("");
        txtServiceType.setText("");
        populateTable();
    }//GEN-LAST:event_btnAddService1ActionPerformed

   private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblServices.getModel();
        model.setRowCount(0);

        for (EmergencyDistressOrg org:system.getEmergencyDistressOrgDirectory().getEmergencyDistressOrgList()) {
            if (org.getUserName().equals(ua.getUsername())) {
               for(EmergencyService service: org.getServiceList()){
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
    private javax.swing.JButton btnAddService1;
    private javax.swing.JButton btnBack1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblServiceDesc1;
    private javax.swing.JLabel lblServiceName1;
    private javax.swing.JLabel lblType1;
    private javax.swing.JTable tblServices;
    private javax.swing.JTextField txtServiceDesc;
    private javax.swing.JTextField txtServiceName;
    private javax.swing.JTextField txtServiceType;
    // End of variables declaration//GEN-END:variables
}
