package colecoes;

import java.util.HashSet;
import java.util.Set;


public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.5);
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add('x');
		conjunto.add(1);
		
		System.out.println(conjunto.size());
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		conjunto.retainAll(nums);
		conjunto.addAll(nums);
		
		System.out.println(conjunto);

		
	}

}
