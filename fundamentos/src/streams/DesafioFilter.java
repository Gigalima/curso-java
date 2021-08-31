package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		Estudante e1 = new Estudante("Gabriel", 24, "M");
		Estudante e2 = new Estudante("Kimberly", 17, "F");
		Estudante e3 = new Estudante("Andy", 32, "M");
		Estudante e4 = new Estudante("Vanessa", 14, "F");
		Estudante e5 = new Estudante("Aurora", 20, "F");
		Estudante e6 = new Estudante("Ronaldo", 28, "M");
		Estudante e7 = new Estudante("Oscar", 16, "M");
		
		Predicate<Estudante> deMaior = i -> i.idade >= 18;
		Predicate<Estudante> isMasc = s -> s.sexo.equalsIgnoreCase("m");
		Function<Estudante, String> maiorMasc = m -> "Olá " + m.nome + ", seja bem-vindo!";
		
		
		List<Estudante> estudantes = Arrays.asList(e1, e2, e3, e4, e5, e6, e7);
		estudantes.stream()
		.filter(deMaior)
		.filter(isMasc)
		.map(maiorMasc)
		.forEach(System.out::println);


	}

}
