package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
//Jueves, d�a 7 de Noviembre del 2019
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce dia de la semana:");
		String dia= entrada.nextLine();
		System.out.println("Introduce dia del mes:");
		int dia_mes= entrada.nextInt();
		System.out.println("Introduce numero de mes:");
		int mes= entrada.nextInt();
		System.out.println("Introduce a�o:");
		int a�o= entrada.nextInt();
		
		String [] dia_semana= {"lunes", "martes", "miercoles","jueves", "viernes", "sabado", "domingo"};
		int diasem=new Integer(dia);	//Integer e creado un objeto de un String(dia)
		
		String[]meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre",};
		int meses_a�o = new Integer(mes);  //Ineteger e creado un objeto de un String(mes)
		
		System.out.println(dia_semana[diasem-1]+ " , dia " + dia_mes + " de " + meses[meses_a�o-1] + " del " + a�o);
		entrada.close();
	}

}
