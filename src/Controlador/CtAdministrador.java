/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ClsAdministrador;

/**
 *
 * @author mateo
 */
public class CtAdministrador {

    public String buscarCedula(String nombre, ClsAdministrador administrador) {
        String caracter = null;
        if (nombre.equals(administrador.getUsuario())) {
            caracter = nombre;
        }
        return caracter;

    }
}
