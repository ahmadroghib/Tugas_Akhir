/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kasir;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import penjualan.koneksi.koneksi;

/**
 *
 * @author rizkiramdani
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background21 = new Background.Background2();
        FormLogin = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        LogIn = new Background.ButtonTransparan();
        Cancel = new Background.ButtonTransparan();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FormLogin.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        FormLogin.setText("FORM LOGIN");

        Username.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Username.setText("Username");

        Password.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Password.setText("Password");

        LogIn.setText("Log In");
        LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInActionPerformed(evt);
            }
        });

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout background21Layout = new org.jdesktop.layout.GroupLayout(background21);
        background21.setLayout(background21Layout);
        background21Layout.setHorizontalGroup(
            background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(background21Layout.createSequentialGroup()
                .add(19, 19, 19)
                .add(background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(Password)
                    .add(Username))
                .add(18, 18, 18)
                .add(background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(txtUsername, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .add(txtPassword))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, background21Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .add(background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, background21Layout.createSequentialGroup()
                        .add(FormLogin)
                        .add(62, 62, 62))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, background21Layout.createSequentialGroup()
                        .add(LogIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(Cancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        background21Layout.setVerticalGroup(
            background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(background21Layout.createSequentialGroup()
                .add(9, 9, 9)
                .add(FormLogin)
                .add(18, 18, 18)
                .add(background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(Username)
                    .add(txtUsername, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(Password)
                    .add(txtPassword, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, Short.MAX_VALUE))
                .add(13, 13, 13)
                .add(background21Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(LogIn, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .add(Cancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(background21, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(background21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInActionPerformed
        // TODO add your handling code here:
        login();
    }//GEN-LAST:event_LogInActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        System.exit (0);
    }//GEN-LAST:event_CancelActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    
    private void login(){
    
        String username = txtUsername.getText();
        String password = String.valueOf(txtPassword.getPassword());
            if (username.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "username masih kosong");
            } else if (password.trim().isEmpty()){
                JOptionPane.showMessageDialog(null, "password masih kosong");
            } else {
                
                try{
                    Connection c = koneksi.getConnection();
                    String sql = "SELECT * from user where username = '"+username+"'";
                    Statement s = (Statement) c.createStatement();
                    ResultSet r = s.executeQuery(sql);
                    
                    boolean ada = r.next();
                    
                    if(!ada){
                        JOptionPane.showMessageDialog(null, "User tidak terdaftar!");
                        txtUsername.setText("");
                        txtPassword.setText("");
                    }else {
                        if (password.equalsIgnoreCase(r.getString("password"))){
                            this.dispose();
                            MenuUtama menuUtama= new MenuUtama();
                            menuUtama.setVisible(true);
                        }else {
                        JOptionPane.showMessageDialog(null, "Username atau password salah!");
                        txtUsername.setText("");
                        txtPassword.setText("");
                        }
                    }
                    }catch (SQLException e){
                            JOptionPane.showMessageDialog(null,"Terjadi Kesalahan :"+e.getMessage());   
                    }catch (Exception e){
                    JOptionPane.showMessageDialog(null,"Terjadi Kesalahan :"+e.getMessage());
                }
            }
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Background.ButtonTransparan Cancel;
    private javax.swing.JLabel FormLogin;
    private Background.ButtonTransparan LogIn;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel Username;
    private Background.Background2 background21;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}