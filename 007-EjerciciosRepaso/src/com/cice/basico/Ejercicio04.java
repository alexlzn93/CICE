/*
 * Ejercicio 04 - Crea un programa que realice lo siguiente:
 * Declara 4 variables de tipo entero y asignales un valor. Inmediatamente despues haz 
 * las operaciones necesarias para que B tome el valor de C, C el valor de A, A tome el valor de D y
 * D tome el valor de B.
 */
package com.cice.basico;

/**
 *
 * @author ggamboa
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro 4 variables de tipo entero
        int a = 4;
        int b = 24;
        int c = 3;
        int d = 25;
        int auxiliar;
        
        // a = 25
        // b = 3
        // c = 4
        // d = 24
        
        auxiliar = d;
        d = b;
        b = c;
        c = a;
        a = auxiliar;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
    
}
