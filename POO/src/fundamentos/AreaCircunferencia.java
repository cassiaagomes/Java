package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		// System.out.println(2+3); 
		double raio = 3.4; // atribuindo 3 a uma variavel - geralmente todas as variaveis em java são double
		final double pi = 3.14159; // final double diz que o valor n será alterado
		
		double area = pi * raio * raio;
		// System.out.println( pi * raio * raio); forma obsoleta de fazer
		System.out.println(area);	
		
		raio = 10; // não é necessário informar o tipo do raio pq a variavel já teve seu tipo definido acima
		area = pi * raio * raio;
		System.out.println("Área = " + area + "m2"); // "+" concatena as informações
		
	}
}
