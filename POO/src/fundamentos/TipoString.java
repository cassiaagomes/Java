package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá, lindos".charAt(2)); // Pega letras especificas de uma string se baseando no seu indice
		
		String s = "Boa noite";
		s = s.toUpperCase(); // Alterando o texto de s, sem modificar o valor original
		s = "Boa noitxeee"; // Muda completamente o valor de s
		System.out.println(s.concat("!!!")); //Concatena a String com o texto entre parenteses
		System.out.println(s+"!!!"); // também concatena, igual ao concat
		System.out.println(s.startsWith("Boa")); // Verifica se a string inicia com o parametro informado, retornando true ou false
		System.out.println(s.toLowerCase().startsWith("boa"));//lowercase não vai considerar as letras minusculas do parametro passado no startswith, então o resultado será verdadeiro
		System.out.println(s.length()); //Retorna a quantidade de caracteres;
		System.out.println(s.endsWith("noite")); // verifica se a string termina com o parametro passado no parenteses, retornando true ou false
		System.out.println(s.toLowerCase().endsWith("noite")); // não considera as letras minusculas do parametro informado, retorna t ou f
		System.out.println(s.equals("boa tarde")); // verifica se o parametro da string é verdadeiro
		System.out.println(s.equalsIgnoreCase("boa noite")); // verifica se o paramentro é verdadeiro mas ignora maiusculas e minusculas
		
		var nome = "Cássia";
		var sobrenome = "Gomes";
		var idade = 23;
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome);
		System.out.println("Idade: " + idade + "\nSalario: " + salario);
		System.out.printf("A senhora %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario); //o método printf suporta formatação string, já o println não suporta
	
		String frase = String.format("\nA senhora %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade, salario); //Outra forma de conseguir demonstrar em tela as informações, usando tipos diferentes
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual")); //verifica se a string possui o parametro informado, retornando true or false.
		System.out.println("Frase qualquer".indexOf("qual")); //verifica qual a posição da palavra passada como parametro, dentro da string.
		System.out.println("Frase qualquer".substring(6, 10)); //Pega as informações do primeiro indice informado e do último indice
		
	}
}
