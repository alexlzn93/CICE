package master.curso.java;

public class Numeros {

	public static void main(String[] args) {


				
		int valor=67;
		Integer numero=new Integer(8);
		double altura=192.78;
		Double altura2=new Double(200.45);
//		double doble_altura=altura2.doubleValue();
//		double suma=valor+numero.intValue();
		double doble_altura=altura2*3;
		double suma=valor+numero;

		System.out.println("la suma de ambos valores es "+suma);
		System.out.println("la altura doble es "+doble_altura);
		
	}

}
