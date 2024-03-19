package exercicios;

import java.util.Random;
import java.util.Scanner;

public class AdvinhaNumero {
	/*
	 * Tentar adivinhar um número entre 0 - 100. Armazene um numero aleatório em uma
	 * variável. O Jogador tem 10 tentativas para adivinhar o número gerado. Ao
	 * final de cada tentativa, imprima a quantidade de tentativas restantes, e
	 * imprima se o número inserido é maior ou menor do que o número armazenado.
	 */
	public static void main(String[] args) {

		Random random = new Random();

		int numeroAleatorio = random.nextInt(20);

		Scanner entrada = new Scanner(System.in);

		int restante = 10;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			int numero = entrada.nextInt();
			restante -= 1;
			if (numero == numeroAleatorio) {
				System.out.println("Você acertou! Número digitado: " + numero + ".\nNúmero gerado aleatoriamente: "
						+ numeroAleatorio + ".");
				break;
			} else if (numero > numeroAleatorio) {
				System.out.println("O número digitado é maior que o número armazenado. Tente novamente. \n" + restante
						+ " tentativas restantes");
				System.out.println();
			}

			else if (numero < numeroAleatorio) {
				System.out.println("O numero digitado é menor que o número armazenado. Tente novamente. \n" + restante
						+ " tentativas restantes");
				System.out.println();
			}
		}
		System.out.println("Parabén!!! O número era o: " + numeroAleatorio);
		entrada.close();
	}

}
