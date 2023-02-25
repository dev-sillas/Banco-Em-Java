package conta;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int ctt;
	
	public Conta(int agencia, int numero) {	
	if(agencia >= 0 && numero >= 0) {	
		Conta.ctt++;
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Conta criada na agencia "+agencia+" e numero "+numero);
	}
	else {
		if(agencia <0) 
			System.out.println("agencia nao pode ser numero nugativo");
		if(numero < 0)
			System.out.println("numedo da conta nao pode ser numero nugativo");

	}
}

	
	
	
	 public void depositar (double valor) {
		 this.saldo += valor;
			System.out.println("Deposito no valor " +valor+" feito com sucesso ");	
		}
	
	 public boolean sacar (double valor) {
		 if(this.saldo >= valor){
		 this.saldo -= valor;
		 System.out.println("saquei feito com sucesso no valor de:"+valor);
		 return true;
		 }
		 else {
			 System.out.println("Saldo insuficiente para realizar saque");
			 return false;
		 }
	 }
	 
	public boolean transfere (double valor ,Conta distino) {
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
	
	
	public double getsaldo() {
		return this.saldo;
	}
	
	public int getnumero() {
		return this.numero;
	}
	
	public void setnumero(int numero) {
		if (numero <=0) {
			System.out.println("O numero da conta nao pode ser menor que 0 ");
			return ; 
			}			
		 this.numero = numero;
	}
	
	public int getagencia() {
		return this.agencia;
	}
	
	public void setagencia(int numero) {
		if( numero <=0) {
			System.out.println("O numero da agencia nao pode ser menor que 0 ");
			return;
			}
		 this.agencia= numero;
	}


	public Cliente getTitular() {
		return titular;
	}


	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

}



/*
public class Conta {

private double saldo;
private int agencia;
private int numero;
private Cliente titular;
private static int total = 0;

public Conta(int agencia, int numero){
    Conta.total++;
    System.out.println("O total de contas é " + Conta.total);
    this.agencia = agencia;
    this.numero = numero;
    this.saldo = 100;
    System.out.println("Estou criando uma conta" + this.numero);
}

public void deposita(double valor) {
    this.saldo = this.saldo + valor;
}

public boolean saca(double valor) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        return true;
    } else {
        return false;
    }
}

public boolean transfere(double valor, Conta destino) {
    if(this.saldo >= valor) {
        this.saldo -= valor;
        destino.deposita(valor);
        return true;
    }
    return false;
}

public double getSaldo(){
    return this.saldo;
}

public int getNumero(){
    return this.numero;
}

public void setNumero(int numero){
    if(numero <= 0) {
        System.out.println("Nao pode valor menor igual a 0");
        return;
    }
    this.numero = numero;
}

public int getAgencia(){
    return this.agencia;
}

public void setAgencia(int agencia){
   if(agencia <= 0) {
       System.out.println("Nao pode valor menor igual a 0");
       return;
   }
   this.agencia = agencia;
}

public void setTitular(Cliente titular){
    this.titular = titular;
}

public Cliente getTitular(){
    return this.titular;
}

public static int getTotal(){
    return Conta.total;
}

}
*/
