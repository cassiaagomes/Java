package aula;
import java.util.Random;

public class JogoAdvinhacao {
	private int tentativa;
	private int numeroSorteado;
	private int numeroJogado;
	private final int MAXIMO;

	public JogoAdvinhacao(int max) throws Exception {
		if (max < 1 || max > 99)
			throw new Exception("limite maximo entre 1 e 99");
		MAXIMO = max;
	}

	public void iniciar() {
		tentativa = 0;
		Random random = new Random();
		numeroSorteado = random.nextInt(MAXIMO + 1);
	}
	public boolean adivinhou(int palpite) throws Exception {
		if (palpite < 0 || palpite > MAXIMO)
			throw new Exception("o numero esta fora da faixa permitida= 0 e " + MAXIMO);

		tentativa++;
		numeroJogado = palpite;
		if (palpite == numeroSorteado)
			return true;
		else
			return false;
	}

	public String getDica() {
		String dica = "";
		if (tentativa == 0 || terminou())
			dica = "n o ha dica";
		else {
			if (numeroJogado < numeroSorteado)
				dica += "tente um numero MAIOR";
			else
				dica += "tente um numero MENOR";

			if (Math.abs(numeroJogado - numeroSorteado) <= 5)
				dica += ", esta QUENTE";
			else
				dica += ", esta FRIO";
		}
		return dica;
	}

	public boolean terminou() {
		if (numeroJogado == numeroSorteado)
			return true;
		else if (tentativa == 6)
			return true;
		else
			return false;
	}

	public String resultado() {
		if (!terminou())
			return "jogo em andamento";
		else
			if (numeroJogado == numeroSorteado)
				return "ganhou com " + tentativa + " tentativa(s)-Num:" + numeroSorteado;
			else
				return "perdeu, terminaram as 6 tentativas-Num:" + numeroSorteado;

	}

	public int getTentativas() {
		return tentativa;
	}

	public int getLimiteMaximo() {
		return MAXIMO;
	}

}
