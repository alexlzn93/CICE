package master.java.excepciones;

public class MiExcepcion extends Exception { //extends significa hereda

	public MiExcepcion() {
		super();
	}
	 public MiExcepcion(String mensaje) {
		 super(mensaje);
	 }
	 @Override
	 public String toString() {
		 // salto de linea \"n"
		 //getclass muestra el nombre de la clase y getName el nombre de la excepcion
		 
		 return "Excepcion:" + this.getClass().getName()+ "\n"+ "Mensaje:" + this.getMessage();
	 }
}
