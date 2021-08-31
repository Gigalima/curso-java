package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProgramaComparator {
	public static void main(String[] args) {
		List<Estudante> estudantes = new ArrayList<>();
		estudantes.add(new Estudante("Jonas", 22));
		estudantes.add(new Estudante("Marcos", 18));
		estudantes.add(new Estudante("Rita", 37));
		estudantes.add(new Estudante("Pentecostes", 57));
		estudantes.add(new Estudante("Sara", 20));
		
		System.out.println(estudantes);
		
		estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
		System.out.println("Ordem reversa");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
		System.out.println("Ordem natural");
		System.out.println(estudantes);
		
		estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
		System.out.println("Ordem reversa");
		System.out.println(estudantes);
		
		Collections.sort(estudantes);
		System.out.println("Ordem natural interface comparable");
		System.out.println(estudantes);
		
		Collections.sort(estudantes, new Compara());
		System.out.println("Ordem reversa interface comparator");
		System.out.println(estudantes);
		
		
		
		//Comparator recebe dois argumentos e compara entre eles
		//Comparable recebe apenas um argumento Classe atual x classe dominio
	}

}
