package curso.java;

public class BucleWhile {

	public void bucleWhile() {
		int maximo = 8;
		int numero = 0;
		while (numero < maximo) {
			System.out.println(numero);
			numero += 1;
		}
	}
	
	public void bucleWhileAnidado() {
		int num = 3;
		while (num > 0) {
			int valor = 4;
			while (valor < 7) {
				System.out.println(valor);
				valor += 2;
			}
			num = num - 1;
		}
	}
	
	public void bucleWhileConBreak() {
		int maxima = 88;
		while (maxima < 100) {
			if (maxima != 92) {
				System.out.println(maxima);
				maxima += 2;
			} else {
				break;
			}
		}
	}

	public void bucleWhileConContinue() {
		int numero = 34;
		while (numero++ < 50) {
			if (numero % 2 == 0) {
				System.out.println(numero);
			} else {
				continue;
			}
		}
	}

	public void bucleWhileInfinito() {
		int numero = 6;
		while (numero < 8) {
			System.out.println(numero);
		}
	}
	
	public void bucleWhileInfinito2() {
		boolean continuar = true;
		while (continuar) {
			System.out.println("Es un bucle infinito");
		}
	}
	
}

