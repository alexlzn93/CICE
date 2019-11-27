import java.util.Scanner;

public class edades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu nombre ");
		
		String nombre=entrada.nextLine();
		
		System.out.println("Introduce tu edad");
		int edad=entrada.nextInt();
		
		if (edad<18) {
			System.out.println("Eres adolescente");
		}
		else if(edad<30) {
			System.out.println("Eres joven");
		}
		else if (edad<65) {
			System.out.println("Eres anciano");
		}
		else {
			System.out.println("Cuidate");
		}
		
		
		
	} 

}
