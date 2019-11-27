package master.java;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTexto {

	public static void main(String[] args) {
		BufferedReader archi = null;
		try {
			archi = new BufferedReader(new FileReader("F:\\Proyectos\\ejemplo.txt"));
			String linea;
			while((linea = archi.readLine()) != null) {
				System.out.println(linea);
			}
			archi.close();
		} catch (IOException ioe) {

		}
	}

}
