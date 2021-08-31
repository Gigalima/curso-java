package funcional;

import java.util.function.UnaryOperator;

public class PrimeiroEx {
	public static void main(String[] args) {
		UnaryOperator<Integer> calcularalgo = valor -> valor*3;
		int valor = 10;
		System.out.println("Calculo: " + calcularalgo.apply(10));
	}

}
