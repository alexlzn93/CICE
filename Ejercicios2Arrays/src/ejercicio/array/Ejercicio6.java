package ejercicio.array;

import java.util.Scanner;

//pedir por teclado una fecha y tiene qque tener el siguiente formato ej:5/11/2019 y tiene que devolver Dia 5 de Noviembre del 2019 
public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//5/11/2019
		//Dia 5 de Noviembre del 2019
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduzca una fecha por favor:");
		String fecha=entrada.nextLine();
		
		String [] fechas=fecha.split("/");
		String[] meses= {"Enero", "Febrero", "Marzo","Abril", "Mayo", "Junio","Julio", "Agosto", "Septiembre","Octubre", "Noviembre", 
				"Diciembre"
		};
		int mes= new Integer(fechas[1]);
		System.out.println("Hoy es " + fechas[0]+ " de" + meses[mes-1]+ " de"+ fechas[2]);
		//fechas[0] como es un split me da la primera cadena de caracteres
		//fechas[2] como es un split me devuelve la tercera cadena de caracteres
	

	}

}
