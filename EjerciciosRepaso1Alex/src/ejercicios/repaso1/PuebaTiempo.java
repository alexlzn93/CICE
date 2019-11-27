package ejercicios.repaso1;

public class PuebaTiempo {

	public static void main(String[] args) {
		
		Tiempo primer = new Tiempo(14,34,12);
		System.out.println(primer); 
		primer.setHora(11);
		System.out.println(primer);
		Tiempo segun = new Tiempo(23,51,30);
		segun.setHora(16);
		System.out.println(segun);
	}

}
