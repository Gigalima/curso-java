package oo;

public class CompraTeste {
	public static void main(String[] args) {
		
		Compra c1 = new Compra();
		c1.cliente = "Adalberto";
		c1.itens.add(new Item("Batata", 10, 0.99));
		c1.itens.add(new Item("Refrigerante", 2, 5.50));
		c1.itens.add(new Item("Pão", 30, 0.60));
		
		System.out.println(c1.itens.size());
		
		System.out.println(c1.getvalorTotal());
		
	}

}
