package master.java.genericas;

import java.util.ArrayList;
import java.util.Iterator;

public class Bolsa<T> implements Iterable<T> {  //T para definir el tipo que va a contener la lista

	private ArrayList<T> lista = new ArrayList<T>();

	public void add(T objeto) {
		lista.add(objeto);
	}

	public T get(int x) {
		return lista.get(x);
	}
	
	@SuppressWarnings("unchecked")
	public void addAll(T... elementos) {
		for (T elemento : elementos) lista.add(elemento);
	}

	public Iterator<T> iterator() {
		return lista.iterator();
	}

	public int size() {
		return lista.size();
	}
	
}
