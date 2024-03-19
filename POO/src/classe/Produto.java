package classe;

public class Produto {
	//NÃO TERA O MÉTODO MAIN
	
	String nome;
	double preco;
	double desconto;
	
	double precoComDesconto () {
		return preco * (1 - desconto);
	}
	
	
	double precoComDesconto (double descontodoGerente) {
		return preco * (1 - desconto + descontodoGerente);
	}
	
}
