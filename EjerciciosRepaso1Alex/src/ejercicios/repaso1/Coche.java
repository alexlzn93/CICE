package ejercicios.repaso1;
/*9 - Crear una clase Coche, a trav�s de la cual se pueda conocer el color del coche, la marca, el modelo, 
el n�mero de caballos, el n�mero de puertas y la matr�cula. Crear el constructor del coche, as� como los 
m�todos que consideres necesarios. Crear una clase PruebaCoche que instancie varios coches, cambi�ndole 
el color a lo largo de la vida a algunos de ellos y mostr�ndolo por pantalla.*/
public class Coche {

	//VARIABLES DE CLASE CON PRIVATE LAS ENCAPSULO
	private String color;
	private String marca;
	private String modelo;
	private int cv;
	private int puertas;
	private String matricula;
	
	//CONSTRUCTOR VACIO
	public Coche() {
		
	}
	//CONSTRUCTOR DE LA CLASE COCHE CON VARIOS PARAMETROS
	public Coche(String color,String marca,String modelo,int cv,int puertas,String matricula) {
		this.color=color;
		this.marca=marca;
		this.modelo=modelo;
		this.cv=cv;
		this.puertas=puertas;
		this.matricula=matricula;
	}
	
	//CREO LOS METODOS
	 
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color= color;
	}
	public String getMarca() {
		return marca;
	}

	public void setMarca() {
		this.marca= marca;
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo() {
		this.modelo= modelo;
	}
	public int getCv() {
		return cv;
	}

	public void setCv() {
		this.puertas= puertas;
	}
	public int getPuertas() {
		return puertas;
	}

	public void setPuertas() {
		this.color= color;
	}
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula() {
		this.matricula=matricula;
	}
	public String toString() {
		return "El color del coche es " + color + " su marca es " + marca + " el modelo es " + modelo +" tiene " + cv+" caballos"+ 
				" tiene " + puertas +" puertas "+ " y su matriculas es " + matricula;
	}
}
