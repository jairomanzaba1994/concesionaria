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
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author DESKTOP-TPC6SO4
 */
public class frmListaContratos extends javax.swing.JFrame {

    Administrador admin = new Administrador();
    
    int tipoDeUsuario;
    
    /**
     * Creates new form frmListaContratos
     */
    public frmListaContratos() {
        initComponents();
        
        tablaListaContratos.setModel(admin.mostrarTablaContratos(""));
        
        String user = frmProceso.lblUsuario.getText();
        try {
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
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaListaContratos = new javax.swing.JTable();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar (Ingrese Nro. De Contrato):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 6, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        txtBuscar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 141;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 6, 0, 0);
        jPanel1.add(txtBuscar, gridBagConstraints);

        btnAceptar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_32.png"))); // NOI18N
        btnAceptar.setText("Ver Contrato");
        btnAceptar.setContentAreaFilled(false);
        btnAceptar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAceptar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_32.png"))); // NOI18N
        btnAceptar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar_48.png"))); // NOI18N
        btnAceptar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 18, 0, 0);
        jPanel1.add(btnAceptar, gridBagConstraints);

        tablaListaContratos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaListaContratos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 850;
        gridBagConstraints.ipady = 356;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        btnAtras.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras_32.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setContentAreaFilled(false);
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras_32.png"))); // NOI18N
        btnAtras.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Atras_48.png"))); // NOI18N
        btnAtras.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        jPanel1.add(btnAtras, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        tablaListaContratos.setModel(admin.mostrarTablaContratos(txtBuscar.getText()));
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed

        frmContrato contrato = new frmContrato();
        contrato.show(false);
        
        int fila = tablaListaContratos.getSelectedRow();

        if (fila >= 0) {
            frmContrato.txtNumeroContrato.setText(tablaListaContratos.getValueAt(fila, 0).toString());
            frmContrato.txtProvincia.setText(tablaListaContratos.getValueAt(fila, 1).toString());
            frmContrato.txtCanton.setText(tablaListaContratos.getValueAt(fila, 2).toString());
            frmContrato.txtDireccion.setText(tablaListaContratos.getValueAt(fila, 3).toString());
            frmContrato.txtFecha.setText(tablaListaContratos.getValueAt(fila, 4).toString());
            frmContrato.txtNroDocumentoVendedor.setText(tablaListaContratos.getValueAt(fila, 5).toString());
            frmContrato.txtNroDocumentoCliente.setText(tablaListaContratos.getValueAt(fila, 6).toString());
            frmContrato.txtPlaca.setText(tablaListaContratos.getValueAt(fila, 7).toString());
            frmContrato.txtPrecio.setText(tablaListaContratos.getValueAt(fila, 8).toString());
            
            String[] datosAuto = new String[5];
            datosAuto = admin.obtenerDatosAutosVendidos(tablaListaContratos.getValueAt(fila, 7).toString());
            
            frmContrato.txtMarca.setText(datosAuto[0]);
            frmContrato.txtMotor.setText(datosAuto[1]);
            frmContrato.txtColor.setText(datosAuto[2]);
            frmContrato.txtMetraje.setText(datosAuto[3]);
            frmContrato.txtModelo.setText(datosAuto[4]);
            frmContrato.txtAnio.setText(datosAuto[5]);
            
            String[] datosVendedor = new String[3];
            datosVendedor = admin.obtenerDatosVendedor(tablaListaContratos.getValueAt(fila, 5).toString());

            frmContrato.txtNombreVendedor.setText(datosVendedor[0]);
            frmContrato.txtApellidosVendedor.setText(datosVendedor[1]);
            frmContrato.txtTipoDocumentoVendedor.setText(datosVendedor[2]);
            
            String[] datosCliente = new String[3];
            datosCliente = admin.obtenerDatosCliente(tablaListaContratos.getValueAt(fila, 6).toString());

            frmContrato.txtNombreCliente.setText(datosCliente[0]);
            frmContrato.txtApellidosCiente.setText(datosCliente[1]);
            frmContrato.txtTipoDocumentoCliente.setText(datosCliente[2]);
            
            frmContrato.btnGuardar.setVisible(false);
            
            this.show(false);
            contrato.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningun dato");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        frmProceso proceso = new frmProceso();

        if (tipoDeUsuario == 1) {
            proceso.btnRegistrarVendedores.setEnabled(false);
            proceso.menuRegistrarVendedor.setEnabled(false);
            proceso.menuVerVendedores.setEnabled(false);
            proceso.menuAutosVendidos.setEnabled(false);
        }

        proceso.show(true);
        this.show(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(frmListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmListaContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmListaContratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAceptar;
    public static javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tablaListaContratos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables

    class FondoPanel extends JPanel {
        private Image imagen;
        
        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/FondoListas.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}