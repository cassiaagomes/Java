package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		//double a = 1; //Conversão implicita - int para double
		//float b = (float) 1.0; // Conversão Explicita - Convertendo double para float
		
		int c = 129; // Conversão excplicita
		byte d = (byte) c; //Vai para o inicio do range pq só aceita valores de -127 a 128
		System.out.println(d);
		
		double e = 1.99999;
		int f = (int) e;
		System.out.println(f);
		
	}
}
