package ejemplo.java;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intoducir numero: ");
		String texto = teclado.nextLine();
		String entero = texto.substring(0, texto.indexOf("."));
		String decimal = texto.substring(texto.indexOf(".") + 1);
		System.out.println("Parte entera: " + entero);
		System.out.println("Parte decimal: " + decimal);
		//version2();
	}

	public static void version2() {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intoducir numero: ");
		String texto = teclado.nextLine();
		System.out.println("Parte entera: " + texto.split("\\.")[0]);
		System.out.println("Parte decimal: " + texto.split("\\.")[1]);
	}
	
}
