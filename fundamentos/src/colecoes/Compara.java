package colecoes;

import java.util.Comparator;

public class Compara implements Comparator<Estudante>{
	
		public int compare(Estudante o1, Estudante o2) {
			return o2.getIdade() - o1.getIdade();
		
		//Comparators precisa pr� definir no c�digo uma regra de neg�cio para ordenar
		// a implementa��o
		
		//Comparable � usada para implementar dentro da classe de dom�nio
			
		
		
	}

}
