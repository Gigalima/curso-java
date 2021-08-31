package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS", "Java", "Go", "C");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
		
		String retornaUltlang = (String) ListaUtil.getUltimo1(langs);
		System.out.println(retornaUltlang);
		
		Integer retornaUltNum = (Integer) ListaUtil.getUltimo1(nums);
		System.out.println(retornaUltNum);
		
		String retornaUltlang2 = ListaUtil.getUltimo2(langs);
		System.out.println(retornaUltlang2);

		Integer reotrnaUltNum2 = ListaUtil.getUltimo2(nums);
		System.out.println(reotrnaUltNum2);
	}

}
