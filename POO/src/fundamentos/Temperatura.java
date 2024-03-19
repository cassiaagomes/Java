package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		double fahrenheit = 50.8;
		double celsius = (fahrenheit - 32) * 5/9;
		
		System.out.println("A temperatura atual em fahreinheit é de: " + fahrenheit + " ºF. Convertendo "
				+ "para Celsius temos: " + celsius + "ºC");
	}
}
