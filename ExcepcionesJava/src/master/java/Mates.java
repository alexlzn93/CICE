package master.java;

import master.java.excepciones.MiExcepcion;

public class Mates {
 
	public static int dividir(int a, int b) throws MiExcepcion {  //throws para lanzar mas de una excepcion de forma explicita
		if (b==0)throw new MiExcepcion ("El segundo valor debe ser distinto de cero");
		return a/b;
	}
}
