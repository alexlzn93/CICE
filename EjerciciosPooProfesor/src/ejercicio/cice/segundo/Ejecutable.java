package ejercicio.cice.segundo;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Libro libro1= new Libro();
		Libro libro2= new Libro();
		Libro libro3= new Libro();
		libro1.setISBN("0-8193-8593-7");
		libro1.setAutor("Pedro");
		libro1.setNumeropaginas(230);
		libro1.setTitulo("Los Picapiedra");
		System.out.println(libro1.toString());
		
		libro2.setISBN("0-2769-746-8");
		libro2.setAutor("Juan ");
		libro2.setNumeropaginas(150);
		libro2.setTitulo("Desaparecidos");
		System.out.println(libro2.toString());
		
		
		
		System.out.println(libro3.mayor());
		
		
	}

}
