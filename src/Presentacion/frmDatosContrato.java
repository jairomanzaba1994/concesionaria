/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Clases.Contrato;
import Controladores.Administrador;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DESKTOP-TPC6SO4
 */
public class frmDatosContrato extends javax.swing.JFrame {

    Administrador admin = new Administrador();
    Contrato contrato = new Contrato();
    
    String fechaActual;
    int tipoDeUsuario;
    
    /**
     * Creates new form frmDatosContrato
     */
    public frmDatosContrato() {
        initComponents();
        fechaActual = contrato.fecha();
        txtFecha.setText(fechaActual);
        
        String user = frmProceso.lblUsuario.getText();
        try {
            if (admin.existeOtrosUsuarios(user) == true) {
                tipoDeUsuario = 2;
            }
            if (admin.existeUsuarioVendedor(user) == true) {
                tipoDeUsuario = 1;
            }
        } catch (Exception ex) {
            Logger.getLogger(frmDatosContrato.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel2 = new FondoPanelRegistros();
        jPanel3 = new FondoPanelRegistros();
        txtPlacaVehiculo = new javax.swing.JTextField();
        txtNroDocumentoVendedor = new javax.swing.JTextField();
        txtNroDocumentoCliente = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtProvincia = new javax.swing.JTextField();
        txtCanton = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        jPanel1 = new FondoPanelRegistros();
        btnBuscarVehiculo = new javax.swing.JButton();
        btnBuscarVendedor = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        btnCargarDatos = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Datos Del Contrato ");
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Para Generar Contrato", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18))); // NOI18N

        txtPlacaVehiculo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txtNroDocumentoVendedor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txtNroDocumentoCliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Placa Del Vehículo:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Nro. Documento Vendedor:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Nro. Documento Cliente:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio:");

        txtPrecio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setText("Fecha:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Provincia:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setText("Cantón:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Dirección:");

        txtProvincia.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txtCanton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txtDireccion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N

        txtFecha.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtFecha.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNroDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtProvincia, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                            .addComponent(txtCanton)
                            .addComponent(txtDireccion)
                            .addComponent(txtPlacaVehiculo)
                            .addComponent(txtNroDocumentoVendedor)
                            .addComponent(txtFecha)))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtProvincia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCanton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPlacaVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNroDocumentoVendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNroDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);

        btnBuscarVehiculo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBuscarVehiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_32.png"))); // NOI18N
        btnBuscarVehiculo.setText("Buscar Vehículo");
        btnBuscarVehiculo.setContentAreaFilled(false);
        btnBuscarVehiculo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarVehiculo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscarVehiculo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_32.png"))); // NOI18N
        btnBuscarVehiculo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_48.png"))); // NOI18N
        btnBuscarVehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVehiculoActionPerformed(evt);
            }
        });

        btnBuscarVendedor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBuscarVendedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_32.png"))); // NOI18N
        btnBuscarVendedor.setText("Buscar Vendedor");
        btnBuscarVendedor.setContentAreaFilled(false);
        btnBuscarVendedor.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarVendedor.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscarVendedor.setInheritsPopupMenu(true);
        btnBuscarVendedor.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_32.png"))); // NOI18N
        btnBuscarVendedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_48.png"))); // NOI18N
        btnBuscarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendedorActionPerformed(evt);
            }
        });

        btnBuscarCliente.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_32.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar Cliente");
        btnBuscarCliente.setContentAreaFilled(false);
        btnBuscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_32.png"))); // NOI18N
        btnBuscarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Buscar_48.png"))); // NOI18N
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        btnCargarDatos.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCargarDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CargarDatos_48.png"))); // NOI18N
        btnCargarDatos.setText("Cargar Datos");
        btnCargarDatos.setContentAreaFilled(false);
        btnCargarDatos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CargarDatos_48.png"))); // NOI18N
        btnCargarDatos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/CargarDatos_64.png"))); // NOI18N
        btnCargarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarDatosActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar_32.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCancelar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar_32.png"))); // NOI18N
        btnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar_48.png"))); // NOI18N
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscarVendedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarVehiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCargarDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarVendedor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscarCliente)
                .addContainerGap())
        );

        jPanel2.add(jPanel1);

        getContentPane().add(jPanel2);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        frmListaCliente listaCliente = new frmListaCliente();
        listaCliente.show(true);
        frmListaCliente.btnAtras.setVisible(false);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        frmProceso proceso = new frmProceso();
        JOptionPane.showMessageDialog(null, "Generación de contrato cancelado!!");
        
        if (tipoDeUsuario == 1) {
            proceso.btnRegistrarVendedores.setEnabled(false);
            proceso.menuRegistrarVendedor.setEnabled(false);
            proceso.menuVerVendedores.setEnabled(false);
            proceso.menuAutosVendidos.setEnabled(false);
        }
        
        proceso.show(true);
        this.show(false);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnCargarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarDatosActionPerformed
        frmContrato contrato = new frmContrato();
        contrato.show(false);
    
    if (!txtCanton.getText().isEmpty() && !txtDireccion.getText().isEmpty() && !txtNroDocumentoCliente.getText().isEmpty() && !txtNroDocumentoVendedor.getText().isEmpty() && !txtPlacaVehiculo.getText().isEmpty() && !txtPrecio.getText().isEmpty() && !txtProvincia.getText().isEmpty()) {    
        frmContrato.txtFecha.setText(txtFecha.getText());
        frmContrato.txtProvincia.setText(txtProvincia.getText());
        frmContrato.txtCanton.setText(txtCanton.getText());
        frmContrato.txtDireccion.setText(txtDireccion.getText());
        
        if (admin.existeAuto(txtPlacaVehiculo.getText()) == true) {
            frmContrato.txtPlaca.setText(txtPlacaVehiculo.getText());           
            
            String[] datosAuto = new String[5];
            datosAuto = admin.obtenerDatosAuto(txtPlacaVehiculo.getText());
            
            frmContrato.txtMarca.setText(datosAuto[0]);
            frmContrato.txtMotor.setText(datosAuto[1]);
            frmContrato.txtColor.setText(datosAuto[2]);
            frmContrato.txtMetraje.setText(datosAuto[3]);
            frmContrato.txtModelo.setText(datosAuto[4]);
            frmContrato.txtAnio.setText(datosAuto[5]);
            
            if (admin.existeVendedor(txtNroDocumentoVendedor.getText()) == true) {
                frmContrato.txtNroDocumentoVendedor.setText(txtNroDocumentoVendedor.getText());
                
                String[] datosVendedor = new String[3];
                datosVendedor = admin.obtenerDatosVendedor(txtNroDocumentoVendedor.getText());
                
                frmContrato.txtNombreVendedor.setText(datosVendedor[0]);
                frmContrato.txtApellidosVendedor.setText(datosVendedor[1]);
                frmContrato.txtTipoDocumentoVendedor.setText(datosVendedor[2]);
                
                if (admin.existeCliente(txtNroDocumentoCliente.getText()) == true) {
                    frmContrato.txtNroDocumentoCliente.setText(txtNroDocumentoCliente.getText());
                    
                    String[] datosCliente = new String[3];
                    datosCliente = admin.obtenerDatosCliente(txtNroDocumentoCliente.getText());
                    
                    frmContrato.txtNombreCliente.setText(datosCliente[0]);
                    frmContrato.txtApellidosCiente.setText(datosCliente[1]);
                    frmContrato.txtTipoDocumentoCliente.setText(datosCliente[2]);
                    
                    if (validarPrecio()==true) {
                        frmContrato.txtPrecio.setText(txtPrecio.getText());
                        
                        contrato.show(true);
                        this.show(false);
                    } else {
                        JOptionPane.showMessageDialog(null, "El precio debe ser un dato numérico!!");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "El cliente no existe!!");
                }
            } else {
                JOptionPane.showMessageDialog(null, "El vendedor no existe!!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El vehículo no existe!!");
        }
    } else {
        JOptionPane.showMessageDialog(null, "Debe llenar todos los campos!!");
    }
    }//GEN-LAST:event_btnCargarDatosActionPerformed

    private void btnBuscarVehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVehiculoActionPerformed
        frmListaVehiculos listaVehiculo = new frmListaVehiculos();
        listaVehiculo.show(true);
        frmListaVehiculos.btnAtras.setVisible(false);
    }//GEN-LAST:event_btnBuscarVehiculoActionPerformed

    private void btnBuscarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendedorActionPerformed
        frmListaVendedor listaVendedores = new frmListaVendedor();
        listaVendedores.show(true);
        frmListaVendedor.btnAtras.setVisible(false);
    }//GEN-LAST:event_btnBuscarVendedorActionPerformed

    private boolean validarPrecio() {
        boolean es;
        
        try {
            Double.parseDouble(txtPrecio.getText());
            es=true;
        } catch (NumberFormatException e) {
            es=false;
        }
        return es;
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
            java.util.logging.Logger.getLogger(frmDatosContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDatosContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDatosContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDatosContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDatosContrato().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnBuscarVehiculo;
    private javax.swing.JButton btnBuscarVendedor;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCargarDatos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCanton;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFecha;
    public static javax.swing.JTextField txtNroDocumentoCliente;
    public static javax.swing.JTextField txtNroDocumentoVendedor;
    public static javax.swing.JTextField txtPlacaVehiculo;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProvincia;
    // End of variables declaration//GEN-END:variables

    class FondoPanelRegistros extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoRegistros.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}