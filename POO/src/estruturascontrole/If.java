package estruturascontrole;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a sua média: ");
		double media = teclado.nextDouble();

		if (media <= 10 && media >= 7.0) {
			System.out.println("Você está aprovado");
			System.out.println("Parabéns!");
		} else if (media < 7 && media >= 5.0) {
			System.out.println("Final");
		} else if (media < 5.0) {
			System.out.println("Reprovado");
		}

		teclado.close();
	}
}
