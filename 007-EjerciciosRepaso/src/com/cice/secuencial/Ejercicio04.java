/*
 * Ejercicio 04 -
 * Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 */
package com.cice.secuencial;

import java.util.Scanner;

/**
 *
 * @author ggamboa
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //declaramos las variables a usar
        int numeroDado = 0;
        Scanner sc = new Scanner(System.in);
        
        //solicitar el numero al usuario
        System.out.print("Introduce el numero de 3 cifras: ");
        numeroDado = sc.nextInt();
        
        String cadena = String.valueOf(numeroDado);
        
        for(int i = 0; i<cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
        
    }
    
}
