package ejercicio.array;
/*4- Realizar un programa que solicite un texto por teclado y, muestre en pantalla las palabras del texto
que tengan más de 3 letras.*/
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada= new Scanner( System.in);
		System.out.println("Introduce un texto:");
		String texto=entrada.nextLine();
		String []palabras= texto.split(" "); /*split devuelve un array y separa una cadena de texto (String) dependiendo del parametro
		aqui espacio en blanco*/
		for(int k=0;k< palabras.length; k++){
			if (palabras[k].length()>3) {
				System.out.println(palabras[k]);
			}
		}

	}

}
