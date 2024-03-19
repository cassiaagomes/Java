package estruturascontrole;

public class Break {
	public static void main(String[] args) {
		//QUEBRA O FLUXO NATURAL DAS COISAS
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("Fim!");
	}
}
