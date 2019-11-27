package ejercicio.array;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double[] numeros = new double[10];
		for (int indice = 0; indice < numeros.length; indice++) {
			System.out.print("Introduzca numero: ");
			numeros[indice] = teclado.nextDouble();
		}
		double media;
		double sumaTotal = 0.0;
		for (int i = 0; i < numeros.length; i++) {
			sumaTotal += numeros[i];
		}
		media = sumaTotal / numeros.length;
		System.out.println("Media aritmetica: " + media);
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > media) {
				System.out.println(numeros[i]);
			}	
		}
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 5 == 0) {
				System.out.println(numeros[i]);
			}	
		}
	}

}
