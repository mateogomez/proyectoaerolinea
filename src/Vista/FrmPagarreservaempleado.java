/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtCliente;
import Controlador.CtPagoreserva;
import Controlador.CtReserva;
import Modelo.ClsCliente;
import Modelo.ClsPagoreserva;
import Modelo.ClsReserva;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mateo
 */
public class FrmPagarreservaempleado extends javax.swing.JFrame {

    ArrayList<ClsReserva> listareservas = new ArrayList<ClsReserva>();
    ArrayList<ClsPagoreserva> listapagos = new ArrayList<ClsPagoreserva>();
    CtReserva controladorreserva;
    CtCliente controladorcliente;
    CtPagoreserva controladorCtPagoreserva;
    ArrayList<ClsCliente> listarcliente = new ArrayList<ClsCliente>();
    String nombre;
    String cedula;

    public FrmPagarreservaempleado() {
        initComponents();
    }

    public FrmPagarreservaempleado(String nombre) {
        initComponents();
        
        this.nombre = nombre;
        
        txtCedula.setText(cedula);
         
        controladorreserva = new CtReserva();
        controladorcliente = new CtCliente();
        controladorCtPagoreserva = new CtPagoreserva();
        try {
            listareservas = controladorreserva.cargarArchivo(listareservas);
            listarcliente = controladorcliente.cargarArchivo(listarcliente);
            listapagos = controladorCtPagoreserva.cargarArchivo(listapagos);
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        lblCedula = new javax.swing.JLabel();
        BtnBuscar = new javax.swing.JButton();
        txtCedula = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtpagos = new javax.swing.JTable();
        lblNumeroreserva = new javax.swing.JLabel();
        txtNumeroreserva = new javax.swing.JTextField();
        btnpagar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jButton1.setText("jButton1");

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCedula.setText("Cedula");

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        jtpagos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Numero reserva", "Numero vuelo", "Estado pago"
            }
        ));
        jScrollPane1.setViewportView(jtpagos);

        lblNumeroreserva.setText("Numero reserva");

        txtNumeroreserva.setEnabled(false);

        btnpagar.setText("Pagar reserva");
        btnpagar.setEnabled(false);
        btnpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        jDesktopPane2.setLayer(lblCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(BtnBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtCedula, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblNumeroreserva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(txtNumeroreserva, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(btnpagar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(BtnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane2Layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnBuscar)
                        .addGap(137, 137, 137))
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(txtNumeroreserva, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(btnpagar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                                .addComponent(BtnRegresar))
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(lblNumeroreserva)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBuscar)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblNumeroreserva)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroreserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnpagar)
                        .addComponent(BtnRegresar)))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        String cedula = txtCedula.getText();
        ClsCliente cliente = null;
        cliente = controladorcliente.buscarCliente(listarcliente, cedula);
        if (cliente == null) {
            txtCedula.setText("");
        } else {
            listar(cliente);
            btnpagar.setEnabled(true);
            txtNumeroreserva.setEnabled(true);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void btnpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarActionPerformed
        String cedula = txtCedula.getText();
        ClsCliente cliente = null;
        txtNumeroreserva.setEnabled(true);
        cliente = controladorcliente.buscarCliente(listarcliente, cedula);
        String idreserva = txtNumeroreserva.getText();
        listapagos = controladorCtPagoreserva.modificarpago(listapagos, idreserva);
        listar(cliente);
    }//GEN-LAST:event_btnpagarActionPerformed

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrmmenuEmpleado empleado= new FrmmenuEmpleado(nombre);
        empleado.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed
    public void listar(ClsCliente cliente) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo = listarElementoscedula(listareservas, cliente);
        jtpagos.setModel(modelo);
    }

    public DefaultTableModel listarElementoscedula(ArrayList<ClsReserva> listareservas, ClsCliente cliente) {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"Numero reserva", "numero vuelo", "Estado reserva"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        try {
            for (int i = 0; i < listareservas.size(); i++) {
                if (cliente.getCedula().equals(listareservas.get(i).getCedulacliente())) {
                    modelo.addRow(new Object[]{listareservas.get(i).getNumerovuelo(), listareservas.get(i).getNumerovuelo(), listareservas.get(i).getEstadoPago()});
                }

            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return modelo;
    }

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
            java.util.logging.Logger.getLogger(FrmPagarreservaempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPagarreservaempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPagarreservaempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPagarreservaempleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPagarreservaempleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton btnpagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable jtpagos;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblNumeroreserva;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNumeroreserva;
    // End of variables declaration//GEN-END:variables
}
