/*
 * Ejercicio 05 - Crea un programa que realice lo siguiente:
 * Declara una variable a de tipo entero y asignale un valor. A continuación muestra un mensaje por consola
 * indicando si el valor de la  variable es par o impar, positivo o negativo, multiplo de 5, multiplo de 10
 * y si es mayor o menor que 100
 */
package com.cice.basico;

/**
 *
 * @author ggamboa
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declara un variable a entera y asigna valor
        int a = 85;
        
        if(a%2 == 0){
            System.out.println("El numero " + a + " es par.");
        }else {
            System.out.println("El numero " + a + " es impar.");
        }
        
        if(a >= 0){
            System.out.println("El numero " + a + " es positivo");
        } else {
            System.out.println("El numero " + a + " es negativo");
        }
        
        if(a%5 == 0 ){
            System.out.println("El numero " + a + " es multiplo de 5");
        }else{
            System.out.println("El numero " + a + " no es multiplo de 5");
        }
        
        if(a%10 == 0){
            System.out.println("El numero " + a + " es multiplo de 10");
        }else{
            System.out.println("El numero " + a + " no es multiplo de 10");
        }
        
        if(a > 100){
            System.out.println("El numero " + a + " es mayor que 100");
        } else if(a == 100){
            System.out.println("El numero " + a + " es igual a 100");
        } else {
            System.out.println("El numero " + a + " es menor que 100");
        }
    }
    
}
