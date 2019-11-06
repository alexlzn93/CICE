package ejemplo.java;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca nombre producto: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduzca precio producto: ");
		double precio = teclado.nextDouble();
		System.out.print("Introduzca iva producto: ");
		double iva = teclado.nextDouble();
		double total = precio + (precio * iva / 100);
		System.out.println("Nombre producto: " + nombre);
		System.out.println("Precio total: " + total);
		teclado.close();
	}

}
