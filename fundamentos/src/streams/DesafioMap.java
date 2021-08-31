package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = txt -> new StringBuilder(txt).reverse().toString();
		Function<String, Integer> conver = c -> Integer.parseInt(c, 2);
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(conver)
		.forEach(System.out::println);

	}

}
