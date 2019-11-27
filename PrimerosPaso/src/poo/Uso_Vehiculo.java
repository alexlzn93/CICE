package poo;

import java.util.Scanner;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Scanner entrada= new Scanner(System.in);
		System.out.println("¿Que color deseea para su coche?");
		String color=entrada.nextLine();
		System.out.println("¿Tiene asientos de cuero?");
		String asientos=entrada.nextLine();
		System.out.println("¿Tiene climatizador?");
		String clima= entrada.nextLine();
		
		Coche mi_coche = new Coche(); // instancia de clase o crear un objeto de clase Coche
		mi_coche.establece_color(color);  /*ESTOY LLAMANDO AL METODO SETTER ESTABLECE_COLOR
		Y COMO TIENE UN PARAMETRO STRING LO TOMA POR VALOR
		System.out.println(mi_coche.toString());
		System.out.println(mi_coche.dime_color());
		mi_coche.configura_asientos(asientos); //llama al metodo setter
		System.out.println(mi_coche.dime_asientos());
		mi_coche.configura_climatizador(clima);//llama al metodo setter 
		System.out.println(mi_coche.dime_climatizador());
		System.out.println(mi_coche.dime_peso_coche() + " kilos");
		System.out.println("El precio final del coche es "+ mi_coche.precio_coche()+ " euros");*/

		Coche micoche= new Coche();
		micoche.establece_color("Gris");
		Furgoneta mifurgo= new Furgoneta(70,3);
		System.out.println(mifurgo.toString()+ "\n" +  micoche.toString());
		mifurgo.establece_color("verde");
		
	}

}
