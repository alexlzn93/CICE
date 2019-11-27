package curso;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero de filas: ");
		int filas = teclado.nextInt();
		double[][] valores = new double[filas][];
		int[] columnas = new int[filas];
		for (int f = 0; f < columnas.length; f++) {
			System.out.print("Columnas: ");
			columnas[f] = teclado.nextInt();
			valores[f] = new double[columnas[f]];
		}
		for (int f = 0; f < valores.length; f++) {
			for (int c = 0; c < valores[f].length; c++) {
				System.out.print("Numero: ");
				valores[f][c] = teclado.nextInt();
			}
		}
		double[] sumasTotales = new double[filas];
		for (int f = 0; f < valores.length; f++) {
			double maximo = valores[f][0];
			for (int c = 0; c < valores[f].length; c++) {
				sumasTotales[f] += valores[f][c];
				if (valores[f][c] > maximo) {
					maximo = valores[f][c];
				}
			}
			double media = sumasTotales[f] / valores[f].length;
			System.out.println("Media aritmetica: " + media);
			System.out.println("Valor maximo: " + maximo);
		}
		for (int f = 0; f < valores.length; f++) {
			for (int c = 0; c < valores[f].length; c++) {
				System.out.print(valores[f][c] + " ");
			}
			System.out.println();
		}
		double maximo = sumasTotales[0];
		double minimo = maximo;
		for (int f = 0; f < sumasTotales.length; f++) {
			if (sumasTotales[f] > maximo) {
				maximo = sumasTotales[f];
			}
			if (sumasTotales[f] < minimo) {
				minimo = sumasTotales[f];
			}
		}
		System.out.println("Suma maxima: " + maximo);
		System.out.println("Suma minima: " + minimo);
	}

}
