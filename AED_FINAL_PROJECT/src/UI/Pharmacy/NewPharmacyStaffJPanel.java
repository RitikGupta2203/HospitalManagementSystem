/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Pharmacy;

import Model.MainAdmin;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author aniketpatole
 */
public class NewPharmacyStaffJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewPharmacyStaffJPanel
     */
    
    private JPanel MainWorkArea;
    MainAdmin admin;
    

    NewPharmacyStaffJPanel(JPanel MainWorkArea, MainAdmin admin) {
        initComponents();
        this.admin=admin;
        this.MainWorkArea= MainWorkArea;
        // Fetch data from the database and populate the table
        
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        CRole = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        CDepartment = new javax.swing.JComboBox<>();
        btnReset = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setText("Role");

        jLabel6.setText("UserName");

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD NEW PHARMACY STAFF MEMBERS");

        jLabel7.setText("Password");

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        CRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Junior Lab Assistant", "Senior Lab Assistant" }));
        CRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CRoleActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Age");

        jLabel4.setText("Department");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        CDepartment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Department A", "Department B", "Department C" }));

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtName)
                            .addComponent(txtAge)
                            .addComponent(CDepartment, 0, 80, Short.MAX_VALUE)
                            .addComponent(CRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUserName)
                            .addComponent(txtPassword)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(194, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnBack))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CDepartment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(CRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(189, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        Connection conn = null;
        PreparedStatement pst = null;

        try {
            //Check to ensure user is unique

            conn = DriverManager.getConnection(admin.getDbUrl(), admin.getDbUsername(), admin.getDbPassword());
            String sql ="INSERT INTO Pharmacy_Staff_Details (Name, Age, Department, Role, UserName, Password) VALUES (?, ?, ?,?,?,?)";
            pst = conn.prepareStatement(sql);

            String name = txtName.getText();
            int age;
            String username = null;
            String password = null;

            try{
                age = Integer.parseInt(txtAge.getText());
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(this, "Invalid Age");
                return;
            }

            try {
                // SEARCH IF ALREADY EXISTS
                username = txtUserName.getText();
                if (username.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "UserName cannot be empty");
                    return;
                }

                // Check if the username already exists in the database
                if (isUsernameExists(username)) {
                    JOptionPane.showMessageDialog(this, "UserName already exists. Choose a different UserName.");
                    return;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "UserName cannot be empty");
                return;
            }

            try{
                if(!txtPassword.getText().isEmpty()){
                    password = txtPassword.getText();
                }

            }catch(Exception e){
                JOptionPane.showMessageDialog(this, "Password cannot be empty");
                return;
            }

            String department = (String) CDepartment.getSelectedItem(); // Assuming the department is a string
            String role = (String) CRole.getSelectedItem();
            // Set parameters for the prepared statement
            pst.setString(1, name);
            pst.setInt(2, age);
            pst.setString(3, department);
            pst.setString(4, role);
            pst.setString(5, username);
            pst.setString(6, password);

            // Execute the prepared statement
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(this,"Staff Added successfully");
            } else {
                JOptionPane.showMessageDialog(this,"Server Error");
            }

            // Close the resources
            pst.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        txtName.setText("");
        txtAge.setText("");
        txtUserName.setText("");
        txtPassword.setText("");

        CDepartment.setSelectedIndex(-1);
        CRole.setSelectedIndex(-1);

    }//GEN-LAST:event_btnSaveActionPerformed

    private void CRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CRoleActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        ManagePharmacyStaffJPanel panel =  new ManagePharmacyStaffJPanel(MainWorkArea, admin);
        MainWorkArea.add("ManagePharmacyStaffJpanel",panel);
        CardLayout layout = (CardLayout) MainWorkArea.getLayout();
        layout.next(MainWorkArea);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:

        txtName.setText("");
        txtAge.setText("");
        txtUserName.setText("");
        txtPassword.setText("");

        CDepartment.setSelectedIndex(-1);
        CRole.setSelectedIndex(-1);

    }//GEN-LAST:event_btnResetActionPerformed
    private boolean isUsernameExists(String username) {
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    try {
        // Establish database connection
        conn = DriverManager.getConnection(admin.getDbUrl(), admin.getDbUsername(), admin.getDbPassword());

        // Prepare the SELECT query
        String sql = "SELECT * FROM Pharmacy_Staff_Details WHERE UserName = ?";
        pst = conn.prepareStatement(sql);

        // Set the parameter in the query
        pst.setString(1, username);

        // Execute the query
        rs = pst.executeQuery();

        // Check if the result set is not empty (username exists)
        return rs.next();
    } catch (SQLException e) {
        e.printStackTrace();
        // Handle database error (e.g., log or show an error message)
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
        return false; // Assuming an error means username doesn't exist
    } finally {
        // Close resources
        try {
            if (rs != null) rs.close();
            if (pst != null) pst.close();
            if (conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CDepartment;
    private javax.swing.JComboBox<String> CRole;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}