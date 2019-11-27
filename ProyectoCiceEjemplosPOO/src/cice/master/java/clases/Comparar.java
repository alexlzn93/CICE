package cice.master.java.clases;

import java.util.Comparator;

public class Comparar implements Comparator<Persona> {  //creamos el comparador porque sort debe llevar implementada el metodo Comparator
  //Comparator< le meto el objeto a comparar>
	@Override
	public int compare(Persona primero, Persona segundo) {
		return primero.nombre.compareTo(segundo.nombre); //primero.nombre.compareTo ordena de A a Z
	}
}
