package cice.master.java;

public class EjemploMetodos {

	public static int sumatorio(int...numeros) {  //lista de argumentos pero todos con el mismo valor numeros es una Arrays de int
		int suma=0;
		for( int n: numeros) {
			suma+=n;
		}
		return suma;
	}
}
