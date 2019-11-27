package master.java.archivos;

public class Provincia {

	public int id;
	public String nombreProvincia;
	public int idComunidad;

	public Provincia() {
		this(0, "", 0);
	}
	
	public Provincia(int id, String nombreProvincia, int idComunidad) {
		this.id = id;
		this.nombreProvincia = nombreProvincia;
		this.idComunidad = idComunidad;
	}

	public String toString() {
		return id + ";" + nombreProvincia + ";" + idComunidad;
	}

}
