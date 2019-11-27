package curso.java;

public class SentenciaIf {

	public void sentenciaIf() {
		int edad = 23;
		if (edad > 18) {
			System.out.println("Mayor de edad");
		}
	}

	public void sentenciaIfElse() {
		double alto = 12.13;
		if (alto > 18) {
			System.out.println("El alto es excesivo");
		} else {
			System.out.println("El alto es inferior");
		}
	}

	public void sentenciaIfAnidada() {
		int edad = 23;
		if (edad > 17) {
			System.out.println("Es mayor de edad");
		} else {
			if (edad < 17) {
				System.out.println("Es mayor de edad");
			} else {
				System.out.println("La edad es igual a 17");
			}
		}
	}

	public void sentenciaIfMultiple() {
		int diaSemana = 6;
		if (diaSemana == 1) {
			System.out.println("Lunes");
		} else if (diaSemana == 2) {
			System.out.println("Martes");
		} else if (diaSemana == 3) {
			System.out.println("Miercoles");
		} else if (diaSemana == 4) {
			System.out.println("Jueves");
		} else if (diaSemana == 5) {
			System.out.println("Viernes");
		} else if (diaSemana == 6) {
			System.out.println("Sabado");
		} else if (diaSemana == 7) {
			System.out.println("Domingo");
		}
	}
	
}
