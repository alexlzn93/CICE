package Ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	/*
	 * Realizar un programa que solicite un nombre completo (nombre y apellidos,
	 * tanto el nombre como los apellidos serán nombres simples, es decir, no se
	 * admiten nombres y apellidos compuestos) y mostrar el nombre completo con el
	 * siguiente formato (nombre y apellidos se tienen que capitalizar):
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre:");
		String nombre = entrada.nextLine();
		System.out.println("Introduce tu primer apellido :");
		String primer_apellido = entrada.nextLine();
		System.out.println("Introduce tu segundo apellido :");
		String segundo_apellido = entrada.nextLine();

		String capitalizadonombre = nombre.toUpperCase().charAt(0) + nombre.toLowerCase().substring(1);

		String capitalizadoapellido = primer_apellido.toUpperCase().charAt(0)
				+ primer_apellido.toLowerCase().substring(1);

		String capitalizadoapellido2 = segundo_apellido.toUpperCase().charAt(0)
				+ segundo_apellido.toLowerCase().substring(1);

		System.out.println(capitalizadoapellido2 + " " + capitalizadoapellido + " ," + capitalizadonombre);

	}

}
