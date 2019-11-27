package cice.master.java.ejer3;

public class Ejercicio3 {

	public static void main(String[] args) {
		proceso();
	}

	public static void proceso() {
		// Creamos los objetos
		Comercial c1 = new Comercial(300, "Francisco", 37, 1000);
		Repartidor r1 = new Repartidor("zona 3", "Fernando", 26, 900);

		// Llamamos a plus
		c1.plus();
		r1.plus();

		// Mostramos la informacion
		System.out.println(c1);
		System.out.println(r1);
	}

}
