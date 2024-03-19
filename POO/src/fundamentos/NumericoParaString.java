package fundamentos;

public class NumericoParaString {
	public static void main(String[] args) {
		Integer num1 = 10000;
		System.out.println(num1.toString()
				.length()); //CONVERTENDO A CLASSE INTEGER PARA STRING É POSSÍVEL UTILIZAR MÉTODOS COMO LENGTH
		
		int num2 = 10000; //TIPO PRIMITIVO
		System.out.println(Integer.toString(num2)
				.length()); // CONVERTENDO UM TIPO PRIMITIVO PARA A CLASSE INTEGER E TRANSFORMANDO EM STRING
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
	}
}
