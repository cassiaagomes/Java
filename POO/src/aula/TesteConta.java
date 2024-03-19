package aula;

public class TesteConta {
	public static void main(String[] args) {

		Conta conta1 = new Conta("101", "123456");

		try {
			conta1.creditar(100);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			
			;
		}

		try {
			conta1.debitar(-10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
		
		try {
			conta1.creditar(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			;
		}
		

		Conta conta2 = new Conta("102", "111111");
		try {
			conta1.transferir(5, conta2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("SALDOS APOS TRANSFERENCIA");
		System.out.println(conta1);
		System.out.println(conta2);

	}
}