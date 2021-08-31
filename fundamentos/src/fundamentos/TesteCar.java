package fundamentos;

public class TesteCar {
	public static void main(String[] args) {
		Carro viajar = new Carro("Ford", "Mustang", 2015);
		viajar.addPessoas(3);
		System.out.println(viajar.getQtdPessoas());
		viajar.tirarPessoas(2);
		System.out.println(viajar.getQtdPessoas());
		
	}

}
