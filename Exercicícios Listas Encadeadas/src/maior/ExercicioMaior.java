package maior;

import java.util.LinkedList;

public class ExercicioMaior {

	public static void main(String[] args) {
		
		// Declaração da lista encadeada
		LinkedList<Integer> ls = new LinkedList<Integer>();
		
		// Adicionando os elementos na lista
		ls.add(10);
		ls.add(300);
		ls.add(100);
		
		// Obtendo o maior valor da lista
		Integer m=0;
		for(int i=0;i<ls.size();++i) {
			if(m<ls.get(i)) {
				m=ls.get(i);
			}
		}
		
		// Mostrando o maior dos elementos
		System.out.println(m);
	}
}