/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Controladores.Administrador;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author DESKTOP-TPC6SO4
 */
public class frmProceso extends javax.swing.JFrame {
    
    Administrador admin = new Administrador();
    int tipoDeUsuario;
    
    FondoPanel fondo = new FondoPanel();
    
    /**
     * Creates new form frmProceso
     */
    public frmProceso() {
        
        this.setContentPane(fondo);
        initComponents();  
        lblUsuario.setText(frmLogin.txtUsuario.getText());
        
        String user = lblUsuario.getText();
        try {
            if (admin.existeOtrosUsuarios(user) == true) {
                tipoDeUsuario = 2;
            }
            if (admin.existeUsuarioVendedor(user) == true) {
                tipoDeUsuario = 1;
            }
        } catch (Exception ex) {
            Logger.getLogger(frmLogin.class.getName()).log(Level.SEVERE, null, ex);
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
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new FondoPanel();
        btnRegistrarVendedores = new javax.swing.JButton();
        btnRegistrarCliente = new javax.swing.JButton();
        btnRegistrarAutos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnVerListaAutos = new javax.swing.JButton();
        btnContrato = new javax.swing.JButton();
        lblUsuario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuRegistrarVendedor = new javax.swing.JMenuItem();
        menuRegistrarCiente = new javax.swing.JMenuItem();
        menuRegistrarAuto = new javax.swing.JMenuItem();
        menuVerRegstros = new javax.swing.JMenu();
        menuVerVendedores = new javax.swing.JMenuItem();
        menuVerCliente = new javax.swing.JMenuItem();
        menuVerAutos = new javax.swing.JMenuItem();
        menuAutosVendidos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuGenerarContrato = new javax.swing.JMenuItem();
        menuListaContratos = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("VENTA DE VEHICULOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Vente De Autos \"Rápidos y Furiosos\"", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setLayout(new java.awt.GridBagLayout());

        btnRegistrarVendedores.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarVendedores.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarVendedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor_96.png"))); // NOI18N
        btnRegistrarVendedores.setText("Registrar Vendedor");
        btnRegistrarVendedores.setContentAreaFilled(false);
        btnRegistrarVendedores.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarVendedores.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor_96.png"))); // NOI18N
        btnRegistrarVendedores.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Vendedor_128.png"))); // NOI18N
        btnRegistrarVendedores.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarVendedoresActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(btnRegistrarVendedores, gridBagConstraints);

        btnRegistrarCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_96.png"))); // NOI18N
        btnRegistrarCliente.setText("Registrar Cliente");
        btnRegistrarCliente.setContentAreaFilled(false);
        btnRegistrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarCliente.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_96.png"))); // NOI18N
        btnRegistrarCliente.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cliente_128.png"))); // NOI18N
        btnRegistrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 19;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(btnRegistrarCliente, gridBagConstraints);

        btnRegistrarAutos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarAutos.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto_96.png"))); // NOI18N
        btnRegistrarAutos.setText("Registrar Auto");
        btnRegistrarAutos.setContentAreaFilled(false);
        btnRegistrarAutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRegistrarAutos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto_96.png"))); // NOI18N
        btnRegistrarAutos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Auto_128.png"))); // NOI18N
        btnRegistrarAutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnRegistrarAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarAutosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(btnRegistrarAutos, gridBagConstraints);

        btnSalir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir_96.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setContentAreaFilled(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir_96.png"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir_128.png"))); // NOI18N
        btnSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 84, 0, 109);
        jPanel1.add(btnSalir, gridBagConstraints);

