package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExeLista {
	public static void main(String[] args) {
		List<String> nomes = new ArrayList<>();
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
		
		for(String nome: nomes) {
			System.out.println("Nome: " + nome);
		}
		nomes.set(2, "Roberto");
		System.out.println(nomes);
		String pos1 = nomes.get(0);
		System.out.println(pos1);
		nomes.remove(3);
		nomes.remove("João");
		int tamanho = nomes.size();
		System.out.println(tamanho);
		System.out.println(nomes);
		boolean temJuliana = nomes.contains("Juliana");
		System.out.println(temJuliana);
		List<String> novosNomes = new ArrayList<>();
		novosNomes.add("Ismael");
		novosNomes.add("Rodrigo");
		nomes.addAll(novosNomes);
		System.out.println(nomes);
		Collections.sort(nomes);
		System.out.println();
	}

}
