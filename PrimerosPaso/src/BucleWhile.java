import java.util.Scanner;
public class BucleWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada= new Scanner(System.in);
		 System.out.println("Introduce tu usuario");
		String usuario=entrada.nextLine();
		
		System.out.println("Introduce tu contraseña");
		String clave=entrada.nextLine();
		
		while (usuario.equals(clave)==false	) {
			
			if (usuario.equals(clave)==false) {
				
				System.out.println("La contraseña es incorrecta");
				
				
				
			}
		}
		System.out.println("La contraseña es correcta");
	}

}
