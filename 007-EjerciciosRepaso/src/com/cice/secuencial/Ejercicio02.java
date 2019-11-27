/*
 * Ejercicio 02 -
 * Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
 */
package com.cice.secuencial;

import java.util.Scanner;

/**
 *
 * @author ggamboa
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos la variables a utilizar
        Scanner sc = new Scanner(System.in);
        int velKmh = 0;
        int velMs = 0;
        int opcion = 0;
        
        do {
            
            System.out.println("EJERCICIO 02");
            System.out.println("============");
            
            System.out.print("Introduce una velocidad en Km/h, o introduce 0 para salir: ");
            velKmh = sc.nextInt();
            
            //Control del bucle
            opcion = velKmh;
            
            if(opcion != 0){
                
                //1 km = 1000m
                //1 h = 3600s
                //1km / 1h -> 1m / 1s -> velKm * 1000 / 3600 -> velMs
                
                velMs = velKmh * 1000 / 3600;
                
                System.out.println("Tu conversión de velocidad es: " + velMs + "m/s");
            } else {
                System.out.println("Hasta Pronto!!!");
            }
            
            
        } while(opcion != 0);
        
    }
    
}
