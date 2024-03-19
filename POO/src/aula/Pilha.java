package aula;

import java.util.ArrayList;

public class Pilha {

	private ArrayList<String> dados = new ArrayList<>();

	public void empilhar(String s) {
		dados.add(s);
	}

	public void desempilhar() throws Exception {
		if (vazia()) {
			throw new Exception("Pilha Vazia");
		}
		int ultimo = dados.size() - 1;
		dados.remove(ultimo);

	}

	public boolean vazia() {
		return dados.isEmpty();
	}

	public String topo() throws Exception {
		if (vazia()) {
			throw new Exception("Pilha Vazia não tem topo.");
		}
		int ultimo = dados.size() - 1;
		return dados.get(ultimo);
	}

	public void esvaziar() throws Exception {
		if (vazia()) {
			throw new Exception("Pilha Vazia");
		}
		dados.clear();
	}

	public String toString() {
		return "Pilha=" + dados;
	}

}
