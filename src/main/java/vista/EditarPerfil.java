/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import controlador.facade.UsuarioFacade;
import controlador.proxy.ProxyUsuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Joel
 */
public class EditarPerfil extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public EditarPerfil() {
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
        panelDorado = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        contraseña = new javax.swing.JLabel();
        Inombre = new javax.swing.JTextField();
        Icorreo = new javax.swing.JTextField();
        Itelefono = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        Inpass = new javax.swing.JPasswordField();
        actulizarBtn = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDorado.setBackground(new java.awt.Color(102, 0, 0));

        nombre.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        nombre.setText("NOMBRE");

        apellido.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        apellido.setText("NUEVO NÚMERO DE TELEFONO");

        correo.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        correo.setText("CORREO ACTUAL");

        contraseña.setFont(new java.awt.Font("Roboto Black", 3, 15)); // NOI18N
        contraseña.setText("NUEVA CONTRASEÑA");

        Inombre.setBackground(new java.awt.Color(102, 0, 0));
        Inombre.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Inombre.setForeground(new java.awt.Color(153, 153, 153));
        Inombre.setText("Ingrese su nombre completo");
        Inombre.setBorder(null);
        Inombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                InombreMousePressed(evt);
            }
        });
        Inombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InombreActionPerformed(evt);
            }
        });

        Icorreo.setBackground(new java.awt.Color(102, 0, 0));
        Icorreo.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Icorreo.setForeground(new java.awt.Color(153, 153, 153));
        Icorreo.setText("Ingrese su correo");
        Icorreo.setBorder(null);
        Icorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IcorreoActionPerformed(evt);
            }
        });

        Itelefono.setBackground(new java.awt.Color(102, 0, 0));
        Itelefono.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Itelefono.setForeground(new java.awt.Color(153, 153, 153));
        Itelefono.setText("Ingrese su numero de telefono");
        Itelefono.setBorder(null);
        Itelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItelefonoActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        Inpass.setBackground(new java.awt.Color(102, 0, 0));
        Inpass.setFont(new java.awt.Font("Roboto Light", 2, 16)); // NOI18N
        Inpass.setForeground(new java.awt.Color(153, 153, 153));
        Inpass.setText("****************");
        Inpass.setBorder(null);
        Inpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InpassActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelDoradoLayout = new javax.swing.GroupLayout(panelDorado);
        panelDorado.setLayout(panelDoradoLayout);
        panelDoradoLayout.setHorizontalGroup(
            panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoradoLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Inpass, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseña)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre)
                    .addComponent(Inombre, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellido)
                    .addComponent(Itelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Icorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correo))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        panelDoradoLayout.setVerticalGroup(
            panelDoradoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoradoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Icorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inpass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Itelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        bg.add(panelDorado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 560));

        actulizarBtn.setBackground(new java.awt.Color(0, 0, 0));
        actulizarBtn.setFont(new java.awt.Font("Roboto Medium", 1, 28)); // NOI18N
        actulizarBtn.setForeground(new java.awt.Color(255, 255, 255));
        actulizarBtn.setText("Actualizar");
        actulizarBtn.setBorder(null);
        actulizarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actulizarBtnMouseClicked(evt);
            }
        });
        actulizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actulizarBtnActionPerformed(evt);
            }
        });
        bg.add(actulizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 240, 176, 70));

        back.setBackground(new java.awt.Color(102, 0, 0));
        back.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(255, 198, 0));
        back.setText("Regresar");
        back.setBorder(null);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        bg.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, 130, 41));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IcorreoActionPerformed

    private void InombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InombreMousePressed
     
        // TODO add your handling code here:
    }//GEN-LAST:event_InombreMousePressed

    private void actulizarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actulizarBtnMouseClicked
        ProxyUsuario proxy = new ProxyUsuario();
        String nombre = Inombre.getText();
        String telefono = Itelefono.getText();
        String correo = Icorreo.getText();
        char[] passwordChars = Inpass.getPassword();
        String contrasenia = new String(passwordChars);
        proxy.registrar(nombre, correo, telefono, contrasenia);
    }//GEN-LAST:event_actulizarBtnMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

    }//GEN-LAST:event_backMouseClicked

    private void InombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InombreActionPerformed

    private void actulizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actulizarBtnActionPerformed
        JOptionPane.showMessageDialog(null, "Le hemos enviado un correo a su gmail, por favor verifique nuestro mensaje");
        UsuarioFacade usuario = new UsuarioFacade();
        String nombre = Inombre.getText();
        String telefono = Itelefono.getText();
        String correo = Icorreo.getText();
        char[] passwordChars = Inpass.getPassword();
        String contrasenia = new String(passwordChars);
        usuario.actuzalizarUsuario(nombre, correo, telefono, contrasenia);
        
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_actulizarBtnActionPerformed

    private void InpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_InpassActionPerformed

    private void ItelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ItelefonoActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Icorreo;
    private javax.swing.JTextField Inombre;
    private javax.swing.JPasswordField Inpass;
    private javax.swing.JTextField Itelefono;
    private javax.swing.JButton actulizarBtn;
    private javax.swing.JLabel apellido;
    private javax.swing.JButton back;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel contraseña;
    private javax.swing.JLabel correo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panelDorado;
    // End of variables declaration//GEN-END:variables
}