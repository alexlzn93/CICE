package mates.java;

public class AplicacionMates {

	public static void main(String[] args) {
		// calculo de elevar un numero a una potencia determinada
		double potencia = Math.pow(2, 7);
		System.out.println(potencia);
		// calculo de elevar el numero 'e' a una potencia
		double expo = Math.exp(2);
		System.out.println(expo);
		double expo2 = Math.pow(Math.E, 2);
		System.out.println(expo2);
		// calculo valor absoluto de un numero entero
		int n1 = -4;
		int rdo1 = Math.abs(n1);
		System.out.println(rdo1);
		// calculo valor absoluto de un numero real
		double n2 = -67.89;
		double rdo2 = Math.abs(n2);
		System.out.println(rdo2);
		// calculo de truncar un numero
		int n4 = (int) n2;
		System.out.println(n4);
		// calculo de redondeo de un numero
		double d3 = 123.4;
		int n3 = (int) Math.round(d3);
		System.out.println(n3);
		// calculo redondeo hacia arriba
		int n5 = (int) Math.ceil(d3);
		System.out.println(n5);
		// calculo redondeo hacia abajo
		int n6 = (int) Math.floor(d3);
		System.out.println(n6);
		// calcular el maximo de dos valores
		int maximo = Math.max(n4, n3);
		System.out.println(maximo);
		// calcular el minimo de dos valores
		int minimo = Math.min(n4, n3);
		System.out.println(minimo);
		// calculo de la raiz cuadrada de un numero
		double raiz = Math.sqrt(223.78);
		System.out.println(raiz);
		// calculo del logaritmo natural de un numero
		double logaritmo1 = Math.log(76.21);
		System.out.println(logaritmo1);
		// calculo del logaritmo en base 10 de un numero
		double logaritmo2 = Math.log10(76.21);
		System.out.println(logaritmo2);
		// calculo del seno de un numero
		double seno = Math.sin(n2);
		System.out.println(seno);
		// calculo del coseno de un numero
		double coseno = Math.cos(n2);
		System.out.println(coseno);
		// calculo de la tangente de un numero
		double tangente = Math.tan(n2);
		System.out.println(tangente);
		// generar un numero aleatorio comprendido entre 0 y 999, ambos inclusive
		int aleatorio = (int) (Math.random() * 1000);
		System.out.println(aleatorio);
		// generar un numero aleatorio comprendido entre 1 y 1000, ambos inclusive
		int aleatorio2 = (int) (Math.random() * 1000 + 1);
		System.out.println(aleatorio2);
		// calculo de la superficie de un circulo con un radio de 2
		double radio = 2;
		double superficie = Math.PI * Math.pow(radio, 2);
		System.out.println(superficie);
	}

}
