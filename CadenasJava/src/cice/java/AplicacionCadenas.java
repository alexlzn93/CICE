package cice.java;

public class AplicacionCadenas {

	public static void main(String[] args) {
		AplicacionCadenas app = new AplicacionCadenas();
		app.ejemploCadenas();
	}

	void ejemploCadenas() {
		String nombre = new String("Lucas");
		String provincia = "Madrid";
		// convertir la provincia en mayusculas
		provincia = provincia.toUpperCase();
		System.out.println(provincia);
		// convertir la provincia en minusculas
		provincia = provincia.toLowerCase();
		System.out.println(provincia);
		// mostrar el numero de caracteres de la variable nombre
		System.out.println(nombre.length());
		// comprobar si existe la letra 'e' dentro de la variable nombre
		boolean existe = nombre.contains("e");
		System.out.println(existe);
		// comprobar si la variable nombre empieza por la letra 'M'
		boolean empieza = nombre.startsWith("M");
		System.out.println(empieza);
		// comprobar si la variable nombre finaliza por la letra 's'
		boolean finaliza = nombre.startsWith("s");
		System.out.println(finaliza);
		// comprobar en que posicion esta la letra 'a' en la variable nombre
		int posicion = nombre.indexOf("a");
		System.out.println(posicion);
		String texto = "Esto es un texto";
		// obtener la palabra 'es' de la variable texto
		String palabra = texto.substring(5, 7);
		System.out.println(palabra);
		String frase = "    esta frase contiene espacios     ";
		System.out.println(frase);
		// eliminar los espacios en blanco de la variable frase
		frase = frase.trim();
		System.out.println(frase);
		// reemplazar todas las 'aes' de la variable frase por 'oes'
		frase = frase.replaceAll("a", "o");
		System.out.println(frase);		
		String nom1 = "Jose";
		String nom2 = "jose";
		// comparar si las variables nom1 y nom2 son iguales
		if (nom1.equals(nom2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}
		if (nom1.equalsIgnoreCase(nom2)) {
			System.out.println("Son iguales");
		} else {
			System.out.println("Son distintas");
		}
		// mostrar todas las vocales de la variable frase
		frase = frase.toLowerCase();
		for (int posi = 0; posi < frase.length(); posi++) {
			char letra = frase.charAt(posi);
			switch (letra) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println(letra);
			}
		}
		
	}
}
