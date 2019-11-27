
public class EjerciciosAlex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ejercicio 1:
		
		/*String nombre=("Alex");
		String direccion=("Av Pablo Iglesias");
		int telefono= 687522271;
		System.out.println("Mi nombre es" + nombre );
		System.out.println("vivo en"+ direccion);
		System.out.println("mi telefono es "+ telefono);*/
	
		
//Ejercicio 2:
		int x=150;
		int y=458;
		int suma=x+y;
		int resta=x-y;
		double division=x/y;
		int multi=x*y;
		System.out.println("El resultado de sumar "+ x +" mas " + y +" es " + suma); 
		System.out.println("el resultado de dividir "+ x + "entre"+ y + "es"+ division);
		
/*Ejercicio3: Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
		convertir deberá estar almacenada en una variable.*/
		  
		final double pesetas=166.386;
		double euro=4.65;
		double  result= Math.round(pesetas*euro);
		
		System.out.println(euro + "son "+ result + "pesetas");
		
		String nombre="Pedro";
		System.out.println("El nombre de "+ nombre + " tiene "+ nombre.length()+ "letras");
		System.out.println("la posicion de la letra numero 3 de "+ nombre + " es "+ nombre.charAt(2));
		
		//Decir la penultima letra de una cadena de caracteres
		
		String nombre1="Pedro";
		int penultima_letra=(nombre1.length());  // 6
		System.out.println("El nombre tiene "+ nombre1.length()+ "letras" );
		System.out.println("La penultima letra de " + nombre1 + " es " + nombre1.charAt(penultima_letra-2) );
		
		//Si dos cadenas de caracteres son iguales
		//el metodo equals devuelve un dato booleano es decir true o false
		String name1="juan";
		String name2="Juan";
		System.out.println(name1.equals(name2));  
		System.out.println(name1.equalsIgnoreCase(name2));
	}

}
