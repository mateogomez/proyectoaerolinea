/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author mateo
 */
public class ClsReserva implements Serializable {

    String tipoVuelo;
    String numerovuelo;
    String fecha;
    String[] pasajero;
    String promocion;
    double pesoEquipaje;
    String seguro;
    String checkin;
    double valorTotal;
    String idReserva;
    String estadoPago;
    String numeroSilla;
    String cedulacliente;
    ClsUsuario acompanante1;
    ClsUsuario acompanante2;

    public ClsReserva(String tipoVuelo, String numerovuelo, String fecha, String[] pasajero, String promocion, double pesoEquipaje, String seguro, String checkin, double valorTotal, String idReserva, String estadoPago, String numeroSilla, String cedulacliente, ClsUsuario acompanante1, ClsUsuario acompanante2) {
        this.tipoVuelo = tipoVuelo;
        this.numerovuelo = numerovuelo;
        this.fecha = fecha;
        this.pasajero = pasajero;
        this.promocion = promocion;
        this.pesoEquipaje = pesoEquipaje;
        this.seguro = seguro;
        this.checkin = checkin;
        this.valorTotal = valorTotal;
        this.idReserva = idReserva;
        this.estadoPago = estadoPago;
        this.numeroSilla = numeroSilla;
        this.cedulacliente = cedulacliente;
        this.acompanante1 = acompanante1;
        this.acompanante2 = acompanante2;
    }

    public String getTipoVuelo() {
        return tipoVuelo;
    }

    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }

    public String getNumerovuelo() {
        return numerovuelo;
    }

    public void setNumerovuelo(String numerovuelo) {
        this.numerovuelo = numerovuelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String[] getPasajero() {
        return pasajero;
    }

    public void setPasajero(String[] pasajero) {
        this.pasajero = pasajero;
    }

    public String getPromocion() {
        return promocion;
    }

    public void setPromocion(String promocion) {
        this.promocion = promocion;
    }

    public double getPesoEquipaje() {
        return pesoEquipaje;
    }

    public void setPesoEquipaje(double pesoEquipaje) {
        this.pesoEquipaje = pesoEquipaje;
    }

    public String getSeguro() {
        return seguro;
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(String idReserva) {
        this.idReserva = idReserva;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public String getNumeroSilla() {
        return numeroSilla;
    }

    public void setNumeroSilla(String numeroSilla) {
        this.numeroSilla = numeroSilla;
    }

    public String getCedulacliente() {
        return cedulacliente;
    }

    public void setCedulacliente(String cedulacliente) {
        this.cedulacliente = cedulacliente;
    }

    public ClsUsuario getAcompanante1() {
        return acompanante1;
    }

    public void setAcompanante1(ClsUsuario acompanante1) {
        this.acompanante1 = acompanante1;
    }

    public ClsUsuario getAcompanante2() {
        return acompanante2;
    }

    public void setAcompanante2(ClsUsuario acompanante2) {
        this.acompanante2 = acompanante2;
    }

    
}
