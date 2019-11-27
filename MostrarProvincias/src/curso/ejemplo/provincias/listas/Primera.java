package curso.ejemplo.provincias.listas;

public class Primera implements IMetodos {

	String nombre = "Lucas";
	
	@Override
	public void mostrar() {
		System.out.println(nombre);
	}

	@Override
	public int getValor() {
		return nombre.length();
	}

	public String getNombre() {
		return nombre;
	}
	
}
