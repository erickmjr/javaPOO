package Professor;

public class Professor {
    public String nome;
    public String titulacao;
    public int cargaHoraria;
    public double salario;
    public String disciplinas;

    public void cadastrarAlterarProfessor (String nome, String titulacao, int cargaHoraria, double salario, String disciplinas) {
        this.nome = nome;
        this.titulacao = titulacao;
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
        this.disciplinas = disciplinas;

        System.out.println("Informações do professor cadastradas/alteradas com sucesso!");
    }

    public void alterarDisciplinaProfessor() {
        this.disciplinas = disciplinas;
    }

    public void dadosProfessor() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Titulação: " + this.titulacao);
        System.out.println("Carga Horária: " + this.cargaHoraria);
        System.out.println("Salário: " + this.salario);
        System.out.println("Disciplinas: " + this.disciplinas);
    }
}
