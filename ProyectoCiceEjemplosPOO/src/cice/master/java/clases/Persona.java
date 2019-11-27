package cice.master.java.clases;

public class Persona implements Comparable<Persona> {

	public String nombre;  //variables de clase
	public int edad;
	public int dni;
		
	public Persona() {
		this(IBase.SIN_NOMBRE, 0, 0);  // a este constructor le estoy metiendo un parametro que es una interfaz que contiene dos constantes
	}

	public Persona(String nombre, int edad, int dni) {
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
	}
	@Override
	public int hashCode() { //creo un hashCode en base a las variables de clase y sirve para ordenar .hashCode 
		int hash= nombre.hashCode();
		hash +=edad;
		hash+=dni;
		return hash;
	}
	@Override
	public boolean equals(Object objeto) {  //si se modifica el equal se debe modificar el hashCode
		if(objeto==null)
			return false;
		if(!(objeto instanceof Persona))
			return false;
		Persona persona= (Persona)objeto; //cast de Persona
		return (edad==persona.edad)&& (dni==persona.dni)&& (nombre.compareTo(persona.nombre)==0); //compareTo devuelve 0 si tiene el mismo valor y si es mayor devuelve 1 y si no -1
	}
	@Override
	public String toString() {
		return nombre + ";" + edad + ";" + dni;
	}

	@Override
	public int compareTo(Persona objeto) {
		// TODO Auto-generated method stub
		if (objeto==null)return -1;
		return nombre.toLowerCase().compareTo(objeto.nombre.toLowerCase());
	}
	
}
