package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno("Ana", 8.4);
		Aluno a2 = new Aluno("Enzo", 7.5);
		Aluno a3 = new Aluno("Rui", 6);
		Aluno a4 = new Aluno("Lane", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);
		
		Comparator<Aluno> MelhorNota = (aluno1, aluno2) -> {
			if (aluno1.nota > aluno2.nota) return 1;
			if (aluno1.nota < aluno2.nota) return -1;
			return 0;
		};
		
		System.out.println(alunos.stream().max(MelhorNota).get());
		System.out.println(alunos.stream().min(MelhorNota).get());
	}

}
