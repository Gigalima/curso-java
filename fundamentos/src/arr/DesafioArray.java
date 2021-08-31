package arr;

import java.util.Scanner;

public class DesafioArray {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quantas notas você quer informar?");
		int qtdNotas = entrada.nextInt();
		double [] notas = new double [qtdNotas];
		
		
		for(int i = 0; i < qtdNotas; i++ ) {
			System.out.print("Digite a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
			
		}
		
		double soma = 0;
		for(double nota: notas) {
			soma += nota;			
		}
		System.out.println("Média do aluno é:" + soma/qtdNotas);
		
		entrada.close();
	}

}
