/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.CtVuelo;
import Controlador.CtVuelos;
import Controlador.CtlRuta;
import Modelo.ClsRuta;
import Modelo.ClsVuelo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author mateo
 */
public class FrmmenuCliente extends javax.swing.JFrame {

    DateFormat formato = DateFormat.getDateInstance();
    ArrayList<ClsRuta> listarutas = new ArrayList<ClsRuta>();
    ArrayList<ClsVuelo> listavuelos = new ArrayList<ClsVuelo>();
    CtVuelos controladorVuelo;
    CtlRuta controladorruta;
    CtVuelo controladorVuelos;
    String nombre;

    public FrmmenuCliente() {
        initComponents();
    }

    public FrmmenuCliente(String nombre) {
        initComponents();
        controladorruta = new CtlRuta();
        controladorVuelo = new CtVuelos();
        controladorVuelos = new CtVuelo();
        this.nombre = nombre;
        lblNombre.setText(nombre);
        try {
            listarutas = controladorruta.cargarArchivo(listarutas);
            listavuelos = controladorVuelo.cargarArchivo(listavuelos);
            listarcomboxorigen();
            listarcomboxdestino();
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

        jRadioButton1 = new javax.swing.JRadioButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        BtnRegresar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        JrdbtnSoloida = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        lblIda = new javax.swing.JLabel();
        JcbxIda = new javax.swing.JComboBox<>();
        lblFechaida = new javax.swing.JLabel();
        JdateFechaida = new com.toedter.calendar.JDateChooser();
        lblFecharegreso = new javax.swing.JLabel();
        JdateFecharegreso = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblPasajeros = new javax.swing.JLabel();
        JcbxDestino = new javax.swing.JComboBox<>();
        txtPasajeros = new javax.swing.JTextField();
        btnSumar = new javax.swing.JButton();
        BtnRestar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        JrdbtnSoloidayvuelta = new javax.swing.JRadioButton();
        lblBienvenido = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Jmenupromociones = new javax.swing.JMenu();
        jmOfertas = new javax.swing.JMenuItem();
        JmDestinos = new javax.swing.JMenu();
        JmtRutas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        buttonGroup1.add(JrdbtnSoloida);
        JrdbtnSoloida.setText("Solo ida");
        JrdbtnSoloida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrdbtnSoloidaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        lblIda.setText("Ida");

        JcbxIda.setEnabled(false);
        JcbxIda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbxIdaActionPerformed(evt);
            }
        });

        lblFechaida.setText("Fecha ida");

        JdateFechaida.setEnabled(false);

        lblFecharegreso.setText("Fecha regreso");

        JdateFecharegreso.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIda)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JcbxIda, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaida)
                                    .addComponent(JdateFechaida, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblFecharegreso))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JdateFecharegreso, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 11, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(JdateFecharegreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblIda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JcbxIda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFechaida)
                            .addComponent(lblFecharegreso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JdateFechaida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setText("Destino");

        lblPasajeros.setText("Pasajeros");

        JcbxDestino.setEnabled(false);
        JcbxDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JcbxDestinoActionPerformed(evt);
            }
        });

        txtPasajeros.setText("1");
        txtPasajeros.setEnabled(false);
        txtPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasajerosActionPerformed(evt);
            }
        });
        txtPasajeros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasajerosKeyTyped(evt);
            }
        });

        btnSumar.setText("+");
        btnSumar.setEnabled(false);
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        BtnRestar.setText("-");
        BtnRestar.setEnabled(false);
        BtnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRestarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(JcbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPasajeros)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtPasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnRestar)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(5, 5, 5)
                .addComponent(JcbxDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPasajeros)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnRestar))
                    .addComponent(txtPasajeros))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BtnBuscar.setBackground(new java.awt.Color(204, 204, 204));
        BtnBuscar.setText("Buscar");
        BtnBuscar.setEnabled(false);
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });

        buttonGroup1.add(JrdbtnSoloidayvuelta);
        JrdbtnSoloidayvuelta.setText("ida y vuelta");
        JrdbtnSoloidayvuelta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrdbtnSoloidayvueltaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(JrdbtnSoloida, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JrdbtnSoloidayvuelta))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JrdbtnSoloida)
                            .addComponent(JrdbtnSoloidayvuelta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );

        lblBienvenido.setText("Bienvenido :");

        lblNombre.setText("Nombre");

        jDesktopPane2.setLayer(BtnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(jPanel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblBienvenido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane2.setLayer(lblNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane2Layout = new javax.swing.GroupLayout(jDesktopPane2);
        jDesktopPane2.setLayout(jDesktopPane2Layout);
        jDesktopPane2Layout.setHorizontalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane2Layout.createSequentialGroup()
                        .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnRegresar)
                            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                                .addComponent(lblBienvenido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane2Layout.setVerticalGroup(
            jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane2Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jDesktopPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBienvenido)
                    .addComponent(lblNombre))
                .addGap(37, 37, 37)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnRegresar)
                .addGap(20, 20, 20))
        );

        jMenu1.setText("Mi reserva");
        jMenuBar1.add(jMenu1);

        Jmenupromociones.setText("Promociones");
        Jmenupromociones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmenupromocionesActionPerformed(evt);
            }
        });

        jmOfertas.setText("Ofertas");
        jmOfertas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmOfertasActionPerformed(evt);
            }
        });
        Jmenupromociones.add(jmOfertas);

        jMenuBar1.add(Jmenupromociones);

        JmDestinos.setText("Destinos");
        JmDestinos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmDestinosActionPerformed(evt);
            }
        });

        JmtRutas.setText("Rutas");
        JmtRutas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JmtRutasActionPerformed(evt);
            }
        });
        JmDestinos.add(JmtRutas);

        jMenuBar1.add(JmDestinos);

        jMenu4.setText("Atencion al cliente");
        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void JmDestinosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmDestinosActionPerformed

    }//GEN-LAST:event_JmDestinosActionPerformed

    private void JmtRutasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmtRutasActionPerformed
        FrmDestinos destinos = new FrmDestinos(nombre);
        destinos.setVisible(true);
        dispose();
    }//GEN-LAST:event_JmtRutasActionPerformed

    private void JrdbtnSoloidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrdbtnSoloidaActionPerformed
        if (JrdbtnSoloida.isSelected() == true) {
            lblFecharegreso.setEnabled(false);
            JdateFecharegreso.setEnabled(false);
            JdateFechaida.setEnabled(true);
            JcbxIda.setEnabled(true);
            JcbxDestino.setEnabled(true);
            txtPasajeros.setEnabled(true);
            btnSumar.setEnabled(true);
            BtnRestar.setEnabled(true);
            BtnBuscar.setEnabled(true);
        }

    }//GEN-LAST:event_JrdbtnSoloidaActionPerformed

    private void JcbxIdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbxIdaActionPerformed

    }//GEN-LAST:event_JcbxIdaActionPerformed

    private void JcbxDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JcbxDestinoActionPerformed

    }//GEN-LAST:event_JcbxDestinoActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        int entrada = Integer.parseInt(txtPasajeros.getText());
        if (entrada >= 1 && entrada <= 2) {
            int suma = entrada + 1;
            String numero = suma + "";
            txtPasajeros.setText(numero);
        }

    }//GEN-LAST:event_btnSumarActionPerformed

    private void BtnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRestarActionPerformed
        int entrada = Integer.parseInt(txtPasajeros.getText());
        if (entrada >= 1 && entrada <= 3) {
            int resta = entrada - 1;
            if (resta > 0) {
                String numero = resta + "";
                txtPasajeros.setText(numero);
            }
        }

    }//GEN-LAST:event_BtnRestarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        ArrayList<ClsVuelo> listavuelo = new ArrayList<ClsVuelo>();
        String origen = JcbxIda.getSelectedItem().toString();
        String destino = JcbxDestino.getSelectedItem().toString();
        int pasajeros = Integer.parseInt(txtPasajeros.getText());
        if (JrdbtnSoloida.isSelected() == true) {
            String fechaida = formato.format(JdateFechaida.getDate());
            Date ida = convertirString(fechaida);
            boolean desicionida = buscarorigenydestinoida(origen, destino);
            listavuelo = llenararray(listavuelos, ida, origen, destino);

            if (listavuelo.isEmpty()) {
                JOptionPane.showMessageDialog(this, "no existe vuelos disponibles");
            } else {
                FrmVueloida vuelo = new FrmVueloida(listavuelo, pasajeros, nombre);
                vuelo.setVisible(true);
                dispose();
            }
        }
        if (JrdbtnSoloidayvuelta.isSelected() == true) {
            for (int i = 0; i < listavuelos.size(); i++) {
                String fecharegreso = formato.format(JdateFecharegreso.getDate());
                String fechaida = formato.format(JdateFechaida.getDate());
                Date ida = convertirString(fechaida);
                Date regreso = convertirString(fecharegreso);
                boolean desicionida = buscarfechasida(ida);
                boolean desicionregreso = buscarfechasregreso(regreso);
                boolean origenydestinoida = buscarorigenydestinoida(origen, destino);
                boolean origenydestinoregreso = buscarorigenydestinoregreso(destino, origen);
                if (origen.equals(listavuelos.get(i).getOrigen()) && destino.equals(listavuelos.get(i).getDestino()) && desicionida == true && desicionregreso == true && origenydestinoida == true && origenydestinoregreso) {
                    FrmVueloidaregreso vuelos = new FrmVueloidaregreso(listavuelos, pasajeros, nombre);
                    vuelos.setVisible(true);
                    dispose();
                    break;
                } else {
                    JOptionPane.showMessageDialog(this, "no existe vuelos disponibles");
                    break;
                }

            }

        }


    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void txtPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasajerosActionPerformed

    }//GEN-LAST:event_txtPasajerosActionPerformed

    private void JmenupromocionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JmenupromocionesActionPerformed

    }//GEN-LAST:event_JmenupromocionesActionPerformed

    private void jmOfertasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmOfertasActionPerformed
        FrmOfertas ofertas = new FrmOfertas(nombre);
        ofertas.setVisible(true);
        dispose();
    }//GEN-LAST:event_jmOfertasActionPerformed

    private void txtPasajerosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasajerosKeyTyped
        char c = evt.getKeyChar();
        if (c < '1' || c > '4') {
            evt.consume();
        }
    }//GEN-LAST:event_txtPasajerosKeyTyped

    private void JrdbtnSoloidayvueltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrdbtnSoloidayvueltaActionPerformed
        if (JrdbtnSoloidayvuelta.isSelected() == true) {
            lblFecharegreso.setEnabled(true);
            JdateFecharegreso.setEnabled(true);
        }
    }//GEN-LAST:event_JrdbtnSoloidayvueltaActionPerformed
    private void listarcomboxorigen() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listarutas.size(); i++) {
            modelo.addElement(listarutas.get(i).getOrigen());
        }
        JcbxIda.setModel(modelo);

    }

    private void listarcomboxdestino() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        for (int i = 0; i < listarutas.size(); i++) {
            modelo.addElement(listarutas.get(i).getDestino());
        }
        JcbxDestino.setModel(modelo);

    }

    public boolean buscarorigenydestinoida(String origen, String destino) {
        boolean desicion = false;
        for (int i = 0; i < listavuelos.size(); i++) {
            if (origen.equals(listavuelos.get(i).getOrigen()) && destino.equals(listavuelos.get(i).getDestino()) && listavuelos.get(i).getTipovuelo().equals("Ida")) {
                desicion = true;
            }
        }
        return desicion;
    }

    public boolean buscarorigenydestinoregreso(String origen, String destino) {
        boolean desicion = false;
        for (int i = 0; i < listavuelos.size(); i++) {
            if (origen.equals(listavuelos.get(i).getOrigen()) && destino.equals(listavuelos.get(i).getDestino()) && listavuelos.get(i).getTipovuelo().equals("Vuelta")) {
                desicion = true;
            }
        }
        return desicion;
    }

    public boolean buscarfechasida(Date fechaida) {
        boolean desicion = false;
        for (int i = 0; i < listavuelos.size(); i++) {
            if (listavuelos.get(i).getTipovuelo().equals("Ida")) {
                Date fechas = convertirString(listavuelos.get(i).getFecha());
                if (fechaida.equals(fechas)) {
                    desicion = true;
                    break;
                }
            }
        }
        return desicion;
    }

    public boolean buscarfechasregreso(Date fechaida) {
        boolean desicion = false;
        for (int i = 0; i < listavuelos.size(); i++) {
            if (listavuelos.get(i).getTipovuelo().equals("Vuelta")) {
                Date fechas = convertirString(listavuelos.get(i).getFecha());
                if (fechaida.equals(fechas)) {
                    desicion = true;
                    break;
                }
            }
        }
        return desicion;
    }

    public Date convertirString(String fecha) {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date fechaDate = null;
        try {
            fechaDate = format.parse(fecha);
        } catch (ParseException ex) {
            System.out.println(ex);
        }
        return fechaDate;
    }

    public ArrayList<ClsVuelo> llenararray(ArrayList<ClsVuelo> listavuelo, Date ida, String origen, String destino) {
        ArrayList<ClsVuelo> nuevalista = new ArrayList<ClsVuelo>();

        for (int i = 0; i < listavuelo.size(); i++) {
            Date idavuelos = convertirString(listavuelo.get(i).getFecha());
            if (ida.equals(idavuelos) && origen.equals(listavuelo.get(i).getOrigen()) && listavuelo.get(i).getTipovuelo().equals("Ida")) {
                nuevalista.add(listavuelo.get(i));
            }
        }

        return nuevalista;
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
            java.util.logging.Logger.getLogger(FrmmenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmmenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmmenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmmenuCliente.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmmenuCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JButton BtnRestar;
    public static javax.swing.JComboBox<String> JcbxDestino;
    public static javax.swing.JComboBox<String> JcbxIda;
    public static com.toedter.calendar.JDateChooser JdateFechaida;
    public static com.toedter.calendar.JDateChooser JdateFecharegreso;
    private javax.swing.JMenu JmDestinos;
    private javax.swing.JMenu Jmenupromociones;
    private javax.swing.JMenuItem JmtRutas;
    private javax.swing.JRadioButton JrdbtnSoloida;
    private javax.swing.JRadioButton JrdbtnSoloidayvuelta;
    private javax.swing.JButton btnSumar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JMenuItem jmOfertas;
    private javax.swing.JLabel lblBienvenido;
    private javax.swing.JLabel lblFechaida;
    private javax.swing.JLabel lblFecharegreso;
    private javax.swing.JLabel lblIda;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPasajeros;
    public static javax.swing.JTextField txtPasajeros;
    // End of variables declaration//GEN-END:variables
}
