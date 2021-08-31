package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandStreams {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Python ", "Clojure\n");
		langs.forEach(print);
		
		String[] maisLangs = {"Go ", "Kotlin ", "Perl\n"};
		Stream.of(maisLangs).forEach(print);
		Arrays.stream(maisLangs).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("JS ", "C ", "PHP\n");
		outrasLangs.stream().forEach(print);
		
		
	}

}
