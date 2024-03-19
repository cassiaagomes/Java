package exercicios;
import java.util.Scanner;

public class Bissexto {
	public static void main(String[] args) {
		// 2. CRIAR UM PROGRAMA QUE INFORMA SE O ANO ATUAL É BISSEXTO; 
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Informe o ano: ");
		int ano = entrada.nextInt();
		if (ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("Ano Bissexto!");
		}
		else 
			if(ano % 100 == 0 ){
			System.out.println("Ano bissexto!");
		}
		
			else {
				System.out.println("Esse ano não é bissexto.");
			}
		System.out.println("Tchau...");
		
		entrada.close();
	}
}
