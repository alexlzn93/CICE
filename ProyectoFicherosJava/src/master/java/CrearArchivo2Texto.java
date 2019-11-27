package master.java;

import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo2Texto {

	public static void main(String[] args) {
		PrintWriter archivo = null;
		try {
			archivo = new PrintWriter("F:\\Proyectos\\ejemplo2.archi");
			for (int i = 0; i < 20; i++) {
				archivo.println("Mi cadena de texto linea " + i);
			} 
			archivo.close();
		} catch(IOException ioe) {
			
		}
	}

}
