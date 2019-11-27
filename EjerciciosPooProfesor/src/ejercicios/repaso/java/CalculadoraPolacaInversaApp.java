package ejercicios.repaso.java;

import java.util.Scanner;

public class CalculadoraPolacaInversaApp {
	
	Scanner teclado= new Scanner(System.in);
	
	int operando1=teclado.nextInt();
	int operando2=teclado.nextInt();
	String signo_aritmetico=teclado.nextLine();
	
	
	
	
	public int suma() {
		return operando1+operando2;
	}

	public int resta() {
		return operando1-operando2;
	}
	public int multiplicacion() {
		return operando1*operando2;
	}
	public double division() {
		return (double)operando1/operando2;
	}
	public int potencia() {
		return (int)Math.pow(operando1, operando2);
	}
	public int modulo() {
		return operando1%operando2;
	}
}
