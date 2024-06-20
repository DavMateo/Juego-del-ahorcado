/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intropoo.juegoahorcado;

/**
 *
 * @author mateo
 */
public class OpcionInvalida extends Exception {
    // Creando el constructor con el mensaje de error personalizado
    public OpcionInvalida() {
        super("Error: La opción ingresada es inválida. Inténtelo de nuevo");
    }
}