package master.curso.java;

import java.util.Scanner;

public class Nombres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Como te llamas?");
		String nombre=entrada.next();
		String mayus=nombre.toUpperCase();
		System.out.println("Estas seguro de que tu nombre es "+nombre.toUpperCase().charAt(0)+ nombre.substring(1)+" ?");
		System.out.println("Tu nombre tiene "+nombre.length() + " letras");
		System.out.println("Tu nombre en mayusculas es "+mayus); //convierte a mayusculas una cadena de texto
		char a='a';
		
		
		
		
		
		
	
		
	}

}
