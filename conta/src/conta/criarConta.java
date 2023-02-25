package conta;

public class criarConta {

	public static void main(String[] args) {
		conta c = new conta();
		System.out.println(c.saldo);
		conta c2= new conta();
		c2.saldo=1000;
		
		c2.transfere(200, c);
		System.out.println(c.saldo);
		System.out.println(c2.saldo);
		c.depositar(200);
		System.out.println(c.saldo);

	}

}