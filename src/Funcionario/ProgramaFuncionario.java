package Funcionario;

import java.util.Scanner;

public class ProgramaFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();


        System.out.println("Digite o nome do funcionário 1: ");
        funcionario1.nome = scanner.nextLine();

        System.out.println("Digite o ano de nascimento do funcionário 1: ");
        funcionario1.anoNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o RG do funcionário 1: ");
        funcionario1.rg = scanner.nextLine();

        System.out.println("Digite o CPF do funcionário 1: ");
        funcionario1.cpf = scanner.nextLine();

        System.out.println("Digite o endereço do funcionário 1: ");
        funcionario1.endereco = scanner.nextLine();

        System.out.println("Digite a naturalidade do funcionário 1: ");
        funcionario1.naturalidade = scanner.nextLine();

        System.out.println("Digite o salário do funcionário 1: ");
        funcionario1.salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a profissão do funcionário 1: ");
        funcionario1.profissao = scanner.nextLine();

        System.out.println("Digite o grau de instrução do funcionário 1: ");
        funcionario1.grauInstrucao = scanner.nextLine();

        System.out.println("Digite a matrícula do funcionário 1: ");
        funcionario1.matricula = scanner.nextLong();
        scanner.nextLine();

        funcionario1.cadastrarAlterarFuncionario(funcionario1.nome, funcionario1.anoNascimento, funcionario1.rg, funcionario1.cpf, funcionario1.endereco, funcionario1.naturalidade, funcionario1.salario, funcionario1.profissao, funcionario1.grauInstrucao, funcionario1.matricula);

        System.out.println("Digite o nome do funcionário 2: ");
        funcionario2.nome = scanner.nextLine();

        System.out.println("Digite o ano de nascimento do funcionário 2: ");
        funcionario2.anoNascimento = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o RG do funcionário 2: ");
        funcionario2.rg = scanner.nextLine();

        System.out.println("Digite o CPF do funcionário 2: ");
        funcionario2.cpf = scanner.nextLine();

        System.out.println("Digite o endereço do funcionário 2: ");
        funcionario2.endereco = scanner.nextLine();

        System.out.println("Digite a naturalidade do funcionário 2: ");
        funcionario2.naturalidade = scanner.nextLine();

        System.out.println("Digite o salário do funcionário 2: ");
        funcionario2.salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite a profissão do funcionário 2: ");
        funcionario2.profissao = scanner.nextLine();

        System.out.println("Digite o grau de instrução do funcionário 2: ");
        funcionario2.grauInstrucao = scanner.nextLine();

        System.out.println("Digite a matrícula do funcionário 2: ");
        funcionario2.matricula = scanner.nextLong();
        scanner.nextLine();

        funcionario2.cadastrarAlterarFuncionario(funcionario2.nome, funcionario2.anoNascimento, funcionario2.rg, funcionario2.cpf, funcionario2.endereco, funcionario2.naturalidade, funcionario2.salario, funcionario2.profissao, funcionario2.grauInstrucao, funcionario2.matricula);

        int resposta;
        do {
            System.out.println("\nDeseja consultar as informações de qual funcionário? (1 ou 2)\nDigite 3 para encerrar a execução.");
            resposta = scanner.nextInt();
            scanner.nextLine();

            if (resposta == 1) {
                funcionario1.dadosFuncionario();
            } else if (resposta == 2) {
                funcionario2.dadosFuncionario();
            }

            System.out.println("------------------");
        } while (resposta == 1 || resposta == 2);

        System.out.println("Execução encerrada.");

        scanner.close();
    }
}

