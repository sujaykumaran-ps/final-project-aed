

package userinterface.LeafClearingOrgRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.LeafClearingOrgRole.ManageLeafClearingInfoJPanel;

/**
 *
 * @author  raunak
 */
public class LeafAdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount ua;
    
    /** Creates new form AdminWorkAreaJPanel
     * @param userProcessContainer */
    public LeafAdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        this.system = system;
      
        lblResName.setText(ua.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleLeafClearingAdmin = new javax.swing.JLabel();
        btnOrgInfo = new javax.swing.JButton();
        btnManageRequests = new javax.swing.JButton();
        btnManageServices = new javax.swing.JButton();
        lblLeafClearingNameTitle = new javax.swing.JLabel();
        lblResName = new javax.swing.JLabel();
        lblImageIcon = new javax.swing.JLabel();
        lblImageIcon3 = new javax.swing.JLabel();
        lblImageIcon2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLeafClearingAdmin.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        titleLeafClearingAdmin.setText("LEAF CLEARING ORG ADMIN");
        add(titleLeafClearingAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        btnOrgInfo.setBackground(new java.awt.Color(255, 204, 102));
        btnOrgInfo.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnOrgInfo.setText("Manage LeafClearingOrg Info");
        btnOrgInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgInfoActionPerformed(evt);
            }
        });
        add(btnOrgInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, 220, 40));

        btnManageRequests.setBackground(new java.awt.Color(255, 204, 102));
        btnManageRequests.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnManageRequests.setText("Manage Requests");
        btnManageRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestsActionPerformed(evt);
            }
        });
        add(btnManageRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 500, 220, 40));

        btnManageServices.setBackground(new java.awt.Color(255, 204, 102));
        btnManageServices.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnManageServices.setText("Manage Services");
        btnManageServices.setPreferredSize(new java.awt.Dimension(160, 29));
        btnManageServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageServicesActionPerformed(evt);
            }
        });
        add(btnManageServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 230, 40));

        lblLeafClearingNameTitle.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lblLeafClearingNameTitle.setText("LEAF CLEARING ENTERPRIZE");
        add(lblLeafClearingNameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 280, 30));

        lblResName.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        add(lblResName, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 190, 30));

        lblImageIcon.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        lblImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Requests_adobespark.jpeg"))); // NOI18N
        lblImageIcon.setText("jLabel2");
        add(lblImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 290, 180));

        lblImageIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/leafClearing_icon_adobespark.jpeg"))); // NOI18N
        lblImageIcon3.setText("jLabel2");
        add(lblImageIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 290, 390, 180));

        lblImageIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage_services_adobespark.png"))); // NOI18N
        lblImageIcon2.setText("jLabel2");
        add(lblImageIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 280, 230, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fall_leaves.jpeg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1360, 780));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 1420, 220));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fall_leaves.jpeg"))); // NOI18N
        jLabel2.setText("jLabel1");
        jLabel2.setPreferredSize(new java.awt.Dimension(1360, 780));
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1420, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrgInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgInfoActionPerformed
        // TODO add your handling code here:
        ManageLeafClearingInfoJPanel manageInfo = new ManageLeafClearingInfoJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("Manage Leaf Clearning Organization Info",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrgInfoActionPerformed

    private void btnManageServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageServicesActionPerformed
        ManageLeafServiceJPanel manageServices = new ManageLeafServiceJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("Manage Services",manageServices);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageServicesActionPerformed

    private void btnManageRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestsActionPerformed
        ManageLeafRequestsJPanel manageRequest = new ManageLeafRequestsJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("Manage Requests", manageRequest);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRequestsActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageRequests;
    private javax.swing.JButton btnManageServices;
    private javax.swing.JButton btnOrgInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblImageIcon;
    private javax.swing.JLabel lblImageIcon2;
    private javax.swing.JLabel lblImageIcon3;
    private javax.swing.JLabel lblLeafClearingNameTitle;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel titleLeafClearingAdmin;
    // End of variables declaration//GEN-END:variables
    
}
