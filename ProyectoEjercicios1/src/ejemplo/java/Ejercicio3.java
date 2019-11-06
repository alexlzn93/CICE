package ejemplo.java;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero = -1;
		long positivos = 0L;
		long negativos = 0L;
		while (numero != 0) {
			System.out.print("Intoducir numero (0=Fin): ");
			numero = teclado.nextDouble();
			if (numero == 0) break;
			if (numero < 0) {
				negativos++;
			} else {
				positivos++;
			}
		}
		System.out.println("Numeros positivos: " + positivos);
		System.out.println("Numeros negativos: " + negativos);
		teclado.close();
	}

}
