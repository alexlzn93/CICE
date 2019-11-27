package master.curso.java;

import java.util.Scanner;

public class Multiplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.print("Introduzca primer numero: ");
		int primero = entrada.nextInt();
		System.out.print("Introduzca segundo numero: ");
		int segundo = entrada.nextInt();
		int resultado = primero * segundo;
		System.out.print("El resultado de multiplicar es: " );
		System.out.println(resultado);
	}

}
