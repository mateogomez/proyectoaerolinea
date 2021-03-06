/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtSilla;
import Modelo.ClsSillas;
import Modelo.ClsVuelo;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class FrmSillas extends javax.swing.JFrame implements ActionListener {

    JButton[][] botones;
    ClsSillas[][] sillas;
    String fila[];
    public int pasajeros;
    public ClsVuelo vuelo;
    public String numerovuelo;
    public String nombreCliente;
    public String cedulaCliente;
    public ArrayList<ClsVuelo> listavuelo = new ArrayList<ClsVuelo>();
    int contador = 0;
    CtSilla controladorsilla;

    public FrmSillas() {
        initComponents();
    }

    public FrmSillas(ArrayList<ClsVuelo> listavuelo, ClsVuelo vuelo, String nombre, String cedulaCliente, int pasajeros) {

        initComponents();
        controladorsilla = new CtSilla();
        this.numerovuelo = vuelo.getNumeroVuelo();
        this.vuelo = vuelo;
        this.nombreCliente = nombre;
        this.cedulaCliente = cedulaCliente;
        this.pasajeros = pasajeros;
        this.listavuelo = listavuelo;
        botones = new JButton[6][10];
        sillas = new ClsSillas[6][10];
        fila = new String[10];
        fila[0] = new String("A");
        fila[1] = new String("B");
        fila[2] = new String("C");
        fila[3] = new String("D");
        fila[4] = new String("E");
        fila[5] = new String("F");
        fila[6] = new String("G");
        fila[7] = new String("H");
        fila[8] = new String("I");
        fila[9] = new String("J");
        cargarBotones();
        try {
            sillas = controladorsilla.cargarArchivo(sillas);
            cargarsilla();
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

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        BtnAleatorio = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnReservar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 942, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        BtnAleatorio.setText("Aleatorio");

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        BtnReservar.setText("Reservar");
        BtnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnReservarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAleatorio)
                    .addComponent(BtnRegresar)
                    .addComponent(BtnReservar))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addComponent(BtnReservar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnAleatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BtnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrmVueloida vueloida = new FrmVueloida(listavuelo, pasajeros, nombreCliente, cedulaCliente);
        vueloida.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnReservarActionPerformed
        ArrayList<String> listasilla = new ArrayList<String>();
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (botones[i][j].getBackground() == Color.BLUE) {
                    listasilla.add(sillas[i][j].getNumeropuesto());
                }
            }
        }
        FrmEquipaje equipaje = new FrmEquipaje(listavuelo, listasilla, vuelo, numerovuelo, cedulaCliente, pasajeros);
        equipaje.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnReservarActionPerformed

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
            java.util.logging.Logger.getLogger(FrmSillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSillas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSillas().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                if (e.getSource() == botones[i][j]) {
                    if (pasajeros == 1) {
                        if (sillas[i][j] == null) {
                            String puesto = botones[i][j].getText();
                            boolean asignado = new Boolean(false);
                            if (contador < pasajeros) {
                                if (asignado == false) {
                                    ClsSillas silla = new ClsSillas(numerovuelo, puesto, false);
                                    sillas[i][j] = silla;
                                    elegirsilla(i, j);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "sobrepaso pasajeros");
                                break;
                            }

                        }
                        if (sillas[i][j].isOcupado() == false) {
                            String puesto = botones[i][j].getText();
                            boolean asignado = new Boolean(false);
                            String asignar = JOptionPane.showInputDialog("Desea reservar esta silla? (si-no):").toLowerCase();
                            if (asignar.equals("si")) {
                                ClsSillas silla = new ClsSillas(numerovuelo, puesto, true);
                                sillas[i][j] = silla;
                                contador++;
                            } else {
                                if (asignar.equals("no")) {
                                    ClsSillas silla = new ClsSillas(numerovuelo, puesto, false);
                                    sillas[i][j] = silla;
                                }
                            }
                            verificarsilla();
                            String res = controladorsilla.guardarArchivo(sillas);
                        }
                    }
                    if (pasajeros == 2) {
                        if (sillas[i][j] == null) {
                            String puesto = botones[i][j].getText();
                            boolean asignado = new Boolean(false);
                            if (contador < pasajeros) {
                                if (asignado == false) {
                                    ClsSillas silla = new ClsSillas(numerovuelo, puesto, false);
                                    sillas[i][j] = silla;
                                    elegirsilla(i, j);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "sobrepaso pasajeros");
                                break;
                            }
                        }
                        if (sillas[i][j].isOcupado() == false) {
                            String puesto = botones[i][j].getText();
                            boolean asignado = new Boolean(false);
                            String asignar = JOptionPane.showInputDialog("Desea reservar esta silla? (si-no):").toLowerCase();
                            if (asignar.equals("si")) {
                                ClsSillas silla = new ClsSillas(numerovuelo, puesto, true);
                                sillas[i][j] = silla;
                                contador++;
                            } else {
                                if (asignar.equals("no")) {
                                    ClsSillas silla = new ClsSillas(numerovuelo, puesto, false);
                                    sillas[i][j] = silla;
                                }
                            }
                            verificarsilla();
                            String res = controladorsilla.guardarArchivo(sillas);
                        }
                    }
                    if (pasajeros == 3) {
                        if (sillas[i][j] == null) {
                            String puesto = botones[i][j].getText();
                            boolean asignado = new Boolean(false);
                            if (contador < pasajeros) {
                                if (asignado == false) {
                                    ClsSillas silla = new ClsSillas(numerovuelo, puesto, false);
                                    sillas[i][j] = silla;
                                    elegirsilla(i, j);
                                }

                            } else {
                                JOptionPane.showMessageDialog(this, "sobrepaso pasajeros");
                                break;
                            }
                        }
                        if (sillas[i][j].isOcupado() == false) {
                            String puesto = botones[i][j].getText();
                            boolean asignado = new Boolean(false);
                            String asignar = JOptionPane.showInputDialog("Desea reservar esta silla? (si-no):").toLowerCase();
                            if (asignar.equals("si")) {
                                ClsSillas silla = new ClsSillas(numerovuelo, puesto, true);
                                sillas[i][j] = silla;
                                contador++;
                            } else {
                                if (asignar.equals("no")) {
                                    ClsSillas silla = new ClsSillas(numerovuelo, puesto, false);
                                    sillas[i][j] = silla;
                                }
                            }
                            verificarsilla();
                            String res = controladorsilla.guardarArchivo(sillas);
                        }
                    }
                }
            }
        }
    }

    private void cargarBotones() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[i].length; j++) {
                botones[i][j] = new JButton();
                botones[i][j].setBounds(20 + i * 160, 20 + j * 50, 100, 50);
                botones[i][j].setText(fila[j] + (i + 1) + "");
                jPanel1.add(botones[i][j]);
                botones[i][j].setVisible(true);
                botones[i][j].addActionListener(this);
            }
        }
    }

    private void cargarsilla() {
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                //si libros en la posicion esta vacio 
                if (sillas[i][j] == null) {
                    //El boton en la posicion cambiar el color agris
                    botones[i][j].setBackground(Color.GRAY);

                } else {
                    //Botones en la posicion mandememe libros en posicion el nombre
                    botones[i][j].setText(sillas[i][j].getNumeropuesto());
                    // si libros es prestado
                    if (sillas[i][j].isOcupado()) {
                        //cambiar color
                        botones[i][j].setBackground(Color.RED);
                    } else {
                        //cambiar color
                        botones[i][j].setBackground(Color.WHITE);
                    }
                }

            }
        }
    }

    private void verificarsilla() {
        for (int i = 0; i < sillas.length; i++) {
            for (int j = 0; j < sillas[i].length; j++) {
                //si libros en la posicion esta vacio 
                if (sillas[i][j] == null) {
                    //El boton en la posicion cambiar el color agris
                    botones[i][j].setBackground(Color.GRAY);

                } else {
                    //Botones en la posicion mandememe libros en posicion el nombre
                    botones[i][j].setText(sillas[i][j].getNumeropuesto());
                    // si libros es prestado

                    if (sillas[i][j].isOcupado()) {
                    } else {
                        //cambiar color
                        botones[i][j].setBackground(Color.WHITE);
                    }
                }

            }
        }
    }

    private void elegirsilla(int m, int n) {
        botones[m][n].setBackground(Color.BLUE);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAleatorio;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnReservar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
