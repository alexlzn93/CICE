package ejercicio.array;
/*1- Realizar un programa que solicite por teclado 10 números y los aguarde en un array, mostrar en 
pantalla todos aquellos números que superen la media aritmética y, visualizar también todos los 
números que sean múltiplos de 5.*/
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner entrada= new Scanner(System.in);
		double []numeros = new double[10];
		for (int indice=0; indice<numeros.length; indice++) {
			System.out.println("Introduzca  numero:");
			numeros[indice] = entrada.nextDouble();
		}
		
		double media; 
		double sumaTotal= 0.0;
		for(int i=0; i< numeros.length; i++) {
			sumaTotal+=numeros[i];
		}
		media=sumaTotal / numeros.length;
		System.out.println("Media aritmetica" + media);
		for (int i=0; i< numeros.length; i++) {
			if (numeros[i]> media){
				System.out.println(numeros[i]);
			}
		}
		for (int i=0; i< numeros.length; i++) { //multiplos de 5
			if (numeros[i] % 5 ==0) {
				System.out.println(numeros[i]);
			
		}
		}
	}

}
