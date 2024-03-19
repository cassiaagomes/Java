package estruturascontrole;

import java.util.Scanner;

public class WhileTwo {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String parar = "";

		while (!parar.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			parar = teclado.nextLine();
		}
		System.out.println("Tchau...");
		teclado.close();
	}

}
