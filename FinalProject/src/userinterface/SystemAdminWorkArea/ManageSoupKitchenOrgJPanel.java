/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Role.SoupKitchenOrgRole;
import Business.SoupKitchenOrg.SoupKitchenOrg;
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
public class ManageSoupKitchenOrgJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageSoupKitchenOrgJPanel
     */
    private JPanel userProcessContainer;
    private EcoSystem system;
    UserAccount user;
    
    public ManageSoupKitchenOrgJPanel(JPanel userProcessContainer, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateSoupKitchenOrgTable();
        btnUpdateSoupOrg.setEnabled(false);
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
        tblSoupKitchenOrg = new javax.swing.JTable();
        txtSoupOrgName = new javax.swing.JTextField();
        btnManageSoupOrgBack = new javax.swing.JButton();
        btnSubmitSoupOrg = new javax.swing.JButton();
        lblSoupKitchen = new javax.swing.JLabel();
        txtSoupOrgUsername = new javax.swing.JTextField();
        txtSoupOrgPassword = new javax.swing.JPasswordField();
        lblSoupPassword = new javax.swing.JLabel();
        btnUpdateSoupOrg = new javax.swing.JButton();
        btnDeleteSoupOrg = new javax.swing.JButton();
        lblSoupUsername = new javax.swing.JLabel();
        titleManageRestaurants = new javax.swing.JLabel();
        btnViewSoupOrg = new javax.swing.JButton();
        btnRefreshOrg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        setPreferredSize(new java.awt.Dimension(900, 900));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSoupKitchenOrg.setAutoCreateRowSorter(true);
        tblSoupKitchenOrg.setBackground(new java.awt.Color(133, 211, 255));
        tblSoupKitchenOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        tblSoupKitchenOrg.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Soup Kitchen Name", "Username", "Password"
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
        jScrollPane1.setViewportView(tblSoupKitchenOrg);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, 90));
        add(txtSoupOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 450, 144, -1));

        btnManageSoupOrgBack.setBackground(new java.awt.Color(133, 211, 255));
        btnManageSoupOrgBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnManageSoupOrgBack.setText("<< ");
        btnManageSoupOrgBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageSoupOrgBackActionPerformed(evt);
            }
        });
        add(btnManageSoupOrgBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, -1, 30));

        btnSubmitSoupOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnSubmitSoupOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSubmitSoupOrg.setText("Submit");
        btnSubmitSoupOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitSoupOrgActionPerformed(evt);
            }
        });
        add(btnSubmitSoupOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 570, -1, 30));

        lblSoupKitchen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSoupKitchen.setText("Soup Kitchen Name:");
        add(lblSoupKitchen, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 460, -1, -1));
        add(txtSoupOrgUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 490, 144, -1));
        add(txtSoupOrgPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 520, 144, -1));

        lblSoupPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSoupPassword.setText("Password:");
        add(lblSoupPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 530, -1, -1));

        btnUpdateSoupOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnUpdateSoupOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdateSoupOrg.setText("Update");
        btnUpdateSoupOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSoupOrgActionPerformed(evt);
            }
        });
        add(btnUpdateSoupOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 570, -1, 30));

        btnDeleteSoupOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnDeleteSoupOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDeleteSoupOrg.setText("Delete");
        btnDeleteSoupOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteSoupOrgActionPerformed(evt);
            }
        });
        add(btnDeleteSoupOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 370, 92, 30));

        lblSoupUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSoupUsername.setText("Username:");
        add(lblSoupUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 490, -1, 20));

        titleManageRestaurants.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        titleManageRestaurants.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRestaurants.setText("Soup Kitchen Org SignUp");
        add(titleManageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 816, -1));

        btnViewSoupOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnViewSoupOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnViewSoupOrg.setText("View");
        btnViewSoupOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewSoupOrgActionPerformed(evt);
            }
        });
        add(btnViewSoupOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 370, -1, -1));

        btnRefreshOrg.setBackground(new java.awt.Color(133, 211, 255));
        btnRefreshOrg.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRefreshOrg.setText("Refresh Table");
        btnRefreshOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshOrgActionPerformed(evt);
            }
        });
        add(btnRefreshOrg, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, -1, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/soup.png"))); // NOI18N
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 620, 770));
    }// </editor-fold>//GEN-END:initComponents

    private void btnManageSoupOrgBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageSoupOrgBackActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel sysAdmin = (SystemAdminWorkAreaJPanel) component;
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnManageSoupOrgBackActionPerformed

    private void btnSubmitSoupOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitSoupOrgActionPerformed
        String name = txtSoupOrgName.getText();
        String username = txtSoupOrgUsername.getText();
        String password = txtSoupOrgPassword.getText();

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
            }else if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$", password) == false){
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
                password, null, new SoupKitchenOrgRole());
            SoupKitchenOrg org = system.getSoupKitchenOrgDirectory().createSoupInfo(username);

            populateSoupKitchenOrgTable();

            txtSoupOrgName.setText("");
            txtSoupOrgUsername.setText("");
            txtSoupOrgPassword.setText("");
        }
    }//GEN-LAST:event_btnSubmitSoupOrgActionPerformed

    private void btnUpdateSoupOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSoupOrgActionPerformed
        // TODO add your handling code here:
        String name = txtSoupOrgName.getText();
        String username = txtSoupOrgUsername.getText();
        String password = txtSoupOrgPassword.getText();

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
            }else if(Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z].*[a-z].*[a-z]).{8}$", password) == false){
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
        populateSoupKitchenOrgTable();
        btnSubmitSoupOrg.setEnabled(true);
        btnDeleteSoupOrg.setEnabled(true);
        btnViewSoupOrg.setEnabled(true);
        btnUpdateSoupOrg.setEnabled(false);
        txtSoupOrgName.setText("");
        txtSoupOrgUsername.setText("");
        txtSoupOrgPassword.setText("");
    }//GEN-LAST:event_btnUpdateSoupOrgActionPerformed

    private void btnDeleteSoupOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteSoupOrgActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSoupKitchenOrg.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Soup Kitchen Detail to Delete !!!");
            return;
        }
        else {
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are You Sure ???", "Warning", selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                String username = (String) tblSoupKitchenOrg.getValueAt(selectedRow, 1);
                String pwd = (String) tblSoupKitchenOrg.getValueAt(selectedRow, 2);

                UserAccount user = system.getUserAccountDirectory().authenticateUser(username, pwd);
                system.getUserAccountDirectory().deleteUserAccount(user);

                system.getSnowClearingOrgDirectory().deleteSnowClearingOrg(user.getUsername());
                populateSoupKitchenOrgTable();

            }
        }
    }//GEN-LAST:event_btnDeleteSoupOrgActionPerformed

    private void btnViewSoupOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewSoupOrgActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSoupKitchenOrg.getSelectedRow();

        if(selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Soup Kitchen Detail to View !!!");
            return;
        }

        else{
            String username = (String) tblSoupKitchenOrg.getValueAt(selectedRow, 1);
            String pwd = (String) tblSoupKitchenOrg.getValueAt(selectedRow, 2);
            user = system.getUserAccountDirectory().authenticateUser(username, pwd);

            txtSoupOrgName.setText(user.getName()+"");
            txtSoupOrgUsername.setText(user.getUsername()+"");
            txtSoupOrgPassword.setText(user.getPassword()+"");

        }

        btnSubmitSoupOrg.setEnabled(false);
        btnDeleteSoupOrg.setEnabled(false);
        btnViewSoupOrg.setEnabled(false);
        btnUpdateSoupOrg.setEnabled(true);
    }//GEN-LAST:event_btnViewSoupOrgActionPerformed

    private void btnRefreshOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshOrgActionPerformed
        // TODO add your handling code here:
        populateSoupKitchenOrgTable();
    }//GEN-LAST:event_btnRefreshOrgActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteSoupOrg;
    private javax.swing.JButton btnManageSoupOrgBack;
    private javax.swing.JButton btnRefreshOrg;
    private javax.swing.JButton btnSubmitSoupOrg;
    private javax.swing.JButton btnUpdateSoupOrg;
    private javax.swing.JButton btnViewSoupOrg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblSoupKitchen;
    private javax.swing.JLabel lblSoupPassword;
    private javax.swing.JLabel lblSoupUsername;
    private javax.swing.JTable tblSoupKitchenOrg;
    private javax.swing.JLabel titleManageRestaurants;
    private javax.swing.JTextField txtSoupOrgName;
    private javax.swing.JPasswordField txtSoupOrgPassword;
    private javax.swing.JTextField txtSoupOrgUsername;
    // End of variables declaration//GEN-END:variables

    private void populateSoupKitchenOrgTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblSoupKitchenOrg.getModel();
        model.setRowCount(0);
        
        
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           

            //System.out.println(user);
            

            if ("Business.Role.SoupKitchenOrgRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
        }
    }
}