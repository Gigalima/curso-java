package fundamentos;

public class SobreString {
	public static void main(String[] args) {
		var nome = "Douglas";
		var sobrenome = "Lima";
		var idade = 28;
		
		String apresenta = String.format("Meu nome é %s %s \ne tenho %d anos", nome, sobrenome, idade);
		System.out.println(apresenta);
	}

}
