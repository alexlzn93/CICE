package ejercicios.repaso1;

public class PuebaCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Coche micoche1= new Coche("rojo","Ford","Focus",150,5,"5642CFG");
		Coche micoche2= new Coche("verde","Ford","Focus",150,5,"5642CFG");
		Coche micoche3= new Coche("Amarillo","renault","clio",141,5,"5642VFG");
		Coche carro= new Coche();
		carro.setColor("VerdePistacho");
		System.out.println(micoche1);
		System.out.println(carro);
		
	}

}
