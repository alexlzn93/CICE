package curso;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Numero de filas: ");
		int filas = teclado.nextInt();
		System.out.print("Numero de columnas: ");
		int columnas = teclado.nextInt();
		int[][] numeros = new int[2][3];
		
		//  8  10
		// 36   4
		
		double nn = Math.random();  // 0   ó     < 1
		
		for (int f = 0; f < 2; f++) {
			for (int c = 0; c < 3; c++) {
				numeros[f][c] = (int)(Math.random() * 10000 + 1);
			}
		}
		
		for (int f = 0; f < 2; f++) {
			for (int c = 0; c < 3; c++) {
				System.out.print(numeros[f][c] + " ");
			}
			System.out.println();
		}
		int maximo = 0;
		int minimo = numeros[0][0];
		// Buscar el valor maximo y su posicion: fila, columna
		int fil = 0;
		int col = 0;
		for (int f = 0; f < 2; f++) {
			for (int c = 0; c < 3; c++) {
				if (numeros[f][c] > maximo) {
					maximo = numeros[f][c];
					fil = f;
					col = c;
				}
			}
		}
		System.out.println("Numero maximo: " + maximo);
		System.out.println("Fila: " + fil);
		System.out.println("Columna: " + col);
		// Buscar el valor minimo y su posicion: fila, columna
		fil = 0;
		col = 0;
		for (int f = 0; f < 2; f++) {
			for (int c = 0; c < 3; c++) {
				if (numeros[f][c] < minimo) {
					minimo = numeros[f][c];
					fil = f;
					col = c;
				}
			}
		}
		System.out.println("Numero minimo: " + minimo);
		System.out.println("Fila: " + fil);
		System.out.println("Columna: " + col);
		
	}

}
