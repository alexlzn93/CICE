
public class calculos_conMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double raiz=Math.sqrt(9);   //Metodo sqrt significa la raiz cuadrada de un numero
		System.out.println(raiz);
		
		
		
		double num1=6.58;
		double resultado=Math.round(num1);   //Metodo round lo que hace es redondear una cifra 
		System.out.println(resultado);
		
		double num2=5.56;  //el round redondea a 6 y num3 a 6
		double num3=6.21;
		int resultado2=(int)Math.round(num2+num3);  //Refundicion(el metodo round te devuelve un doble) y se refunde con (int) delante de la clase math
		System.out.println(resultado2);
		
		double base=4;
		double  exponente=3;
		double resultado3=Math.pow(base, exponente); //Metodo pow lo que hace es elevar un numero a una potencia 
		System.out.println("El resultado de "+base + " elevado a " + exponente + " es "+ resultado3);
				
		//Math.pow devuelve un numero de tipo double
	}

}
