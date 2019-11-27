
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//SINTAXIS DE UN ARRAYS
		
		int [] mi_matriz= new int [8];
		mi_matriz[0]= 23;
		mi_matriz[1]= -4;
		mi_matriz[2]= 36;
		mi_matriz[3]= 25;
		mi_matriz[4]= 43;
		mi_matriz[5]= 75;
		mi_matriz[6]= -54;
		mi_matriz[7]= 69;
		
		for (int x=0; x<mi_matriz.length;x++) {
			System.out.println("valor de indice " + x + " =" +  mi_matriz[x] );
		}
	}

}
