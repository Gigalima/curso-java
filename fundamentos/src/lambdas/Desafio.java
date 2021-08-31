package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {

	public static void main(String[] args) {
		
		Function<Produto, Double> precoFinal =
				produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> imposto =
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arredonda = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto("Ipad", 3250.50, 0.13);
		String preco = precoFinal
				.andThen(imposto)
				.andThen(frete)
				.andThen(arredonda)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O preco final é" + preco);
	}

}
