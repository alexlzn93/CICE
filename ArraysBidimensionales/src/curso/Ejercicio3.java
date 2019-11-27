package curso;

public class Ejercicio3 {

	public static void main(String[] args) {

		float[] numeros = new float[4];
		for (int f = 0; f < numeros.length; f++) {
			numeros[f] = (float)f;
		}
		for (int f = 0; f < numeros.length; f++) {
			System.out.println(numeros[f]);
			
		}
		// redimensionar un array
		numeros = new float[8];
	}

}
