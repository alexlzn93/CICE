package master.java;

import java.io.File;

public class CrearDir {

	public static void main(String[] args) {
		File directorio = new File("F:/NuevaCarpeta");  //creo un objeto de tipo File
		if (!directorio.exists()) {
			directorio.mkdir(); //mkdir crea el directorio si no exixte
		} else {
			directorio.delete();
		}		
	}

}
