/*
 * Ejercicio 01 -
 * Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit. 
 * La fórmula correspondiente es: F = 32 + ( 9 * C / 5)
 */
package com.cice.secuencial;

import java.util.Scanner;

/**
 *
 * @author ggamboa
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declarar las variables a utilizar
        int cen;
        int fah;
        int opcion = 0;
        Scanner sc = new Scanner(System.in);
        
        //mostarmos al usuario el menu contextual
        do {
            
            System.out.println("EJERCICIO 01");
            System.out.println("============");
            
            System.out.print("Introduce un grado centigrado o introduce 0 para salir: ");
            cen = sc.nextInt();
            
            //Esto nos va a aayudar a salir del programa o no
            opcion = cen;
            
            if (opcion != 0){
                System.out.println("El resultaldo en Fahrenheit es: " + (32 + ( 9 * cen / 5)));
            }else{
                System.out.println("Hasta Pronto!!");
            }
        }while(opcion != 0);
        
    }
    
}
