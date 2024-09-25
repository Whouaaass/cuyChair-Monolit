/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import dataAccess.user.RepositorySQLiteUser;
import domain.User;
import drivers.UserStoreService;

import javax.swing.JFrame;

/**
 *
 * @author julia
 */
public class ViewLogIn extends javax.swing.JFrame {

    private UserStoreService objUserStoreService;

    /**
     * Creates new form viewLogIn
     */
    public ViewLogIn(UserStoreService objUserStoreService) {
        initComponents();
        this.objUserStoreService = objUserStoreService;
        this.setLocationRelativeTo(null);
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
        jTextPasswordFieldUserPassword = new javax.swing.JPasswordField();

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
                .addGap(20, 20, 20)
                .addComponent(jLabelRegistroUsuario)
                .addGap(20, 20, 20))
        );

        getContentPane().add(jPanelUp, java.awt.BorderLayout.PAGE_START);

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
        jButtonLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogInActionPerformed(evt);
            }
        });

        jButtonNoTengoUnaCuenta.setBackground(new java.awt.Color(199, 213, 224));
        jButtonNoTengoUnaCuenta.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonNoTengoUnaCuenta.setForeground(new java.awt.Color(30, 61, 155));
        jButtonNoTengoUnaCuenta.setText("No tengo una cuenta");
        jButtonNoTengoUnaCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoTengoUnaCuentaActionPerformed(evt);
            }
        });

        jTextPasswordFieldUserPassword.setText("ContraSegura123");

        javax.swing.GroupLayout jPanelDownLayout = new javax.swing.GroupLayout(jPanelDown);
        jPanelDown.setLayout(jPanelDownLayout);
        jPanelDownLayout.setHorizontalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDownLayout.createSequentialGroup()
                .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDownLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabelCorreo))
                    .addGroup(jPanelDownLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTextPasswordFieldUserPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanelDownLayout.createSequentialGroup()
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabelContrasena)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDownLayout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jButtonNoTengoUnaCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDownLayout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jButtonLogIn)))
                .addContainerGap(142, Short.MAX_VALUE))
        );
        jPanelDownLayout.setVerticalGroup(
            jPanelDownLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDownLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabelCorreo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelContrasena)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextPasswordFieldUserPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jButtonLogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNoTengoUnaCuenta)
                .addGap(40, 40, 40))
        );

        getContentPane().add(jPanelDown, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Te redirecciona al registro de usuario
    private void jButtonNoTengoUnaCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoTengoUnaCuentaActionPerformed
        ViewSignIn objViewSingIn = new ViewSignIn(this.objUserStoreService);
        objViewSingIn.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewSingIn.setVisible(true);        
        this.setVisible(false);
    }//GEN-LAST:event_jButtonNoTengoUnaCuentaActionPerformed

    private void jButtonLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogInActionPerformed
        ViewMainMenu objViewMainMenu = new ViewMainMenu();
        String varEmail = this.jTextFieldMail.getText();
        String varPassword = new String(this.jTextPasswordFieldUserPassword.getPassword());

        User objUser = objUserStoreService.getUserByEmail(varEmail);

        if (objUser == null) {
            System.out.println("Usuario no encontrado");
            utilities.Utilities.setAlert("Error", "Usuario no encontrado");
            return;
        }
        if (!objUser.getUserPassword().equals(varPassword)) {
            System.out.println("Contraseña incorrecta");
            utilities.Utilities.setAlert("Error!!!", "Contraseña incorrecta");
            return;
        }

        objViewMainMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        objViewMainMenu.setVisible(true);
        this.setVisible(false);        
    }//GEN-LAST:event_jButtonLogInActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogIn;
    private javax.swing.JButton jButtonNoTengoUnaCuenta;
    private javax.swing.JLabel jLabelContrasena;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelRegistroUsuario;
    private javax.swing.JPanel jPanelDown;
    private javax.swing.JPanel jPanelUp;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JPasswordField jTextPasswordFieldUserPassword;
    // End of variables declaration//GEN-END:variables
}
