package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<Integer, String>();
		
		usuarios.put(1, "João");
		usuarios.put(2, "Maria");
		usuarios.put(3, "Ronaldo");
		usuarios.put(4, "Marta");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println(usuarios.containsKey(3));
		System.out.println(usuarios.containsKey(5));
		System.out.println(usuarios.containsValue("Marta"));
		System.out.println(usuarios.containsValue("Messi"));
		
		System.out.println(usuarios.get(3));
		
		for(int chave:usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for(String valor:usuarios.values()) {
			System.out.println(valor);
		}
		
		for(Entry<Integer, String> chaveValor: usuarios.entrySet()) {
			System.out.print(chaveValor.getKey() + " - ");
			System.out.println(chaveValor.getValue());
		}
	}
}
