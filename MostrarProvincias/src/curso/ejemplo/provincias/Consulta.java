package curso.ejemplo.provincias;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

public class Consulta {
//En un arrayList guardamos las provincias 
	public ArrayList<String> leerArchivo(String nombreArchivo) {  //"getter" metodo arraylist que recibe como parametro nombreArchivo
		ArrayList<String> lineasArchivo = new ArrayList<String>(); //instacia del ArrayList
		BufferedReader archivo = null;
		try {
			//BufferedReader para leer lineas completas de una secuencia de entrada
			 archivo = new BufferedReader(new FileReader(nombreArchivo));  
			String linea = "";
			while (linea != null) {
				linea = archivo.readLine();
				if (linea != null) {
					lineasArchivo.add(linea);
				}
			}
			archivo.close();			
		} catch(IOException ioe) {
		}
		return lineasArchivo;
	}
	// en un hashmap guardamos las comunidades porque tiene dos campos Ej 1;Andalucia Y se toma como clave -valor(HashMap)
	public HashMap<Integer, String> getComunidades(String nombreArchivo) {
		HashMap<Integer, String> mapa = new HashMap<Integer, String>();
		for (String linea : leerArchivo(nombreArchivo)) {
			String[] campo = linea.split(";");
			mapa.put(Integer.parseInt(campo[0]), campo[1]);
		}
		return mapa;
	}
	
	public void guardar(ArrayList<String> lista, String nombreArchivo) {
		PrintWriter salida = null;
		try {
			salida = new PrintWriter(new FileWriter(nombreArchivo));
			for (String linea : lista) {
				salida.println(linea);
			}
		} catch (FileNotFoundException fnfe) {		
		}catch (IOException ioe) {
		} finally {
			if (salida != null) salida.close();
		}
	}
	
}
