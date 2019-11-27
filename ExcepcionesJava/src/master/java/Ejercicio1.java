package master.java;

import java.util.Scanner;

import master.java.excepciones.MiExcepcion;

public class Ejercicio1 {

	static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		teclado = new Scanner(System.in);
		System.out.println("Primer numero:");
		int primero=teclado.nextInt();
		System.out.println("Segundo numero:");
		int segundo=teclado.nextInt();
		try {
		
		if (segundo==0) {
			throw new MiExcepcion("Error division por 0"); //throw lo que hace es lanzar excepciones
		}
		}catch (MiExcepcion me) {
			System.out.println(me.getMessage());
			me.printStackTrace(); //muestra desde donde se a producido el error 
		}
	}

}
