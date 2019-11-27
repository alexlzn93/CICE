/*
 * Ejercicio 01 - 
 * 
 * Programa una aplicación qque realice lo siguiente:
 * Declara tres variables, un entero, un decimal y un caracter y asignales un valor correcto
 * Pinta por consola el valor de cada variable concatenado con el nombre de cada una.
 * Pinta por consola los calculos del (entero + el decimal) y (decimal - entero)
 */
package com.cice.basico;

/**
 *
 * @author ggamboa
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos las variables solicitadas y asignamos valores validos,
        int entero = 23;
        float decimal = 1.15f;
        char caracter = 's';
        
        //pintamos por consola los valores
        System.out.println("El valor de la variable entera es: " + entero);
        System.out.println("El valor de la variable decimal es: " + decimal);
        System.out.println("El valor de la variable caracter es: " + caracter);
        
        //pintamos el valor de las operaciones
        System.out.println("El resultado de entero + decimal es = " + (entero + decimal));
        System.out.println("El resutlado de decimal - entero es = " + (decimal - entero));
        
        
    }
    
}
