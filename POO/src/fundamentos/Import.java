package fundamentos;

import java.util.Date; // Mostra a data e a hora atual - Import fica fora da class

public class Import {
	public static void main(String[] args) {
		String s = "Bom dia";
		System.out.println(s);
		
		Date d = new Date(); // Para utilizar, é necessário importar do java util
		System.out.println(d);
		
		// ctrl + shift + o: Organiza os imports, colocando os imports ou removendo
	}
}
