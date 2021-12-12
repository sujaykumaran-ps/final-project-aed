

package userinterface.SnowClearingOrgRole;


import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userinterface.SnowClearingOrgRole.ManageSnowClearingInfoJPanel;

/**
 *
 * @author  raunak
 */
public class AdminWorkAreaJPanel extends javax.swing.JPanel {
    
    JPanel userProcessContainer;
    EcoSystem system;
    UserAccount ua;
    
    /** Creates new form AdminWorkAreaJPanel
     * @param userProcessContainer */
    public AdminWorkAreaJPanel(JPanel userProcessContainer, UserAccount ua, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ua = ua;
        this.system = system;
      
        lblSnowOrgName.setText(ua.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleResAdmin = new javax.swing.JLabel();
        btnOrgInfo = new javax.swing.JButton();
        btnManageServices = new javax.swing.JButton();
        btnManageRequests = new javax.swing.JButton();
        lblSnowOrgNameTitle = new javax.swing.JLabel();
        lblSnowOrgName = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblImageIcon = new javax.swing.JLabel();
        lblImageIcon2 = new javax.swing.JLabel();
        lblImageIcon3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleResAdmin.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        titleResAdmin.setForeground(new java.awt.Color(0, 0, 153));
        titleResAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleResAdmin.setText("SNOW CLEARING ORG ADMIN");
        add(titleResAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        btnOrgInfo.setBackground(new java.awt.Color(133, 211, 255));
        btnOrgInfo.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        btnOrgInfo.setText("Manage SnowClearing Enterprize Info");
        btnOrgInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrgInfoActionPerformed(evt);
            }
        });
        add(btnOrgInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 480, 280, 50));

        btnManageServices.setBackground(new java.awt.Color(133, 211, 255));
        btnManageServices.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        btnManageServices.setText("Manage Services");
        btnManageServices.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageServicesActionPerformed(evt);
            }
        });
        add(btnManageServices, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 280, 50));

        btnManageRequests.setBackground(new java.awt.Color(133, 211, 255));
        btnManageRequests.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        btnManageRequests.setText("Manage Requests");
        btnManageRequests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageRequestsActionPerformed(evt);
            }
        });
        add(btnManageRequests, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 480, 280, 50));

        lblSnowOrgNameTitle.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSnowOrgNameTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSnowOrgNameTitle.setText("SNOW CLEARING ENTERPRIZE");
        add(lblSnowOrgNameTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 360, 30));

        lblSnowOrgName.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        add(lblSnowOrgName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 170, 160, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tuxpi.com.1639261320.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(1360, 780));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1420, 220));

        lblImageIcon.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        lblImageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Requests_adobespark.jpeg"))); // NOI18N
        lblImageIcon.setText("jLabel2");
        add(lblImageIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 290, 180));

        lblImageIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/manage_services_adobespark.png"))); // NOI18N
        lblImageIcon2.setText("jLabel2");
        add(lblImageIcon2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 270, 230, 190));

        lblImageIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/snowShovel.png"))); // NOI18N
        lblImageIcon3.setText("jLabel2");
        add(lblImageIcon3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, 230, 180));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/tuxpi.com.1639261320.jpg"))); // NOI18N
        jLabel3.setText("jLabel1");
        jLabel3.setPreferredSize(new java.awt.Dimension(1360, 780));
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 580, 1370, 220));
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrgInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrgInfoActionPerformed
        // TODO add your handling code here:
        ManageSnowClearingInfoJPanel manageInfo = new ManageSnowClearingInfoJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("Manage Snow Clearning Organization Info",manageInfo);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnOrgInfoActionPerformed

    private void btnManageServicesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageServicesActionPerformed
        ManageServiceJPanel manageServices = new ManageServiceJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("Manage Services",manageServices);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageServicesActionPerformed

    private void btnManageRequestsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageRequestsActionPerformed
        ManageRequestsJPanel manageRequest = new ManageRequestsJPanel(userProcessContainer, ua, system);
        userProcessContainer.add("Manage Requests", manageRequest);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageRequestsActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnManageRequests;
    private javax.swing.JButton btnManageServices;
    private javax.swing.JButton btnOrgInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblImageIcon;
    private javax.swing.JLabel lblImageIcon2;
    private javax.swing.JLabel lblImageIcon3;
    private javax.swing.JLabel lblSnowOrgName;
    private javax.swing.JLabel lblSnowOrgNameTitle;
    private javax.swing.JLabel titleResAdmin;
    // End of variables declaration//GEN-END:variables
    
}
