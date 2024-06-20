/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.intropoo.juegoahorcado;

// Importando las librerías necesarias
import java.util.ArrayList;

/**
 *
 * @author mateo
 */
public class Renderizado {
    // Definiendo los atributos
    private int indexPosicion = -1;
    private ArrayList<String> lstEspaciosxPalabra = new ArrayList<>(); //Tendrá los espacios de una palabra y se irá reemplazando
    
    
    // Definiendo los constructores
    public Renderizado() {
        
    }
    
    public Renderizado(int indexPosicion, ArrayList<String> lstEspaciosxPalabra, ArrayList<String> lstLetrasIngresadas) {
        this.indexPosicion = indexPosicion;
        this.lstEspaciosxPalabra = lstEspaciosxPalabra;
    }
    
    
    // Definiendo los Getters y Setters
    public int getIndexPosicion() {
        return indexPosicion;
    }
    public void setIndexPosicion(int indexPosicion) {
        this.indexPosicion = indexPosicion;
    }
    
    
    public ArrayList<String> getLstEspaciosxPalabra() {
        return lstEspaciosxPalabra;
    }
    public void setLstEspaciosxPalabra(ArrayList<String> lstEspaciosxPalabra) {
        this.lstEspaciosxPalabra = lstEspaciosxPalabra;
    }
}
