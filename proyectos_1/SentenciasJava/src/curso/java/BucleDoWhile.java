package curso.java;

public class BucleDoWhile {

	public void bucleDoWhile() {
		int numero = 0;
		do {
			System.out.println(numero);
			numero += 3;
		} while (numero < 10);
	}
	
	public void bucleDoWhileConBreak() {
		int numeros = 7;
		do {
			if (numeros == 23) {
				break;
			} else {
				System.out.println(++numeros);
			}
		} while (numeros < 100);
	}
	
	public void bucleDoWhileConContinue() {
		int posicion = 3;
		do {
			if (++posicion == 7) {
				continue;
			} else {
				System.out.println(posicion);
			}
		} while (posicion != 31);
	}

}
