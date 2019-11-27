package cice.master.java.ejer3;

public class Comercial extends Empleado {
	 //Atributos
    private double comision;
 
    //Constructores
    public Comercial(double comision, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.comision = comision;
    }
 
    //Metodos
    public double getComision() {
        return comision;
    }
 
    public void setComision(double comision) {
        this.comision = comision;
    }
 
    @Override
    public String toString() {
        return super.toString() + " comision=" + comision;
    }
 
    /**
     * Si tiene más de 30 años y la comisión es mayor que 200, aumentamos el
     * sueldo al empleado
     */
    @Override
    public boolean plus() {
        if (super.getEdad() > 30 && this.comision > 200) {
            //Con super. llamo a un método de la clase padre
            double nuevoSalario = super.getSalario() + super.PLUS;
            super.setSalario(nuevoSalario);
            System.out.println("Se le añadido el plus, al empleado " + super.getNombre());
            return true;
        }
        return false;
    }
    
}
