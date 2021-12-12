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

        btnFWBack.setBackground(new java.awt.Color(133, 211, 255));
        btnFWBack.setText("<< Back");
        btnFWBack.setMaximumSize(new java.awt.Dimension(147, 29));
        btnFWBack.setMinimumSize(new java.awt.Dimension(147, 29));
        btnFWBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFWBackActionPerformed(evt);
            }
        });

        btnSubmitFW.setText("Submit");
        btnSubmitFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitFWActionPerformed(evt);
            }
        });

        lblFieldWorkerName.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblFieldWorkerName.setText("Ambulance Driver Name:");

        lblDelPassword.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelPassword.setText("Password:");

        btnViewFW.setText("View");
        btnViewFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFWActionPerformed(evt);
            }
        });

        btnDeleteFW.setText("Delete");
        btnDeleteFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFWActionPerformed(evt);
            }
        });

        lblDelUsername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDelUsername.setText("Username:");

        titleManageDeliveryMan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleManageDeliveryMan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageDeliveryMan.setText("Ambulance Drivers SignUp");

        btnUpdateFW.setText("Update");
        btnUpdateFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateFWActionPerformed(evt);
            }
        });

        btnRefreshFW.setText("Refresh Table");
        btnRefreshFW.setMaximumSize(new java.awt.Dimension(147, 29));
        btnRefreshFW.setMinimumSize(new java.awt.Dimension(147, 29));
        btnRefreshFW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshFWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(btnFWBack, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1199, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titleManageDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 816, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(650, 650, 650)
                            .addComponent(btnRefreshFW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(250, 250, 250)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(580, 580, 580)
                            .addComponent(btnViewFW)
                            .addGap(35, 35, 35)
                            .addComponent(btnDeleteFW))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(322, 322, 322)
                            .addComponent(lblFieldWorkerName)
                            .addGap(32, 32, 32)
                            .addComponent(txtFieldWorker, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(400, 400, 400)
                            .addComponent(lblDelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(31, 31, 31)
                            .addComponent(txtFieldWorkerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(400, 400, 400)
                            .addComponent(lblDelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addComponent(txtFieldWorkerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(490, 490, 490)
                            .addComponent(btnUpdateFW)
                            .addGap(13, 13, 13)
                            .addComponent(btnSubmitFW, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnFWBack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(694, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titleManageDeliveryMan)
                    .addGap(78, 78, 78)
                    .addComponent(btnRefreshFW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnViewFW)
                        .addComponent(btnDeleteFW))
                    .addGap(37, 37, 37)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblFieldWorkerName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldWorker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtFieldWorkerUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDelPassword)
                        .addComponent(txtFieldWorkerPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnUpdateFW)
                        .addComponent(btnSubmitFW))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
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
