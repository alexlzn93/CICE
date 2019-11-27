package master.java.archivos;

public class Comunidad {

	public int id;
	public String nombreComunidad;
	
	public Comunidad() {
		this(0, "");
	}
			
	public Comunidad(int id, String nombreComunidad) {
		this.id = id;
		this.nombreComunidad = nombreComunidad;
	}

	public String toString() {
		return id + ";" + nombreComunidad;
	}
}
