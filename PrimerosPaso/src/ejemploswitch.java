import java.util.Scanner;

public class ejemploswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduce dia de la semana ");
		String dia_semana=entrada.nextLine(); //Le estoy pidiendo un dato tipo String por eso nextLine()
		switch (dia_semana) {
			case "lunes":
				System.out.println("te quedan 4 dias para el viernes");
				break;
		
			case "martes":
				System.out.println("te quedan 3 dias para el vienres");
				break;
			case "miercoles":
				System.out.println("te quedan 2 dias para el viernes");
				break;
			case "jueves":
				System.out.println("te queda un dia para el viernes");
				break;
			case "viernes":
				System.out.println("Por fin ya es viernes");
				break;
			case "sabado":
				System.out.println("ya estas en el fin de semana");
				break;
			case "domingo":
				System.out.println("mañana es lunes");
				break;
			default:
				System.out.println("No es un dia de semana");
					
	}

}
}
