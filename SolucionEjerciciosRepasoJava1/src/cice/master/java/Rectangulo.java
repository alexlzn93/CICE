package cice.master.java;

public class Rectangulo {

	public double base;
	public double altura;
	
	public Rectangulo() { //constructor de la clase, constructor vacio
		
	}
	
	public Rectangulo(double base, double altura) { // SETTER metodo para calcular el AREA( base*altura)
		this.base = base;  //this llama a la variable de clase (base)
		this.altura = altura;  //this llama a la variable de clase(altura)
	}
	
	public double area() { //GETTER metodo para calcular el area sin parametros
		return base * altura;
	}
	
	public double perimetro() {  //GETTER metodo para calcular el perimetro 
		return (base + altura) * 2.0;
	}
	
}
