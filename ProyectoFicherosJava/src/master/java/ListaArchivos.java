package master.java;

import java.io.File;
import java.util.ArrayList;

public class ListaArchivos {

	public static void main(String[] args) {
		ArrayList<String> carpetas = getCarpetas("F:\\");
		for (String carpeta : carpetas) {
			System.out.println(carpeta);
		}
		ArrayList<String> archivos = getArchivos("F:\\");
		for (String archivo : archivos) {
			System.out.println(archivo);
		}
		int totalArchivos = 0;
		for (String archivo : archivos) {
			if (archivo.endsWith(".txt")) {
				totalArchivos++;
			}
		}
		System.out.println("Total Archivos .txt = " + totalArchivos);
	}

	static ArrayList<String> getCarpetas(String rutaDirectorio) {
		ArrayList<String> carpetas = new ArrayList<String>();
		File ruta = new File(rutaDirectorio);
		if (!ruta.exists()) {
			return carpetas;
		}
		for (File carpeta : ruta.listFiles()) {
			if (carpeta.isDirectory()) {
				carpetas.add(carpeta.getName());
			}
		}
		return carpetas;
	}
	
	static ArrayList<String> getArchivos(String rutaDirectorio) {
		ArrayList<String> archivos = new ArrayList<String>();
		File ruta = new File(rutaDirectorio);
		if (!ruta.exists()) {
			return archivos;
		}
		for (File archivo : ruta.listFiles()) {
			if (archivo.isFile()) {
				archivos.add(archivo.getName());
			}
		}
		return archivos;
	}
	
}
