package excecao.personalizadaA;

import excecao.Aluno;

public class TesteValidacoes {

	public static void main(String[] args) {
		
		try {
			Aluno a1 = new Aluno("", -7);
			Validar.aluno(a1);
		} catch (StringVaziaExc | NumForadoIntervaloExcep e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Fim!!!");

	}

}
