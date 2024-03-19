package estruturascontrole;

import java.util.Scanner;

public class SomaNumero {
	/*
	 * CRIAR UM PROGRAMA QUE ENQUANTO ESTIVER RECEBENDO NÚMEROS POSITIVOS, IMPRIME
	 * NO CONSOLE A SOMA DOS NÚMEROS INSERIDOS, CASOS RECEBBA -1,
	 * ENCERRE O PROGRAMA. TENTE UTILIZAR A ESTRUTURA DO WHILE.
	 */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		while (numero != -1) {
			System.out.println("Digite um número: ");
			int numero1 = entrada.nextInt();
			int soma = numero+numero1;
			System.out.println("A soma dos número digitados é de: " + soma);
			numero1 = 0;
		}

		entrada.close();
	}
}
