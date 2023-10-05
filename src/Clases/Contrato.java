/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author DESKTOP-TPC6SO4
 */
public class Contrato {
    private int numeroContrato;
    private String provincia;
    private String canton;
    private String direccion;
    private String fecha;
    private String numeroDoc_vendedor;
    private String numeroDoc_cliente;
    private String placa_vehiculo;
    private double precio;
    
    public Contrato() {
        
    }

    public Contrato(int numeroContrato, String provincia, String canton, String direccion, String fecha, String numeroDoc_vendedor, String numeroDoc_cliente, String placa_vehiculo, double precio) {
        this.numeroContrato = numeroContrato;
        this.provincia = provincia;
        this.canton = canton;
        this.direccion = direccion;
        this.fecha = fecha;
        this.numeroDoc_vendedor = numeroDoc_vendedor;
        this.numeroDoc_cliente = numeroDoc_cliente;
        this.placa_vehiculo = placa_vehiculo;
        this.precio = precio;
    }

    public int getNumeroContrato() {
        return numeroContrato;
    }

    public void setNumeroContrato(int numeroContrato) {
        this.numeroContrato = numeroContrato;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getFecha() {
        return fecha;
    }
//
//    public void setFecha(String fecha) {
//        this.fecha = fecha;
//    }

    public String getNumeroDoc_vendedor() {
        return numeroDoc_vendedor;
    }

    public void setNumeroDoc_vendedor(String numeroDoc_vendedor) {
        this.numeroDoc_vendedor = numeroDoc_vendedor;
    }

    public String getNumeroDoc_cliente() {
        return numeroDoc_cliente;
    }

    public void setNumeroDoc_cliente(String numeroDoc_cliente) {
        this.numeroDoc_cliente = numeroDoc_cliente;
    }

    public String getPlaca_vehiculo() {
        return placa_vehiculo;
    }

    public void setPlaca_vehiculo(String placa_vehiculo) {
        this.placa_vehiculo = placa_vehiculo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String fecha(){
        Calendar fecha = Calendar.getInstance();
        DateFormat formatoFecha = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy"); 
        java.util.Date fechaActual = fecha.getTime();        
        this.fecha = formatoFecha.format(fechaActual);        
        
        return this.fecha;
    }
}
