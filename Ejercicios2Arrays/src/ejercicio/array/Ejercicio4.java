package ejercicio.array;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Texto: ");
		String texto = teclado.nextLine();
		String[] palabras = texto.split(" ");
		for (int k = 0; k < palabras.length; k++) {
			if (palabras[k].length() > 3) {
				System.out.println(palabras[k]);
			}
		}
	}

}
