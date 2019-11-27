package ejercicio.array;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// 5/11/2019
	    // Dia 5 de Noviembre del 2019
		Scanner teclado = new Scanner(System.in);
		System.out.print("Fecha: ");
		String fecha = teclado.nextLine();
		String[] dato = fecha.split("/");
		String[] meses = { "Enero", "Febrero", "Marzo", 
				"Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre"
				};
		int mes = Integer.parseInt(dato[1]);	
		
		int mes2 = new Integer(dato[1]); // outboxing		pasar de dato tipo int a string
		System.out.println("Dia " + dato[0] + " " + 
		                   meses[mes - 1] + " " + dato[2]);
			
	}

}
