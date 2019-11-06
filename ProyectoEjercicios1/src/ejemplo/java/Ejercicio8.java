package ejemplo.java;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Intoducir segundos: ");
		int segundos = teclado.nextInt();
		int horas = segundos / 3600;
		int restoMinutos = segundos % 3600;
		int minutos = restoMinutos / 60;
		int segun = restoMinutos % 60;
		System.out.println("Horas: " + horas);
		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segun);
	}

}
