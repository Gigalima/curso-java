package classes;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Geladeira", 3200, 0.15);
		double precoFinal = p1.precoComDesconto();
		
		var p2 = new Produto("Copos", 35, 0.10 );
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(p1.nome);
		
		
		System.out.println
		("O valor do produto sem desconto é:\n" + p1.preco);
		
		System.out.println
		("O valor do produto com desconto é:\n" + precoFinal);
		
		System.out.println
		("O valor do produto com desconto é\n" + precoFinal2);
		
				
		
	}

}
