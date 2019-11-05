package ejercicio.array;

import java.util.Scanner;

/*2- Realizar un programa que solicite por teclado 7 números reales y se guarden en un array, después
mostrar en pantalla el número máximo y el número mínimo.*/
public class Ejercicio2 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		int numeroElementos=7;
		double[] numeros= new double[numeroElementos];
		for (int indice=0; indice<numeros.length; indice++) {
			System.out.println("Introduzca numero:");
			numeros[indice] = entrada.nextDouble();
		}
		
		double maximo= numeros[0];
		double minimo= numeros[0];

		for (int ii=1; ii<numeros.length; ii++) {
			if (numeros[ii]> maximo) {
				maximo=numeros[ii];
			}
				
			if (numeros[ii]> maximo) {
				minimo=numeros[ii];
			}
		}
		System.out.println("Maximo:" + maximo);
		System.out.println("Minimo:" + minimo);
	}

}
