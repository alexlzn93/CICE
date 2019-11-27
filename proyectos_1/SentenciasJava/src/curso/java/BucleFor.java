package curso.java;

public class BucleFor {

	public void bucleFor() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Numero: " + i);
		}
	}
	
	public void numeroImpares() {
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	
	public void bucleAnidado() {
		for (int fila = 1; fila < 3; fila = fila + 1) {
			for (int col = 1; col < 3; col += 1) {
				System.out.println(fila * col);
			}
		}
	}
	
	public void bucleConBreak() {
		for (int numero = 1; numero < 20; numero++) {
			if (numero == 12) {
				break;
			} else {
				System.out.println(numero);
			}
		}
	}
	
	public void bucleConContinue() {
		for (int numero = 1; numero < 20; numero++) {
			if (numero % 2 == 1) {
				continue;
			} else {
				System.out.println(numero);
			}
		}
	}
	
}
