/*
 * Ejercicio 03 -
 * Programa que calcula el área de un triángulo a partir de la longitud de sus lados.
 * Calculo del area de un triangulo dados sus tres lados
 * Raiz cuadrada [p ( p - a )( p - b )( p - c)]
 * p = ( a + b + c ) / 2
 */
package com.cice.secuencial;

import java.util.Scanner;

/**
 *
 * @author ggamboa
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaramos las variables,
        double a, b, c;
        double area;
        double p;
        
        Scanner sc = new Scanner(System.in);
        
        //Pedimos los valores de los lados del triangulo
        System.out.print("Introduce el valor del lado1: ");
        a = sc.nextInt();
        
        System.out.print("Introduce el valor del lado2: ");
        b = sc.nextInt();
        
        System.out.print("Introduce el valor del lado3: ");
        c = sc.nextInt();
        
        p = (a + b + c) / 2;
        area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        
        System.out.println("El area del triangulo dados sus tres lados es: " + area);
        
    }
    
}
