
public class Declaraciones_operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* final double apulgadas=2.54;    //final=declarar una constante
		 double cm=6;
		 double resultado=cm/apulgadas;
		 
		
		System.out.println("En "+cm + " cm hay "+ resultado+ " pulgadas");
		
		int x=25;
		int d=2;
		double division=(double) x/2; //se llama hacer un cast
		System.out.println("El resultado de dividir" + x + "entre "+ d +" es igual a "+ division);
		
		
		int a=7;
		int b=3;
		int suma=a+b;
		
		suma-=7;
		System.out.println(suma);*/
		
		int num1=2; //Pre-incremento primero incrementa la variable y despues la guarda como su valor
		int num2=++num1;  //++num1=3 y guarda en num2 su valor que es 3
		System.out.println(num2);  // num1= 3 y num2=3
		
		int num3=2;  //Post-incremento primero se calcula el resultado y despues se incrementa
		int num4=num3++;
		System.out.println(num3);
		System.out.println(num4);
		  //num4=2 num3=3
		
		int t=4;
		System.out.println(t++); //primero t vale 4 porq no suma de uno en uno hasta q no se ejecuta.
		System.out.println(t++); // aqui ya t vale 5 porque le a sumado uno despues de que se ha ejecutado
		 
		
		
	
	}

}
