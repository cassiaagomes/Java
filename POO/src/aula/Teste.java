package aula;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		String[] nomes = {"bala", "bola", "balão"};
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número entre 0 e " + (nomes.length-1));
		int numero = entrada.nextInt();
		try {
			System.out.println(nomes[numero]);	
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Apenas indices de 0 a 2.");
		}
		entrada.close();
		
	}
}
