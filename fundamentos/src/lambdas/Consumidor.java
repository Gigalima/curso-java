package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("TV", 2990, 0.20);
		Produto p2 = new Produto("Mouse", 39.90, 0.09);
		Produto p3 = new Produto("Caneta", 2990, 0.05);
		Produto p4 = new Produto("Teclado", 99.99, 0.10);
		Produto p5 = new Produto("Guitarra", 1000.99, 0.25);
		
		imprimirNome.accept(p4);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		
		produtos.forEach(p -> System.out.println(p.preco));

	}

}
