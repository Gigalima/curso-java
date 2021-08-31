package colecoes;

import java.util.Optional;

public class ExemploOptionals {
	public static void main(String[] args) {
		Optional<String> opString = Optional.of("Valor presente");
		System.out.println("Valor opcional que está presente");
		opString.ifPresentOrElse(System.out::println, () -> System.out.println("não está presente"));
		
		Optional<String> opNull = Optional.ofNullable(null);
		System.out.println("Valor opcional que não está presente");
		opNull.ifPresentOrElse(System.out::println, () -> System.out.println("null, não está presente"));
		
		Optional<String> opEmpty = Optional.empty();
		System.out.println("Valor opcional que não está presente");
		opEmpty.ifPresentOrElse(System.out::println, () -> System.out.println
				("empty, não está presente"));
		
		
		Optional<String> opErro = Optional.of(null);
		System.out.println("Valor que lança erro NullPointerException");
		opErro.ifPresentOrElse(System.out::println,() -> System.out.println("Erro"));
		
	}

}
