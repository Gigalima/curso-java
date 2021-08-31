package colecoes;

import java.util.Optional;

public class ExemploOptionals {
	public static void main(String[] args) {
		Optional<String> opString = Optional.of("Valor presente");
		System.out.println("Valor opcional que est� presente");
		opString.ifPresentOrElse(System.out::println, () -> System.out.println("n�o est� presente"));
		
		Optional<String> opNull = Optional.ofNullable(null);
		System.out.println("Valor opcional que n�o est� presente");
		opNull.ifPresentOrElse(System.out::println, () -> System.out.println("null, n�o est� presente"));
		
		Optional<String> opEmpty = Optional.empty();
		System.out.println("Valor opcional que n�o est� presente");
		opEmpty.ifPresentOrElse(System.out::println, () -> System.out.println
				("empty, n�o est� presente"));
		
		
		Optional<String> opErro = Optional.of(null);
		System.out.println("Valor que lan�a erro NullPointerException");
		opErro.ifPresentOrElse(System.out::println,() -> System.out.println("Erro"));
		
	}

}
