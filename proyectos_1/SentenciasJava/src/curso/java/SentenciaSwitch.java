package curso.java;

public class SentenciaSwitch {

	public void sentenciaSwitch() {
		int dia = 10;
		switch (dia) {
			case 0:
				System.out.println("Lunes");
				break;
			case 1:
				System.out.println("Martes");
				break;
			case 2:
				System.out.println("Miercoles");
				break;
			case 3:
				System.out.println("Jueves");
				break;
			case 4:
				System.out.println("Viernes");
				break;
			case 5:
				System.out.println("Sabado");
				break;
			case 6:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("No es un dia de semana");
		}
	}
	
	public void sentenciaSwitch2() {
		char letra = 'a';
		switch (letra) {
			case 'a':
				System.out.println("es una vocal");
				break;
			default:
				System.out.println("no es una letra del alfabeto");
				break;
			case 'c':
				System.out.println("es una consonante");
				break;
		}
	}
	
	public void sentenciaSwitch3() {
		char letra = 't';
		switch (letra) {
			case 'c':
				System.out.println("es una consonante");
				break;
			case 't':
				System.out.println("es una consonante");
			case 'a':
				System.out.println("es una vocal");
			case 'e':
				System.out.println("es una vocal");
		}
	}

	public void sentenciaSwitch4() {
		String dia = "lunes";
		final String diaSemana = "jueves";
		switch (dia) {
			case "lunes":
				System.out.println("Es un lunes");
				break;
			default:
				System.out.println("No es un dia de semana");
				break;
			case "martes":
				System.out.println("Es un martes");
				break;
			case diaSemana:
				System.out.println("Es un " + diaSemana);
		}
	}
	
}
