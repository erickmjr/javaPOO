package ContaBancaria;

public class ContaBancaria {
    public String nome;
    public String rg;
    public String cpf;
    public double saldo;
    public int numero;
    public String agencia;


    public void cadastrarAlterarContaBancaria(String nome, String rg, String cpf, double saldo,int numero, String agencia) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.saldo = saldo;
        this.numero = numero;
        this.agencia = agencia;

        System.out.println("Informações da conta bancária cadastradas/alteradas com sucesso.");
    }

    public void imprimirSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }


}
