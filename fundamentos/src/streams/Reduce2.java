package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 8.4);
		Aluno a2 = new Aluno("Enzo", 7.5);
		Aluno a3 = new Aluno("Rui", 6);
		Aluno a4 = new Aluno("Lane", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Predicate<Aluno> isBom = c -> c.nota >= 7;
		Function<Aluno, Double> nota = a -> a.nota;
		BinaryOperator<Double> somatoria = (a, t) -> a + t;
		
		double result = alunos.stream().filter(isBom).map(nota).reduce(somatoria).get();
		
		System.out.println("A somatória dos alunos aprovados é de: " + result);

	}

}
