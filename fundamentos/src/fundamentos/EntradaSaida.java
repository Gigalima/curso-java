package fundamentos;

import java.util.Scanner;

public class EntradaSaida {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		System.out.println("Olá, " + nome);
		entrada.close();
	}

}
