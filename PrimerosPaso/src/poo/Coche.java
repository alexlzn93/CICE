package poo;

public class Coche { // caracteristicas comunes (VARIABLES DE CLASE)

	private int ruedas; // al poner private lo que hago es encapsular los datos para que no se puedan
						// modificar en otra clase
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador; // devuelve un true o false

	public Coche() { // Metodo constructor Sintaxis: public\private\protected Clase() {}
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
       
		
	}

	public String toString() { // METODO GETTER:PARA ACCEDER A LAS PROPIEDADES ENCAPSULADAS
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" + ".Mide" + largo/1000 + "metros con un ancho de "+
			ancho + " cm y un peso de plataforma de " + peso_plataforma+ " kg" ;
	}

	public int dime_ancho() { // METODO GETTER
		return ancho;
	}

	public void establece_color(String color_coche) { // Le meto por parametro un String ->color_coche //SETTER 
		color=color_coche;
	}

	public String dime_color() { // GETTER
		return "El color del coche es " + color;  //los metodos GETTER siempre llevan un return
	}
	public void configura_asientos(String asientos_cuero) {  //SETTER ASIENTOS
		//this.asientos_cuero= asientos_cuero; //variable de clase(asientos_cuero) = argumento(asientos_cuero)
	
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true; //con this llamo a la variable de clase asientos_cuero
			
		}
		else { this.asientos_cuero=false;}  //"no"
	}
	public String dime_asientos() {  //GETTER ASIENTOS devuelve un String return "El coche tiene..."
		if (asientos_cuero==true) {
			return "El coche tiene asientos de cuero"; //
		}
		else {
			return "El coche tiene asientos de serie";
		}
	}
	public void configura_climatizador(String climatizador) { //SETTER parametro string
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}
		else {
			this.climatizador=false;
		}
	}
	public String dime_climatizador() {  //GETTER
		if(climatizador==true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado";
		}
	}
			
	public String dime_peso_coche() {  //SETTER Y GETTER A LA VEZ
		int peso_carroceria=500;
		peso_total=peso_plataforma +peso_carroceria; //SETTER PORQUE MODIFICO EL VALOR DE LA VARIABLE PESO_TOTAL
		if(asientos_cuero==true) {
			peso_total+=50;
		}
		if(climatizador==true) {
			peso_total+=20;
		}
		return "El peso del coche es " + peso_total;  //GETTER PORQUE ME DEVUELVE EL VALOR
	}
	public int precio_coche() {  //GETTER
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if (climatizador==true) {
			precio_final+=1500;
		}
		return  precio_final;
	}
	}

