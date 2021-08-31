package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		fila.add("C++");
		fila.add("Java");
		fila.add("C");
		fila.add("Python");
		fila.remove();
		
		String s1 = fila.peek();
		System.out.println(s1); // comando 1
		
		fila.add("Cobol");
		fila.add("PHP");
		fila.remove();
		
		String s2 = fila.peek();
		System.out.println(s2); // comando 1
		
		fila.remove();
		String s3 = fila.peek();
		System.out.println(s3); // comando 1
		
		fila.add("Fortran");
		fila.add("C#");
	
	}
}
