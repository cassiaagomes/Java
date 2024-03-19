package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		double a = 4.5;
		System.out.println(a);
		
		var b = 4.5; // mesmo não definindo o tipo, o java vai inferir (dizer) qual o tipo da variavel pelo dado inserido
		System.out.println(b);
		
		var c = "Cássia"; // O java vai inferir que é uma string
		System.out.println(c);
		
		c = "Oi"; // Alterei o texto da variavel
		System.out.println(c);
		
		// A inferencia só não permite que a variavel tenha seu tipo alterada, por exemplo: double n pode ser string
		
		double d; // variavel foi declarada
		d = 122.65; // variavel foi inicializada
		System.out.println(d); // usada!!
		
		// Não consigo fazer o exemplo acima com var pq o java não identifica o tipo da variavel (não infere)
		
	}
}
