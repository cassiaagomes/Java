package exercicios;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {
		// 1. CRIAR UM PROGRAMA QUE RECEBA UM NÚMERO E VERIFIQUE SE ELE ESTÁ ENTRE 0 E
		// 10 E É PAR;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();

		if (numero <= 10 && numero > 0) {
			System.out.println("O numero " + numero + " está entre 0 e 10");
			if (numero % 2 == 0) {
				System.out.println("Além disso, o numero " + numero + " é par!");
			} else if (numero % 2 == 1) {
				System.out.println("Além disso, o número " + numero + " é ímpar!");
			}
		} else {
			System.out.println("O numero " + numero + " não está entre 0 e 10");
		}

		entrada.close();
	}
}
