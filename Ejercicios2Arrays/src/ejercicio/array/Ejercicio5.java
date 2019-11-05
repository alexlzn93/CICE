package ejercicio.array;
/*5- Realizar un programa que solicite un texto por teclado y, capitalice todas las palabras del texto.
Ejemplo:
Introducir un texto: eSTE tExTo se tiEne que caPITalizar
Salida en pantalla:
Este Texto Se Tiene Que Capitalizar*/

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner( System.in);
		System.out.println("Introduce un texto:");
		String texto=entrada.nextLine();
		String capitalizado="";
		String [] palabras=texto.split(" ");
		//eSTE tExTo se tiEne que caPITalizar
		//Este Texto Se Tiene Que Capitalizar
		for (int b=0; b < palabras.length; b++) {
			capitalizado = capitalizado + palabras[b].toUpperCase().charAt(0)+ palabras[b].toLowerCase().substring(1)+" ";
		}
capitalizado=capitalizado.trim();
System.out.println(capitalizado);
	}

}
