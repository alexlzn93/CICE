package ejercicio.cice.primero;

public class Persona {

	private String nombre;
	private int edad;
	private String dni;
	private String sexo;
	private int peso;
	private int altura;
	int imc;

	// CONSTRUCTOR POR DEFECTO

	public Persona() {
		
	}

	// CONSTRUCTOR NOMBRE,EDAD,SEXO
	public Persona(String nombre, int edad, String sexo) {
		nombre = "Alex";
		edad = 26;
		sexo = "Hombre";
		peso = 0;
		altura = 0;
		dni = "0";
	}

	// CONSTRUCTOR CON TODOS LOS ATRIBUTOS COMO PARAMETROS
	public Persona(String nombre, int edad, int peso, int altura, String dni) {
		this.nombre = "Alejandro";
		this.edad = 26;
		this.sexo = "Hombre";
		this.peso = 73;
		this.altura = 178;
		this.dni = "53478308L";
	}

	

	// calcularIMC metodo
	public int getIMC() { // getter

		if (imc < 20) {
			return -1;

		} else if (imc >= 20 && imc <= 25) {
			return 0;
		} else {
			return 1;
		}

	}

	public void setImc() {
		imc = peso / ((altura ^ 2) / 100);
	}

	// calcular mayor de edad
	public String calcularEdad() { // GETTER
		if (edad > 18) {
			return "Eres mayor de edad";
		} else {
			return "No eres mayor de edad";
		}

	}
}
