package estruturascontrole;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		// DO SENTECA; OU {} WHILE (...); - É EXECUTADA PELO MENOS UMA VEZ
		
		Scanner teclado = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.println("Voce precisa falar as palavras mágicas...");
			System.out.println("Quer sair? ");
			
			texto = teclado.nextLine();
			
		} while(!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Tchauzinho...");
		
		teclado.close();
		
		
	}
}
