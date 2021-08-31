package colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Doug");
		lista.add(u1);
		lista.add(new Usuario("Karls"));
		lista.add(new Usuario("Oars"));
		lista.add(new Usuario("Pears"));
		lista.add(new Usuario("Adolfo"));
		
		System.out.println(lista.get(2));
		
		lista.set(2, new Usuario("José"));
		lista.remove(3);
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}

}
