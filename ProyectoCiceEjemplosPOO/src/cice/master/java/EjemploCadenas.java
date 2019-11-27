package cice.master.java;

public class EjemploCadenas {

	public static void main (String[]args) {
		//tardara mucho la consola en ejecutar
		String letras= "";// cadena vacia  la clase String es inmutable
		
		for (int i=0;i<1000; i++) {
			letras=letras+"a";
		}
		System.out.println(letras);
		
		//con stringBuilder tardara mucho menos en ejecutar
		StringBuilder cadena= new StringBuilder(""); //StringBuuilder es un contenedor de cadenas es como crear un objeto operador new
		for (int i=0;i<1000; i++) {
			cadena.append("a");
		}
		System.out.println(cadena.toString());
	}
}
