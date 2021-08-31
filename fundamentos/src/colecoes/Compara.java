package colecoes;

import java.util.Comparator;

public class Compara implements Comparator<Estudante>{
	
		public int compare(Estudante o1, Estudante o2) {
			return o2.getIdade() - o1.getIdade();
		
		//Comparators precisa pré definir no código uma regra de negócio para ordenar
		// a implementação
		
		//Comparable é usada para implementar dentro da classe de domínio
			
		
		
	}

}
