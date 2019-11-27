import java.util.*;
public class Entrada_ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in); //se pone system.in para introducir informacion del exterior 
		System.out.println("Introduce tu nombre, por favor");
		String nombre_usuario=entrada.nextLine();     //introducir datos del exterior(entrada) y nextline siguiente intruccion
		
		System.out.println("Introduce tu edad ");
		
		int edad=entrada.nextInt();  // entrada para introdcuir datos y nextint para numero entero
		edad++;  //con incremento de sufijo lo que hago es incrementar la variable edad en 1
		System.out.println("Hola "+ nombre_usuario + " el año que viene tendras "+ edad + " años");
		
		if(edad>18) {
			System.out.println("Puedes pasar" + nombre_usuario);
			
		}
		else {
			System.out.println("No puedes pasar" + nombre_usuario);
		}
		
		
entrada.close();
	}

}
