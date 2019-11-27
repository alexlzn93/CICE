package master.java;

import java.io.FileWriter;
import java.io.IOException;

public class CrearArchivoTexto {

	public static void main(String[] args) {

		FileWriter archivo = null;
		try {
			archivo = new FileWriter("F:\\Proyectos\\ejemplo.txt");
			for (int i = 0; i < 10; i++) {
				archivo.write("Mi cadena de texto linea " + i + "\r\n");
			}
		} catch (IOException ioe) {
			System.out.println("Error de creacion del archivo");
		} finally {
			if (archivo != null) {
				try {
					archivo.close();
				} catch (IOException iio) {
				}
			} else {
				System.out.println(archivo);
			}
		}

	}

}
