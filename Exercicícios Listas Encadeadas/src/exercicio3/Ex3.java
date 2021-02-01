package exercicio3;

import java.util.LinkedList;

public class Ex3 {

	public static void main(String[] args) {
		
		// Declaração da lista encadeada
		LinkedList<Integer> ls = new LinkedList<Integer>();
		
		// Adicionando os elementos na lista
		ls.add(10);
		ls.add(3);
		
		// Somando os elementos
		Integer som=0;
		for(int i=0;i<ls.size();++i) som+=ls.get(i);
		
		// Mostrando o resultado da soma dos elementos
		System.out.println(som);
	}
}
