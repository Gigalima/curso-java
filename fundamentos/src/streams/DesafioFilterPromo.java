package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilterPromo {
	
	public static void main(String[] args) {
		Produto p1 = new Produto("Televisão", 2199.00,0.30, 0);
		Produto p2 = new Produto("PS5", 4699.90, 0.05, 99.49);
		Produto p3 = new Produto("Violão", 310.45, 0.15, 0);
		Produto p4 = new Produto("Jogo de Panela", 250.00,0.30, 0);
	 	Produto p5 = new Produto("Copos", 34.40, 0.18, 11.70);
		Produto p6 = new Produto("Geladeira", 2600.00, 0.30, 0);
		
		List <Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<Produto> desconto = d -> d.desconto >= 0.30;
		Predicate<Produto> frete = f -> f.frete == 0;
		Function<Produto, String> msg = m -> "Super promoção " + m.nome + " De: R$ " + m.preco 
				+ " Por: R$ " + m.precoFinal();
		
		produtos.stream()
		.filter(desconto)
		.filter(frete)
		.map(msg)
		.forEach(System.out::println);
		
	}

}
