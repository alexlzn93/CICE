package ejercicio.array;

import java.util.Scanner;

public class Ejerccicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		int[][]matriz = new int[3][3];
		for (int fila=0; fila<matriz.length; fila++){
			for (int col=0; col<matriz[fila].length; col++){
				System.out.println("Numero:");
				matriz[fila][col]= entrada.nextInt();
			}
		}
		for (int fila=0; fila<matriz.length; fila++){
			for (int col=0; col<matriz[fila].length; col++){
				System.out.println("Numero:");
				matriz[fila][col]= entrada.nextInt();
			}
		}
		
		

	}

}
