package master.curso.java;

public class Numeros {

	public static void main(String[] args) {
		
		// Aqui no se hace outboxing
		int valor = 67;
		Integer numero = new Integer(8);
		double altura = 192.78;
		
		Double altura2 = new Double(200.45);
		
		double doble_altura = altura2 * 2;
		
		int suma = valor + numero;
		System.out.println(suma);
		
		Integer resultado = new Integer(valor) + numero;
		
		Numeros nn = new Numeros();
		 
	}

}
