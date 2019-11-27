/*
 * Ejercicio 05 -
 * Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) 
 * y calcule su número de la suerte. 
 * Ejemplo: 12/07/1980 -> 12 + 7 + 1980 -> 1999 -> 1 + 9 + 9 + 9 -> 28
 */
package com.cice.secuencial;

import java.util.Scanner;

/**
 *
 * @author ggamboa
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro mis variables
        String fecha;
        int suerte = 0;
        int resultado = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce tu fecha de nacimiento (31/12/1990): ");
        fecha = sc.nextLine();
        
        String[] datos = fecha.split("/");
        
        //punto de control
        //System.out.println("INFO: el tamaño del array es: " + datos.length);
        
        for(String dato : datos){
            suerte += Integer.parseInt(dato);
        }
        
        //punto de control
        //System.out.println("INFO: suerte vale: " + suerte);
        
        //volver a convertir el numero suerte en un string
        String aux = String.valueOf(suerte);
        
        for (int i = 0; i < aux.length(); i++){
            String ch = String.valueOf(aux.charAt(i));
            resultado += Integer.parseInt(ch);
        }
        
        System.out.println("Tu número de la suerte es: " + resultado);
        
    }
    
}
