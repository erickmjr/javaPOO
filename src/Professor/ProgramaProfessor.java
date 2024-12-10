package Professor;

import java.util.Scanner;

public class ProgramaProfessor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Professor professor1 = new Professor();
        Professor professor2 = new Professor();

        System.out.println("Digite o nome do professor 1: ");
        professor1.nome = scanner.nextLine();

        System.out.println("Digite a titulação do professor 1: ");
        professor1.titulacao = scanner.nextLine();

        System.out.println("Digite a carga horária do professor 1: ");
        professor1.cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o salário do professor 1: ");
        professor1.salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite as disciplinas do professor 1: ");
        professor1.disciplinas = scanner.nextLine();

        professor1.cadastrarAlterarProfessor(professor1.nome, professor1.titulacao, professor1.cargaHoraria, professor1.salario, professor1.disciplinas);


        System.out.println("Digite o nome do professor 2: ");
        professor2.nome = scanner.nextLine();

        System.out.println("Digite a titulação do professor 2: ");
        professor2.titulacao = scanner.nextLine();

        System.out.println("Digite a carga horária do professor 2: ");
        professor2.cargaHoraria = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o salário do professor 2: ");
        professor2.salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite as disciplinas do professor 2: ");
        professor2.disciplinas = scanner.nextLine();

        professor2.cadastrarAlterarProfessor(professor2.nome, professor2.titulacao, professor2.cargaHoraria, professor2.salario, professor2.disciplinas);

        int resposta;
        do {
            System.out.println("\nDeseja consultar as informações de qual professor? (1 ou 2)\nDigite 3 para encerrar a execução.");
            resposta = scanner.nextInt();
            scanner.nextLine();

            if (resposta == 1) {
                professor1.dadosProfessor();
            } else if (resposta == 2) {
                professor2.dadosProfessor();
            } else if (resposta != 3) {
                System.out.println("Opção inválida! Por favor, escolha 1, 2 ou 3.");
            }
            System.out.println("------------------");
        } while (resposta == 1 || resposta == 2);

        System.out.println("Execução encerrada.");
        scanner.close();
    }
}
