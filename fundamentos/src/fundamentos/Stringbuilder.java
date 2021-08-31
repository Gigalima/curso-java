package fundamentos;

import java.util.stream.IntStream;

public class Stringbuilder {
	public static void main(String[] args) {
		var nome = "Douglas";
		
		var builder = new StringBuilder(nome);
		System.out.println(builder.insert(4, "lalala"));
		
		IntStream.of(1,2,3,4,5).forEach(n-> {
			System.out.println(n);
		});
		
		IntStream.range(0,5).forEach(n-> {
			System.out.println("Número = " + n);
		});
		
	}

}
