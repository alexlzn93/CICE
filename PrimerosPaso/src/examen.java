import java.util.Scanner;

//Dependiendo del numero  que metas por consola te diga el dia de la semana que estas
public class examen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("Introduce numero de la semana");
		int dia_semana=entrada.nextInt(); //Le estoy pidiendo un dato de tipo int por eso nexInt()

		switch (dia_semana) {
		case 1:
			System.out.println("Es un lunes");
			break;
		case 2:
			System.out.println("Es un martes");
			break;
		case 3:
			System.out.println("Es un miercoles");
			break;
		case 4:
			System.out.println("Es un jueves");
			break;
		case 5:
			System.out.println("Es un viernes");
			break;
		case 6:
			System.out.println("Es un sabado");
			break;
		case 7:
			System.out.println("Es un domingo");
			break;
		default:
			System.out.println("error");	
		}
		entrada.close();
	}

}
