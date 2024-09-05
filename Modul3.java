/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package belajarjava;

import javax.swing.JOptionPane;
/**
 *
 * @author Maya
 */
public class Modul3 extends javax.swing.JFrame {

    /**
     * Creates new form Modul3
     */
    public Modul3() {
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

        FieldPassword = new javax.swing.JPasswordField();
        FieldUser = new javax.swing.JFormattedTextField();
        ButtonLogin = new javax.swing.JButton();
        ButtonBatal = new javax.swing.JButton();
        LabelUser = new javax.swing.JLabel();
        LabelPassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FieldPasswordActionPerformed(evt);
            }
        });

        ButtonLogin.setText("Login");
        ButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLoginActionPerformed(evt);
            }
        });

        ButtonBatal.setText("Batal");
        ButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonBatalActionPerformed(evt);
            }
        });

        LabelUser.setText("User");

        LabelPassword.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelPassword)
                    .addComponent(LabelUser))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonLogin)
                        .addGap(41, 41, 41)
                        .addComponent(ButtonBatal))
                    .addComponent(FieldUser)
                    .addComponent(FieldPassword))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelUser)
                    .addComponent(FieldUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPassword)
                    .addComponent(FieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonLogin)
                    .addComponent(ButtonBatal))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FieldPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FieldPasswordActionPerformed

    private void ButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLoginActionPerformed
    String username = FieldUser.getText();
    String password = new String(FieldPassword.getPassword()); 

    // menampilkan username and password yang tellah dimasukan ke JOptionPane
    JOptionPane.showMessageDialog(null, "Username: " + username + "\nPassword: " + password, "Login Info", JOptionPane.INFORMATION_MESSAGE);

    
    // Mengecek apakah login berhasil
    if (username.equals("sahrul") && password.equals("sahrul123")) {
        // Tampilkan pesan sukses
        JOptionPane.showMessageDialog(this, 
            "Login berhasil!",
            "Login Information",
            JOptionPane.INFORMATION_MESSAGE);
        
        Modul2 mainForm = new Modul2();
        mainForm.setVisible(true);

        // Menutup form login
        this.dispose();
    } else {
        // Tampilkan pesan gagal
        JOptionPane.showMessageDialog(this, 
            "Maaf user dan Password Salah.",
            "Login Information",
            JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_ButtonLoginActionPerformed

    private void ButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonBatalActionPerformed
        // Mengosongkan isi dari FieldUser dan FieldPassword
    FieldUser.setText("");
    FieldPassword.setText("");
    }//GEN-LAST:event_ButtonBatalActionPerformed

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
            java.util.logging.Logger.getLogger(Modul3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modul3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modul3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modul3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modul3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonBatal;
    private javax.swing.JButton ButtonLogin;
    private javax.swing.JPasswordField FieldPassword;
    private javax.swing.JFormattedTextField FieldUser;
    private javax.swing.JLabel LabelPassword;
    private javax.swing.JLabel LabelUser;
    // End of variables declaration//GEN-END:variables
}