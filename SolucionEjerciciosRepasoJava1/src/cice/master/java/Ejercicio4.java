package cice.master.java;

import java.util.Scanner;

public class Ejercicio4 {

	static Scanner teclado;
	
	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = pedirNumeroEntero(); //ejecuta el metodo pedirNumeroEntero
		if (edad > 17) {
			System.out.print("Salario: ");
			double salario = pedirNumeroReal(); //ejecuta el metodo pedirNumeroReal
			salario = getSalario(edad, salario);
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
			System.out.println("Salario: " + salario);
		} else {
			System.out.println("Es un menor de edad");
		}
		teclado.close();
	}

	static int pedirNumeroEntero() { //metodo para validar si los datos introducidos son datos de tipo numerico int
		int numero = 0;
		while (numero == 0) {
			try {
				String valor = teclado.nextLine(); //cambia dato de tipo String a int
				numero = Integer.parseInt(valor);
			} catch (Exception e) {
				numero = 0;
			}
		}
		return numero;
	}
	
	static double pedirNumeroReal() { //metodo para validar si se introduce datos de tipo double, lo pide el enunciado del ejercicio
		double numero = 0.0;
		while (numero == 0.0) {
			try {
				String valor = teclado.nextLine();
				numero = Double.parseDouble(valor);
			} catch (Exception e) {
				numero = 0.0;
			}
		}
		return numero;
	}
	
	static double getSalario(int edad, double salario) {  //metedo getter y setter a la vez
		double valor = 0;
		if ((edad > 18) && (edad < 51)) { //si >18 y <51 el salario se incrementa 5%
			valor = salario + (salario * 5 / 100);
		} else if ((edad > 50) && (edad < 61)) { //si >50 y <61 salario se incrementa 10%
			valor = salario + (salario * 10 / 100);
		} else if (edad > 60) {  //si >60 se incrementa 15%
			valor = salario + (salario * 15 / 100);
		} else if (edad == 18) {  //si edad =18 el salario no cambia
			valor = salario;
		}
		return valor;
	}
}
