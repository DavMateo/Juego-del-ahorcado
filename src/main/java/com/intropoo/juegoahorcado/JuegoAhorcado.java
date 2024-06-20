/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.intropoo.juegoahorcado;

// Importando las librerías necesarias
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
import java.text.MessageFormat;


/**
 *
 * @author mateo
 */

/**
 * 
 * Este programa consiste en el juego conocido como El Ahorcado en el cuál se va
 * dibujando un stickman colgado de una soga a medida que el jugador se vaya
 * equivocando en adivinar una palabra.
 * 
 * El jugador tiene tres oportunidades para adivinar una palabra, si falla, 
 * el juego se acabará pero si adivina la palabra, esta se elimina del programa
 * y se le restauran las 3 vidas al jugador.
 */
public class JuegoAhorcado {
    
    public static void main(String[] args) {
        // CREANDO LA FUNCIONALIDAD DEL MENÚ
        Menu menu = new Menu(); //Creando el objeto menu
        
        // Solicitando información mediante un manejador de errores
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("3. Eliga una opción: ");
            
            // Evaluar todas las opciones de juego
            switch(sc.nextInt()) {
                case 1:
                    JuegoAhorcado principal = new JuegoAhorcado(); //Crear instancia para llamar a funciones fuera de la función principal
                    String[] lstResultadoJuego = principal.juego();
                    
                    // Condicional para determinar el estado del juego
                    if(lstResultadoJuego[0] == "0") {
                        System.out.println(
                            MessageFormat.format("\n\n¡Has perdido!\nLa palabra correcta era: {0}", lstResultadoJuego[1])
                        );
                        
                    } else {
                        System.out.println(
                            MessageFormat.format("\n\n¡Has ganado!\nLa palabra adivinada fue: {0}", lstResultadoJuego[1])
                        );
                    }
                    break;
                
                case 2:
                    // Mostrar al usuario un mensaje de despedida
                    System.out.println("\n\n¡Gracias por usar el programa!");
                    sc.close();
                    break;
                    
                default:
                    // Lanzar un error personalizado en caso de que ninguna opción anterior sea verdadera.
                    throw new OpcionInvalida();
            }
            
        } catch(OpcionInvalida e) {
            
            
        } finally {
            
        }
    }
    
    
    public ArrayList<String> representGrafica(String palabraSeleccionada) {
        int count = 0;
        ArrayList<String> lstEspaciosLetras = new ArrayList<>();
        
        while(count < palabraSeleccionada.length()) {
            lstEspaciosLetras.add("_ ");
            count++;
        }
        
        return lstEspaciosLetras;
    }
    
    
    public String[] juego() {
        // Definiendo las instancias de los objetos necesarios
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        
        // Definiendo las variables principales
        int vidas = 3;
        int cantErrores = 0;
        String palabraSeleccionada;
        String[] lstRespuesta = new String[2];  //El índice 0 corresponde al estado del juego ("0" o "1"), el índice 1 a la palabra correcta
        String[] lstPalabras = {"Guitarra", "Computador", "Musica", "Hablar", "Cantar", "Teclado", "Responsabilidad"};
        ArrayList<String> lstLetrasIngresadas = new ArrayList<>(); //Guardará todas las letras ingresadas por el usuario
        int numeroAleatorio = random.nextInt(lstPalabras.length);
        Renderizado render = new Renderizado();
        
        
        // Código principal del juego
        // Elije una palabra al azar según la longitud de la lista
        palabraSeleccionada = lstPalabras[numeroAleatorio];
        render.setLstEspaciosxPalabra(representGrafica(palabraSeleccionada));
        
        
        // Ciclo infinito hasta que las vidas sean igual a 0 o el jugador gane
        while(vidas >= 1 && vidas <= 3) {
            try {
                System.out.print("\nInserta una letra: ");
                String caracter = sc.nextLine();
                
                // Validar si el caracter agregado es único
                if(caracter.length() == 1) {
                    // Verificar si hay coincidencias con el caracter ingresado
                    
                    
                    // Agrega el caracter a la lista y restablece el contador de errores a cero.
                    lstLetrasIngresadas.add(caracter);
                    cantErrores = 0;
                    
                    // Actualizar la visualización de espacios
                    
                } else {
                    // Lanzar un error personalizado en caso de que ninguna opción anterior sea verdadera.
                    throw new CharIncorrecto();
                }
                
            } catch(CharIncorrecto e) {
                if(cantErrores <= 3) {
                    cantErrores++;
                    continue;
                    
                } else {
                    //Rompe con el ciclo while si hay más de 3 errores cometidos seguidamente
                    System.out.println("Error: Se ha alcanzado el límite de intentos posibles, saliendo...");
                    break;
                }
                
            } finally {
            
            }
        }
        
        
        // Valor de retorno según el resultado final
        return lstRespuesta;
    }
}