package ejemplo.java;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intoducir centimos: ");
		int centimos = teclado.nextInt();
		int euros2 = centimos / 200;
		int resto = centimos % 200;
		int euros = resto / 100;
		resto %= 100; // resto = resto % 100
		int centi50 = resto / 50;
		resto %= 50;  // resto = resto % 50
		int centi20 = resto / 20;
		resto %= 20;  // resto = resto % 20
		int centi10 = resto / 10;
		resto %= 10;  // resto = resto % 10
		int centi5 = resto / 5;
		resto %= 5;   // resto = resto % 5
		int centi2 = resto / 2;
		int centi = resto % 2;
		System.out.println("Monedas 2 euros: " + euros2);
		System.out.println("Monedas 1 euro: " + euros);
		System.out.println("Monedas 50 centi: " + centi50);
		System.out.println("Monedas 20 centi: " + centi20);
		System.out.println("Monedas 10 centi: " + centi10);
		System.out.println("Monedas 5 centi: " + centi5);
		System.out.println("Monedas 2 centi: " + centi2);
		System.out.println("Monedas 1 centi: " + centi);
	}
}
