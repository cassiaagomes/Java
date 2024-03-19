package exercicios;

import java.util.Scanner;

public class Primo {
	// RECEBER UM NÚMERO E DIZER SE ELE É PRIMO
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if (numero / numero == 1 && numero / 1 == numero) {
			System.out.println("O número " + numero + " é primo");
		}
		else {
			System.out.println("O número " + numero + " não é primo");
		}
		
		entrada.close();
		
	}
}

// ERRADO

