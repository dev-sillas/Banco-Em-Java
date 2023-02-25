package conta;

public class conta {

	double saldo;
	int agencia;
	int numero;
	Pessoa titular;
	
	 public void depositar (double valor) {
		 this.saldo += valor;
			System.out.println("Deposito no valor " +valor+" feito com sucesso ");

		 
			
		}
	 public boolean sacar (double valor) {
		 if(this.saldo >= valor){
		 this.saldo += valor;
		 return true;
		 }
		 else {
			 System.out.println("nao tem saldo");
			 return false;
		 }
	 }
	 
	public boolean transfere (double valor ,conta distino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			distino.depositar(valor);
			System.out.println("transferencia completa");
			return true;
		}
		else {
			System.out.println("Não conseguimos realizar a traferencia");
		return false;
			}
		}
	

}



