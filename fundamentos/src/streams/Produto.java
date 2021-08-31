package streams;

public class Produto {
	
	String nome;
	double preco;
	double desconto;
	double frete;
	
	public Produto(String nome, double preco, double desconto, double frete) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		this.frete = frete;
	}
	public double precoFinal() {
		return preco * (1 - desconto);
	}
	

}
