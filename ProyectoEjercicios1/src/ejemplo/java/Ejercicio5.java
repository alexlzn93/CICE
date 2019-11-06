package ejemplo.java;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intoducir texto: ");
		String texto = teclado.nextLine();
		// Esto es Un textO pOr tEclado
		byte vocales = 0;
		for (int b = 0; b < texto.length(); b++) {
			char letra = texto.charAt(b);
			switch (letra) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vocales++;
			}
		}
		System.out.println("Numero de vocales: " + vocales);
	}

}
