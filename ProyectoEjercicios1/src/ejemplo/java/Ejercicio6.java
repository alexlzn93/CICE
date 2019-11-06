package ejemplo.java;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int pares = 0;
		int impares = 0;	
		int suma = 0;		
		int introducidos = 0;
		do {
			System.out.print("Introduzca un numero: ");
			numero = teclado.nextInt();
			if (numero == 0) break;
			if (numero % 2 == 1) 
				impares++;
			else 
				pares++;		
			suma += numero;
			introducidos++;
		} while (numero != 0);
		double media = suma / introducidos;
		System.out.println("Numeros pares: " + pares);
		System.out.println("Numeros impares: " + impares);
		System.out.println("Numeros introducidos: " + introducidos);
		System.out.println("Media: " + media);
	}

}
