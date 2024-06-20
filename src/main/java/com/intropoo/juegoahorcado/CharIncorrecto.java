/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intropoo.juegoahorcado;

/**
 *
 * @author mateo
 */
public class CharIncorrecto extends Exception {
    // Creando el constructor con el mensaje de error personalizado
    public CharIncorrecto() {
        super("Error: La cadena de texto ingresada debe tener 1 solo caracter. Inténtelo de nuevo");
    }
}
