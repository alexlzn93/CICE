package ejercicio.array;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Texto: ");
		String texto = teclado.nextLine();
		String capitalizado = "";
		String[] palabras = texto.split(" ");
		// eSTE tExto se tIEne que caPItaLizar
		// Este Texto Se Tiene Que Capitalizar 
		for (int b = 0; b < palabras.length; b++) {
			capitalizado += palabras[b].toUpperCase().charAt(0) + 
					        palabras[b].toLowerCase().substring(1) + " "; 
		}
		capitalizado = capitalizado.trim();
		System.out.println(capitalizado);
	}

}
