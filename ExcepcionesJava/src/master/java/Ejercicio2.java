package master.java;

import master.java.excepciones.MiExcepcion;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rdo= 0;
		try {
			rdo=Mates.dividir(6, 0);
		}catch (MiExcepcion me){
			System.out.println(me.getMessage());
		}
	}

}
