import java.util.Scanner;
public class evalua_edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int edad=entrada.nextInt();
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
			
			}
		if(edad>30) {
			System.out.println("Eres adulto");
			
		}
		if (edad>70) {
			System.out.println("Eres anciano");
		}
		else  {
			System.out.println("Eres menor de edad");}
		
		
		}
		}
		
		
	


