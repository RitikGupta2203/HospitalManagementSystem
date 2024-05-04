/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Lab.Staff;

import Model.MainAdmin;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ritik
 */
public class StaffLandingJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StaffLandingJPanel
     */
    private JPanel MainWorkArea;
    MainAdmin admin;
    private String username;
    public StaffLandingJPanel(JPanel MainWorkArea,MainAdmin admin,String username) {
        initComponents();
         this.MainWorkArea = MainWorkArea;
       this.admin=admin;
       this.username = username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnNewTestRequest = new javax.swing.JButton();
        btnARTestRequest = new javax.swing.JButton();
        btnCompletedTestRequest = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));
        setPreferredSize(new java.awt.Dimension(700, 7));

        btnNewTestRequest.setText("NEW TEST REQUEST");
        btnNewTestRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewTestRequestActionPerformed(evt);
            }
        });

        btnARTestRequest.setText("AWAITING RESULT TEST REQUEST");
        btnARTestRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnARTestRequestActionPerformed(evt);
            }
        });

        btnCompletedTestRequest.setText("COMPLETED TEST");
        btnCompletedTestRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletedTestRequestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnNewTestRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnARTestRequest))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(btnCompletedTestRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnARTestRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNewTestRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCompletedTestRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewTestRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewTestRequestActionPerformed
        
          ManageNewTestRequestJPanel panel =  new ManageNewTestRequestJPanel(MainWorkArea, admin,username);
        MainWorkArea.add("ManageLabRequestJPanel",panel);
        CardLayout layout = (CardLayout) MainWorkArea.getLayout();
        layout.next(MainWorkArea);
    }//GEN-LAST:event_btnNewTestRequestActionPerformed

    private void btnCompletedTestRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompletedTestRequestActionPerformed
        // TODO add your handling code here:
        ManageCompletedTestRequestJPanel panel =  new ManageCompletedTestRequestJPanel(MainWorkArea, admin,username);
        MainWorkArea.add("ManageCompletedTestRequestJPanel",panel);
        CardLayout layout = (CardLayout) MainWorkArea.getLayout();
        layout.next(MainWorkArea);
    }//GEN-LAST:event_btnCompletedTestRequestActionPerformed

    private void btnARTestRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnARTestRequestActionPerformed
        // TODO add your handling code here:
        ManagerInProgressTestRequestJPanel panel =  new ManagerInProgressTestRequestJPanel(MainWorkArea, admin,username);
        MainWorkArea.add("ManagerInProgressTestRequestJPanel",panel);
        CardLayout layout = (CardLayout) MainWorkArea.getLayout();
        layout.next(MainWorkArea);
    }//GEN-LAST:event_btnARTestRequestActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnARTestRequest;
    private javax.swing.JButton btnCompletedTestRequest;
    private javax.swing.JButton btnNewTestRequest;
    // End of variables declaration//GEN-END:variables
}