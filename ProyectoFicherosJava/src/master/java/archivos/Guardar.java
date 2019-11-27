package master.java.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Guardar<T> {

	public void guardarLista(ArrayList<T> lista, String nombreArchivo) {
		guardarLista(lista, new File(nombreArchivo));
	}
	
	public void guardarLista(ArrayList<T> lista, File nombreArchivo) {
		try {
			PrintWriter archivo = new PrintWriter(new FileWriter(nombreArchivo));
			for (T elemento : lista) {
				archivo.println(elemento.toString());
			}
			archivo.close();
		} catch(IOException ioe) {			
		}
	}
	
}
