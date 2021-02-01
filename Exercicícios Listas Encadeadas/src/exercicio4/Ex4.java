package exercicio4;

import java.util.LinkedList;

public class Ex4 {

	public static void main(String[] args) {
		
		// Declaração da lista encadeada
		LinkedList<Integer> ls = new LinkedList<Integer>();
		
		// Adicionando os elementos na lista
		ls.add(10);
		ls.add(300);
		ls.add(100);
		
		// Somando os elementos
		Integer m=0;
		for(int i=0;i<ls.size();++i) {
			if(m<ls.get(i)) {
				m=ls.get(i);
			}
		}
		
		// Mostrando o resultado da soma dos elementos
		System.out.println(m);
	}
}