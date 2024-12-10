package Carro;

public class Carro {
    public long codigo;
    public String marca;
    public String cor;
    public String modelo;
    public int anoDeFabricacao;
    public int qtdPortas;
    public String combustivel;
    public int qtdDisponivel;
    public double  preco;
    public String completoBasico;

    public void cadastrarAlterarCarro(long codigo, String marca, String cor, String modelo, int anoDeFabricacao, int qtdPortas, String combustivel, int qtdDisponivel, double preco, String completoBasico) {
        this.codigo = codigo;
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
        this.qtdPortas = qtdPortas;
        this.combustivel = combustivel;
        this.qtdDisponivel = qtdDisponivel;
        this.preco = preco;
        this.completoBasico = completoBasico;

        System.out.println("Informações do carro cadastradas/alteradas com sucesso.");
    }

    public void listarInformacoesCarro() {
        System.out.println("Codigo do carro: " + this.codigo);
        System.out.println("Marca: " + this.marca);
        System.out.println("Cor: " + this.cor);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano de fabricação: " + this.anoDeFabricacao);
        System.out.println("Quantidade portas: " + this.qtdPortas);
        System.out.println("Combustível: " + this.combustivel);
        System.out.println("Quantidade disponivel: " + this.qtdDisponivel);
        System.out.println("Preço: " + this.preco);
        System.out.println("Completo: " + this.completoBasico);
    }

}
