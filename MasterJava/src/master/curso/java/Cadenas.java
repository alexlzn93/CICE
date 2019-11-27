package master.curso.java;

import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {
		
		
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Nombre completo por favor");
		String texto=entrada.nextLine();
		int palabras=texto.split(" ").length;
		System.out.println("Numero de palabras de tu nombre son "+palabras);
		
		
		System.out.println(texto);
		
		
		entrada.close();
		
		
		
		
		
		
		
		
		
		
	}

}
