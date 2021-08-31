package programa;

import oo.desafio.Carro;
import oo.desafio.Civic;
import oo.desafio.Ferrari;

public class Desafio extends Carro {
	Desafio(int velocidadeAtual) {
		super(velocidadeAtual);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Civic civic = new Civic();
		
		System.out.println(civic.velocidadeAtual);
		civic.acelerar();
		civic.acelerar();
		civic.acelerar();
		System.out.println("Velocidade do Civic: " + civic.velocidadeAtual);
		civic.frear();
		civic.frear();
		System.out.println("Velocidade do Civic: " + civic.velocidadeAtual);
		
		System.out.println();
		Ferrari ferrari = new Ferrari();
		
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();		
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);
		ferrari.frear();
		ferrari.frear();
		System.out.println("Velocidade da Ferrari: " + ferrari.velocidadeAtual);

	}

}
