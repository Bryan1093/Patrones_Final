/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import controlador.proxy.ProxyUsuario;
import javax.swing.JOptionPane;

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

        bg = new javax.swing.JPanel();
        PanelAzul = new javax.swing.JPanel();
        TextPass = new javax.swing.JLabel();
        TextUser = new javax.swing.JLabel();
        Iuser = new javax.swing.JTextField();
        Ipass = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Entrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Entrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelAzul.setBackground(new java.awt.Color(190, 165, 133));

        TextPass.setFont(new java.awt.Font("Roboto Black", 2, 15)); // NOI18N
        TextPass.setText("CONTRASEÑA:");

        TextUser.setFont(new java.awt.Font("Roboto Black", 2, 15)); // NOI18N
        TextUser.setText("USUARIO:");

        Iuser.setBackground(new java.awt.Color(190, 165, 133));
        Iuser.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Iuser.setForeground(new java.awt.Color(0, 0, 0));
        Iuser.setText("Ingrese su usuario");
        Iuser.setBorder(null);
        Iuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IuserMousePressed(evt);
            }
        });
        Iuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IuserActionPerformed(evt);
            }
        });

        Ipass.setBackground(new java.awt.Color(190, 165, 133));
        Ipass.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Ipass.setForeground(new java.awt.Color(0, 0, 0));
        Ipass.setText("Ingrese su contraseña");
        Ipass.setBorder(null);
        Ipass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IpassMousePressed(evt);
            }
        });
        Ipass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IpassActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        Entrar.setBackground(new java.awt.Color(51, 0, 0));
        Entrar.setFont(new java.awt.Font("Roboto Medium", 3, 28)); // NOI18N
        Entrar.setForeground(new java.awt.Color(255, 255, 255));
        Entrar.setText("Entrar");
        Entrar.setBorder(null);
        Entrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EntrarMouseClicked(evt);
            }
        });
        Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntrarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(102, 0, 0));
        btnSalir.setFont(new java.awt.Font("Roboto Medium", 3, 28)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(102, 0, 0));
        btnSalir.setIcon(new javax.swing.ImageIcon("C:\\Users\\bryan\\OneDrive\\Escritorio\\Salones_Grupal\\Salones_Grupal_Final\\src\\main\\java\\vista\\recursos\\imagenesLogin\\back.png")); // NOI18N
        btnSalir.setActionCommand("Registrarse");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0), new java.awt.Color(102, 0, 0)));
        btnSalir.setBorderPainted(false);
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\bryan\\OneDrive\\Escritorio\\Salones_Grupal\\Salones_Grupal_Final\\src\\main\\java\\vista\\recursos\\imagenesLogin\\angelesNegro1.png")); // NOI18N

        Entrar1.setBackground(new java.awt.Color(51, 0, 0));
        Entrar1.setFont(new java.awt.Font("Roboto Medium", 3, 28)); // NOI18N
        Entrar1.setForeground(new java.awt.Color(255, 255, 255));
        Entrar1.setText("Registrate Gratis");
        Entrar1.setActionCommand("botonRegistrar");
        Entrar1.setBorder(null);
        Entrar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Entrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Entrar1MouseClicked(evt);
            }
        });
        Entrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Entrar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelAzulLayout = new javax.swing.GroupLayout(PanelAzul);
        PanelAzul.setLayout(PanelAzulLayout);
        PanelAzulLayout.setHorizontalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAzulLayout.createSequentialGroup()
                .addGroup(PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAzulLayout.createSequentialGroup()
                        .addGroup(PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelAzulLayout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelAzulLayout.createSequentialGroup()
                                        .addGroup(PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAzulLayout.createSequentialGroup()
                                                .addComponent(TextPass)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(Ipass, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(PanelAzulLayout.createSequentialGroup()
                                                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Iuser, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(PanelAzulLayout.createSequentialGroup()
                                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(32, 32, 32))))
                                        .addGap(18, 18, 18))))
                            .addGroup(PanelAzulLayout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelAzulLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(Entrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAzulLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        PanelAzulLayout.setVerticalGroup(
            PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAzulLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Iuser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(PanelAzulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ipass, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Entrar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Entrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bg.add(PanelAzul, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IuserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IuserMousePressed
    if (Iuser.getText().equals("Ingrese su nombre de usuario")) {
        Iuser.setText("");
        Iuser.setForeground(Color.BLACK);
    }

    Ipass.setText("**************");
    Ipass.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_IuserMousePressed

    private void IpassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IpassMousePressed
    if (new String(Ipass.getPassword()).equals("Ingrese su contraseña")) {
        Iuser.setText("Ingrese su nombre de usuario");
        Iuser.setForeground(new Color(153,153,153));
        Ipass.setText("");
        Ipass.setForeground(Color.BLACK);
    }
    }//GEN-LAST:event_IpassMousePressed

    private void EntrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EntrarMouseClicked
        ProxyUsuario proxy = new ProxyUsuario();
String usuario = Iuser.getText();
char[] contraseniaChars = Ipass.getPassword();
String contrasenia = new String(contraseniaChars);

boolean inicioSesionExitoso = proxy.iniciarSesion(usuario, contrasenia);

if (inicioSesionExitoso) {
    Principal main = new Principal();
    main.setVisible(true);
    this.setVisible(false);
} else {
    JOptionPane.showMessageDialog(this, "Inicio de sesión incorrecto. Por favor, verifique sus credenciales.", "Error de inicio de sesión", JOptionPane.ERROR_MESSAGE);
}
    }//GEN-LAST:event_EntrarMouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
    
    }//GEN-LAST:event_btnSalirMouseClicked

    private void IuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IuserActionPerformed

    private void IpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IpassActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void Entrar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Entrar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Entrar1MouseClicked

    private void Entrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Entrar1ActionPerformed
    Register registro = new Register();
    registro.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_Entrar1ActionPerformed

    private void EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EntrarActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Entrar;
    private javax.swing.JButton Entrar1;
    private javax.swing.JPasswordField Ipass;
    private javax.swing.JTextField Iuser;
    private javax.swing.JPanel PanelAzul;
    private javax.swing.JLabel TextPass;
    private javax.swing.JLabel TextUser;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
