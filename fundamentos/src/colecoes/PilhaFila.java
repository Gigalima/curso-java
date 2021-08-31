package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class PilhaFila {
	public static void main(String[] args) throws Exception {
		Queue<Integer> fila = new LinkedList<>();
		Deque<Integer> pilha = new ArrayDeque<>();
		int i;
		
		for(i=0; i< 6; i++) {
			pilha.push(i);
		}
		
		for(i=0; i< 3; i++) {
			fila.add(pilha.peek());
			pilha.pop();
		}
		for(i = 0; i < 3; i++) {
			pilha.push(fila.peek());
			fila.remove();
		}
		
		System.out.println(pilha.peek());
		
	}

}
