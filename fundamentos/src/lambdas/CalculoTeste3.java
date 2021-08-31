package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {
		
		BinaryOperator<Double> calculo = (x, y) -> { return x + y;};
		System.out.println(calculo.apply(2.0, 3.0));
		
		BinaryOperator<Integer> calculo2 = (x, y) -> x * y;
		
		System.out.println(calculo2.apply(4, 2));
		
		BinaryOperator<String> teste = (a, b) -> a.concat(b); 
		System.out.println(teste.apply("Batata ", "Doce"));

	}

}
