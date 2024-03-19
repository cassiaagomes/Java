package megasena;

import java.util.Random;

public class Sorteiocin {

	public static void main(String[] args) {
		Random sorteio = new Random();
		int numero;
		do{
				numero = sorteio.nextInt(60);
				System.out.println(numero);
		}
		while(numero != 51) ;
	}

}
