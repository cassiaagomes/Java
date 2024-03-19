package estruturascontrole;

public class While {
	public static void main(String[] args) {

		int cont = 1; // INICIALIZANDO UMA VARIAVEL PARA O LAÇO

		while (cont <= 10) { // ESSA REPETICAO VAI OCORRER ATÉ O CONT SER MENOR OU IGUAL A 10
			System.out.println(cont);
			cont ++; // A CADA INTERACAO, O CONT VAI INCREMENTAR +1 AO SEU VALOR. QUANDO ULTRAPASSAR 10 O LAÇO PARA
		}
	}
}
