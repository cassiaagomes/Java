package fundamentos;

import javax.swing.JOptionPane;

public class StringParaNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog(
				"Digite o primeiro número: ");
		
		System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1); // O método parseDouble() converte uma string que representa um número em um valor do tipo double.
		double numero2 = Double.parseDouble(valor1);
		
		double soma = numero1 + numero2;
		System.out.println("Soma é:" + soma);
		System.out.println("Média é:" + soma/2);
	}
}
