package Funcionario;

public class Funcionario {
    public String nome;
    public int anoNascimento;
    public String rg;
    public String cpf;
    public String endereco;
    public String naturalidade;
    public double salario;
    public String profissao;
    public String grauInstrucao;
    public long matricula;

    public void cadastrarAlterarFuncionario(String nome, int anoNascimento, String rg, String cpf, String endereco, String naturalidade, double salario, String profissao, String grauInstrucao, long matricula) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.naturalidade = naturalidade;
        this.salario = salario;
        this.profissao = profissao;
        this.grauInstrucao = grauInstrucao;
        this.matricula = matricula;

        System.out.println("Informações do(a) Funcionário(a) cadastradas/alteradas com sucesso!");
    }

    public void dadosFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + anoNascimento);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Endereço: " + endereco);
        System.out.println("Naturalidade: " + naturalidade);
        System.out.println("Salário: " + salario);
        System.out.println("Profissão: " + profissao);
        System.out.println("Grau de instrução: " + grauInstrucao);
        System.out.println("Matrícula: " + matricula);
    }
}
