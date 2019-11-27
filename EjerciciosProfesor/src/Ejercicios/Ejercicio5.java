package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce numero entre 0 y 99:");
		int numero = entrada.nextInt();

		int unidades = numero % 10;
		int decenas = numero / 10;

		if (numero < 0) {
			System.out.println("Numero incorrecto");

		} else if (numero > 99) {
			System.out.println("Numero incorrecto");
		}
		switch (decenas) {

		case 1:
			System.out.print("diez");
			break;
		case 2:
			System.out.println("veinte");
			break;
		case 3:
			System.out.print("treinta");
			break;
		case 4:
			System.out.print("cuarenta");
			break;
		case 5:
			System.out.print("cincuenta");
			break;
		case 6:
			System.out.print("sesenta");
			break;
		case 7:
			System.out.print("setenta");
			break;
		case 8:
			System.out.print("ochenta");
			break;
		case 9:
			System.out.print("noventa");
			break;

		}
		switch (unidades) {
		case 1:
			System.out.println(" y uno");
			break;
		case 2:
			System.out.println("y dos");
			break;
		case 3:
			System.out.println("y tres");
			break;
		case 4:
			System.out.println("y cuatro");
			break;
		case 5:
			System.out.println("y cinco");
			break;
		case 6:
			System.out.println("y seis");
			break;
		case 7:
			System.out.println("y siete");
			break;
		case 8:
			System.out.println("y ocho");
			break;
		case 9:
			System.out.println("y nueve");
			break;
		}

	}

}
