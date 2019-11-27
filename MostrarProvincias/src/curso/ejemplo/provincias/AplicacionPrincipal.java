package curso.ejemplo.provincias;

import java.util.ArrayList;
import java.util.HashMap;

public class AplicacionPrincipal {

	public static void main(String[] args) {
		String archivoProvincias = "C:\\Users\\Alex\\Downloads\\datasets\\provincias.txt";
		String archivoComunidades = "C:\\Users\\Alex\\Downloads\\datasets\\comunidades.txt";
		String archivoGuardar = "C:\\Users\\Alex\\Downloads\\datasets\\provincias.comunidades.txt";
		Consulta consultar = new Consulta();
		HashMap<Integer, String> comunidades = consultar.getComunidades(archivoComunidades);
		ArrayList<String> lineasArchivo = consultar.leerArchivo(archivoProvincias);
		ArrayList<String> listaComunidades = new ArrayList<String>();
		for (String linea : lineasArchivo) {
			String[] campo = linea.split(";");
			listaComunidades.add(campo[1] + ", " + comunidades.get(Integer.parseInt(campo[2])));
		}
		consultar.guardar(listaComunidades, archivoGuardar);

		/*
		 * Primera primera = new Primera(); primera.mostrar(); String n =
		 * primera.getNombre(); int x = primera.getValor(); IMetodos segunda = new
		 * Hija(); //segunda.getNombre(); System.out.println(segunda.getValor());
		 * segunda.mostrar();
		 */
	}

}
