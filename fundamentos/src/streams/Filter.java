package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("João", 6);
		Aluno a2 = new Aluno("Lucas", 8.2);
		Aluno a3 = new Aluno("Joana", 9);
		Aluno a4 = new Aluno("Valdo", 9.2);
		Aluno a5 = new Aluno("Rhonda", 7);
		Aluno a6 = new Aluno("Rita", 6.9);
		
		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Function<Aluno, String> mensagem = a -> "Parabéns " + a.nome + "! Você foi Aprovado (a)";
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);
		alunos.stream()
			.filter(aprovado)
			.map(mensagem)
			.forEach(System.out::println);
		
		
		
		

	}

}
