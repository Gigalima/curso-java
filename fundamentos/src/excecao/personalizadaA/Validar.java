package excecao.personalizadaA;

import excecao.Aluno;

public class Validar {
	
	public static void aluno(Aluno aluno) {
		
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno est? nulo");
		}
		
		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaExc("nome");
		}
		
		if (aluno.nota < 0 || aluno.nota > 10) {
			throw new NumForadoIntervaloExcep("nota");
		}
	}

}
