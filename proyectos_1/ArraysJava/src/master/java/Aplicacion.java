package master.java;

public class Aplicacion {

	public static void main(String[] args) {
		Aplicacion app = new Aplicacion();
		app.arrayDeEnteros();
		app.arrayDeDobles();
		app.arrayDeCadenas();
	}

	void arrayDeEnteros() {
		int valores[] = new int[3];
		valores[0] = 10;
		valores[1] = 10;
		valores[2] = 10;
		int rdo = 0;
		for (int k = 0; k < 3; k++) {
			rdo += valores[k];
		}
		System.out.println(rdo);
		
		int numeros[] = new int[5];
		for (int k = 0; k < numeros.length; k++) {
			numeros[k] = k;
		}
		int suma = 0;
		for (int k = 0; k < numeros.length; k++) {
			suma += numeros[k];
		}
		System.out.println(suma);
		
		int precios[] = { 23, 67, 89, 35 };
		for (int k = 0; k < precios.length; k++) {
			System.out.println(precios[k]);
		}
	}
	
	void arrayDeDobles() {
		double altura[] = new double[2];
		altura[0] = 128.7;
		altura[1] = 181.72;
		double suma = 0D;
		for (int d = 0; d < altura.length; d++) {
			System.out.println(altura[d]);
		}
		Double peso[] = new Double[3];
		peso[0] = new Double(80);
		peso[1] = 60D;
		peso[2] = 70D;
		for (int n = 0; n < peso.length; n++) {
			suma += peso[n];
		}
		System.out.println(suma);
		
		double pesos[] = { 56.3, 78.8, 89.9, 192.6 };
		for (int i = 0; i < peso.length; i += 1) {
			System.out.println(pesos[i]);
		}
	}
	
	void arrayDeCadenas() {
		String nombres[] = new String[3];
		nombres[0] = new String("Jose");
		nombres[1] = "Lucas";
		nombres[2] = "Ana";
		for (int m = 0; m < nombres.length; m = m + 1) {
			System.out.println(nombres[m].toUpperCase());
		}
		String dia[] = { "lunes", "martes", "jueves", "viernes" };
		for (int b = 0; b < dia.length; b = b + 1) {
			if (dia[b].length() == 6) {
				System.out.println(dia[b]);
			}
		}
	}
	
}
