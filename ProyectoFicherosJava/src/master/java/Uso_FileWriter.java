package master.java;

import java.io.*;

public class Uso_FileWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileWriter fichero = null; //lo inicializo a null por si no exixte el fichero lo crea
		try {
			// creo y escribo en el fichero (ficheroprueba.txt) con FileWriter, creo un objeto de tipo FileWriter
			fichero = new FileWriter("C:\\Users\\Alex\\Downloads\\datasets\\ficheroprueba.txt");
			fichero.write(126);
			fichero.write("Te amo mi vida"); // .write escribo un String
			fichero.write(126); // .write escribo un caracter char Unicode
			fichero.close();// importante cerrarlo para guardarlo close();

		} catch (IOException ioe) {

		}
	}

}
