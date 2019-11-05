package ejercicio.array;

import java.util.Scanner;

/*3- Realizar un programa que solicite por teclado 5 nombres de personas y se guarden en un array y,
mostrar en pantalla cuántos nombres empiezan por la letra 'P' o 'p' y, cuántos acaban por la letra 'A'
o 'a', también mostrar en pantalla todos los nombres que tengan más de 5 letras.*/
public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner (System.in);
		String[] nombres= new String[5];
		for (int indice=0; indice<nombres.length; indice++) {
			System.out.println("Introduzca nombre:");
			nombres[indice] = entrada.nextLine();
	}
		int empiezaP=0;
		int finalizaA=0;
		for(int x=0; x< nombres.length; x++) {
			if (nombres[x].toUpperCase().startsWith("P")) {
				empiezaP++;
			}
			if(nombres[x].toLowerCase().endsWith("a")) {
				finalizaA++;
			}
			
			
		}
	System.out.println("Nombres que empiezan por P o p =" + empiezaP);
	System.out.println("Nombres que finalizan por A o a =" + finalizaA);
	for (int x=0; x< nombres.length; x++) {
		if (nombres[x].length()>5) {
			System.out.println(nombres[x]);
		}
	}
	}
	

}
