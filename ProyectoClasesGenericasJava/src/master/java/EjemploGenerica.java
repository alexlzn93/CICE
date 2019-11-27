package master.java;

import master.java.clases.Chocolatina;
import master.java.clases.Golosina;
import master.java.genericas.Bolsa;

public class EjemploGenerica {

	public static void main(String[] args) {
		Bolsa<Golosina> golosinas = new Bolsa<Golosina>();  //T es igual a Golosina y en los arrayList solo se usan Instancias de clase NO dato tipo primitivo
		golosinas.add(new Golosina("Chicle"));
		golosinas.add(new Golosina("Gominola"));
		golosinas.add(new Golosina("Caramelo"));
		golosinas.add(new Golosina("Nube"));
		golosinas.addAll(new Golosina[] { new Golosina("Chicle"), new Golosina("Nube") });
		golosinas.addAll(new Golosina("Nubes"), new Golosina("Gominola"), new Golosina("Caramelo"));
		Golosina golosina = golosinas.get(3);
		System.out.println(golosina.getNombre());	
		for (Golosina chuche : golosinas) {
			System.out.println(chuche.getNombre());
		}
		
		Bolsa<Chocolatina> chocolatinas = new Bolsa<Chocolatina>();
		chocolatinas.add(new Chocolatina("Kinder"));
		chocolatinas.add(new Chocolatina("Twix"));
		chocolatinas.add(new Chocolatina("M&M's"));
		chocolatinas.add(new Chocolatina("Kit Kat"));
		chocolatinas.addAll(new Chocolatina[] { new Chocolatina("Kinder"), new Chocolatina("Twix") });
		chocolatinas.addAll(new Chocolatina("M&M's"), new Chocolatina("Kinder"), new Chocolatina("Kit Kat"));
		Chocolatina chocolatina = chocolatinas.get(5);
		System.out.println(chocolatina.getMarca());
		for (Chocolatina choco : chocolatinas) {
			System.out.println(choco.getMarca());
		}
	}

}
