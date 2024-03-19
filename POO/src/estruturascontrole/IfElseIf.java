package estruturascontrole;

import java.util.Scanner;

public class IfElseIf { // CORRESPONDE AO ELIF DE PYTHON
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite uma nota de 0 a 10: ");

		double nota = teclado.nextDouble();

		if (nota >= 9 && nota == 10) {
			System.out.println("Parabens! Você é um aluno conceito A!!");
		}   else if (nota < 9 && nota >= 7) {
			System.out.println("Você é um aluno conceito B!");
		} else if (nota < 7 && nota >= 3) {
			System.out.println("Você é um aluno coneito C.");
		} else {
			System.out.println("Você é um aluno conceito D.");
		}

		System.out.println("Fim!");

		teclado.close();
	}
}
