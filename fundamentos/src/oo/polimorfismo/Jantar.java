package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		Pessoa convidado = new Pessoa(60);
		
		Comida ingrediente1 = new Arroz(0.3);
		Comida ingrediente2 = new Feijao(0.2);
		Comida sobremesa = new Sorvete(0.5);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso()); 
	}
	
	
	

}
