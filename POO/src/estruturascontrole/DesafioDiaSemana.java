package estruturascontrole;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o dia da semana: ");
		String dia = teclado.nextLine();
		String domingo = "Domingo";
		String segunda = "Segunda";
		String terca = "Terça";
		String quarta = "Quarta";
		String quinta = "Quinta";
		String sexta = "Sexta";
		String sabado = "Sábado";

		if (dia.equalsIgnoreCase(domingo)) {
			System.out.println("1");
		} else if (dia.equalsIgnoreCase(segunda)) {
			System.out.println("2");
		} else if (dia.equalsIgnoreCase(terca)) {
			System.out.println("3");
		} else if (dia.equalsIgnoreCase(quarta)) {
			System.out.println("4");
		} else if (dia.equalsIgnoreCase(quinta)) {
			System.out.println("5");
		} else if (dia.equalsIgnoreCase(sexta)) {
			System.out.println("6");
		} else if (dia.equalsIgnoreCase(sabado)) {
			System.out.println("7");
		} else {
			System.out.println("Que dia é esse? ");
		}

		teclado.close();
	}
}
