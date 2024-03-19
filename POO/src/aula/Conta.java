package aula;

public class Conta {
	private String numero;
	private String cpf;
	private double saldo;

	public Conta(String numero, String cpf) {
		this.numero = numero;
		this.cpf = cpf;
		this.saldo = 0;
	}

	public void creditar(double valor) {
		saldo = saldo + valor;
	}
	public void creditar(double... lista) {
		for(double valor : lista)
			saldo = saldo + valor;
	}

	public void debitar(double valor) throws Exception {
		if (valor < 0) {
			throw new Exception ("Não é possivel debitar valores negativos.\n");
		}
		if (valor > saldo) {
			throw new Exception ("Quantia errada= " + valor + "\n");
		}
		saldo = saldo - valor;
	}

	public void transferir(double valor, Conta destino) throws Exception {
		if (valor > saldo) {
			throw new Exception ("Quantia errada= " + valor + "\n");		
		}
		
		this.debitar(valor);
		destino.creditar(valor);
	}

	public boolean vazia() {
		if (saldo == 0)
			return true;
		else
			return false;
		
		//return saldo==0;
	}

	@Override
	public String toString() {
		return "numero=" + numero + " cpf=" + cpf + " saldo=" + saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSaldo() {
		return saldo;
	}

}
