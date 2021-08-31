package fundamentos;

public class Carro {
	
	public Carro(String marca, String modelo, int ano) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
	}
	private String marca;
	private String modelo;
	private int ano;
	private int qtdPessoas;


	public int getQtdPessoas() {
		return qtdPessoas;
	}
	
	public String carroCheio() {
		return "Carro Cheio";
	}
	
	public String carroVazio() {
		return "Carro Vazio";
	}

	public void addPessoas(int qtdPessoas) {
		if(qtdPessoas < 5) {
			this.qtdPessoas += qtdPessoas;		
		} else {
			carroCheio();
		}
				
	}
	public void tirarPessoas(int qtdPessoas) {
		if(qtdPessoas == 0) {
			carroVazio();
		} else {
			
			this.qtdPessoas -= qtdPessoas;
		}
	}
}