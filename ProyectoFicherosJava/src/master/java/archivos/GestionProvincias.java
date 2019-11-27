package master.java.archivos;

import java.io.File;
import java.util.ArrayList;

public class GestionProvincias {

	public static void main(String[] args) {
		String archivoProvincias="F:\\proyectos\\datasets\\provincias.txt";
		
		Fichero.mostrarArhivoTexto(archivoProvincias);
		
		File comunidad = new File("F:\\proyectos\\datasets\\comunidades.txt");
		//System.out.println("---------------------------------------------");
		//Fichero.mostrarArhivoTexto(comunidad);
		//File imagen = new File("F:\\proyectos\\datasets\\imagen.png");
		/*for (Provincia provincia : Fichero.getFicheroProvincia(archivoProvincias)) {
			System.out.println(provincia.nombreProvincia.toUpperCase());
		}*/
		String texto = Fichero.leerArhivoTexto(archivoProvincias);
		//System.out.println(texto);
		ArrayList<Comunidad> comunidades = new ArrayList<Comunidad>();
		ArrayList<Provincia> provincias = new ArrayList<Provincia>();
		
	}
	
	
}
