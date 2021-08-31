package excecao;

public class Aluno {
	public String nome;
	public double nota;
	
	public Aluno(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
