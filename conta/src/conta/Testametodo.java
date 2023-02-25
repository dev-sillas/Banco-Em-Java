package conta;

public class Testametodo {

	public static void main(String[] args) {

	 Conta fabinho = new Conta(111,555);
	 //fabinho.depositar(200);
	 //fabinho.getsaldo();
	 //System.out.println("voce tem esse saldo "+fabinho.getsaldo());
	 
	 Cliente sillas = new Cliente();
	 sillas.setCpf ("491.929.898-61");
	 sillas.setNome ("SILLAS TORRES SANTOS");
	 sillas.setProfissao ("analista de teste");
	 
	 fabinho.setTitular(sillas) ;
	 Cliente sillas12 =  fabinho.getTitular();
	 System.out.println(sillas12.tudo());

	 
		
	}

}
