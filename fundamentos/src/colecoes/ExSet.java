package colecoes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExSet {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		numeros.add(3);
		numeros.add(88);
		numeros.add(20);
		numeros.add(44);
		numeros.add(3);
		numeros.add(null);
		
		Iterator mostrarNumeros = numeros.iterator();
		while(mostrarNumeros.hasNext()) {
			System.out.println(mostrarNumeros.next());
		}
		
		numeros.remove(3);
		numeros.add(23);
		System.out.println(numeros);
		int tamanho = numeros.size();
		System.out.println(tamanho);
		boolean estaVazio = numeros.isEmpty();
		System.out.println(estaVazio);
	}

}
