package ejercicios.repaso1;

/*10 - Crear una clase Tiempo, con atributos hora, minuto y segundo, que pueda ser constru�da indicando 
los tres atributos, s�lo la hora y minuto o s�lo la hora. Crear adem�s los m�todos necesarios para 
modi?car la hora en cualquier momento de forma manual. Mantenga la integridad de los datos en todo 
momento. Crear una clase PruebaTiempo que prueba una hora concreta y la modi?que a su gusto mostr�ndola 
por pantalla.*/
public class Tiempo {

	private int hora;
	private int minuto;
	private int segundo;
	
	public Tiempo(int hora, int minuto, int segundo) {
		this.hora=hora;
		this.minuto=minuto;
		this.segundo=segundo;
	}
	public Tiempo( int hora, int minuto) {
		this.hora=hora;
		this.minuto=minuto;
	}
	public Tiempo (int hora) {
		this.hora=hora;
	}
	public int getHora() {  //getter
		return hora;
	}
	public void setHora(int hora) {  //setter
		this.hora=hora;
	}
	public String toString() {  //metodo toString muestra la informacion de los objetos
		return "Hora: " + hora + " Minutos: " + minuto + " Segundos:" + segundo;
	}
}
