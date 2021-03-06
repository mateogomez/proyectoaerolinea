/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtEmpleado;
import Modelo.ClsEmpleado;
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class FrmAdministrador extends javax.swing.JFrame {

    ArrayList<ClsEmpleado> listaEmpleado = new ArrayList<ClsEmpleado>();
    CtEmpleado controladorEmpleado;
    String nombre;

    public FrmAdministrador() {
        initComponents();
    }

    public FrmAdministrador(String nombre) {
        initComponents();
        this.nombre = nombre;
        lblNombre.setText(nombre);
        controladorEmpleado = new CtEmpleado();
        try {
            listaEmpleado = controladorEmpleado.cargarArchivo(listaEmpleado);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnRegresar = new javax.swing.JButton();
        lblBienvenido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JmtAerolinea = new javax.swing.JMenu();
        JmtEmpleado = new javax.swing.JMenuItem();
        JmtCliente = new javax.swing.JMenuItem();
        JmtPromocion = new javax.swing.JMenuItem();
        JmtRutas = new javax.swing.JMenuItem();
        JmtAviones = new javax.swing.JMenuItem();
        JmtInventario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        JmVuelo = new javax.swing.JMenu();
        JmtVuelo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        lblBienvenido.setText("Bienvenido:");

        lblNombre.setText("Nombre");

        JmtAerolinea.setText("Aerolinea");
        JmtAerolinea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtAerolineaActionPerformed(evt);
            }
        });

        JmtEmpleado.setText("Empleados");
        JmtEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtEmpleadoActionPerformed(evt);
            }
        });
        JmtAerolinea.add(JmtEmpleado);

        JmtCliente.setText("Clientes");
        JmtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtClienteActionPerformed(evt);
            }
        });
        JmtAerolinea.add(JmtCliente);

        JmtPromocion.setText("Promociones");
        JmtPromocion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtPromocionActionPerformed(evt);
            }
        });
        JmtAerolinea.add(JmtPromocion);

        JmtRutas.setText("Rutas");
        JmtRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtRutasActionPerformed(evt);
            }
        });
        JmtAerolinea.add(JmtRutas);

        JmtAviones.setText("Aviones");
        JmtAviones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtAvionesActionPerformed(evt);
            }
        });
        JmtAerolinea.add(JmtAviones);

        JmtInventario.setText("Inventario");
        JmtInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtInventarioActionPerformed(evt);
            }
        });
        JmtAerolinea.add(JmtInventario);

        jMenuBar1.add(JmtAerolinea);

        jMenu2.setText("Reservas");

        jMenuItem7.setText("jMenuItem7");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        JmVuelo.setText("Vuelos");
        JmVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmVueloActionPerformed(evt);
            }
        });

        JmtVuelo.setText("Abrir");
        JmtVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtVueloActionPerformed(evt);
            }
        });
        JmVuelo.add(JmtVuelo);

        jMenuBar1.add(JmVuelo);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 321, Short.MAX_VALUE)
                .addComponent(BtnRegresar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBienvenido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNombre)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBienvenido)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(BtnRegresar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JmtEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtEmpleadoActionPerformed
        FrmEmpleado empleado = new FrmEmpleado(nombre);
        empleado.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtEmpleadoActionPerformed

    private void JmtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtClienteActionPerformed
        FrmCliente cliente = new FrmCliente(nombre);
        cliente.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtClienteActionPerformed

    private void JmtPromocionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtPromocionActionPerformed
        FrmPromocion promocion = new FrmPromocion(nombre);
        promocion.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtPromocionActionPerformed

    private void JmtRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtRutasActionPerformed
        FrmRuta ruta = new FrmRuta(nombre);
        ruta.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtRutasActionPerformed

    private void JmtAvionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtAvionesActionPerformed
        FrmAvion avion = new FrmAvion(nombre);
        avion.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtAvionesActionPerformed

    private void JmtInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtInventarioActionPerformed
        FrmInventario inventario = new FrmInventario(nombre);
        inventario.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtInventarioActionPerformed

    private void JmtAerolineaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtAerolineaActionPerformed

    }//GEN-LAST:event_JmtAerolineaActionPerformed

    private void JmtVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtVueloActionPerformed
        FrmVuelos vuelo = new FrmVuelos(nombre);
        vuelo.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtVueloActionPerformed

    private void JmVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmVueloActionPerformed

    }//GEN-LAST:event_JmVueloActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JMenu JmVuelo;
    private javax.swing.JMenu JmtAerolinea;
    private javax.swing.JMenuItem JmtAviones;
    private javax.swing.JMenuItem JmtCliente;
    private javax.swing.JMenuItem JmtEmpleado;
    private javax.swing.JMenuItem JmtInventario;
    private javax.swing.JMenuItem JmtPromocion;
    private javax.swing.JMenuItem JmtRutas;
    private javax.swing.JMenuItem JmtVuelo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblNombre;
    // End of variables declaration//GEN-END:variables
}
