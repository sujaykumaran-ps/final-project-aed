/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Member.Member;
import Business.EcoSystem;
import Business.SnowClearingOrg.SnowClearingOrg;
import Business.Role.SnowClearingOrgRole;
import Business.Role.MemberRole;
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

public class ManageMembersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageMembersJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    public ManageMembersJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateMembersTable();
        btnUpdateMember.setEnabled(false);
        
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
        tblMembers = new javax.swing.JTable();
        txtMemName = new javax.swing.JTextField();
        btnCusBack = new javax.swing.JButton();
        btnSubmitMember = new javax.swing.JButton();
        lblCusName = new javax.swing.JLabel();
        txtMemUsername = new javax.swing.JTextField();
        lblCusPassword = new javax.swing.JLabel();
        txtMemPassword = new javax.swing.JPasswordField();
        btnViewMember = new javax.swing.JButton();
        btnDeleteMember = new javax.swing.JButton();
        lblCusUsername = new javax.swing.JLabel();
        titleManageCustomers = new javax.swing.JLabel();
        btnUpdateMember = new javax.swing.JButton();
        btnRefreshMem = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 243, 243));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMembers.setBackground(new java.awt.Color(133, 211, 255));
        tblMembers.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        tblMembers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Member Name", "Username"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMembers);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 190, 560, 91));

        txtMemName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtMemName, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 144, -1));

        btnCusBack.setBackground(new java.awt.Color(133, 211, 255));
        btnCusBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnCusBack.setText("<< ");
        btnCusBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCusBackActionPerformed(evt);
            }
        });
        add(btnCusBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        btnSubmitMember.setBackground(new java.awt.Color(133, 211, 255));
        btnSubmitMember.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSubmitMember.setText("Submit");
        btnSubmitMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitMemberActionPerformed(evt);
            }
        });
        add(btnSubmitMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 480, -1, -1));

        lblCusName.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        lblCusName.setText("Member Name:");
        add(lblCusName, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, -1, -1));

        txtMemUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtMemUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, 144, -1));

        lblCusPassword.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        lblCusPassword.setText("Password:");
        add(lblCusPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, -1, -1));

        txtMemPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        txtMemPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMemPasswordActionPerformed(evt);
            }
        });
        add(txtMemPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, 144, -1));

        btnViewMember.setBackground(new java.awt.Color(133, 211, 255));
        btnViewMember.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnViewMember.setText("View");
        btnViewMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMemberActionPerformed(evt);
            }
        });
        add(btnViewMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        btnDeleteMember.setBackground(new java.awt.Color(133, 211, 255));
        btnDeleteMember.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDeleteMember.setText("Delete");
        btnDeleteMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteMemberActionPerformed(evt);
            }
        });
        add(btnDeleteMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, -1, -1));

        lblCusUsername.setFont(new java.awt.Font("Segoe UI Light", 1, 12)); // NOI18N
        lblCusUsername.setText("Username:");
        add(lblCusUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 390, -1, 20));

        titleManageCustomers.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        titleManageCustomers.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageCustomers.setText("Member SignUp");
        add(titleManageCustomers, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 1100, 40));

        btnUpdateMember.setBackground(new java.awt.Color(133, 211, 255));
        btnUpdateMember.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdateMember.setText("Update");
        btnUpdateMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMemberActionPerformed(evt);
            }
        });
        add(btnUpdateMember, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 480, -1, -1));

        btnRefreshMem.setBackground(new java.awt.Color(133, 211, 255));
        btnRefreshMem.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRefreshMem.setText("Refresh Table");
        btnRefreshMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshMemActionPerformed(evt);
            }
        });
        add(btnRefreshMem, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 150, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/member.jpg"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 1010, 830));
    }// </editor-fold>//GEN-END:initComponents

    private void btnCusBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCusBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnCusBackActionPerformed

    private void btnSubmitMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitMemberActionPerformed
        String name = txtMemName.getText();
        String username = txtMemUsername.getText();
        String password = txtMemPassword.getText();
              
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Member Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Customer Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Member Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Member Name !!!");
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
            }else if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$", password) == false){
                throw new Exception("Password is too weak !!!");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password Field Cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is too weak !!! Your Password should contain 2 numbers, 1 Uppercase Letter, and the length should be 8 !!");
            return;
        }
         
        if (system.getUserAccountDirectory().checkIfUsernameIsUnique(username) == false) {
            JOptionPane.showMessageDialog(null,"Username Already Exists ! Please enter a different Username !!!");
        }else{
            
        UserAccount ua = system.getUserAccountDirectory().createUserAccount(name, username, password, null, new MemberRole());
        Member mem = system.getMemberDirectory().createMember(username);
        
        populateMembersTable();
        
        txtMemName.setText("");
        txtMemUsername.setText("");
        txtMemPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitMemberActionPerformed

    private void txtMemPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMemPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMemPasswordActionPerformed

    private void btnViewMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMemberActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMembers.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Customer Detail to View !!!");
            return;
        }

        else{
            String username = (String) tblMembers.getValueAt(selectedRow, 1);
            String pwd = (String) tblMembers.getValueAt(selectedRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtMemName.setText(user.getName()+"");
            txtMemUsername.setText(user.getUsername()+"");
            txtMemPassword.setText(user.getPassword()+"");

        }
        
        btnSubmitMember.setEnabled(false);
        btnDeleteMember.setEnabled(false);
        btnViewMember.setEnabled(false);
        btnUpdateMember.setEnabled(true);
    }//GEN-LAST:event_btnViewMemberActionPerformed

    private void btnDeleteMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteMemberActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblMembers.getSelectedRow();
        
        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Customer Detail to Delete !!!");
            return;
        }
        else {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure ???", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username = (String) tblMembers.getValueAt(selectedRow, 1);
                String pwd = (String) tblMembers.getValueAt(selectedRow, 2);
                
                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);
                system.getUserAccountDirectory().deleteUserAccount(user);
                system.getMemberDirectory().deleteMember(user.getUsername());
                populateMembersTable();
            }
        }
    }//GEN-LAST:event_btnDeleteMemberActionPerformed

    private void btnUpdateMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMemberActionPerformed
        // TODO add your handling code here:
        String name = txtMemName.getText();
        String username = txtMemUsername.getText();
        String password = txtMemPassword.getText();
        
        try {
            if(name == null || name.isEmpty()){
                throw new NullPointerException("Member Name Field Cannot be Empty !!!");   
            }else if(Pattern.matches("^[A-Za-z ]+$", name) == false){
                throw new Exception("Please Enter a valid Member Name !!!");    
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Member Name Field Cannot be Empty !!!");
            return;
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Please Enter a valid Member Name !!!");
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
            }else if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$", password) == false){
                throw new Exception("Password is too weak !!! ");
            }
        } catch(NullPointerException e){
            JOptionPane.showMessageDialog(null, "Password Field Cannot be Empty !!!");
            return;
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Password is too weak !!! Your Password should contain 2 numbers, 1 Uppercase Letter, and the length should be 8 !!");
            return;
        }
        
        system.getUserAccountDirectory().updateUserAccount(user, name, username, password);
        populateMembersTable();
        btnSubmitMember.setEnabled(true);
        btnDeleteMember.setEnabled(true);
        btnViewMember.setEnabled(true);
        btnUpdateMember.setEnabled(false);
        txtMemName.setText("");
        txtMemUsername.setText("");
        txtMemPassword.setText("");
    }//GEN-LAST:event_btnUpdateMemberActionPerformed

    private void btnRefreshMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshMemActionPerformed
        // TODO add your handling code here:
        populateMembersTable();
    }//GEN-LAST:event_btnRefreshMemActionPerformed

    private void populateMembersTable() {
        DefaultTableModel model = (DefaultTableModel) tblMembers.getModel();
        model.setRowCount(0);
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.MemberRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[2]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                
                model.addRow(row);
            }
            
        }
       
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCusBack;
    private javax.swing.JButton btnDeleteMember;
    private javax.swing.JButton btnRefreshMem;
    private javax.swing.JButton btnSubmitMember;
    private javax.swing.JButton btnUpdateMember;
    private javax.swing.JButton btnViewMember;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCusName;
    private javax.swing.JLabel lblCusPassword;
    private javax.swing.JLabel lblCusUsername;
    private javax.swing.JTable tblMembers;
    private javax.swing.JLabel titleManageCustomers;
    private javax.swing.JTextField txtMemName;
    private javax.swing.JPasswordField txtMemPassword;
    private javax.swing.JTextField txtMemUsername;
    // End of variables declaration//GEN-END:variables
}
