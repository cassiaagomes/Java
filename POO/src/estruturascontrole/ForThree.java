package estruturascontrole;

public class ForThree {
	public static void main(String[] args) {
		
		//int i = 0; // ACESSANDO A VARIAVEL FORA DO LAÇO
		
		/***for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		System.out.println("Saiu do for...");
		System.out.println(i);
	} ***/
		
		// UM FOR DENTRO DO OUTRO
		for(int i = 0; i < 10; i++) {
		 	for (int j = 0; j < 10; j++) {
		 		System.out.printf("[%d %d]", i, j);
		 	}
		 	System.out.println();
		}
	}
}
