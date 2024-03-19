package aula;

public class TestePilha {

	public static void main(String[] args) {
		Pilha p1 = new Pilha();
		p1.empilhar("joao");
		p1.empilhar("maria");
		p1.empilhar("jose");
		p1.empilhar("ana");
		try {
			p1.topo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
		System.out.println(p1.toString());

		try {
			// while (true) -- DESEMPILHAR TODOS DE UMA VEZ
			p1.desempilhar();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
		System.out.println(p1.toString());

		try {
			p1.esvaziar();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println(p1.toString());

		try {
			p1.topo();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
