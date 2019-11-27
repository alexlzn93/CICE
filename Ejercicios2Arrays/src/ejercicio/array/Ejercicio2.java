package ejercicio.array;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroElementos = 7;
		double[] numeros = new double[numeroElementos];
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.print("Introduzca numero: ");
			numeros[indice] = teclado.nextDouble();
		}
		double maximo = numeros[0]; // 7
		double minimo = numeros[0]; // 2
		for (int ii = 1; ii < numeros.length; ii++) {
			if (numeros[ii] > maximo) {
				maximo = numeros[ii];
			}
			if (numeros[ii] < minimo) {
				minimo = numeros[ii];
			}
		}
		System.out.println("Maximo: " + maximo);
		System.out.println("Minimo: " + minimo);
	}

}
