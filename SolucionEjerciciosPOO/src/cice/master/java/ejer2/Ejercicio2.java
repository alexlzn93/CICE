package cice.master.java.ejer2;

public class Ejercicio2 {

	public static void main(String[] args) {
		proceso();
	}

	public static void proceso() {
		// Creamos lo objetos
		Libro libro1 = new Libro(1111111111, "titulo1", "autor1", 30);
		Libro libro2 = new Libro(1111111112, "titulo2", "autor2", 60);

		// Mostramos su estado
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());

		// Comparamos quien tiene más páginas
		if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
			System.out.println(libro1.getTitulo() + " tiene más páginas");
		} else {
			System.out.println(libro2.getTitulo() + " tiene más páginas");
		}

	}

}
