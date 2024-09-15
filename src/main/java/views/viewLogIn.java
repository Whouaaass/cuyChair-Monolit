/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import drivers.userStoreService;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

/**
 *
 * @author julia
 */
public class viewLogIn extends javax.swing.JFrame {
    private userStoreService objUserStoreService;
    /**
     * Creates new form viewLogIn
     */
    public viewLogIn() {
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

        jPanelUp = new javax.swing.JPanel();
        jLabelRegistroUsuario = new javax.swing.JLabel();
        jPanelDown = new javax.swing.JPanel();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelContrasena = new javax.swing.JLabel();
        jTextFieldMail = new javax.swing.JTextField();
        jButtonLogIn = new javax.swing.JButton();
        jButtonNoTengoUnaCuenta = new javax.swing.JButton();
        jPasswordFieldUserPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelUp.setBackground(new java.awt.Color(42, 71, 94));

        jLabelRegistroUsuario.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabelRegistroUsuario.setForeground(new java.awt.Color(199, 213, 224));
        jLabelRegistroUsuario.setText("INICIO DE SESIÓN");

        javax.swing.GroupLayout jPanelUpLayout = new javax.swing.GroupLayout(jPanelUp);
        jPanelUp.setLayout(jPanelUpLayout);
        jPanelUpLayout.setHorizontalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addComponent(jLabelRegistroUsuario)
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanelUpLayout.setVerticalGroup(
            jPanelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelUpLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelRegistroUsuario)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanelDown.setBackground(new java.awt.Color(27, 40, 56));

        jLabelCorreo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelCorreo.setForeground(new java.awt.Color(199, 213, 224));
        jLabelCorreo.setText("Email");

        jLabelContrasena.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelContrasena.setForeground(new java.awt.Color(199, 213, 224));
        jLabelContrasena.setText("Contraseña");

        jTextFieldMail.setText("@gmail.com");

        jButtonLogIn.setBackground(new java.awt.Color(26, 23, 33));
        jButtonLogIn.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButtonLogIn.setForeground(new java.awt.Color(199, 213, 224));
        jButtonLogIn.setText("Iniciar sesión");

        jButtonNoTengoUnaCuenta.setBackground(new java.awt.Color(26, 23, 33));
        jButtonNoTengoUnaCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNoTengoUnaCuenta.setForeground(new java.awt.Color(51, 102, 255));
        jButtonNoTengoUnaCuenta.setText("No tengo una cuenta");
        jButtonNoTengoUnaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoTengoUnaCuentaActionPerformed(evt);
            }
        });

        jPasswordFieldUserPassword.setText("jPasswordField1");

        javax.swing.GroupLayout jPanelDownLayout = new javax.swing.GroupLayout(jPanelDown);
        jPanelDown.setLayout(jPanelDownLayout);
        jPanelDownLayout.setHorizontalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDownLayout.createSequentialGroup()
                .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordFieldUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDownLayout.createSequentialGroup()
                            .addGap(176, 176, 176)
                            .addComponent(jLabelContrasena))
                        .addGroup(jPanelDownLayout.createSequentialGroup()
                            .addGap(140, 140, 140)
                            .addComponent(jButtonNoTengoUnaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelDownLayout.createSequentialGroup()
                            .addGap(149, 149, 149)
                            .addComponent(jButtonLogIn))
                        .addGroup(jPanelDownLayout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanelDownLayout.createSequentialGroup()
                                    .addComponent(jLabelCorreo)
                                    .addGap(81, 81, 81))
                                .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanelDownLayout.setVerticalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDownLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabelCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jButtonLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNoTengoUnaCuenta)
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 461, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanelDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanelUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jPanelDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Te redirecciona al registro de usuario
    private void jButtonNoTengoUnaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoTengoUnaCuentaActionPerformed
        viewSignIn objViewSingIn = new viewSignIn(objUserStoreService);
        objViewSingIn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewSingIn.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonNoTengoUnaCuentaActionPerformed

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
            java.util.logging.Logger.getLogger(viewLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonNoTengoUnaCuenta;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelRegistroUsuario;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JPasswordField jPasswordFieldUserPassword;
    private javax.swing.JTextField jTextFieldMail;
    // End of variables declaration//GEN-END:variables
}
