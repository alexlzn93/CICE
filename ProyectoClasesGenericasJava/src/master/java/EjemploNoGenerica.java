package master.java;

import master.java.clases.Chocolatina;
import master.java.clases.Golosina;
import master.java.nogenerica.Bolsa;

public class EjemploNoGenerica {  //puedes meter cualquier tipo a la lista porque almacena todos los tipos de Object

	public static void main(String[] args) {
		Bolsa bolsa = new Bolsa();  //La funcionalidad de esta clase es una coleccion
		Chocolatina chocolatina1 = new Chocolatina("Kit Kat");
		Chocolatina chocolatina2 = new Chocolatina("Kinder");
		
		Golosina golosina1 = new Golosina("Chicle");
		Golosina golosina2 = new Golosina("Caramelo");
		Golosina golosina3 = new Golosina("Nube");
	
		bolsa.add(golosina1);
		bolsa.add(golosina2);
		bolsa.add(chocolatina1);
		bolsa.add(golosina3);
		bolsa.add(chocolatina2);

		for (Object elemento : bolsa) {
			if (elemento instanceof Chocolatina) {
				Chocolatina chocolatina = (Chocolatina) elemento;
				System.out.println(chocolatina.getMarca());
			} else if (elemento instanceof Golosina){
				Golosina golosina = (Golosina) elemento;
				System.out.println(golosina.getNombre());
			}
		}
	
		bolsa.showAll();
	}

}
