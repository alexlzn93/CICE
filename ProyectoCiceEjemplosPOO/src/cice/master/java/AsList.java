package cice.master.java;

import java.util.Arrays;
import java.util.List;

import cice.master.java.clases.Persona;

public class AsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numeros= Arrays.asList(1,2,3,8,4,6,98,8); //parametros de tipo int
		List<String> nombres =Arrays.asList("Jose" , "Ana" , "Mar","Lucia");
		String[] ciudad = new String[] {"Madrid" ,"Oviedo", "Bilabao"};
		List<String> cuidades =Arrays.asList(ciudad);
		List<Persona> persona =Arrays.asList(new Persona(), new Persona(), new Persona());
				
		  int[] nn= {3,4,6,55,8};  //al metodo sumatorio le puedo meter un array nn con varios valores o meterle numeros directamente(4,5,6,4)
		
		int suma= EjemploMetodos.sumatorio(3,4,8,6); //nose porque me da 0 xoan
				System.out.println(suma);
		
	}

}
