package poo;

public class Furgoneta extends Coche {

	private int capacidad_carga;
	private int plazas_extra;
	
	public Furgoneta(int capacidadcarga , int plazas_extra) {  //CONSTRUCTOR
		super();  //llama al constructor de la clase padre (Coche)
		this.capacidad_carga=capacidadcarga;
		this.plazas_extra=plazas_extra;
		
	}
	
	public String toString() {
		
		return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " + plazas_extra;
	}
}
