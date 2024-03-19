package exercicios;

import java.util.Scanner;

public class Soma {
	/*
	 * Criar um programa que enquanto estiver recebendo números positivos, imprime
	 * no console a soma dos números inseridos, caso receba um número negativo,
	 * encerre o programa. Tente utilizar a estrutura do while.
	 */
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int numero = 0;

		while (numero >= 0) {
			System.out.println("Digite um numero inteiro (ou negativo para sair): ");
			numero = entrada.nextInt();
			numero += numero; //
			System.out.printf("\nSoma até o momento: %d\n", numero);
			}
		
		entrada.close();
		
		}

}
