package poo;

public class Puebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Alex");
		Empleados trabajador3 = new Empleados("Alfonso");
		Empleados trabajador4 = new Empleados("Alberto");
		Empleados trabajador5 = new Empleados("Lola");
		
		trabajador1.setSeccion("RRHH"); // llamando al metodo setSeccion cambio su seccion
		System.out.println(trabajador1);

		trabajador2.setSeccion("Pescaderia");
		System.out.println(trabajador2);

		System.out.println(trabajador3 + "\n" + trabajador4 + "\n" + trabajador5);  //"\n" hace un salto de linea
		System.out.println(Empleados.getidSiguiente());
	}

}

class Empleados {

	private final String nombre;
	private String sector;
	private int ide; // variable ide compartida por varios Objetos STATIC
	private static int ideSiguiente = 1; // declaro una variable static ideSiguiente=1;

	public Empleados(String nom) { // CONSTRUCTOR
		nombre = nom;
		sector = "Administracion";
		ide = ideSiguiente; // ide=ideSiguiente que es la variable static
		ideSiguiente++; // incremente en uno la variable static
	}

	public static String getidSiguiente() {  //metodo static solo se aplica a la clase Empleados no a los objetos
		return "El id siguiente es: " + ideSiguiente;
	}

	public void setSeccion(String seccion) { // setter
		this.sector = seccion;
	}

	public String toString() {
		return "El nombre " + nombre + " trabaja en la seccion " + sector + " su ID es " + ide;
	}
}
