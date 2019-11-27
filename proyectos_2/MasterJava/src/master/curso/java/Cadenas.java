package master.curso.java;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.print("Nombre completo: ");
		String nombre = teclado.nextLine();
		int palabras = nombre.split(" ").length;
		System.out.println("Numero de palabras: " + palabras);	
	}

}
