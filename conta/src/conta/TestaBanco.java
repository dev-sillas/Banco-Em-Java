package conta;
public class TestaBanco { 
    public static void main(String[] args) { 
        Cliente paulo = new Cliente(); 
        paulo.setNome ("sillas Silveira");
        paulo.setCpf ("222.222.222-22");
        paulo.setProfissao ("programador");

        Conta contaDoPaulo = new Conta(5444, 8444); 
        contaDoPaulo.depositar(100);

        //contaDoPaulo.titular = paulo; 
       // System.out.println(contaDoPaulo.titular.nome);
    }
}