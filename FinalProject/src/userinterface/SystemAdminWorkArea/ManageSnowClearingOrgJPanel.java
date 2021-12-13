/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.SnowClearingOrg.SnowClearingOrg;
import Business.Role.SnowClearingOrgRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sujay
 */
public class ManageSnowClearingOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSnowClearingOrgJPanel
     * 
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    
    public ManageSnowClearingOrgJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateSnowClearingOrgTable();
        btnUpdateOrg.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSnowClearingOrg = new javax.swing.JTable();
        txtOrgName = new javax.swing.JTextField();
        btnManageOrgBack = new javax.swing.JButton();
        btnSubmitOrg = new javax.swing.JButton();
        lblResName = new javax.swing.JLabel();
        txtOrgUsername = new javax.swing.JTextField();
        txtOrgPassword = new javax.swing.JPasswordField();
        lblResPassword = new javax.swing.JLabel();
        btnUpdateOrg = new javax.swing.JButton();
        btnDeleteOrg = new javax.swing.JButton();
        lblResUsername = new javax.swing.JLabel();
        titleManageRestaurants = new javax.swing.JLabel();
        btnViewOrg = new javax.swing.JButton();
        btnRefreshOrg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSnowClearingOrg.setBackground(new java.awt.Color(133, 211, 255));
        tblSnowClearingOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        tblSnowClearingOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "SnowClearingOrg Name", "Username", "Password"
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
        jScrollPane1.setViewportView(tblSnowClearingOrg);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, 496, 91));

        txtOrgName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 420, 144, -1));

        btnManageOrgBack.setBackground(new java.awt.Color(133, 211, 255));
        btnManageOrgBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnManageOrgBack.setText("<< ");
        btnManageOrgBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageOrgBackActionPerformed(evt);
            }
        });
        add(btnManageOrgBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        btnSubmitOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnSubmitOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSubmitOrg.setText("Submit");
        btnSubmitOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitOrgActionPerformed(evt);
            }
        });
        add(btnSubmitOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, -1, -1));

        lblResName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblResName.setText("Snow ClearingOrg Name:");
        add(lblResName, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 420, -1, -1));

        txtOrgUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtOrgUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 144, -1));

        txtOrgPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtOrgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 490, 144, -1));

        lblResPassword.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblResPassword.setText("Password:");
        add(lblResPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, -1, -1));

        btnUpdateOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnUpdateOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdateOrg.setText("Update");
        btnUpdateOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateOrgActionPerformed(evt);
            }
        });
        add(btnUpdateOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 540, -1, -1));

        btnDeleteOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnDeleteOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDeleteOrg.setText("Delete");
        btnDeleteOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOrgActionPerformed(evt);
            }
        });
        add(btnDeleteOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 370, -1, -1));

        lblResUsername.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblResUsername.setText("Username:");
        add(lblResUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, -1, 20));

        titleManageRestaurants.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        titleManageRestaurants.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRestaurants.setText("Snow Clearing Org SignUp");
        add(titleManageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 816, -1));

        btnViewOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnViewOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnViewOrg.setText("View");
        btnViewOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewOrgActionPerformed(evt);
            }
        });
        add(btnViewOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 370, -1, -1));

        btnRefreshOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnRefreshOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRefreshOrg.setText("Refresh Table");
        btnRefreshOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshOrgActionPerformed(evt);
            }
        });
        add(btnRefreshOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snow.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 890, 280));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageOrgBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageOrgBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnManageOrgBackActionPerformed

    private void btnSubmitOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitOrgActionPerformed
        String name = txtOrgName.getText();
        String username = txtOrgUsername.getText();
        String password = txtOrgPassword.getText();
              
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Name !!!");
            return;
        }
        
        try {
            if(username == null || username.isEmpty()){
               throw new NullPointerException("Username Field Cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Username Field Cannot be Empty !!!");
            return;  
        }
        
        try { 
            if(password == null || password.isEmpty()){
                throw new NullPointerException("Password Field Cannot be Empty !!!");
            }else if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8,}$", password) == false){
                throw new Exception("Password is too weak !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password Field Cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is too weak !!!");
            return;
        }
         
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(username) == false) {
            JOptionPane.showMessageDialog(null,"Username Already Exists ! Please enter a different Username !!!");
        }else{
            

        UserAccount ua = system.getUserAccountDirectory().createUserAccount(name, username, 
                password, null, new SnowClearingOrgRole());
        SnowClearingOrg org = system.getSnowClearingOrgDirectory().createSnowClearingOrgInfo(username);

        
        
        populateSnowClearingOrgTable();
        
        txtOrgName.setText("");
        txtOrgUsername.setText("");
        txtOrgPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitOrgActionPerformed

    private void btnUpdateOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateOrgActionPerformed
        // TODO add your handling code here:
        String name = txtOrgName.getText();
        String username = txtOrgUsername.getText();
        String password = txtOrgPassword.getText();
        
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Name !!!");
            return;
        }
        
        try {
            if(username == null || username.isEmpty()){
               throw new NullPointerException("Username Field Cannot be Empty !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Username Field Cannot be Empty !!!");
            return;  
        }
        
        try { 
            if(password == null || password.isEmpty()){
                throw new NullPointerException("Password Field Cannot be Empty !!!");
            }else if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8,}$", password) == false){
                throw new Exception("Password is too weak !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password Field Cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is too weak !!!");
            return;
        }
        
        system.getUserAccountDirectory().updateUserAccount(user, name, username, password);
        populateSnowClearingOrgTable();
        btnSubmitOrg.setEnabled(true);
        btnDeleteOrg.setEnabled(true);
        btnViewOrg.setEnabled(true);
        btnUpdateOrg.setEnabled(false);
        txtOrgName.setText("");
        txtOrgUsername.setText("");
        txtOrgPassword.setText("");
    }//GEN-LAST:event_btnUpdateOrgActionPerformed

    private void btnDeleteOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOrgActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSnowClearingOrg.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a SnowClearingOrg Detail to Delete !!!");
            return;
        }
        else {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure ???", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username = (String) tblSnowClearingOrg.getValueAt(selectedRow, 1);
                String pwd = (String) tblSnowClearingOrg.getValueAt(selectedRow, 2);
                
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);
                system.getUserAccountDirectory().deleteUserAccount(user);

                system.getSnowClearingOrgDirectory().deleteSnowClearingOrg(user.getUsername());
                populateSnowClearingOrgTable();

            }
        }
    }//GEN-LAST:event_btnDeleteOrgActionPerformed

    private void btnViewOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewOrgActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSnowClearingOrg.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a SnowClearingOrg Detail to View !!!");
            return;
        }

        else{
            String username = (String) tblSnowClearingOrg.getValueAt(selectedRow, 1);
            String pwd = (String) tblSnowClearingOrg.getValueAt(selectedRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtOrgName.setText(user.getName()+"");
            txtOrgUsername.setText(user.getUsername()+"");
            txtOrgPassword.setText(user.getPassword()+"");

        }
        
        btnSubmitOrg.setEnabled(false);
        btnDeleteOrg.setEnabled(false);
        btnViewOrg.setEnabled(false);
        btnUpdateOrg.setEnabled(true);
    }//GEN-LAST:event_btnViewOrgActionPerformed

    private void btnRefreshOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshOrgActionPerformed
        // TODO add your handling code here:
        populateSnowClearingOrgTable();
    }//GEN-LAST:event_btnRefreshOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteOrg;
    private javax.swing.JButton btnManageOrgBack;
    private javax.swing.JButton btnRefreshOrg;
    private javax.swing.JButton btnSubmitOrg;
    private javax.swing.JButton btnUpdateOrg;
    private javax.swing.JButton btnViewOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblResPassword;
    private javax.swing.JLabel lblResUsername;
    private javax.swing.JTable tblSnowClearingOrg;
    private javax.swing.JLabel titleManageRestaurants;
    private javax.swing.JTextField txtOrgName;
    private javax.swing.JPasswordField txtOrgPassword;
    private javax.swing.JTextField txtOrgUsername;
    // End of variables declaration//GEN-END:variables

    private void populateSnowClearingOrgTable() {
        DefaultTableModel model = (DefaultTableModel) tblSnowClearingOrg.getModel();
        model.setRowCount(0);
        
        
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           

            //System.out.println(user);
            

            if ("Business.Role.SnowClearingOrgRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    }
}
