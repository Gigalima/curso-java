package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<Item>();
	
	void addItens (Produto p, int qtde) {
		this.itens.add(new Item(p, qtde));
	}
		
	void addItens (String nome, double preco, int qtde) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, qtde));
	}
		
	double obterTotal() {
		double total = 0;
		
		for(Item item: this.itens ) {
			total += item.quantidade * item.produto.preco;
		}
		
		return total;
	}

}
