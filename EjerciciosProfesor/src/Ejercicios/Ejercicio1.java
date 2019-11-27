package Ejercicios;

/*1- Realizar un programa que solicite un texto por teclado y, que muestre el número total de apariciones
por vocal, es decir, que muestre en número total de aes, ees, ies, oes y ues que hay en el texto.*/
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce un texto");
		String texto = entrada.nextLine();
		int vocalA = 0;
		int vocalE = 0;
		int vocalI = 0;
		int vocalO = 0;
		int vocalU = 0;
		texto = texto.toLowerCase(); // para pasar el txto a minusculas
		for (int x = 0; x < texto.length(); x++) {
			char letra = texto.charAt(x); // char porque solo quiero ver un caracter (a,e,i,o,u)
			switch (letra) {
			case 'a':
				vocalA++;
				break;
			case 'e':
				vocalE++;
				break;
			case 'i':
				vocalI++;
				break;
			case 'o':
				vocalO++;
				break;
			case 'u':
				vocalU++;
				break;

			}
		}
		System.out.println("El texto  " + texto + " tiene " + vocalA + " aes");
		System.out.println("El texto " + texto + " tiene " + vocalE + " ees");
		System.out.println("El texto " + texto + " tiene " + vocalI + " ies");
		System.out.println("El texto " + texto + " tiene " + vocalO + " oes");
		System.out.println("El texto " + texto + " tiene " + vocalU + " ues");

		entrada.close();
	}

}
