package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		SortedSet <String> lista = new TreeSet<>();
		
		lista.add("Dario");
		lista.add("Rute");
		lista.add("Mateus");
		lista.add("Ana");
		
		for(String list: lista) {
			System.out.println(list);	
			
		}
		
		Set <Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (int n: nums) {
			System.out.println(n);
			
		}
		
	}

}