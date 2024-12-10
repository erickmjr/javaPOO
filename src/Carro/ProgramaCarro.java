package Carro;

import java.util.Scanner;

public class ProgramaCarro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        System.out.println("Digite o código do carro 1: ");
        carro1.codigo = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Digite a marca do carro 1: ");
        carro1.marca = scanner.nextLine();

        System.out.println("Digite a cor do carro 1: ");
        carro1.cor = scanner.nextLine();

        System.out.println("Digite o modelo do carro 1: ");
        carro1.modelo = scanner.nextLine();

        System.out.println("Digite o ano de fabricação do carro 1: ");
        carro1.anoDeFabricacao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a quantidade de portas do carro 1: ");
        carro1.qtdPortas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o tipo de combustível suportado pelo carro 1: ");
        carro1.combustivel = scanner.nextLine();

        System.out.println("Digite a quantidade de carros (carro 1) disponíveis: ");
        carro1.qtdDisponivel = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o preço do carro 1: ");
        carro1.preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a versão do carro (Completo ou Básico) 1: ");
        carro1.completoBasico = scanner.nextLine();

        carro1.cadastrarAlterarCarro(carro1.codigo, carro1.marca, carro1.cor, carro1.modelo,
                carro1.anoDeFabricacao, carro1.qtdPortas, carro1.combustivel, carro1.qtdDisponivel, carro1.preco, carro1.completoBasico);

        System.out.println("Digite o código do carro 2: ");
        carro2.codigo = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Digite a marca do carro 2: ");
        carro2.marca = scanner.nextLine();

        System.out.println("Digite a cor do carro 2: ");
        carro2.cor = scanner.nextLine();

        System.out.println("Digite o modelo do carro 2: ");
        carro2.modelo = scanner.nextLine();

        System.out.println("Digite o ano de fabricação do carro 2: ");
        carro2.anoDeFabricacao = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite a quantidade de portas do carro 2: ");
        carro2.qtdPortas = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o tipo de combustível suportado pelo carro 2: ");
        carro2.combustivel = scanner.nextLine();

        System.out.println("Digite a quantidade de carros (carro 2) disponíveis: ");
        carro2.qtdDisponivel = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o preço do carro 2: ");
        carro2.preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a versão do carro (Completo ou Básico) 2: ");
        carro2.completoBasico = scanner.nextLine();

        carro2.cadastrarAlterarCarro(carro2.codigo, carro2.marca, carro2.cor, carro2.modelo,
                carro2.anoDeFabricacao, carro2.qtdPortas, carro2.combustivel, carro2.qtdDisponivel, carro2.preco, carro2.completoBasico);
    int resposta;
    do {
        System.out.println("\nDeseja consultar informações de qual carro? (1 ou 2)\nDigite 3 para encerrar a execução.");
        resposta = scanner.nextInt();
        scanner.nextLine();
        if(resposta == 1){
            carro1.listarInformacoesCarro();
        } else if(resposta == 2){
            carro2.listarInformacoesCarro();
        }
        System.out.println("------------------");
    } while (resposta == 1 || resposta == 2);

    System.out.println("Execução encerrada.");
    scanner.close();
    }
}
