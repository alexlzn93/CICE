package cice.master.java.ejer1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		proceso();
	}

	public static void proceso() {
		Scanner sc = new Scanner(System.in);

		// Introducimos los datos
		System.out.println("Introduce el nombre");
		String nombre = sc.next();

		System.out.println("Introduce la edad");
		int edad = sc.nextInt();

		System.out.println("Introduce el sexo");
		char sexo = sc.next().charAt(0);

		System.out.println("Introduce el peso");
		double peso = sc.nextDouble();

		System.out.println("Introduce la altura");
		double altura = sc.nextDouble();
		sc.close();
		
		// Creamos objetos con cada constructor
		Persona persona1 = new Persona(nombre, edad, sexo, peso, altura); //contructor de todos los parametros
		Persona persona2 = new Persona(nombre, edad, sexo); //nombre edad y peso
		Persona persona3 = new Persona();  //constructor por defecto
		
		// Los datos que no esten completos los insertamos con los metodos setter
		persona2.setNombre("Mario");
		persona2.setEdad(31);
		persona2.setSexo('H');
		persona2.setPeso(90.5);
		persona2.setAltura(1.80);

		// Usamos metodos para realizar la misma accion para cada objeto
		System.out.println("Persona1");
		muestraMensajePeso(persona1);
		muestraMayorDeEdad(persona1);
		System.out.println(persona1.toString());

		System.out.println("Persona2");
		muestraMensajePeso(persona2);
		muestraMayorDeEdad(persona2);
		System.out.println(persona2.toString());

		System.out.println("Persona3");
		muestraMensajePeso(persona3);
		muestraMayorDeEdad(persona3);
		System.out.println(persona3.toString());
	}

	public static void muestraMensajePeso(Persona p) {
		int IMC = p.calcularIMC();
		switch (IMC) {
		case Persona.PESO_IDEAL:
			System.out.println("La persona esta en su peso ideal");
			break;
		case Persona.INFRAPESO:
			System.out.println("La persona esta por debajo de su peso ideal");
			break;
		case Persona.SOBREPESO:
			System.out.println("La persona esta por encima de su peso ideal");
			break;
		}
	}

	public static void muestraMayorDeEdad(Persona p) {
		if (p.esMayorDeEdad()) {
			System.out.println("La persona es mayor de edad");
		} else {
			System.out.println("La persona no es mayor de edad");
		}
	}

}
