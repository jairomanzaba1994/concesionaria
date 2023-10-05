/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Clases.Auto;
import Clases.Contrato;
import Clases.Login;
import Clases.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DESKTOP-TPC6SO4
 */
public class Administrador {
    
    public void crearLoginAdministradores(Login loginAdm) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "INSERT INTO loginadministradores (usuario, contrasenia) values (?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, loginAdm.getUsuario());
            consulta.setString(2, loginAdm.getContrasenia());
            
            consulta.executeUpdate();
            consulta.close();
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public boolean existeUsuarioAdministrativo(String usuarioIngresado) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        boolean usuariosIguales = false;
        String usuarioCapturado = null;
        
        try {
            String sql = "SELECT * FROM loginadministradores WHERE usuario=?";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuarioIngresado);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                usuarioCapturado = resultado.getString("usuario");
            } 
            
            if (usuarioIngresado.equals(usuarioCapturado)) {
                usuariosIguales = true;
            } else {
                usuariosIguales = false;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return usuariosIguales;
    }
    
    public void crearLoginVendedores(Login loginVendedores) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "INSERT INTO loginvendedores (usuario, contrasenia) values (?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, loginVendedores.getUsuario());
            consulta.setString(2, loginVendedores.getContrasenia());
            
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public boolean existeUsuarioVendedor(String usuarioIngresado) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        boolean usuariosIguales = false;
        String usuarioCapturado = null;
        
        try {
            String sql = "SELECT * FROM loginvendedores WHERE usuario=?";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuarioIngresado);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                usuarioCapturado = resultado.getString("usuario");
            } 
            
            if (usuarioIngresado.equals(usuarioCapturado)) {
                usuariosIguales = true;
            } else {
                usuariosIguales = false;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return usuariosIguales;
    }
    
    public void crearLoginOtrosUsuarios(Login loginOtrosUsuarios) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "INSERT INTO loginotrosusuarios (usuario, contrasenia) values (?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, loginOtrosUsuarios.getUsuario());
            consulta.setString(2, loginOtrosUsuarios.getContrasenia());
            
            consulta.executeUpdate();
            consulta.close();
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public boolean existeOtrosUsuarios(String usuarioIngresado) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        boolean usuariosIguales = false;
        String usuarioCapturado = null;
        
        try {
            String sql = "SELECT * FROM loginotrosusuarios WHERE usuario=?";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, usuarioIngresado);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                usuarioCapturado = resultado.getString("usuario");
            } 
            
            if (usuarioIngresado.equals(usuarioCapturado)) {
                usuariosIguales = true;
            } else {
                usuariosIguales = false;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return usuariosIguales;
    }
    
    public boolean compararContraseniasAdministradores(String usuario, String contraseniaIngresada) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String contraseniaCapturada = null;
        boolean contraseniasIguales = false;
       
        try {
            String sql = "SELECT contrasenia FROM loginadministradores WHERE usuario=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, usuario);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                contraseniaCapturada = resultado.getString("contrasenia");
            }
            
            if (contraseniaIngresada.equals(contraseniaCapturada)) {
                contraseniasIguales = true;
            } else {
                contraseniasIguales = false;
            }
  
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return contraseniasIguales;
    }

    
    public boolean compararContraseniasVendedores(String usuario, String contraseniaIngresada) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String contraseniaCapturada = null;
        boolean contraseniasIguales = false;
       
        try {
            String sql = "SELECT contrasenia FROM loginvendedores WHERE usuario=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, usuario);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                contraseniaCapturada = resultado.getString("contrasenia");
            }
            
            if (contraseniaIngresada.equals(contraseniaCapturada)) {
                contraseniasIguales = true;
            } else {
                contraseniasIguales = false;
            }
  
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return contraseniasIguales;
    }
    
    public boolean compararContraseniasOtrosUsuarios(String usuario, String contraseniaIngresada) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String contraseniaCapturada = null;
        boolean contraseniasIguales = false;
       
        try {
            String sql = "SELECT contrasenia FROM loginotrosusuarios WHERE usuario=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, usuario);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                contraseniaCapturada = resultado.getString("contrasenia");
            }
            
            if (contraseniaIngresada.equals(contraseniaCapturada)) {
                contraseniasIguales = true;
            } else {
                contraseniasIguales = false;
            }
  
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return contraseniasIguales;
    }
    
    public void registrarVendedor(Persona vendedor) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "INSERT INTO registrovendedores (nombres, apellidos, tipoDocumento, numeroDocumento, genero, correo, telefono) values (?, ?, ?, ?, ?, ?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, vendedor.getNombres());
            consulta.setString(2, vendedor.getApellidos());
            consulta.setString(3, vendedor.getTipoDocumento());
            consulta.setString(4, vendedor.getNumeroDocumento());
            consulta.setString(5, vendedor.getSexo());
            consulta.setString(6, vendedor.getCorreo());
            consulta.setString(7, vendedor.getTelefono());
            
            consulta.executeUpdate();
            consulta.close();
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public boolean existeVendedor(String numeroDocumentoIngresado) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        boolean usuariosIguales = false;
        String numeroDocumentoCapturado = null;
        
        try {
            String sql = "SELECT * FROM registrovendedores WHERE numeroDocumento=?";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, numeroDocumentoIngresado);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                numeroDocumentoCapturado = resultado.getString("numeroDocumento");
            } 
            
            if (numeroDocumentoIngresado.equals(numeroDocumentoCapturado)) {
                usuariosIguales = true;
            } else {
                usuariosIguales = false;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return usuariosIguales;
    }
    
    public boolean validarCedula(String cedulaIngresada) {
        boolean cedulaCorrecta = false;
 
        try {
 
            if (cedulaIngresada.length() == 10) {
                
                int tercerDigito = Integer.parseInt(cedulaIngresada.substring(2, 3));
                
                if (tercerDigito < 6) {
                    int[] coefValCedula = { 2, 1, 2, 1, 2, 1, 2, 1, 2 };
                    int verificador = Integer.parseInt(cedulaIngresada.substring(9,10));
                    int suma = 0;
                    int digito = 0;

                    for (int i = 0; i < (cedulaIngresada.length() - 1); i++) {
                        digito = Integer.parseInt(cedulaIngresada.substring(i, i + 1))* coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                                cedulaCorrecta = true;
                            } else {
                                cedulaCorrecta = false;
                            }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;    
    }
    
    public DefaultTableModel mostrarTablaVendedor(String valor){
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        
        String sql = "SELECT * FROM registrovendedores WHERE numeroDocumento LIKE '%" + valor + "%'";
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("Numero Documento");
        tabla.addColumn("Nombres");
        tabla.addColumn("Apellidos");
        tabla.addColumn("Tipo Documento");
        tabla.addColumn("Genero");
        tabla.addColumn("Telefono");
        tabla.addColumn("Correo");

        String[] datos = new String[7];
        
        try {
            consulta = conexion.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery(sql);
            
            while (resultado.next()){

                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                tabla.addRow(datos);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return tabla;
    }
    
    public void modificarVendedor(Persona vendedor) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "UPDATE registrovendedores SET nombres=?, apellidos=?, tipoDocumento=?, numeroDocumento=?, genero=?, correo=?, telefono=? WHERE numeroDocumento=?";
            
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, vendedor.getNombres());
            consulta.setString(2, vendedor.getApellidos());
            consulta.setString(3, vendedor.getTipoDocumento());
            consulta.setString(4, vendedor.getNumeroDocumento());
            consulta.setString(5, vendedor.getSexo());
            consulta.setString(6, vendedor.getCorreo());
            consulta.setString(7, vendedor.getTelefono());
            consulta.setString(8, vendedor.getNumeroDocumento());
            
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void eliminarVendedor(String datosFila) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "DELETE FROM registrovendedores WHERE numeroDocumento=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, datosFila);
            
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public DefaultTableModel mostrarTablaClientes(String valor){
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        
        String sql = "SELECT * FROM registroclientes WHERE numeroDocumento LIKE '%" + valor + "%'";
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("Numero Documento");
        tabla.addColumn("Nombres");
        tabla.addColumn("Apellidos");
        tabla.addColumn("Tipo Documento");
        tabla.addColumn("Genero");
        tabla.addColumn("Telefono");
        tabla.addColumn("Correo");

        String[] datos = new String[7];
        
        try {
            consulta = conexion.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery(sql);
            
            while (resultado.next()){

                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                tabla.addRow(datos);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return tabla;
    }
    
    public void registrarCliente(Persona cliente) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "INSERT INTO registroclientes (nombres, apellidos, tipoDocumento, numeroDocumento, genero, correo, telefono) values (?, ?, ?, ?, ?, ?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, cliente.getNombres());
            consulta.setString(2, cliente.getApellidos());
            consulta.setString(3, cliente.getTipoDocumento());
            consulta.setString(4, cliente.getNumeroDocumento());
            consulta.setString(5, cliente.getSexo());
            consulta.setString(6, cliente.getCorreo());
            consulta.setString(7, cliente.getTelefono());
            
            consulta.executeUpdate();
            consulta.close();
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public boolean existeCliente(String numeroDocumentoIngresado) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        boolean usuariosIguales = false;
        String numeroDocumentoCapturado = null;
        
        try {
            String sql = "SELECT * FROM registroclientes WHERE numeroDocumento=?";
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, numeroDocumentoIngresado);
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                numeroDocumentoCapturado = resultado.getString("numeroDocumento");
            } 
            
            if (numeroDocumentoIngresado.equals(numeroDocumentoCapturado)) {
                usuariosIguales = true;
            } else {
                usuariosIguales = false;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return usuariosIguales;
    }
    
    public void modificarCliente(Persona cliente) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "UPDATE registroclientes SET nombres=?, apellidos=?, tipoDocumento=?, numeroDocumento=?, genero=?, correo=?, telefono=? WHERE numeroDocumento=?";
            
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, cliente.getNombres());
            consulta.setString(2, cliente.getApellidos());
            consulta.setString(3, cliente.getTipoDocumento());
            consulta.setString(4, cliente.getNumeroDocumento());
            consulta.setString(5, cliente.getSexo());
            consulta.setString(6, cliente.getCorreo());
            consulta.setString(7, cliente.getTelefono());
            consulta.setString(8, cliente.getNumeroDocumento());
            
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void eliminarCliente(String datosFila) {
    
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "DELETE FROM registroclientes WHERE numeroDocumento=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, datosFila);
            
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public DefaultTableModel mostrarTablaAutos(String valor){
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta = null;
        
        String sql = "SELECT * FROM registroautos WHERE placa LIKE '%" + valor + "%'";
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("Placa");
        tabla.addColumn("Marca");
        tabla.addColumn("Motor");
        tabla.addColumn("Color");
        tabla.addColumn("Metraje");
        tabla.addColumn("Modelo");
        tabla.addColumn("Año");

        String[] datos = new String[7];
        
        try {
            consulta = conexion.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery(sql);
            
            while (resultado.next()){

                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                
                String fecha = resultado.getString(7);                
                String anio = fecha.substring(0, 4);
                
                datos[6] = anio;
                tabla.addRow(datos);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return tabla;
    }
    
    public void registrarAuto(Auto auto) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta = null;
        try {
            String sql = "INSERT INTO registroautos (placa, marca, motor, color, metraje, modelo, anio) values (?, ?, ?, ?, ?, ?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, auto.getPlaca());
            consulta.setString(2, auto.getMarca());
            consulta.setString(3, auto.getMotor());
            consulta.setString(4, auto.getColor());
            consulta.setInt(5, auto.getMetraje());
            consulta.setString(6, auto.getModelo());
            consulta.setString(7, auto.getAnio());
            
            consulta.executeUpdate();
            consulta.close();
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public boolean existeAuto(String placaIngresada) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        boolean usuariosIguales = false;
        String placaCapturada = null;
        
        try {
            String sql = "SELECT * FROM registroautos WHERE placa=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, placaIngresada);
            
            ResultSet resultado = consulta.executeQuery();
            if (resultado.next()) {
                placaCapturada = resultado.getString("placa");
            } 
            
            if (placaIngresada.equals(placaCapturada)) {
                usuariosIguales = true;
            } else {
                usuariosIguales = false;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return usuariosIguales;
    }
    
    public void modificarAuto(Auto auto) {
 
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "UPDATE registroautos SET placa=?, marca=?, motor=?, color=?, metraje=?, modelo=?, anio=? WHERE placa=?";
            
            consulta = conexion.prepareStatement(sql);
            consulta.setString(1, auto.getPlaca());
            consulta.setString(2, auto.getMarca());
            consulta.setString(3, auto.getMotor());
            consulta.setString(4, auto.getColor());
            consulta.setInt(5, auto.getMetraje());
            consulta.setString(6, auto.getModelo());
            consulta.setString(7, auto.getAnio());
            consulta.setString(8, auto.getPlaca());
            
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public void eliminarAuto(String datosFila) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "DELETE FROM registroautos WHERE placa=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, datosFila);
            
            consulta.executeUpdate();
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public String[] obtenerDatosAuto(String placa) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String datos[] = new String[6] ;
       
        try {
            String sql = "SELECT marca, motor, color, metraje, modelo, anio FROM registroautos WHERE placa=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, placa);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                datos[0] = resultado.getString("marca");
                datos[1] = resultado.getString("motor");
                datos[2] = resultado.getString("color");
                datos[3] = resultado.getString("metraje");
                datos[4] = resultado.getString("modelo");
                
                String fecha = resultado.getString("anio");                
                String anio = fecha.substring(0, 4);
                
                datos[5] = anio;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }
    
    public String[] obtenerDatosVendedor(String numeroDocumento) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String datos[] = new String[3] ;
       
        try {
            String sql = "SELECT nombres, apellidos, tipoDocumento FROM registrovendedores WHERE numeroDocumento=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, numeroDocumento);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                datos[0] = resultado.getString("nombres");
                datos[1] = resultado.getString("apellidos");
                datos[2] = resultado.getString("tipoDocumento");
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }
    
    public String[] obtenerDatosCliente(String numeroDocumento) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String datos[] = new String[3] ;
       
        try {
            String sql = "SELECT nombres, apellidos, tipoDocumento FROM registroclientes WHERE numeroDocumento=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, numeroDocumento);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                datos[0] = resultado.getString("nombres");
                datos[1] = resultado.getString("apellidos");
                datos[2] = resultado.getString("tipoDocumento");
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }
    
    public void registrarContrato(Contrato contrato) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        try {
            String sql = "INSERT INTO registrocontratos (provincia, canton, direccion, fecha, numeroDocVendedor, numeroDocCliente, placaVehiculo, precio) values (?, ?, ?, ?, ?, ?, ?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, contrato.getProvincia());
            consulta.setString(2, contrato.getCanton());
            consulta.setString(3, contrato.getDireccion());
            consulta.setString(4, contrato.getFecha());
            consulta.setString(5, contrato.getNumeroDoc_vendedor());
            consulta.setString(6, contrato.getNumeroDoc_cliente());
            consulta.setString(7, contrato.getPlaca_vehiculo());
            consulta.setString(8, String.valueOf(contrato.getPrecio()));
            
            consulta.executeUpdate();
            consulta.close();
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public DefaultTableModel mostrarTablaContratos(String valor){
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta = null;
        
        String sql = "SELECT * FROM registrocontratos WHERE numeroContrato LIKE '%" + valor + "%'";
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("Nro. Contrato");
        tabla.addColumn("Provincia");
        tabla.addColumn("Cantón");
        tabla.addColumn("Dirección");
        tabla.addColumn("Fecha");
        tabla.addColumn("Nro. Doc. Vendedor");
        tabla.addColumn("Nro. Doc. Cliente");
        tabla.addColumn("Placa");
        tabla.addColumn("Precio");

        String[] datos = new String[9];
        
        try {
            consulta = conexion.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery(sql);
            
            while (resultado.next()){

                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                datos[8] = resultado.getString(9);
                
                tabla.addRow(datos);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return tabla;
    }
    
    public String obtenerNumeroContrato(String placa) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String dato = null;
       
        try {
            String sql = "SELECT numeroContrato FROM registrocontratos WHERE placaVehiculo=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, placa);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                dato = resultado.getString("numeroContrato");
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return dato;
    }
    
    public void registrarAutoVendido(Auto auto) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta = null;
        try {
            String sql = "INSERT INTO autosvendidos (placa, marca, motor, color, metraje, modelo, anio) values (?, ?, ?, ?, ?, ?, ?)";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, auto.getPlaca());
            consulta.setString(2, auto.getMarca());
            consulta.setString(3, auto.getMotor());
            consulta.setString(4, auto.getColor());
            consulta.setInt(5, auto.getMetraje());
            consulta.setString(6, auto.getModelo());
            consulta.setString(7, auto.getAnio());
            
            consulta.executeUpdate();
            consulta.close();
            
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public DefaultTableModel mostrarTablaAutosVendidos(String valor){
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta = null;
        
        String sql = "SELECT * FROM autosVendidos WHERE placa LIKE '%" + valor + "%'";
        
        DefaultTableModel tabla = new DefaultTableModel();
        
        tabla.addColumn("Placa");
        tabla.addColumn("Marca");
        tabla.addColumn("Motor");
        tabla.addColumn("Color");
        tabla.addColumn("Metraje");
        tabla.addColumn("Modelo");
        tabla.addColumn("Año");

        String[] datos = new String[7];
        
        try {
            consulta = conexion.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery(sql);
            
            while (resultado.next()){

                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                
                String fecha = resultado.getString(7);                
                String anio = fecha.substring(0, 4);
                
                datos[6] = anio;
                tabla.addRow(datos);
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return tabla;
    }
    
    public String[] obtenerDatosAutosVendidos(String placa) {
        Connection conexion = Conectar.getConnection();
        PreparedStatement consulta;
        String datos[] = new String[6] ;
       
        try {
            String sql = "SELECT marca, motor, color, metraje, modelo, anio FROM autosvendidos WHERE placa=?";
            consulta = conexion.prepareStatement(sql);
            
            consulta.setString(1, placa);
            
            ResultSet resultado = consulta.executeQuery();
            
            if (resultado.next()) {
                datos[0] = resultado.getString("marca");
                datos[1] = resultado.getString("motor");
                datos[2] = resultado.getString("color");
                datos[3] = resultado.getString("metraje");
                datos[4] = resultado.getString("modelo");
                
                String fecha = resultado.getString("anio");                
                String anio = fecha.substring(0, 4);
                
                datos[5] = anio;
            }
            
            consulta.close();
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        return datos;
    }
}
