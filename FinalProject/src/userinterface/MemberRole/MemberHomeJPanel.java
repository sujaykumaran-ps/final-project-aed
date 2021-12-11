/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.MemberRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author nagashreeseshadri
 */
public class MemberHomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form MemberHomeJPanel
     */
    private JPanel userProcessContainer;
    EcoSystem system;
    private UserAccount account;

    
    
    public MemberHomeJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system) {
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

        titleWelcome = new javax.swing.JLabel();
        btnSnowClearing = new javax.swing.JButton();
        btnLeafClearing = new javax.swing.JButton();
        btnDonate = new javax.swing.JButton();
        btnSoupKitchen = new javax.swing.JButton();
        titleWelcome1 = new javax.swing.JLabel();
        titleWelcome2 = new javax.swing.JLabel();
        titleWelcome3 = new javax.swing.JLabel();
        titleWelcome4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(900, 900));

        titleWelcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleWelcome.setText("Welcome ");

        btnSnowClearing.setText("Snow Clearing Org");
        btnSnowClearing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSnowClearingActionPerformed(evt);
            }
        });

        btnLeafClearing.setText("Leaf Clearing Org");
        btnLeafClearing.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLeafClearingActionPerformed(evt);
            }
        });

        btnDonate.setText("Donate Funds");
        btnDonate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonateActionPerformed(evt);
            }
        });

        btnSoupKitchen.setText("Soup Kitchen");

        titleWelcome1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleWelcome1.setText("Choose what you would like to do!");

        titleWelcome2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleWelcome2.setText("Create Requests for:");

        titleWelcome3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleWelcome3.setText("Order soup:");

        titleWelcome4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titleWelcome4.setText("Pick your cause and donate funds:");

        lblName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLeafClearing)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(248, 248, 248)
                                .addComponent(btnSnowClearing))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleWelcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleWelcome3, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(titleWelcome4, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSoupKitchen, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDonate, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(titleWelcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(212, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDonate, btnLeafClearing, btnSnowClearing, btnSoupKitchen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titleWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(titleWelcome1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(titleWelcome2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSnowClearing)
                .addGap(18, 18, 18)
                .addComponent(btnLeafClearing)
                .addGap(28, 28, 28)
                .addComponent(titleWelcome4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDonate)
                .addGap(18, 18, 18)
                .addComponent(titleWelcome3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSoupKitchen)
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSnowClearingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSnowClearingActionPerformed
        // TODO add your handling code here:
        
        MemberAreaJPanel memJPanel = new MemberAreaJPanel(userProcessContainer, account, system);
        userProcessContainer.add("SnowClearing Organization Service", memJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnSnowClearingActionPerformed


    private void btnLeafClearingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLeafClearingActionPerformed
        // TODO add your handling code here:
        LeafOrgAreaJPanel leafmemJPanel = new LeafOrgAreaJPanel(userProcessContainer, account, system);
        userProcessContainer.add("LeafClearing Organization Service", leafmemJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnLeafClearingActionPerformed
    private void btnDonateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonateActionPerformed
        FundDonationJPanel fundJPanel = new FundDonationJPanel(userProcessContainer, account, system);
        userProcessContainer.add("Fund Raising Organization", fundJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDonateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonate;
    private javax.swing.JButton btnLeafClearing;
    private javax.swing.JButton btnSnowClearing;
    private javax.swing.JButton btnSoupKitchen;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel titleWelcome;
    private javax.swing.JLabel titleWelcome1;
    private javax.swing.JLabel titleWelcome2;
    private javax.swing.JLabel titleWelcome3;
    private javax.swing.JLabel titleWelcome4;
    // End of variables declaration//GEN-END:variables
}
