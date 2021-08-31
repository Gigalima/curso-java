package fundamentos;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		String faixa = entrada.nextLine();
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Faixa preta");
			break;
		case "marrom":
			System.out.println("Faixa marrom");
			break;
		case "roxa":
			System.out.println("Faixa roxa");
		default:
			System.out.println("Estou aprendendo");
		}
		
		entrada.close();
	}

}
