package colecoes;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExStreamAPI {
	public static void main(String[] args) {
		
		List<String> estudante = new ArrayList<>();
		
		
		estudante.add("Pedro");
		estudante.add("Thais");
		estudante.add("Carla");
		estudante.add("Douglas");
		estudante.add("Andrey");
		estudante.add("Ari");
		
		System.out.println("Contagem: " + estudante.stream().count());
		System.out.println("Maior número de letras: \n" + estudante.stream()
		.max(Comparator.comparingInt(String::length)));
		
		System.out.println("Menor número de letras: \n" + estudante.stream()
		.min(Comparator.comparingInt(String::length)));
		
		System.out.println("Com a letra r no nome:\n" + estudante.stream().filter((estudantes) -> 
		estudantes.toLowerCase().contains("r")).collect(Collectors.toList()));
		
		System.out.println("Retorna uma nova coleção com a quantidade de letras:\n" + 
		estudante.stream().map(estudantes -> estudantes.concat(" - ").concat(String.valueOf(estudantes.length()))).collect(Collectors.toList()));
		
		System.out.println("Retorna os 3 primeiros:\n" + estudante.stream().limit(3).collect(Collectors.toList()));
	}

}
