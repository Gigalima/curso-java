package oo.desafio;

public class Carro {
	public int velocidadeAtual;
	
	protected Carro(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}
	
	public void acelerar() {
		velocidadeAtual += 5;
	}
	
	public void frear() {
		if(velocidadeAtual <= 0) {
			velocidadeAtual = 0;
		}	
		 velocidadeAtual -= 5;
		}
	}