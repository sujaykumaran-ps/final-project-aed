/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Member.Member;
import Business.FieldWorker.FieldWorker;
import Business.EcoSystem;
import Business.Role.MemberRole;
import Business.Role.FieldWorkerRole;
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
public class ManageFieldWorkerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFieldWorkerJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount user;
    
    public ManageFieldWorkerJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateFieldWorkerTable();
        btnUpdateFW.setEnabled(false);
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
        tblFieldWorker = new javax.swing.JTable();
        txtFieldWorker = new javax.swing.JTextField();
        btnFWBack = new javax.swing.JButton();
        btnSubmitFW = new javax.swing.JButton();
        lblFieldWorkerName = new javax.swing.JLabel();
        txtFieldWorkerUsername = new javax.swing.JTextField();
        lblDelPassword = new javax.swing.JLabel();
        txtFieldWorkerPassword = new javax.swing.JPasswordField();
        btnViewFW = new javax.swing.JButton();
        btnDeleteFW = new javax.swing.JButton();
        lblDelUsername = new javax.swing.JLabel();
        titleManageDeliveryMan = new javax.swing.JLabel();
        btnUpdateFW = new javax.swing.JButton();
        btnRefreshFW = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFieldWorker.setAutoCreateRowSorter(true);
        tblFieldWorker.setBackground(new java.awt.Color(133, 211, 255));
        tblFieldWorker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FieldWorker Name", "Username", "Password"
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
        jScrollPane1.setViewportView(tblFieldWorker);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 496, 91));
        add(txtFieldWorker, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 380, 144, -1));

        btnFWBack.setBackground(new java.awt.Color(133, 211, 255));
        btnFWBack.setText("<< Back");
        btnFWBack.setMaximumSize(new java.awt.Dimension(147, 29));
        btnFWBack.setMinimumSize(new java.awt.Dimension(147, 29));
        btnFWBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFWBackActionPerformed(evt);
            }
        });
        add(btnFWBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

        btnSubmitFW.setBackground(new java.awt.Color(133, 211, 255));
        btnSubmitFW.setText("Submit");
        btnSubmitFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitFWActionPerformed(evt);
            }
        });
        add(btnSubmitFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 490, -1, -1));

        lblFieldWorkerName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFieldWorkerName.setText("Field Worker Name:");
        add(lblFieldWorkerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, -1, 20));
        add(txtFieldWorkerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 410, 144, -1));

        lblDelPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelPassword.setText("Password:");
        add(lblDelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 450, -1, -1));
        add(txtFieldWorkerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 450, 144, -1));

        btnViewFW.setBackground(new java.awt.Color(133, 211, 255));
        btnViewFW.setText("View");
        btnViewFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFWActionPerformed(evt);
            }
        });
        add(btnViewFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 320, -1, -1));

        btnDeleteFW.setBackground(new java.awt.Color(133, 211, 255));
        btnDeleteFW.setText("Delete");
        btnDeleteFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFWActionPerformed(evt);
            }
        });
        add(btnDeleteFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 320, -1, -1));

        lblDelUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelUsername.setText("Username:");
        add(lblDelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 410, -1, 20));

        titleManageDeliveryMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleManageDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageDeliveryMan.setText("                  Manage FieldWorker ");
        add(titleManageDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 816, -1));

        btnUpdateFW.setBackground(new java.awt.Color(133, 211, 255));
        btnUpdateFW.setText("Update");
        btnUpdateFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFWActionPerformed(evt);
            }
        });
        add(btnUpdateFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        btnRefreshFW.setBackground(new java.awt.Color(133, 211, 255));
        btnRefreshFW.setText("Refresh Table");
        btnRefreshFW.setMaximumSize(new java.awt.Dimension(147, 29));
        btnRefreshFW.setMinimumSize(new java.awt.Dimension(147, 29));
        btnRefreshFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshFWActionPerformed(evt);
            }
        });
        add(btnRefreshFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SnowClearing_fieldworker.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 1360, 900));
    }// </editor-fold>//GEN-END:initComponents

    private void btnFWBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFWBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnFWBackActionPerformed

    private void btnSubmitFWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitFWActionPerformed
        String name = txtFieldWorker.getText();
        String username = txtFieldWorkerUsername.getText();
        String password = txtFieldWorkerPassword.getText();
              
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Field Worker Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Field Worker Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Field Worker Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Field Worker Name !!!");
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
            }else if(password.length() < 5){
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
            
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(name, username, password, null, new FieldWorkerRole());
        FieldWorker fieldWorker= system.getFieldWorkerDirectory().createFieldWorker(name, username);
        
        populateFieldWorkerTable();
        
        txtFieldWorker.setText("");
        txtFieldWorkerUsername.setText("");
        txtFieldWorkerPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitFWActionPerformed

    private void btnViewFWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFWActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFieldWorker.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Field Worker Detail to View !!!");
            return;
        }

        else{
            String username = (String) tblFieldWorker.getValueAt(selectedRow, 1);
            String pwd = (String) tblFieldWorker.getValueAt(selectedRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtFieldWorker.setText(user.getName()+"");
            txtFieldWorkerUsername.setText(user.getUsername()+"");
            txtFieldWorkerPassword.setText(user.getPassword()+"");

        }
        
        btnSubmitFW.setEnabled(false);
        btnDeleteFW.setEnabled(false);
        btnViewFW.setEnabled(false);
        btnUpdateFW.setEnabled(true);
    }//GEN-LAST:event_btnViewFWActionPerformed

    private void btnDeleteFWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFWActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFieldWorker.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Delivery Person Detail to Delete !!!");
            return;
        }
        else {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure ???", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username = (String) tblFieldWorker.getValueAt(selectedRow, 1);
                String pwd = (String) tblFieldWorker.getValueAt(selectedRow, 2);
                
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);
                system.getUserAccountDirectory().deleteUserAccount(user);
                //system.getDeliveryManDirectory().deleteDeliveryMan(user.getUsername());
                system.getFieldWorkerDirectory();
                populateFieldWorkerTable();
            }
        }
    }//GEN-LAST:event_btnDeleteFWActionPerformed

    private void btnUpdateFWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFWActionPerformed
        // TODO add your handling code here:
        String name = txtFieldWorker.getText();
        String username = txtFieldWorkerUsername.getText();
        String password = txtFieldWorkerPassword.getText();
        
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Field Worker Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Field Worker Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Field Worker Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Field Worker Name !!!");
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
            }else if(password.length() < 5){
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
        populateFieldWorkerTable();
        btnSubmitFW.setEnabled(true);
        btnDeleteFW.setEnabled(true);
        btnViewFW.setEnabled(true);
        btnUpdateFW.setEnabled(false);
        txtFieldWorker.setText("");
        txtFieldWorkerUsername.setText("");
        txtFieldWorkerPassword.setText("");
    }//GEN-LAST:event_btnUpdateFWActionPerformed

    private void btnRefreshFWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshFWActionPerformed
        // TODO add your handling code here:
        populateFieldWorkerTable();
    }//GEN-LAST:event_btnRefreshFWActionPerformed

    private void populateFieldWorkerTable() {
        DefaultTableModel model = (DefaultTableModel) tblFieldWorker.getModel();
        model.setRowCount(0);
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.FieldWorkerRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteFW;
    private javax.swing.JButton btnFWBack;
    private javax.swing.JButton btnRefreshFW;
    private javax.swing.JButton btnSubmitFW;
    private javax.swing.JButton btnUpdateFW;
    private javax.swing.JButton btnViewFW;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDelPassword;
    private javax.swing.JLabel lblDelUsername;
    private javax.swing.JLabel lblFieldWorkerName;
    private javax.swing.JTable tblFieldWorker;
    private javax.swing.JLabel titleManageDeliveryMan;
    private javax.swing.JTextField txtFieldWorker;
    private javax.swing.JPasswordField txtFieldWorkerPassword;
    private javax.swing.JTextField txtFieldWorkerUsername;
    // End of variables declaration//GEN-END:variables
}
