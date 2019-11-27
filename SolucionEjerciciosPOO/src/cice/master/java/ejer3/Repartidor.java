package cice.master.java.ejer3;

public class Repartidor extends Empleado {
	//Atributos
    private String zona;
 
    //Constructores
    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }
 
    //Metodos
    public String getZona() {
        return zona;
    }
 
    public void setZona(String zona) {
        this.zona = zona;
    }
 
    @Override
    public String toString() {
        return super.toString() + " zona=" + zona;
    }
 
    /**
     * Si tiene menos de 25 a�os y la zona es "zona 3",
     * aumentamos el sueldo al empleado
     */
    @Override
    public boolean plus() {
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {
            //Con super. llamo a un m�todo de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le a�adido el plus, al empleado "+super.getNombre());
            return true;
        }
        return false;
    }
}
