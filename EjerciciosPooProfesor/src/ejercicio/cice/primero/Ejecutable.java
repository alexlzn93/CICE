package ejercicio.cice.primero;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner entrada=new Scanner (System.in);
		System.out.println("Introduce tu nombre");
		String nombre= entrada.nextLine();
		System.out.println("Introduce tu edad");
		String edad= entrada.nextLine();
		System.out.println("Introduce tu peso");
		String peso= entrada.nextLine();
		System.out.println("Introduce tu altura");
		String altura= entrada.nextLine();
		Persona individuo= new Persona();
		System.out.println(individuo);
		
		
	}

}
