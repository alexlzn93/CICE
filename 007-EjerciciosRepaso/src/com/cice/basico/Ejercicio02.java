/*
 * Ejercicio 02 - Crea un programa que realice lo siguiente:
 * Declara dos variables X e Y de tiepo entero, 2 variables M y N de tipo decimal. Asignales un valor.
 * Pinta por consola todas las operaciones matemáticas que se te ocurran entre ellas.
 */
package com.cice.basico;

/**
 *
 * @author ggamboa
 */
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaro e inicializo 2 variables enteras
        int a = 23;
        int b = 12;
        //Declaro e inicializo 2 variables decimales
        double m = 4.17;
        double n = 1.75;
        
        //Operaciones matematicas entre ellas
        
        System.out.println("a + n = " + (a+n));
        System.out.println("n + m + a + b = " + (n + m + a + b));
        
        System.out.println("m + (a - n) * (b / m) = " +(m+(a-n)*(b/m)));
        System.out.println("m * n / (a + (m * b)) = " + (m*n/(a + (m*b))));
        
        
    }
    
}
