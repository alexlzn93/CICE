package Ejercicios;

import java.util.Scanner;

/*Realizar un programa que solicite un número con punto decimal en formato texto y, solicite un nuevo
numero para indicar el número de decimales a redondear y, mostrar en pantalla el número introducido con
el redondeo en los decimales especificados.*/
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 1245.2353

		Scanner entrada=new Scanner (System.in);
		System.out.println("Introduzca un numero decimal");
	    String numero= entrada.nextLine();	
	    System.out.println("Introduzca numero de decimales a redondear");
	    int  decimales= entrada.nextInt();	
	    double doble = Double.parseDouble(numero);
	    int redondeo=(int)Math.round((doble *100)/100);
	    
	     System.out.println(redondeo);
	}

}
