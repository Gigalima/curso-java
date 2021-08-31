package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo calculo = new Soma();
		double s1 = calculo.executar(10, 15);
		
		
		calculo = new Multiplicar();
		double m1 = calculo.executar(5, 10);
		
		System.out.println(s1);
		System.out.println(m1);

	}

}
