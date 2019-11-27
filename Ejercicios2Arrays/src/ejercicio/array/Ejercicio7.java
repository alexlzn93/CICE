package ejercicio.array;

import java.util.Scanner;

public class Ejercicio7 {

	// 2 3 4  9
	// 3 4 5  12
	// 5 2 1  8
	
	// 10 9 10
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.print("Numero: ");
				matriz[fila][col] = teclado.nextInt();
			}
		}
		// 8 7 2
		// 3 4 6
		// 5 6 7
		
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				if (fila == col) {
					System.out.println(matriz[fila][col]);
				}
			}
		}
	}
	
}
