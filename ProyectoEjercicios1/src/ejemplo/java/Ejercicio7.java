package ejemplo.java;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intoducir texto: ");
		String texto = teclado.nextLine();
		String cadena = "";
		for (int t = texto.length() - 1; t >= 0; t--) {
			cadena += texto.charAt(t);
		}
		System.out.println("Texto invertido: " + cadena);
	}

}
