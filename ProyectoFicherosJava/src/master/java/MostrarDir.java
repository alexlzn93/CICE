package master.java;

import java.io.*;

public class MostrarDir {

	public static void main(String[] args) {
		String directorio = "F:\\";
		File archivos = new File(directorio);
		for (File archivo : archivos.listFiles()) {
			if (archivo.isFile() && (archivo.getName().endsWith(".txt"))) {
				System.out.println(archivo.toString());
			}
		}
	}

}
