/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import DP.Administrador;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alienware
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        jPanel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        isAdministrador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        isClaveAdministrador = new javax.swing.JPasswordField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuIngresoAlSistema = new javax.swing.JMenuItem();
        menuAdministradores = new javax.swing.JMenuItem();
        menuSalirDelSistema = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuGestionarUsuarios = new javax.swing.JMenuItem();
        menuGestionarPacientes = new javax.swing.JMenuItem();
        menuGestionarHistoriasClínicas = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Clínica Odontológica Morales");
        setBackground(new java.awt.Color(204, 204, 204));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jButton1.setText("Ingreso");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new java.awt.GridLayout(2, 2));

        jLabel1.setText("Administrador: ");
        jPanel2.add(jLabel1);

        isAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isAdministradorActionPerformed(evt);
            }
        });
        jPanel2.add(isAdministrador);

        jLabel2.setText("Clave: ");
        jPanel2.add(jLabel2);
        jPanel2.add(isClaveAdministrador);

        jPanel3.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 571, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(88, 88, 88)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(101, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 365, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addGap(141, 141, 141)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE)))
        );

        jMenu1.setText("Sistema");

        menuIngresoAlSistema.setText("Ingreso al sistema");
        menuIngresoAlSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuIngresoAlSistemaActionPerformed(evt);
            }
        });
        jMenu1.add(menuIngresoAlSistema);

        menuAdministradores.setText("Administradores");
        menuAdministradores.setEnabled(false);
        menuAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAdministradoresActionPerformed(evt);
            }
        });
        jMenu1.add(menuAdministradores);

        menuSalirDelSistema.setText("Salir del sistema");
        menuSalirDelSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirDelSistemaActionPerformed(evt);
            }
        });
        jMenu1.add(menuSalirDelSistema);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Gestión");

        menuGestionarUsuarios.setText("Gestionar usuarios");
        menuGestionarUsuarios.setEnabled(false);
        menuGestionarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionarUsuariosActionPerformed(evt);
            }
        });
        jMenu2.add(menuGestionarUsuarios);

        menuGestionarPacientes.setText("Gestionar pacientes");
        menuGestionarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionarPacientesActionPerformed(evt);
            }
        });
        jMenu2.add(menuGestionarPacientes);

        menuGestionarHistoriasClínicas.setText("Gestionar historias clínicas");
        menuGestionarHistoriasClínicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGestionarHistoriasClínicasActionPerformed(evt);
            }
        });
        jMenu2.add(menuGestionarHistoriasClínicas);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Ayuda");

        jMenuItem6.setText("Acerca de");
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGestionarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionarUsuariosActionPerformed
       VentanaUsuario ventanaUsuario = new VentanaUsuario();
       ventanaUsuario.setVisible(true);
    }//GEN-LAST:event_menuGestionarUsuariosActionPerformed

    private void menuGestionarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionarPacientesActionPerformed
       VentanaPaciente ventanaPaciente = new VentanaPaciente();
       ventanaPaciente.setVisible(true);
    }//GEN-LAST:event_menuGestionarPacientesActionPerformed

    private void menuGestionarHistoriasClínicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGestionarHistoriasClínicasActionPerformed
       VentanaHistoriaClinica ventanaHistoriaClinica = new VentanaHistoriaClinica();
       ventanaHistoriaClinica.setVisible(true);
    }//GEN-LAST:event_menuGestionarHistoriasClínicasActionPerformed

    private void menuSalirDelSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirDelSistemaActionPerformed
        System.exit(-1);
    }//GEN-LAST:event_menuSalirDelSistemaActionPerformed

    private void menuAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAdministradoresActionPerformed
       VentanaAdministradores ventanaAdministradores = new VentanaAdministradores();
       ventanaAdministradores.setVisible(true);
    }//GEN-LAST:event_menuAdministradoresActionPerformed

    private void menuIngresoAlSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuIngresoAlSistemaActionPerformed
      jPanel3.setVisible(true);
    }//GEN-LAST:event_menuIngresoAlSistemaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Administrador administrador = new Administrador(isAdministrador.getText(),isClaveAdministrador.getText());
            if(administrador.verificarAdministrador())
            {
                menuAdministradores.setEnabled(true);
                menuGestionarUsuarios.setEnabled(true);
                jPanel3.setVisible(false);
            }
            else
            {
                VentanaError error = new VentanaError();
                error.setVisible(true);
            }
        } catch (ClassNotFoundException ex){
            throw new ClassCastException(ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void isAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_isAdministradorActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField isAdministrador;
    private javax.swing.JPasswordField isClaveAdministrador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JMenuItem menuAdministradores;
    private javax.swing.JMenuItem menuGestionarHistoriasClínicas;
    private javax.swing.JMenuItem menuGestionarPacientes;
    private javax.swing.JMenuItem menuGestionarUsuarios;
    private javax.swing.JMenuItem menuIngresoAlSistema;
    private javax.swing.JMenuItem menuSalirDelSistema;
    // End of variables declaration//GEN-END:variables
}
