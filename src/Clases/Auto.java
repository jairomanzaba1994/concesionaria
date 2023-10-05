/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author DESKTOP-TPC6SO4
 */
public class Auto {
    private String placa;
    private String marca;
    private String motor;
    private String color;
    private int metraje;
    private String modelo;
    private String anio;

    public Auto(String placa, String marca, String motor, String color, int metraje, String modelo, String anio) {
        this.placa = placa;
        this.marca = marca;
        this.motor = motor;
        this.color = color;
        this.metraje = metraje;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMetraje() {
        return metraje;
    }

    public void setMetraje(int metraje) {
        this.metraje = metraje;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }
    
        
}
