package cice.master.java;

public class Ejercicio8 {

	public static void main(String[] args) {
		Rectangulo primero = new Rectangulo(12.65, 17.3); //creo un objeto de Rectangulo y le paso los parametros double base y double altura
		Rectangulo segundo = new Rectangulo();
		segundo.base = 26.0; //Valor de la base 26.0 del segundo Objeto Rectangulo
		segundo.altura = 4.0; //valor de la altura 4.0 del segundo Objeto Rectagulo
		System.out.println("Area primer rect�ngulo: " + primero.area());
		System.out.println("Per�metro primer rect�ngulo: " + primero.perimetro());
		System.out.println("Area segundo rect�ngulo: " + segundo.area());
		System.out.println("Per�metro segundo rect�ngulo: " + segundo.perimetro());
	}

}
