import javax.swing.*;
public class Entrada_numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double x=10000.0;
		
		System.out.printf("%1.2f", + x/3); // "%1.2f" , da formato al resultado, el 2 significa dos decimales printf inprime con forma
		
		
		String num1=JOptionPane.showInputDialog("Introduce un numero");
		
		double num2=Double.parseDouble(num1); //Double.parseDouble convierte un numero entero en decimal
		
		System.out.print("La raiz de "+ num2 + " es ");
		System.out.printf("%1.2f", Math.sqrt(num2)); // tiene que ser un numero doble xk la clase math.sqrt devuelve un doble
		
		

	}

}
