package master.curso.java;
import java.util.Scanner;


public class Multiplica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		System.out.println("Dime un numero");
		int primero=entrada.nextInt();
		System.out.println("Dime otro numero");
		int segundo=entrada.nextInt();
		int resultado=primero*segundo;
		System.out.println("El resultado de multiplicar "+primero+" y "+segundo+" es "+resultado);
		
		
		
		
	}

}