        btnVerListaAutos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVerListaAutos.setForeground(new java.awt.Color(255, 255, 255));
        btnVerListaAutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lista_96.png"))); // NOI18N
        btnVerListaAutos.setText("Ver Lista De Autos");
        btnVerListaAutos.setContentAreaFilled(false);
        btnVerListaAutos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerListaAutos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lista_96.png"))); // NOI18N
        btnVerListaAutos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Lista_128.png"))); // NOI18N
        btnVerListaAutos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVerListaAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerListaAutosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 84, 0, 109);
        jPanel1.add(btnVerListaAutos, gridBagConstraints);

        btnContrato.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnContrato.setForeground(new java.awt.Color(255, 255, 255));
        btnContrato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contrato_96.png"))); // NOI18N
        btnContrato.setText("Nuevo Contrato");
        btnContrato.setContentAreaFilled(false);
        btnContrato.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContrato.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contrato_96.png"))); // NOI18N
        btnContrato.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contrato_128.png"))); // NOI18N
        btnContrato.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 17;
        gridBagConstraints.ipady = 25;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 84, 0, 109);
        jPanel1.add(btnContrato, gridBagConstraints);

        lblUsuario.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 94;
        gridBagConstraints.ipady = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(lblUsuario, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/User_32.png"))); // NOI18N
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 31, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jMenuBar1.setBackground(new java.awt.Color(0, 102, 102));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registros_32.png"))); // NOI18N
        jMenu1.setText("Registros");

        menuRegistrarVendedor.setText("Registrar Vendedor");
        menuRegistrarVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarVendedorActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrarVendedor);

        menuRegistrarCiente.setText("Registrar Cliente");
        menuRegistrarCiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarCienteActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrarCiente);

        menuRegistrarAuto.setText("Registrar Auto");
        menuRegistrarAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRegistrarAutoActionPerformed(evt);
            }
        });
        jMenu1.add(menuRegistrarAuto);

        jMenuBar1.add(jMenu1);

        menuVerRegstros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VerRegistros_32.png"))); // NOI18N
        menuVerRegstros.setText("Ver Registros");

        menuVerVendedores.setText("Ver Vendedores");
        menuVerVendedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerVendedoresActionPerformed(evt);
            }
        });
        menuVerRegstros.add(menuVerVendedores);

        menuVerCliente.setText("Ver Clientes");
        menuVerCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerClienteActionPerformed(evt);
            }
        });
        menuVerRegstros.add(menuVerCliente);

        menuVerAutos.setText("Ver Autos");
        menuVerAutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerAutosActionPerformed(evt);
            }
        });
        menuVerRegstros.add(menuVerAutos);

        menuAutosVendidos.setText("Ver Autos Vendidos");
        menuAutosVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAutosVendidosActionPerformed(evt);
            }
        });
        menuVerRegstros.add(menuAutosVendidos);

        jMenuBar1.add(menuVerRegstros);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Contratos_32.png"))); // NOI18N
        jMenu3.setText("Contratos");

        menuGenerarContrato.setText("Generar Contrato");
        menuGenerarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGenerarContratoActionPerformed(evt);
            }
        });
        jMenu3.add(menuGenerarContrato);

        menuListaContratos.setText("Lista Contratos");
        menuListaContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListaContratosActionPerformed(evt);
            }
        });
        jMenu3.add(menuListaContratos);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Salir_32.png"))); // NOI18N
        jMenu4.setText("Salir");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        frmCliente cliente = new frmCliente();
        cliente.show(true);
        this.show(false);
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void btnRegistrarVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarVendedoresActionPerformed
        frmVendedor vendedor = new frmVendedor();
        vendedor.show(true);
        this.show(false);
    }//GEN-LAST:event_btnRegistrarVendedoresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        frmPantallaPrincipal p = new frmPantallaPrincipal();
        p.show(true);
        this.show(false);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnVerListaAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerListaAutosActionPerformed
        frmListaVehiculos listaAutos = new frmListaVehiculos();
        
        frmListaVehiculos.btnAceptar.setVisible(false);
        frmListaVehiculos.btnCancelar.setVisible(false);
        
        listaAutos.show(true);
        this.show(false);
    }//GEN-LAST:event_btnVerListaAutosActionPerformed

    private void btnRegistrarAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarAutosActionPerformed
        frmVehiculo vehiculo = new frmVehiculo();
        vehiculo.show(true);
        this.show(false);
    }//GEN-LAST:event_btnRegistrarAutosActionPerformed

    private void btnContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratoActionPerformed
        frmDatosContrato datosContrato = new frmDatosContrato();
        datosContrato.show(true);
        this.show(false);
    }//GEN-LAST:event_btnContratoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        frmPantallaPrincipal p = new frmPantallaPrincipal();
        p.show(true);
        this.show(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void menuGenerarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGenerarContratoActionPerformed
        frmDatosContrato datosContrato = new frmDatosContrato();
        datosContrato.show(true);
        this.show(false);
    }//GEN-LAST:event_menuGenerarContratoActionPerformed

    private void menuVerVendedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerVendedoresActionPerformed
        frmListaVendedor listaVendedores = new frmListaVendedor();  
        
        frmListaVendedor.btnAceptar.setVisible(false);
        frmListaVendedor.btnCancelar.setVisible(false);
        
        listaVendedores.show(true);
        this.show(false);
    }//GEN-LAST:event_menuVerVendedoresActionPerformed

    private void menuVerClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerClienteActionPerformed
        frmListaCliente listaClientes = new frmListaCliente();
        
        frmListaCliente.btnAceptar.setVisible(false);
        frmListaCliente.btnCancelar.setVisible(false);
        
        listaClientes.show(true);
        this.show(false);
    }//GEN-LAST:event_menuVerClienteActionPerformed

    private void menuVerAutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerAutosActionPerformed
        frmListaVehiculos listaAutos = new frmListaVehiculos();
        
        frmListaVehiculos.btnAceptar.setVisible(false);
        frmListaVehiculos.btnCancelar.setVisible(false);
        
        listaAutos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuVerAutosActionPerformed

    private void menuRegistrarVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarVendedorActionPerformed
        frmVendedor vendedor = new frmVendedor();
        vendedor.show(true);
        this.show(false);
    }//GEN-LAST:event_menuRegistrarVendedorActionPerformed

    private void menuRegistrarCienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarCienteActionPerformed
        frmCliente cliente = new frmCliente();
        cliente.show(true);
        this.show(false);
    }//GEN-LAST:event_menuRegistrarCienteActionPerformed

    private void menuRegistrarAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRegistrarAutoActionPerformed
        frmVehiculo vehiculo = new frmVehiculo();
        vehiculo.show(true);
        this.show(false);
    }//GEN-LAST:event_menuRegistrarAutoActionPerformed

    private void menuListaContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListaContratosActionPerformed
        frmListaContratos contratos = new frmListaContratos();
        contratos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuListaContratosActionPerformed

    private void menuAutosVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAutosVendidosActionPerformed
        frmListaAutosVendidos autosVendidos = new frmListaAutosVendidos();
        autosVendidos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuAutosVendidosActionPerformed
    
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
            java.util.logging.Logger.getLogger(frmProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnContrato;
    public javax.swing.JButton btnRegistrarAutos;
    public javax.swing.JButton btnRegistrarCliente;
    public javax.swing.JButton btnRegistrarVendedores;
    public javax.swing.JButton btnSalir;
    public javax.swing.JButton btnVerListaAutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lblUsuario;
    public javax.swing.JMenuItem menuAutosVendidos;
    public javax.swing.JMenuItem menuGenerarContrato;
    public javax.swing.JMenuItem menuListaContratos;
    public javax.swing.JMenuItem menuRegistrarAuto;
    public javax.swing.JMenuItem menuRegistrarCiente;
    public javax.swing.JMenuItem menuRegistrarVendedor;
    public javax.swing.JMenuItem menuVerAutos;
    public javax.swing.JMenuItem menuVerCliente;
    public javax.swing.JMenu menuVerRegstros;
    public javax.swing.JMenuItem menuVerVendedores;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
