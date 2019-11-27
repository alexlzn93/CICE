package ejercicios.repaso.java;
import java.util.Scanner;
public class Aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce primer operando");
		int operando1=entrada.nextInt();
		System.out.println("Introduce segundo operando");
		int operando2=entrada.nextInt();
		System.out.println("Introduce signo aritmetico");
		String signo_aritmetico=entrada.nextLine();
		
		
		
		
		CalculadoraPolacaInversaApp miaplicacion= new CalculadoraPolacaInversaApp();
		
	
		miaplicacion.suma();
		miaplicacion.resta();
		miaplicacion.multiplicacion();
		miaplicacion.division();
		miaplicacion.potencia();
		miaplicacion.modulo();
		
		/*System.out.println(miaplicacion.suma());
		System.out.println(miaplicacion.resta());
		System.out.println(miaplicacion.multiplicacion());
		System.out.println(miaplicacion.division());
		System.out.println(miaplicacion.potencia());
		System.out.println(miaplicacion.modulo());*/
	}

}
