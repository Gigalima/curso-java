package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
	
	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 8.4);
		Aluno a2 = new Aluno("Enzo", 7.5);
		Aluno a3 = new Aluno("Rui", 6);
		Aluno a4 = new Aluno("Lane", 10);
		Aluno a5 = new Aluno("Ana", 8.4);
		Aluno a6 = new Aluno("Pedro", 7.5);
		Aluno a7 = new Aluno("Rui", 6);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct...");
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip Limit");
		alunos.stream().distinct().skip(2).limit(3).forEach(System.out::println);
		
		
	}

}
