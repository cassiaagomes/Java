package estruturascontrole;

public class For {
	public static void main(String[] args) {	
		for (int cont = 10; cont >= 1 ; cont --) {
			System.out.println(cont);
		} //MELHOR USAR ESTA
		
		int x = 2;
		for (; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		for (;;) { // LAÇO INFINITO
			System.out.println("bim di princisi");
		}
	}
}
