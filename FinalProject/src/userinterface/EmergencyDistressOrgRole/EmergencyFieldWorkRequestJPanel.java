/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EmergencyDistressOrgRole;

import Business.Ambulance.Ambulance;
import javax.swing.JOptionPane;

import Business.Member.Member;
import Business.FieldWorker.FieldWorker;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyWorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author mohitdaswani
 */
public class EmergencyFieldWorkRequestJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount account;
    EmergencyWorkRequest request;
    EcoSystem system;
    /**
     * Creates new form EmergencyFieldWorkRequestJPanel
     */
    public EmergencyFieldWorkRequestJPanel(JPanel userProcessContainer, UserAccount account, EmergencyWorkRequest request, EcoSystem system) {
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.request = request;
        this.system = system;
        initComponents();
        populateFieldWorkers();    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAssignRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FieldWorkerJTable = new javax.swing.JTable();

        btnAssignRequest.setText("Assign Request to the Selected Ambulance");
        btnAssignRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignRequestActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Assign FieldWorker");

        FieldWorkerJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Ambulance Driver Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(FieldWorkerJTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnBack)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(627, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(547, 547, 547))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnAssignRequest)
                        .addGap(494, 494, 494))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(btnBack)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnAssignRequest)
                .addContainerGap(431, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void populateFieldWorkers() {
        DefaultTableModel model = (DefaultTableModel) FieldWorkerJTable.getModel();
        model.setRowCount(0);
        
        for(FieldWorker fieldWorker:system.getFieldWorkerDirectory().getFieldWorkerList()){
               Object[] row = new Object[1];           
                row[0] = fieldWorker;
                model.addRow(row);
            }
    }
    private void btnAssignRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignRequestActionPerformed
        // TODO add your handling code here:
        int selectedRow = FieldWorkerJTable.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null,"Please select a row from the table to view details","Warning",JOptionPane.WARNING_MESSAGE);
        }
        else
        {

            Ambulance ambulance  = (Ambulance)FieldWorkerJTable.getValueAt(selectedRow, 0);
            ambulance.getEmgRequestList().add(request);
            request.setStatus("Assigned Ambulance");

            for(Member member:system.getMemberDirectory().getMemberList()){
                if(request.getMemName().equals(member.getMemUsername())){
                    for(EmergencyWorkRequest request : member.getEmgRequestList()){
                        if(request.getStatus().equals("In Progress")){
                            request.setStatus("Assigned Ambulance");
                        }
                    }
                }
            }
            userProcessContainer.remove(this);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.previous(userProcessContainer);

        }
    }//GEN-LAST:event_btnAssignRequestActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FieldWorkerJTable;
    private javax.swing.JButton btnAssignRequest;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
