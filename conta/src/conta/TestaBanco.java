package conta;
public class TestaBanco { 
    public static void main(String[] args) { 
        Cliente paulo = new Cliente(); 
        paulo.setNome("paulo Silveira");
        paulo.setCpf("222.222.222-22");
        paulo.setProfissao("programador");
        Cliente sillas = new Cliente(); 
        sillas.setNome("sillas torres");
        sillas.setCpf("491.929.898-61");
        sillas.setProfissao("Analista de teste");

        Conta contaDoPaulo = new Conta(5444, 8444); 
        contaDoPaulo.depositar(100);
        contaDoPaulo.getagencia();
        contaDoPaulo.getnumero();
        contaDoPaulo.setTitular(paulo);
        System.out.println(contaDoPaulo.getTitular().getNome());
        contaDoPaulo.setTitular(sillas);
        System.out.println(contaDoPaulo.getTitular().getNome());
        

    }
}