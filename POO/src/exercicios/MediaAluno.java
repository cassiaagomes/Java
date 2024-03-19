package exercicios;

import java.util.Scanner;

public class MediaAluno {
	/*  CRIAR UM PROGRAMA QUE RECEBA DUAS NOTAS PARCIAS, CALCULAR A MÉDIA FINAL. 
	 * SE A NOTA DO ALUNO FOR MAIOR OU IGUAL a 7.0 IMPRIME NO CONSOLE "APROVADO, SE A NOTA FOR MENOR QUE 7.0 
	 * E MAIOR QUE 4.0, IMPRIME NO CONSOLE "RECUPERAÇÃO", CASO CONTRÁRIO EXIBE NO CONSOLE "REPROVADO".
	*/
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = teclado.nextDouble();
		System.out.println("Informe a segunda nota: ");
		double nota2 = teclado.nextDouble();
		
		double media = (nota1 + nota2) / 2;

		if (media <= 10 && media >= 7.0) {
			System.out.println("Sua média é: " + media + ". Você está aprovado");
			System.out.println("Parabéns!");
		} else if (media < 7 && media >= 4.0) {
			System.out.println("Sua média é: " + media + ". Você está na final");
		} else if (media < 3.9) {
			System.out.println("Sua média é: " + media + ". Você foi reprovado");
		}

		teclado.close();
	}

}


