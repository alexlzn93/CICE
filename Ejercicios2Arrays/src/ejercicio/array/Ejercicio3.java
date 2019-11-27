package ejercicio.array;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nombres = new String[5];
		for (int indice = 0; indice < nombres.length; indice++) {
			System.out.print("Introduzca nombre: ");
			nombres[indice] = teclado.nextLine();
		}
		int empiezaP = 0; 
		int finalizaA = 0;
		for (int x = 0; x < nombres.length; x++) {
			if (nombres[x].toLowerCase().startsWith("p")) {
				empiezaP++;
			}
			if (nombres[x].toLowerCase().endsWith("a")) {
				finalizaA++;
			}
		}
		System.out.println("Nombres que empiezan por P o p = " + empiezaP); 
		System.out.println("Nombres que finalizan en A o a = " + finalizaA);
		for (int x = 0; x < nombres.length; x++) {
			if (nombres[x].length() > 5) {
				System.out.println(nombres[x]);
			}
		}
	}

}
