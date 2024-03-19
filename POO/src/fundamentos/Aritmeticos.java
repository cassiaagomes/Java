package fundamentos;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2+3);
		
		double x = 34.56; 
		double y = 2.2;
		
		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		
		int a = 8;
		int b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a/(double)b); // o "(double)" converte o int para double
		
		System.out.println(8%3); // o operador "%" representa o resto da divisão
		System.out.println(8%2);
		
		System.out.println(x+y - a*b);
	}
}
