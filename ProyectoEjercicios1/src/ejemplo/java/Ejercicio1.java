package ejemplo.java;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca un nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Introduzca nota 1: ");
		double nota1 = teclado.nextDouble();
		System.out.print("Introduzca nota 2: ");
		double nota2 = teclado.nextDouble();
		System.out.print("Introduzca nota 3: ");
		double nota3 = teclado.nextDouble();
		double notaMedia = (nota1 + nota2 + nota3) / 3;
		System.out.println("Nombre alumno: " + nombre);
		System.out.println("La nota media es: " + notaMedia);
		teclado.close();
	}

}
