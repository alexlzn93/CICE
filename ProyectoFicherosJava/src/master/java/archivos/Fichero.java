package master.java.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class Fichero {

	public static String leerArhivoTexto(String nombreArchivo) {
		return leerArhivoTexto(new File(nombreArchivo));
	}

	public static String leerArhivoTexto(File nombreArchivo) {
		BufferedReader archivo = null;
		StringBuilder texto = new StringBuilder("");
		try {
			archivo = new BufferedReader(new FileReader(nombreArchivo));
			String linea;
			while ((linea = archivo.readLine()) != null) {
				texto.append(linea + " ");
			}
			archivo.close();
		} catch (IOException ioe) {
		}
		return texto.toString();
	}

	public static void mostrarArhivoTexto(String nombreArchivo) {
		mostrarArhivoTexto(new File(nombreArchivo));
	}

	public static void mostrarArhivoTexto(File nombreArchivo) {
		BufferedReader archivo = null;
		try {
			archivo = new BufferedReader(new FileReader(nombreArchivo));
			String linea;
			while ((linea = archivo.readLine()) != null) {
				System.out.println(linea);
			}
			archivo.close();
		} catch (IOException ioe) {
		}
	}

	public static ArrayList<String> leerArhivoTextoLista(String nombreArchivo) {
		return leerArhivoTextoLista(new File(nombreArchivo));
	}
	
	public static ArrayList<String> leerArhivoTextoLista(File nombreArchivo) {
		BufferedReader archivo = null;
		ArrayList<String> lista = new ArrayList<String>();
		try {
			archivo = new BufferedReader(new FileReader(nombreArchivo));
			String linea = "";
			while (linea != null) {
				linea = archivo.readLine();
				if (linea != null) {
					lista.add(linea);
				}
			}
			archivo.close();
		} catch (IOException ioe) {
		}
		return lista;
	}
	
	public static ArrayList<Provincia> getFicheroProvincia(String nombreArchivo) {
		return getFicheroProvincia(new File(nombreArchivo));
	}
	
	public static ArrayList<Provincia> getFicheroProvincia(File nombreArchivo) {
		ArrayList<Provincia> listaProvincias = new ArrayList<Provincia>();
		for (String campos : leerArhivoTextoLista(nombreArchivo)) {
			String[] campo = campos.split(";");
			Provincia provincia = new Provincia();
			provincia.id = Integer.parseInt(campo[0]);
			provincia.nombreProvincia = campo[1];
			provincia.idComunidad = Integer.parseInt(campo[2]);
			listaProvincias.add(provincia);
			
			/*Provincia provincia2 = new Provincia(
					Integer.parseInt(campo[0]), 
					campo[1], 
					Integer.parseInt(campo[2]));
			
			listaProvincias.add(provincia2);
			
			listaProvincias.add(new Provincia(
					Integer.parseInt(campo[0]), 
					campo[1], 
					Integer.parseInt(campo[2])));*/
		}
		return listaProvincias;
	}
	
	public static ArrayList<Comunidad> getFicheroComunidad(String nombreArchivo) {
		return getFicheroComunidad(new File(nombreArchivo));
	}
	
	public static ArrayList<Comunidad> getFicheroComunidad(File nombreArchivo) {
		ArrayList<Comunidad> listaComunidades = new ArrayList<Comunidad>();
		for (String campos : leerArhivoTextoLista(nombreArchivo)) {
			String[] campo = campos.split(";");
			Comunidad comunidad = new Comunidad();
			comunidad.id = Integer.parseInt(campo[0]);
			comunidad.nombreComunidad = campo[1];
			listaComunidades.add(comunidad);
		}
		return listaComunidades;
	}
	
	public static void guardarTexto(ArrayList<String> lista, String nombreArchivo) {
		Guardar<String> guardar = new Guardar<String>();
		guardar.guardarLista(lista, nombreArchivo);
	}
	
	public static void guardarComunidades(ArrayList<Comunidad> comunidades, String nombreArchivo) {
		Guardar<Comunidad> guardar = new Guardar<Comunidad>();
		guardar.guardarLista(comunidades, nombreArchivo);
	}
	
	public static void guardarProvincias(ArrayList<Provincia> provincias, String nombreArchivo) {
		try {
			PrintWriter archivo = new PrintWriter(new FileWriter(nombreArchivo));
			for (Provincia elemento : provincias) {
				archivo.println(elemento.toString());
			}
			archivo.close();
		} catch(IOException ioe) {			
		}
	}

}

