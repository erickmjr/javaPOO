package ContaBancaria;

import java.util.Scanner;

public class ProgramaContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria();
        ContaBancaria conta2 = new ContaBancaria();

        System.out.println("Digite o nome do correntista da conta 1: ");
        conta1.nome = scanner.nextLine();

        System.out.println("Digite o RG (00.000.000-00) do correntista " + conta1.nome +" dono(a) da conta 1: ");
        conta1.rg = scanner.nextLine();

        System.out.println("Digite o CPF (000.000.000-00) do correntista " + conta1.nome +" dono(a) da conta 1: ");
        conta1.rg = scanner.nextLine();

        System.out.println("Digite o saldo da conta 1: ");
        conta1.saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o número da conta 1: ");
        conta1.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o numero da agência (0000-0) da conta 1: ");
        conta1.agencia = scanner.nextLine();

        conta1.cadastrarAlterarContaBancaria(conta1.nome, conta1.rg,  conta1.cpf, conta1.saldo, conta1.numero, conta1.agencia);

        System.out.println("Digite o nome do correntista da conta 2: ");
        conta2.nome = scanner.nextLine();

        System.out.println("Digite o RG (00.000.000-00) do correntista " + conta2.nome +" dono(a) da conta 2: ");
        conta2.rg = scanner.nextLine();

        System.out.println("Digite o CPF (000.000.000-00) do correntista " + conta2.nome +" dono(a) da conta 2: ");
        conta2.rg = scanner.nextLine();

        System.out.println("Digite o saldo da conta 2: ");
        conta2.saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Digite o número da conta 2: ");
        conta2.numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o numero da agência (0000-0) da conta 2: ");
        conta2.agencia = scanner.nextLine();

        conta2.cadastrarAlterarContaBancaria(conta2.nome, conta2.rg,  conta2.cpf, conta2.saldo, conta2.numero, conta2.agencia);

        int resposta;
        do {
            System.out.println("\nDeseja consultar o saldo de qual conta? (1 ou 2)\nDigite 3 para encerrar a execução.");
            resposta = scanner.nextInt();
            scanner.nextLine();
            if(resposta == 1){
                conta1.imprimirSaldo();
            } else if(resposta == 2){
                conta2.imprimirSaldo();
            }
            System.out.println("------------------");
        } while (resposta == 1 || resposta == 2);

        System.out.println("Execução encerrada.");
        scanner.close();
    }
}
