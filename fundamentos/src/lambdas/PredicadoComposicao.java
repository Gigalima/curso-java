package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {

		Predicate<Integer> isPar = num -> num % 2 == 0;
		Predicate<Integer> isTresDig = num -> num >= 100 && num <= 999;
		
		System.out.println(isPar.and(isTresDig).negate().test(33));
		System.out.println(isPar.and(isTresDig).test(22));

	}

}
