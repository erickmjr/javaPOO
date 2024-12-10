package Animal;

import java.util.Scanner;

public class ProgramaAnimal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();

        System.out.println("Digite o nome do animal 1: ");
        animal1.nome = scanner.nextLine();

        System.out.println("Digite o número de registro do animal 1: ");
        animal1.numRegistro = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Digite a espécie do animal 1: ");
        animal1.especie = scanner.nextLine();

        System.out.println("Digite o local de nascimento do animal 1: ");
        animal1.localNascimento = scanner.nextLine();

        System.out.println("Digite o ano de nascimento do animal 1: ");
        animal1.anoNascimento = scanner.nextInt();
        scanner.nextLine();


        animal1.cadastrarAlterarAnimal(animal1.especie, animal1.anoNascimento,  animal1.nome, animal1.numRegistro, animal1.localNascimento);

        System.out.println("Digite o nome do animal 2: ");
        animal2.nome = scanner.nextLine();

        System.out.println("Digite o número de registro do animal 2: ");
        animal2.numRegistro = scanner.nextLong();
        scanner.nextLine();

        System.out.println("Digite a espécie do animal 2: ");
        animal2.especie = scanner.nextLine();

        System.out.println("Digite o local de nascimento do animal 2: ");
        animal2.localNascimento = scanner.nextLine();

        System.out.println("Digite o ano de nascimento do animal 2: ");
        animal2.anoNascimento = scanner.nextInt();
        scanner.nextLine();

        animal2.cadastrarAlterarAnimal(animal2.especie, animal2.anoNascimento,  animal2.nome, animal2.numRegistro, animal2.localNascimento);

        int resposta;
        do {
            System.out.println("\nDeseja consultar informações de qual animal? (1 ou 2)\nDigite 3 para encerrar a execução.");
            resposta = scanner.nextInt();
            scanner.nextLine();
            if(resposta == 1){
                animal1.informacoesAnimal();
            } else if(resposta == 2){
                animal2.informacoesAnimal();
            }
            System.out.println("------------------");
        } while (resposta == 1 || resposta == 2);

        System.out.println("Execução encerrada.");
        scanner.close();
    }
}

