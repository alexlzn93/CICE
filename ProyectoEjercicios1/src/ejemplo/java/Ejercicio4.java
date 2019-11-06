package ejemplo.java;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intoducir numero: ");
		int numero = teclado.nextInt();
		for (int y = 1; y <= 10; y++) {
			System.out.println(numero + " x " + y + " = " + numero * y);
		}
	}

}
