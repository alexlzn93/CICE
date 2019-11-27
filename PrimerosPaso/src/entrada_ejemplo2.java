import javax.swing.*;
public class entrada_ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre");
				
		String edad=JOptionPane.showInputDialog("Introduce tu edad"); //variable edad en un string xk joption devuelve un string
		
		int edad_usuario=Integer.parseInt(edad);//parseint para cambiar de string a numero entero int
		
		edad_usuario ++;  //tambien funcionaria igual pero habria que quitar el +1 de edad_usuario
			
			System.out.println("Hola "+ nombre_usuario + " el año que viene tendras " + (edad_usuario+1) + " años");
			// tenemos que hacer una nueva variable ya que para sumarle uno hay que declarar una variable de tipo int edad_usuario
			
			System.out.println("Hola "+ nombre_usuario + " el año que viene tendras " + edad_usuario + " años");
				
	}

}
