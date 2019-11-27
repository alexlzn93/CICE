package master.java.nogenerica;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa implements Iterable {

	private ArrayList lista = new ArrayList();

	public void add(Object objeto) {
		lista.add(objeto);
	}

	public Object get(int x) {
		return lista.get(x);
	}
	
	@SuppressWarnings("unchecked")
	public void addAll(Object... elementos) { //... indica que es una lista de argumentos ,parecido a un array
		for (Object elemento : elementos) {
			lista.add(elemento);
		}
	}

	@Override
	public Iterator iterator() {
		return lista.iterator();
	}

	public int size() {
		return lista.size();
	}
	public void showAll() {
		for(Object elemento:lista) {
			System.out.println(elemento.toString());
		}
	}
}
