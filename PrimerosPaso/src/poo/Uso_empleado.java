package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//PRIMERA FORMA: LLAMANDO A CADA OBJETO EMPLEADO Y METIENDO SUS VALORES POR ARGUMENTOS
		
		/*Empleado empleado1 = new Empleado("Alex", 1490, 2012,10,25);
		Empleado empleado2 = new Empleado("Vero", 1640, 2009,7,9);
		Empleado empleado3 = new Empleado("Paco", 8690, 2017,11,17);
		empleado1.setSueldo(5); //llamo al metodo setter para meterle el porcentaje de cada empleado
		empleado2.setSueldo(9);
		empleado3.setSueldo(7);
		System.out.println("Nombre: " + empleado1.getNombre()+ " tiene un sueldo de " + empleado1.getSueldo()
		+ "euros " + "dado de alta el " + empleado1.getFecha());
		System.out.println("Nombre: " + empleado2.getNombre()+ " tiene un sueldo de " + empleado2.getSueldo()
		+ "euros " + "dado de alta el " + empleado2.getFecha());
		System.out.println("Nombre: " + empleado3.getNombre()+ " tiene un sueldo de " + empleado3.getSueldo()
		+ "euros " + "dado de alta el " + empleado3.getFecha());*/
		
		//SEGUNDA FORMA:CREANDO UN ARRAY DE OBJETOS EMPLEADOS
		Jefatura jefe1= new Jefatura("Pedro",1452.3,2003,3,5);
		jefe1.setIncentivo(235.65);
		System.out.println(jefe1.toString());
		
		Empleado[] mis_empleados= new Empleado[5]; //array de la clase Empleado
		mis_empleados[0]= new Empleado("Alex", 1490,2012,10,25);
		mis_empleados[1]= new Empleado("Vero",1640,2009,7,9);
		mis_empleados[2]= new Empleado("Paco",5640,2005,4,6);
		mis_empleados[3]= new Jefatura("Angel",2154,2006,8,24); //POLIMORFISMO
		mis_empleados[4]= jefe1;  //POLIMORFISMO EQUIVALENTE
		for(Empleado e: mis_empleados) {  //bucle for-each (tipo de dato (Empleado) nombre del bucle (e) y nombre de la lista a iterar(mis_empleados)
			e.setSueldo(5);
			System.out.println("Nombre " + e.getNombre() + " Sueldo " + e.getSueldo() + " Fecha: " + e.getFecha());
		
		}
		
	}

}

class Empleado {
	
	public Empleado(String nom , double sue, int año, int mes, int dia) { //constructor con varios parametros
		nombre=nom;  //parametro nom
		sueldo=sue;  //parametro sue
		GregorianCalendar calendario= new GregorianCalendar(año, (mes-1), dia); //creo un objeto y le digo los parametros q va a recibir
		altacontrato=calendario.getTime(); //getTime me devuelve la fecha en formato Date
	}
	public Empleado(String nom) {
		this(nom,3000,2010,5,23); //con this llamo al constructor de 5 parametros pero solo modifico el nom
	}
	
	public String getNombre(){  //GETTER
		return nombre;
	}
	public double getSueldo() { //getter
		return sueldo;
	}
	public Date getFecha() {  //getter
		return altacontrato;
	}
	public void setSueldo(double porcentaje) {
		double aumento=sueldo* porcentaje/100;
		sueldo=sueldo+aumento;
	}
	//Declaracion de variables de clase
	private String nombre;
	private double sueldo;
	private Date altacontrato;
}
class Jefatura extends Empleado {
	public Jefatura(String nom , double sue, int año, int mes, int dia) {
		super(nom,sue,año,mes,dia); //llama al constructor de la clase padre
	}
	public void setIncentivo(double prima) {
		incentivo=prima;
	}
	@Override
	public double getSueldo() {
		double sueldo_jefe= super.getSueldo();  //con super llamo al metodo getSueldo de la clase Empleado
		return sueldo_jefe + incentivo;
	}
	public String toString() {
		return " El nombre del jefe es: " + getNombre()+ " y su sueldo total es: " + getSueldo(); 
	}
	private double incentivo;
	
}
