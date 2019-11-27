package cice.master.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import cice.master.java.clases.Comparar;
import cice.master.java.clases.Persona;

public class EjemploClases  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona jose=new Persona("Jose",27,125467);
		Persona jose2=new Persona("Jose",27,125467);
		Persona ana=new Persona("Ana",32,1242167);
		Persona ana2=ana;
		
		if (jose==jose2) {  
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintos"); //jose==jose2 me diria que son distintos porque ocupan espacios diferentes en la memoria
		}
		
		ArrayList<String> nombres= new ArrayList<String>();
		nombres.add("Lucas");
		nombres.add("Ana");
		nombres.add("Jose");
		Collections.sort(nombres); //se usa para ordenar la ArrayList (metodo .sort)
		for (String nombre: nombres) {
			System.out.println(nombre);
		}
		ArrayList<Double> numeros= new ArrayList<Double>();
		numeros.add(2.0);
		numeros.add(45.3);
		numeros.add(12.3);
		Collections.sort(numeros);
		for(double numero:numeros) {
			System.out.println(numero);
		}
		ArrayList<Persona> personas= new ArrayList<Persona>();
		personas.add(jose);
		personas.add(jose2);
		personas.add(ana);
		personas.add(new Persona("Lucia", 29,534872615));
		//Version 1
		Collections.sort(personas,new Comparar());
		for(Persona persona:personas) {
			System.out.println(persona);
		}
		//Version 2
		Collections.sort(personas, new Comparator<Persona>() {
			@Override
			public int compare(Persona primero,Persona segundo) {
				return primero.nombre.compareTo(segundo.nombre);
				}
		});
		//Version 3
		Collections.sort(personas);
		
		for(Persona persona:personas) {
			System.out.println(persona);
		}	
		
	}
	

}
