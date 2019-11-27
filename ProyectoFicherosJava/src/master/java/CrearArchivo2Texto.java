package master.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CrearArchivo2Texto {

	public static void main(String[] args) {
		PrintWriter archivo = null; //lo inicializo a null por si no exixte lo crea
		try {
			archivo = new PrintWriter("C:\\Users\\Alex\\Downloads\\datasets\\ficheroprueba2.txt");
			archivo.write("Estoy creando un archivo .txt");
			
			archivo.close();
		} catch(IOException ioe) {
			
		}
	

		//Sin inicializarlo a null creo yo el archivo manualmente
		try {
			FileWriter fichero = new FileWriter("C:\\Users\\Alex\\Downloads\\datasets\\ficheroprueba3.txt");
		
			fichero.write("No inicializo a null y creo yo el archivo manualmente");
			fichero.close();
		}catch(IOException ioe) {
		
		}
	}
	

}
