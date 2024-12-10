package Animal;

public class Animal {
    public String especie;
    public int anoNascimento;
    public String nome;
    public long numRegistro;
    public String localNascimento;

    public void cadastrarAlterarAnimal(String especie, int anoNascimento, String nome, long numRegistro, String localNascimento) {
        this.especie = especie;
        this.anoNascimento = anoNascimento;
        this.nome = nome;
        this.numRegistro = numRegistro;
        this.localNascimento = localNascimento;

        System.out.println("Informações do animal cadastradas/alteradas com sucesso.");
    }

    public void informacoesAnimal(){
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Número de registro: " + numRegistro);
        System.out.println("Ano de nascimento: " + anoNascimento);
        System.out.println("Local de nascimento: " + localNascimento);
    }
}
