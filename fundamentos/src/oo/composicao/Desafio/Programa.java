package oo.composicao.Desafio;

public class Programa {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.addItens("Arroz", 14.90, 3);
		compra1.addItens("Suco", 1.19, 8);
		
		Compra compra2 = new Compra();
		compra2.addItens("Caderno", 19.00, 1);
		compra2.addItens("Caneta", 1.19, 6);
		
		System.out.println(compra1.obterTotal());
		
		Cliente cliente1 = new Cliente("José Lorivaldo");
		cliente1.compras.add(compra1);
		cliente1.addCompra(compra2);
		
		System.out.println(cliente1.obterTotal());
	}

}
