package master.java;

import java.io.File;

public class CrearDir {

	public static void main(String[] args) {
		File directorio = new File("F:/NuevaCarpeta");
		if (!directorio.exists()) {
			directorio.mkdir();
		} else {
			directorio.delete();
		}		
	}

}
