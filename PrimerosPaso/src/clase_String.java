
public class clase_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre="Tamara";
		System.out.println("El nombre de mi amor es "+ nombre);
		
		System.out.println("El nombre de mi amor tiene "+ nombre.length()+ " letras"); /*nombre.lenght muestra el numero de 
		caracteres (letras) que tiene*/
		
		System.out.println("La cuarta letra de tu nombre es "+ nombre.charAt(3)); /* nombre.charAt muestra el caracter que 
		que nosotros le digamos siendo la primera letra el numero 0*/
		
		int ultima_letra;
		ultima_letra=nombre.length();
		System.out.println("La ultima letra de " + nombre + " es " + nombre.charAt(ultima_letra-1));
		
		//EJEMPLO
		
		String cliente="Fernando";
		System.out.println("El nombre de mi cliente es "+ cliente);
		System.out.println("El nombre de mi cliente tiene " + cliente.length() + "letras");
		System.out.println("La cuarta letra de su nombre es "+ cliente.charAt(3) );
		
		int penultima_letra=cliente.length(); //calcula el numero de caracteres de una cadena de texto
		System.out.println("La penultima letra de mi cliente es " + cliente.charAt(penultima_letra-2));
	}

}
