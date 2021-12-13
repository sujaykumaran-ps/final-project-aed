/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Ambulance.Ambulance;
import Business.EcoSystem;
import Business.Role.AmbulanceRole;
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
public class ManageAmbulanceDriversJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAmbulanceDriversJPanel
     */
     private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount user;
    public ManageAmbulanceDriversJPanel(JPanel userProcessContainer,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        populateAmbulanceTable();
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
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblFieldWorker.setBackground(new java.awt.Color(133, 211, 255));
        tblFieldWorker.setFont(new java.awt.Font("Segoe UI Semibold", 0, 11)); // NOI18N
        tblFieldWorker.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Ambulance Driver Name", "Username", "Password"
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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 496, 91));

        txtFieldWorker.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtFieldWorker, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 144, -1));

        btnFWBack.setBackground(new java.awt.Color(133, 211, 255));
        btnFWBack.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnFWBack.setText("<< ");
        btnFWBack.setMaximumSize(new java.awt.Dimension(147, 29));
        btnFWBack.setMinimumSize(new java.awt.Dimension(147, 29));
        btnFWBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFWBackActionPerformed(evt);
            }
        });
        add(btnFWBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 63, 90, -1));

        btnSubmitFW.setBackground(new java.awt.Color(133, 211, 255));
        btnSubmitFW.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnSubmitFW.setText("Submit");
        btnSubmitFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitFWActionPerformed(evt);
            }
        });
        add(btnSubmitFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 70, -1));

        lblFieldWorkerName.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblFieldWorkerName.setText("Ambulance Driver Name:");
        add(lblFieldWorkerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, -1, 20));

        txtFieldWorkerUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtFieldWorkerUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 144, -1));

        lblDelPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDelPassword.setText("Password:");
        add(lblDelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, 60, -1));

        txtFieldWorkerPassword.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        add(txtFieldWorkerPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 470, 144, -1));

        btnViewFW.setBackground(new java.awt.Color(133, 211, 255));
        btnViewFW.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnViewFW.setText("View");
        btnViewFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFWActionPerformed(evt);
            }
        });
        add(btnViewFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));

        btnDeleteFW.setBackground(new java.awt.Color(133, 211, 255));
        btnDeleteFW.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnDeleteFW.setText("Delete");
        btnDeleteFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFWActionPerformed(evt);
            }
        });
        add(btnDeleteFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 340, -1, -1));

        lblDelUsername.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        lblDelUsername.setText("Username:");
        add(lblDelUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 440, 60, 20));

        titleManageDeliveryMan.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        titleManageDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageDeliveryMan.setText("Ambulance Drivers SignUp");
        add(titleManageDeliveryMan, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 83, 816, -1));

        btnUpdateFW.setBackground(new java.awt.Color(133, 211, 255));
        btnUpdateFW.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnUpdateFW.setText("Update");
        btnUpdateFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFWActionPerformed(evt);
            }
        });
        add(btnUpdateFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 530, -1, -1));

        btnRefreshFW.setBackground(new java.awt.Color(133, 211, 255));
        btnRefreshFW.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnRefreshFW.setText("Refresh Table");
        btnRefreshFW.setMaximumSize(new java.awt.Dimension(147, 29));
        btnRefreshFW.setMinimumSize(new java.awt.Dimension(147, 29));
        btnRefreshFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshFWActionPerformed(evt);
            }
        });
        add(btnRefreshFW, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Ambulance-Loop-1.gif"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1360, 780));
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

            UserAccount ua = system.getUserAccountDirectory().createUserAccount(name, username, password, null, new AmbulanceRole());
            Ambulance ambulance= system.getAmbulanceDirectory().createAmbulance(name, username);

            populateAmbulanceTable();

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
                populateAmbulanceTable();
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
        populateAmbulanceTable();
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
        populateAmbulanceTable();
    }//GEN-LAST:event_btnRefreshFWActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteFW;
    private javax.swing.JButton btnFWBack;
    private javax.swing.JButton btnRefreshFW;
    private javax.swing.JButton btnSubmitFW;
    private javax.swing.JButton btnUpdateFW;
    private javax.swing.JButton btnViewFW;
    private javax.swing.JLabel jLabel2;
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

    private void populateAmbulanceTable() {
        DefaultTableModel model = (DefaultTableModel) tblFieldWorker.getModel();
        model.setRowCount(0);
        
        for (UserAccount user : system.getUserAccountDirectory().getUserAccountList()) {
           
            if ("Business.Role.AmbulanceRole".equals(user.getRole().getClass().getName())) {
                Object[] row = new Object[3]; 
                row[0] = user.getName();
                row[1] = user.getUsername();
                row[2] = user.getPassword();
                
                model.addRow(row);
            }
            
        } 
    }
}
