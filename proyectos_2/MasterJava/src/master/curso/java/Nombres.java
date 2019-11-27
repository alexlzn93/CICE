package master.curso.java;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un nombre: ");
		String nombre = teclado.nextLine();
		System.out.println("Numero de letras: " + nombre.length());
		System.out.println("Nombre: " + nombre.toUpperCase());
	}

}
