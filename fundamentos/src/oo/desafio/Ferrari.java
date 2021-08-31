package oo.desafio;

public class Ferrari extends Carro{
	
	public Ferrari() {
		this(0);
	}
	
	public Ferrari(int velocidadeAtual) {
		super(velocidadeAtual);
	}
	
	@Override
	public void acelerar() {
		velocidadeAtual += 15;
		
	}
}