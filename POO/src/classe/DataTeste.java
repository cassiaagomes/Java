package classe;

public class DataTeste {
	public static void main(String[] args) {
		Data d1 = new Data ();
		d1.dia = 10;
		d1.mes = 06;
		d1.ano = 1999;
		
		Data d2 = new Data ();
		d2.dia = 06;
		d2.mes = 10;
		d2.ano = 1999;
		
		String dataFormatada1 = d1.obterDataFormatada();
		String dataFormatada2 = d1.obterDataFormatada();
		System.out.println(dataFormatada1);
		System.out.println(dataFormatada2);
	}
}
