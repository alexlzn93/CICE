package curso.ejemplo.provincias;

import curso.ejemplo.provincias.listas.Primera;

public class Hija extends Primera {

	@Override
	public void mostrar() {
		System.out.println("Este mensaje es de la clase hija");
	}

	@Override
	public int getValor() {
		return 100;
	}

	
}
