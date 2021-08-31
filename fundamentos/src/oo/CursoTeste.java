package oo;

public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Roberto");
		Aluno aluno2 = new Aluno("Leila");
		Aluno aluno3 = new Aluno("Joaquim");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Cabeleireira Completo");
		Curso curso3 = new Curso("Fullstack Javascript");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno3);
		
		curso2.adicionarAluno(aluno2);
		
		aluno1.adiconarCurso(curso3);
		aluno2.adiconarCurso(curso3);
		aluno3.adiconarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos) {
			System.out.println("Estou matriculado no curso: " + curso3.nome);
			System.out.println("Meu nome é: " + aluno.nome);
		}
		System.out.println();
		for (Curso curso: aluno1.cursos) {
			System.out.println(curso.nome);
		}
		
	}

}
