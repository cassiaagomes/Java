package list;

import java.util.LinkedList;

public class ArrayLista {

	public static void main(String[] args) {
		LinkedList<String> filhos = new LinkedList<>(); /* funciona da mesma foma do arraylist*/
		filhos.add("Cássia");
		filhos.add("Ygor");
		
		LinkedList<String> lista = new LinkedList<>();
		lista.add("Mãe");
		lista.add("Pai");
		
		LinkedList<String> familia = new LinkedList<>();
		familia.addAll(lista);
		familia.addAll(filhos);
		
		/*filhos.clear();
		lista.clear();
		System.out.print(familia);
		System.out.print(filhos);
		System.out.print(lista);
		*/
		filhos.removeIf(e -> e.contains("go")); //Contains - Método da class string
		System.out.println(filhos);
	}

}
