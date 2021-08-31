package oo.composicao.Desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterTotal();
		}
		
		return total;
	}

}
