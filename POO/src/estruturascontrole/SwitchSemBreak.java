package estruturascontrole;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "laranja";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada");
		}
		System.out.println("Fim");
		
		int idade = 3;
		switch (idade) {
		case 3:
			System.out.println("Fala");
		case 2:
			System.out.println("Anda");
		case 1: 
			System.out.println("respira");
		}
	}
}

// !!! SEM O BREAK, O CASE SAI EXECUTANDO TODOS OS QUE ESTÃO ABAIXO DO CASE CHAMADO
