package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		
		Function<String, String> oResultadoE = valor -> "O Resultado é " + valor;
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.apply(33);
		
		System.out.println(resultadoFinal);
		System.out.println(parOuImpar.apply(21));
	}

}
