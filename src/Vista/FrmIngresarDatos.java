/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtCliente;
import Modelo.ClsCliente;
import Modelo.ClsSillas;
import Modelo.ClsVuelo;
import java.util.ArrayList;

/**
 *
 * @author Javier Parra
 */
public class FrmIngresarDatos extends javax.swing.JFrame {

    ArrayList<String> silla = new ArrayList<String>();
    ArrayList<ClsVuelo> listaVuelos = new ArrayList<ClsVuelo>();
    ArrayList<ClsCliente> listacliente = new ArrayList<ClsCliente>();
    String nombreCliente;
    String cedulaCliente;
    int pasajeros;
    String nombrepromocion;
    ClsVuelo vuelos;
    CtCliente controladorcliente;

    public FrmIngresarDatos() {

    }

    public FrmIngresarDatos(ArrayList<ClsVuelo> listavuelo, ArrayList<String> silla, ClsVuelo vuelo, String nombreCliente, String cedulaCliente, String nombrepromocion) {
        this.silla = silla;
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
        this.nombrepromocion = nombrepromocion;
        this.listaVuelos = listavuelo;
        this.vuelos = vuelo;
        if (silla.size() == 1) {
            initComponents();
            jPanelPasajero1.setEnabled(true);
            txtNombres.setEnabled(true);
            txtApellidos.setEnabled(true);
            txtNumeroDocumento.setEnabled(true);
            CbxGenero.setEnabled(true);
            controladorcliente = new CtCliente();
            try {
                listacliente = controladorcliente.cargarArchivo(listacliente);
                clientefijo();
            } catch (Exception e) {
                System.out.println(e.toString());
            }

        }
        if (silla.size() == 2) {
            initComponents();
            jPanelPasajero1.setEnabled(true);
            txtNombres.setEnabled(true);
            txtApellidos.setEnabled(true);
            txtNumeroDocumento.setEnabled(true);
            CbxGenero.setEnabled(true);
            jPanelPasajero2.setEnabled(true);
            txtNombres2.setEnabled(true);
            txtApellidos2.setEnabled(true);
            txtNumeroDocumento2.setEnabled(true);
            JrbtnMasculino2.setEnabled(true);
            JrbtnFemenino2.setEnabled(true);
        }
        if (silla.size() == 3) {
            initComponents();
            jPanelPasajero1.setEnabled(true);
            txtNombres.setEnabled(true);
            txtApellidos.setEnabled(true);
            txtNumeroDocumento.setEnabled(true);
            CbxGenero.setEnabled(true);
            jPanelPasajero2.setEnabled(true);
            txtNombres2.setEnabled(true);
            txtApellidos2.setEnabled(true);
            txtNumeroDocumento2.setEnabled(true);
            JrbtnMasculino2.setEnabled(true);
            JrbtnFemenino2.setEnabled(true);
            jPanelPasajero3.setEnabled(true);
            txtNombres3.setEnabled(true);
            txtApellidos3.setEnabled(true);
            txtNumeroDocumento3.setEnabled(true);
            JrbtnMasculino3.setEnabled(true);
            JrbtnFemenino3.setEnabled(true);
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

        buttonGroupGenero = new javax.swing.ButtonGroup();
        buttonGroupGenero2 = new javax.swing.ButtonGroup();
        buttonGroupGenero3 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanelPasajero1 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblGeneros = new javax.swing.JLabel();
        lblApellidos = new javax.swing.JLabel();
        lblNumeroDocumento = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtNumeroDocumento = new javax.swing.JTextField();
        CbxGenero = new javax.swing.JComboBox<>();
        jPanelPasajero2 = new javax.swing.JPanel();
        lblNombre2 = new javax.swing.JLabel();
        lblApellidos2 = new javax.swing.JLabel();
        lblGenero2 = new javax.swing.JLabel();
        lblNumeroDocumento1 = new javax.swing.JLabel();
        txtNombres2 = new javax.swing.JTextField();
        txtApellidos2 = new javax.swing.JTextField();
        txtNumeroDocumento2 = new javax.swing.JTextField();
        JrbtnMasculino2 = new javax.swing.JRadioButton();
        JrbtnFemenino2 = new javax.swing.JRadioButton();
        jPanelPasajero3 = new javax.swing.JPanel();
        lblNombre3 = new javax.swing.JLabel();
        lblApellidos3 = new javax.swing.JLabel();
        lblNumeroDocumento2 = new javax.swing.JLabel();
        lblGenero3 = new javax.swing.JLabel();
        txtNombres3 = new javax.swing.JTextField();
        txtApellidos3 = new javax.swing.JTextField();
        txtNumeroDocumento3 = new javax.swing.JTextField();
        JrbtnMasculino3 = new javax.swing.JRadioButton();
        JrbtnFemenino3 = new javax.swing.JRadioButton();
        btnRegresar = new javax.swing.JButton();
        BtnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelPasajero1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPasajero1.setEnabled(false);

        lblNombre.setText("Nombres:");

        lblGeneros.setText("Genero");

        lblApellidos.setText("Apellidos");

        lblNumeroDocumento.setText("Numero Documento:");

        txtNombres.setEnabled(false);

        txtApellidos.setEnabled(false);

        txtNumeroDocumento.setEnabled(false);

        CbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino" }));
        CbxGenero.setEnabled(false);

        javax.swing.GroupLayout jPanelPasajero1Layout = new javax.swing.GroupLayout(jPanelPasajero1);
        jPanelPasajero1.setLayout(jPanelPasajero1Layout);
        jPanelPasajero1Layout.setHorizontalGroup(
            jPanelPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajero1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanelPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblGeneros)
                    .addComponent(lblNombre)
                    .addComponent(txtNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(CbxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(137, 137, 137)
                .addGroup(jPanelPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanelPasajero1Layout.createSequentialGroup()
                            .addGroup(jPanelPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblApellidos)
                                .addComponent(lblNumeroDocumento))
                            .addGap(66, 66, 66))
                        .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanelPasajero1Layout.setVerticalGroup(
            jPanelPasajero1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajero1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lblNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblGeneros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPasajero1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(lblApellidos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(lblNumeroDocumento)
                .addGap(18, 18, 18)
                .addComponent(txtNumeroDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanelPasajero2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPasajero2.setEnabled(false);

        lblNombre2.setText("Nombres:");

        lblApellidos2.setText("Apellidos");

        lblGenero2.setText("Genero");

        lblNumeroDocumento1.setText("Numero Documento:");

        txtNombres2.setEnabled(false);

        txtApellidos2.setEnabled(false);

        txtNumeroDocumento2.setEnabled(false);

        buttonGroupGenero2.add(JrbtnMasculino2);
        JrbtnMasculino2.setText("Masculino");
        JrbtnMasculino2.setEnabled(false);

        buttonGroupGenero2.add(JrbtnFemenino2);
        JrbtnFemenino2.setText("Femenino");
        JrbtnFemenino2.setEnabled(false);

        javax.swing.GroupLayout jPanelPasajero2Layout = new javax.swing.GroupLayout(jPanelPasajero2);
        jPanelPasajero2.setLayout(jPanelPasajero2Layout);
        jPanelPasajero2Layout.setHorizontalGroup(
            jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajero2Layout.createSequentialGroup()
                .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPasajero2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre2)
                            .addComponent(lblGenero2)
                            .addComponent(txtNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPasajero2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JrbtnMasculino2)
                        .addGap(18, 18, 18)
                        .addComponent(JrbtnFemenino2)))
                .addGap(126, 126, 126)
                .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtApellidos2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addComponent(lblNumeroDocumento1)
                    .addComponent(lblApellidos2)
                    .addComponent(txtNumeroDocumento2, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE))
                .addGap(211, 211, 211))
        );
        jPanelPasajero2Layout.setVerticalGroup(
            jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajero2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre2)
                    .addComponent(lblApellidos2))
                .addGap(11, 11, 11)
                .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGenero2)
                    .addComponent(lblNumeroDocumento1))
                .addGap(18, 18, 18)
                .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNumeroDocumento2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelPasajero2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JrbtnMasculino2)
                        .addComponent(JrbtnFemenino2)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanelPasajero3.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPasajero3.setEnabled(false);

        lblNombre3.setText("Nombres:");

        lblApellidos3.setText("Apellidos");

        lblNumeroDocumento2.setText("Numero Documento:");

        lblGenero3.setText("Genero");

        txtNombres3.setEnabled(false);

        txtApellidos3.setEnabled(false);

        txtNumeroDocumento3.setEnabled(false);

        buttonGroupGenero3.add(JrbtnMasculino3);
        JrbtnMasculino3.setText("Masculino");
        JrbtnMasculino3.setEnabled(false);

        buttonGroupGenero3.add(JrbtnFemenino3);
        JrbtnFemenino3.setText("Femenino");
        JrbtnFemenino3.setEnabled(false);

        javax.swing.GroupLayout jPanelPasajero3Layout = new javax.swing.GroupLayout(jPanelPasajero3);
        jPanelPasajero3.setLayout(jPanelPasajero3Layout);
        jPanelPasajero3Layout.setHorizontalGroup(
            jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajero3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre3)
                    .addComponent(txtNombres3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGenero3)
                    .addGroup(jPanelPasajero3Layout.createSequentialGroup()
                        .addComponent(JrbtnMasculino3)
                        .addGap(18, 18, 18)
                        .addComponent(JrbtnFemenino3)))
                .addGap(123, 123, 123)
                .addGroup(jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblApellidos3)
                    .addComponent(lblNumeroDocumento2)
                    .addComponent(txtApellidos3, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                    .addComponent(txtNumeroDocumento3))
                .addContainerGap(244, Short.MAX_VALUE))
        );
        jPanelPasajero3Layout.setVerticalGroup(
            jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPasajero3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidos3)
                    .addComponent(lblNombre3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombres3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtApellidos3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumeroDocumento2)
                    .addComponent(lblGenero3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelPasajero3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroDocumento3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JrbtnMasculino3)
                    .addComponent(JrbtnFemenino3))
                .addGap(18, 32, Short.MAX_VALUE))
        );

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        BtnContinuar.setText("Continuar");
        BtnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnContinuarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jPanelPasajero1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanelPasajero2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPanelPasajero3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(BtnContinuar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPasajero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPasajero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelPasajero3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnContinuar)
                .addGap(18, 18, 18)
                .addComponent(btnRegresar)
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelPasajero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanelPasajero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jPanelPasajero3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(BtnContinuar)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        FrmEquipaje equipaje = new FrmEquipaje(listaVuelos, silla, vuelos, nombreCliente, cedulaCliente, pasajeros);
        equipaje.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void BtnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnContinuarActionPerformed
      if(silla.size()==1){
          String nombre= txtNombres.getText();
          String apellido=txtApellidos.getText();
          String cedula= txtNumeroDocumento.getText();
          String genero= CbxGenero.getSelectedItem().toString();
          FrmAdicionales adicionales= new FrmAdicionales(listaVuelos, silla, vuelos, nombre,apellido,cedula, nombrepromocion, genero);
          adicionales.setVisible(true);
          dispose();
          
      }
    }//GEN-LAST:event_BtnContinuarActionPerformed
    private void clientefijo() {
        for (int i = 0; i < listacliente.size(); i++) {
            if (listacliente.get(i).getCedula().equals(cedulaCliente) && listacliente.get(i).getGenero().equals("Masculino")) {
                txtNombres.setText(listacliente.get(i).getNombre());
                txtApellidos.setText(listacliente.get(i).getApellido());
                txtNumeroDocumento.setText(listacliente.get(i).getCedula());
                CbxGenero.setSelectedItem(listacliente.get(i).getGenero());
            } else {
                if (listacliente.get(i).getCedula().equals(cedulaCliente) && listacliente.get(i).getGenero().equals("Femenino")) {
                    txtNombres.setText(listacliente.get(i).getNombre());
                    txtApellidos.setText(listacliente.get(i).getApellido());
                    txtNumeroDocumento.setText(listacliente.get(i).getCedula());
                    CbxGenero.setSelectedItem(listacliente.get(i).getGenero());
                }
            }
        }
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
            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmIngresarDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmIngresarDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnContinuar;
    private javax.swing.JComboBox<String> CbxGenero;
    private javax.swing.JRadioButton JrbtnFemenino2;
    private javax.swing.JRadioButton JrbtnFemenino3;
    private javax.swing.JRadioButton JrbtnMasculino2;
    private javax.swing.JRadioButton JrbtnMasculino3;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroupGenero;
    private javax.swing.ButtonGroup buttonGroupGenero2;
    private javax.swing.ButtonGroup buttonGroupGenero3;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanelPasajero1;
    private javax.swing.JPanel jPanelPasajero2;
    private javax.swing.JPanel jPanelPasajero3;
    private javax.swing.JLabel lblApellidos;
    private javax.swing.JLabel lblApellidos2;
    private javax.swing.JLabel lblApellidos3;
    private javax.swing.JLabel lblGenero2;
    private javax.swing.JLabel lblGenero3;
    private javax.swing.JLabel lblGeneros;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JLabel lblNombre3;
    private javax.swing.JLabel lblNumeroDocumento;
    private javax.swing.JLabel lblNumeroDocumento1;
    private javax.swing.JLabel lblNumeroDocumento2;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtApellidos2;
    private javax.swing.JTextField txtApellidos3;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNombres2;
    private javax.swing.JTextField txtNombres3;
    private javax.swing.JTextField txtNumeroDocumento;
    private javax.swing.JTextField txtNumeroDocumento2;
    private javax.swing.JTextField txtNumeroDocumento3;
    // End of variables declaration//GEN-END:variables
}
