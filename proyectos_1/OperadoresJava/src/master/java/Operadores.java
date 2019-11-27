package master.java;

public class Operadores {

	public void operadoresAsignacion() {
		int valor = 3;
		valor = valor + 1;
		// Equivalencias de la operacion de asignacion anterior
		valor++;
		valor += 1;
		System.out.println("Valor de la variable valor = " + valor);
		
		int numero = 15;
		numero = numero * 4;
		// Equivalencia de la operacion de asignacion anterior
		numero *= 4;
		System.out.println("Valor de la variable numero = " + numero);
		
		numero = numero - 8;
		// Equivalencia de la operacion de asignacion anterior
		numero -= 8;
		System.out.println("Valor de la variable numero = " + numero);
		
		int suma = 0;
		suma = suma + valor;
		// Equivalencia de la operacion de asignacion anterior
		suma += valor;
		System.out.println("Valor de la variable suma = " + suma);
		
		numero = numero / 6;
		// Equivalencia de la operacion de asignacion anterior
		numero /= 6;
		System.out.println("Valor de la variable numero = " + numero);
	}

	public void operadoresDeIncremento() {
		int numero = 8;
		System.out.println(numero++);
		int edad = 17;
		System.out.println(++edad);
		
		int valor = 80;
		int rdo1 = valor++;
		System.out.println(rdo1);
		int rdo2 = ++valor;
		System.out.println(rdo2);
	}
	
	public void operadoresDeDecremento() {
		int numero = 22;
		System.out.println(numero--);
		int edad = 19;
		System.out.println(--edad);
		
		int valor = 180;
		int rdo1 = valor--;
		System.out.println(rdo1);
		int rdo2 = --valor;
		System.out.println(rdo2);
	}

	public void operacionCast() {
		long maximo = 2033L;
		int suma = 0;
		suma = suma + (int)maximo;
		System.out.println(suma);
		double n2 = 209.87;
		float rdo = (float)n2 * 4;
		System.out.println(rdo);
	}
	
	public void operacionInBoxing() {
		// InBoxing de numeros enteros
		Integer numero = new Integer(23);
		int valor = 18;
		Integer suma = numero + valor;
		System.out.println(suma);
		Long numero2 = new Long(23);
		long rdo = numero2 * numero;
		System.out.println(rdo);
		
		// InBoxing de numeros reales con punto decimal
		Double maximo = new Double(123.68);
		double alto = 34D;
		Double rdo1 = maximo * alto;
		System.out.println(rdo1);
		Double rdo2 = rdo1 + suma;
		System.out.println(rdo2);
		float altura = 201.65F;
		Float altura_max = new Float(altura);
		altura_max += 43.89F;
		System.out.println(altura_max);
	}

	public void operacionOutBoxing() {
		// OutBoxing de numeros reales con punto decimal
		Double peso = new Double(81.90);
		double peso_doble = 1D;
		peso_doble += peso * 2;
		System.out.println(peso_doble);
		Float dimension = new Float(123);
		float maxima = 20F;
		maxima = maxima + dimension;
		System.out.println(maxima);
		
		// OutBoxing de numeros enteros
		Long n1 = new Long(1009);
		long suma = 0L;
		suma = suma + (n1 * 3);
		System.out.println(suma);
		Integer valor = new Integer(100);
		suma += valor;
		System.out.println(suma);
	}
	
}
