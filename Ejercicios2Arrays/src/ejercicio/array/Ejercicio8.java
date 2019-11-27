package ejercicio.array;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// 6 7
		// 8 2 3
		// 9 8 5 4 4
		Scanner teclado = new Scanner(System.in);
		int[][] matriz = new int[3][];
		matriz[0] = new int[2];
		matriz[1] = new int[3];
		matriz[2] = new int[5];
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int col = 0; col < matriz[fila].length; col++) {
				System.out.print("Numero: ");
				matriz[fila][col] = teclado.nextInt();
			}
		}
	}

}
