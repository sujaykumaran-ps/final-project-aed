/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FieldWorkerRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.MemberRole.MemberAreaJPanel;

/**
 *
 * @author sujay
 */
public class FieldWorkerHomeJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private EcoSystem system;
    private UserAccount account;
    /**
     * Creates new form FieldWorkerHomeJPanel
     */
    public FieldWorkerHomeJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
        initComponents();   
        this.account = account;
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        lblName.setText(account.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName = new javax.swing.JLabel();
        titleWelcome = new javax.swing.JLabel();
        btnSnowClearance = new javax.swing.JButton();
        btnLeafClearance = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        titleManageRestaurants = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setBackground(new java.awt.Color(255, 255, 255));
        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 290, 30));

        titleWelcome.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        titleWelcome.setText("Hello");
        add(titleWelcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, 60, 30));

        btnSnowClearance.setBackground(new java.awt.Color(133, 211, 255));
        btnSnowClearance.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSnowClearance.setText("Snow Clearance Requests");
        btnSnowClearance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnowClearanceActionPerformed(evt);
            }
        });
        add(btnSnowClearance, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 342, 40));

        btnLeafClearance.setBackground(new java.awt.Color(133, 211, 255));
        btnLeafClearance.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnLeafClearance.setText("Leaf Clearance Requests");
        btnLeafClearance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeafClearanceActionPerformed(evt);
            }
        });
        add(btnLeafClearance, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 510, 342, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leafBlowing.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 200, 420, 280));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snow.jpg"))); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 580, 280));

        titleManageRestaurants.setFont(new java.awt.Font("Segoe UI Light", 1, 24)); // NOI18N
        titleManageRestaurants.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleManageRestaurants.setText("Field Worker Home");
        add(titleManageRestaurants, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 816, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSnowClearanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnowClearanceActionPerformed
        // TODO add your handling code here:
        FieldWorkerAreaJPanel snowJPanel = new FieldWorkerAreaJPanel(userProcessContainer, account, system);
        userProcessContainer.add("SnowClearing Request", snowJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSnowClearanceActionPerformed

    private void btnLeafClearanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeafClearanceActionPerformed
        // TODO add your handling code here:
        FieldWorkerLeafAreaJPanel snowJPanel = new FieldWorkerLeafAreaJPanel(userProcessContainer, account, system);
        userProcessContainer.add("Leaf Clearing Request", snowJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLeafClearanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLeafClearance;
    private javax.swing.JButton btnSnowClearance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel titleManageRestaurants;
    private javax.swing.JLabel titleWelcome;
    // End of variables declaration//GEN-END:variables
}
