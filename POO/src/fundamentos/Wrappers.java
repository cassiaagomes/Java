package fundamentos;

/* EM Java, UM WRAPPER É UMA CLASSE QUE ENCAPSULA TIPOS PRIMITIVOS EM UM OBJETO.
 * ISSO PERMITE QUE VOCÊ TRABALHE COM TIPOS PRIMITIVOS COMO OBJETOS.
 * EXISTEM CLASSES WRAPPER PARA CADA TIPO PRIMITIVO EM JAVA.
 * OU SEJA, SÃO AS VERSÕES ORIENTADAS A OBJETO DOS TIPOS PRIMITIVOS
 */

//import java.util.Scanner;

public class Wrappers {
	public static void main(String[] args) {
		// Scanner entrada = new Scanner(System.in); - Lê o que o usuário está digitando
		// byte
		Byte b = 100;
		Short s = 1000;
		//Integer i = Integer.parseInt(entrada.next()); //int
		Integer i = 10000;
		Long l = 100000L;
		
		Double d = 1234.5678;
		System.out.println(d);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i*3);
		System.out.println(l/3);
		
		Boolean bo = Boolean.parseBoolean("true"); // convertendo bool para string
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // Isso só é possível pois o boolean foi convertido pra string
		
		Character c = '#'; // char
		System.out.println(c.toString());
		
		//entrada.close();
	}
}
