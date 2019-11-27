package ejercicio.cice.segundo;

public class Libro {

	private String ISBN;
	private String titulo;
	private String autor;
	private int numeropaginas;
	
	public String getISBN() { //GETTER ISBN
		return ISBN;
	}
	public void setISBN(String iSBN) {  //SETTER ISBN
		ISBN = iSBN;
	}
	public String getTitulo() {  //GETTER TITULO
		return titulo;
	}
	public void setTitulo(String titulo) {  //SETTER TITULO
		this.titulo = titulo;
	}
	public String getAutor() {   //GETTER AUTOR
		return autor;
	}
	public void setAutor(String autor) {   //SETTER AUTOR
		this.autor = autor;
	}
	public int getNumeropaginas() {   //GETTER PAGINAS
		return numeropaginas;
	}
	public void setNumeropaginas(int numeropaginas) {   //SETTER PAGINAS
		this.numeropaginas = numeropaginas;
	}
	public String toString() {
		String mensaje="El libro con "+ ISBN + " creado por "+ autor + " tiene "+ numeropaginas + " paginas";
		return mensaje;
	}
	public String mayor() {  //me falta hacer bien este metodo
		this.setNumeropaginas(numeropaginas);  
		if (numeropaginas>numeropaginas) {
			return "Tiene mas paginas";
		}
		else {
			return "Tiene menos paginas";
		}
	}
}
