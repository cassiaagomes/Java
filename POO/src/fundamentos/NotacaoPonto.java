package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		
		//double a = 2.3; // Tudo que fica em laranja/roxo, são palavras reservadas em java
		String s = "Boa noite, Bruno!";
		s = s.replace("Bruno", "Cássia"); // Os valores de s só serão alterados se forem associados a uma variavél
		s = s.toUpperCase(); 
		s = s.concat("<3");
		System.out.println(s);
		System.out.println("Cássia".toUpperCase());
		
		// exemplo acima em outro modelo:
		String x = "Gabriel".toUpperCase();
		System.out.println(x);
		
		String y = "Bom dia X"
				.replace("X", "Gabriel")
				.toUpperCase()
				.concat("<33333"); //A sentença pode ter quebra de linha no ponto
		System.out.println(y);
		
	}
}
