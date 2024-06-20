/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intropoo.juegoahorcado;

// Importanto las librerias necesarias
import java.util.Scanner;

/**
 *
 * @author mateo
 */
public class Menu {
    // Definiendo los atributos
    private int opElegido;
    
    
    // Definiendo los constructores
    public Menu() {
        System.out.println("=========================");
        System.out.println("=== JUEGO EL AHORCADO ===");
        System.out.println("=========================");
        
        System.out.println("\nOpciones:");
        System.out.println("1. Jugar\n2. Salir");
    }
    
    public Menu(int opElegido) {
        this.opElegido = opElegido;
    }
    
    
    // Creando los Getters y Setters
    public int getOpElegido() {
        return opElegido;
    }
    public void setOpElegido(int opElegido) {
        this.opElegido = opElegido;
    }
}
