
public class ejemplosif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int temperatura=23;
int nevando=-4;
		if (temperatura > 15) {
		    if (temperatura > 25) {
		        // Si la temperatura es mayor que 25 ...
		        System.out.println("A la playa!!!");
		    } else {
		        System.out.println("A la montaña!!!");
		    }
		} else if (temperatura < 5) {
		    if (nevando<0) {
		        System.out.println("A esquiar!!!");
		    }
		} else {
		    System.out.println("A descansar... zZz");
		}
	}

}
