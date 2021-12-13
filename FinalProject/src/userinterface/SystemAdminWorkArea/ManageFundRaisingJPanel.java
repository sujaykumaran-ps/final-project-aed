/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.FundRaising.FundRaising;
import Business.Role.FundRaisingRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nagashreeseshadri
 */
public class ManageFundRaisingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageFundRaisingJPanel
     */
   private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    
    public ManageFundRaisingJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateFundRaisingTable();
        
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
        tblFundRaisingEnt = new javax.swing.JTable();
        txtFundRaisingName = new javax.swing.JTextField();
        btnManageFundBack = new javax.swing.JButton();
        btnSubmitFund = new javax.swing.JButton();
        lblResName = new javax.swing.JLabel();
        txtFundRaisingUsername = new javax.swing.JTextField();
        txtFundRaisingPassword = new javax.swing.JPasswordField();
        lblResPassword = new javax.swing.JLabel();
        btnUpdateFund = new javax.swing.JButton();
        btnDeleteEnt = new javax.swing.JButton();
        lblResUsername = new javax.swing.JLabel();
        titleManageRestaurants = new javax.swing.JLabel();
        btnViewFundEnt = new javax.swing.JButton();
        btnRefreshEnt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFundRaisingEnt.setBackground(new java.awt.Color(133, 211, 255));
        tblFundRaisingEnt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "FundRaising Enterprise Name", "Username", "Password"
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
        jScrollPane1.setViewportView(tblFundRaisingEnt);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 496, 91));

        txtFundRaisingName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtFundRaisingName, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 480, 144, -1));

        btnManageFundBack.setBackground(new java.awt.Color(133, 211, 255));
        btnManageFundBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnManageFundBack.setText("<< ");
        btnManageFundBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageFundBackActionPerformed(evt);
            }
        });
        add(btnManageFundBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 40, -1, -1));

        btnSubmitFund.setBackground(new java.awt.Color(133, 211, 255));
        btnSubmitFund.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSubmitFund.setText("Submit");
        btnSubmitFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitFundActionPerformed(evt);
            }
        });
        add(btnSubmitFund, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 600, -1, -1));

        lblResName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblResName.setText("FundRaising Enterprise Name:");
        add(lblResName, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, -1, -1));

        txtFundRaisingUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtFundRaisingUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 510, 144, -1));

        txtFundRaisingPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtFundRaisingPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 540, 144, -1));

        lblResPassword.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblResPassword.setText("Password:");
        add(lblResPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 540, -1, -1));

        btnUpdateFund.setBackground(new java.awt.Color(133, 211, 255));
        btnUpdateFund.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdateFund.setText("Update");
        btnUpdateFund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFundActionPerformed(evt);
            }
        });
        add(btnUpdateFund, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 600, -1, -1));

        btnDeleteEnt.setBackground(new java.awt.Color(133, 211, 255));
        btnDeleteEnt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDeleteEnt.setText("Delete");
        btnDeleteEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEntActionPerformed(evt);
            }
        });
        add(btnDeleteEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, -1, -1));

        lblResUsername.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblResUsername.setText("Username:");
        add(lblResUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 510, -1, 20));

        titleManageRestaurants.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        titleManageRestaurants.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRestaurants.setText("FundRaising Org SignUp");
        add(titleManageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 151, 816, -1));

        btnViewFundEnt.setBackground(new java.awt.Color(133, 211, 255));
        btnViewFundEnt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnViewFundEnt.setText("View");
        btnViewFundEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFundEntActionPerformed(evt);
            }
        });
        add(btnViewFundEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 410, -1, -1));

        btnRefreshEnt.setBackground(new java.awt.Color(133, 211, 255));
        btnRefreshEnt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRefreshEnt.setText("Refresh Table");
        btnRefreshEnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshEntActionPerformed(evt);
            }
        });
        add(btnRefreshEnt, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donate-image.jpg"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 610, 310));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/donatehome.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 710, 490));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageFundBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageFundBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnManageFundBackActionPerformed

    private void btnSubmitFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitFundActionPerformed
        String name = txtFundRaisingName.getText();
        String username = txtFundRaisingUsername.getText();
        String password = txtFundRaisingPassword.getText();

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

            UserAccount ua = system.getUserAccountDirectory().createUserAccount(name, username,
                password, null, new FundRaisingRole());
            FundRaising org = system.getFundRaisingDirectory().createFundRaisingInfo(username);

            populateFundRaisingTable();

            txtFundRaisingName.setText("");
            txtFundRaisingUsername.setText("");
            txtFundRaisingPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitFundActionPerformed

    private void btnUpdateFundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateFundActionPerformed
        // TODO add your handling code here:
        String name = txtFundRaisingName.getText();
        String username = txtFundRaisingUsername.getText();
        String password = txtFundRaisingPassword.getText();

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
        populateFundRaisingTable();
        btnSubmitFund.setEnabled(true);
        btnDeleteEnt.setEnabled(true);
        btnViewFundEnt.setEnabled(true);
        btnUpdateFund.setEnabled(false);
        txtFundRaisingName.setText("");
        txtFundRaisingUsername.setText("");
        txtFundRaisingPassword.setText("");
    }//GEN-LAST:event_btnUpdateFundActionPerformed

    private void btnDeleteEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEntActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFundRaisingEnt.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Fund Raising Detail to Delete !!!");
            return;
        }
        else {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure ???", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username = (String) tblFundRaisingEnt.getValueAt(selectedRow, 1);
                String pwd = (String) tblFundRaisingEnt.getValueAt(selectedRow, 2);

                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);
                system.getUserAccountDirectory().deleteUserAccount(user);

                system.getFundRaisingDirectory().deleteFundRaising(user.getUsername());
                populateFundRaisingTable();

            }
        }
    }//GEN-LAST:event_btnDeleteEntActionPerformed

    private void btnViewFundEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFundEntActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblFundRaisingEnt.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Fund Raising Org Detail to View !!!");
            return;
        }

        else{
            String username = (String) tblFundRaisingEnt.getValueAt(selectedRow, 1);
            String pwd = (String) tblFundRaisingEnt.getValueAt(selectedRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtFundRaisingName.setText(user.getName()+"");
            txtFundRaisingUsername.setText(user.getUsername()+"");
            txtFundRaisingPassword.setText(user.getPassword()+"");

        }

        btnSubmitFund.setEnabled(false);
        btnDeleteEnt.setEnabled(false);
        btnViewFundEnt.setEnabled(false);
        btnUpdateFund.setEnabled(true);
    }//GEN-LAST:event_btnViewFundEntActionPerformed

    private void btnRefreshEntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshEntActionPerformed
        // TODO add your handling code here:
        populateFundRaisingTable();
    }//GEN-LAST:event_btnRefreshEntActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteEnt;
    private javax.swing.JButton btnManageFundBack;
    private javax.swing.JButton btnRefreshEnt;
    private javax.swing.JButton btnSubmitFund;
    private javax.swing.JButton btnUpdateFund;
    private javax.swing.JButton btnViewFundEnt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblResPassword;
    private javax.swing.JLabel lblResUsername;
    private javax.swing.JTable tblFundRaisingEnt;
    private javax.swing.JLabel titleManageRestaurants;
    private javax.swing.JTextField txtFundRaisingName;
    private javax.swing.JPasswordField txtFundRaisingPassword;
    private javax.swing.JTextField txtFundRaisingUsername;
    // End of variables declaration//GEN-END:variables

    private void populateFundRaisingTable() {
        DefaultTableModel model = (DefaultTableModel) tblFundRaisingEnt.getModel();
        model.setRowCount(0);
        
        
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           

            //System.out.println(user);
            

            if ("Business.Role.FundRaisingRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        }
    
    }
}
