
public class numeroRandom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero = (int) (Math.random() * 100);
        int intentos=0;
		
		while(numero!=0) {
			if (numero==0) break;
			System.out.println("que suerte");
			if (numero!=0) {
				System.out.println("sigue intentandolo");
				intentos++;
			}
		}
	}

}
