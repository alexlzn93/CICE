
public class Bucle_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array de tipo int
		int[] miarray= {1,5,6,3,7,12,8};
		for(int numeros: miarray) { //bucle for-each sintaxis for(tipo variable :array)
			System.out.println(numeros);
		}
	
		//Array de tipo String
		String [] miarray2= {"pedro","oscar","juan","alex","tamara","jose"};
		int x;
		for ( x=0; x<miarray2.length; x++) { //Bucle for tradicional
			System.out.println(miarray2[x]);
		}
	}

}
