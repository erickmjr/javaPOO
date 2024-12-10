package Calculadora;

import java.util.Scanner;

public class ProgramaCalculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();

        int resposta;
        do {
            System.out.println("---------------");
            System.out.println("Qual operação deseja realizar?\n1)Soma\n2)Subtração\n3)Multiplicação\n4)Divisão\n");
            resposta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o primeiro valor: ");
            double n1 = scanner.nextDouble();

            System.out.println("Digite o segundo valor: ");
            double n2 = scanner.nextDouble();

            switch (resposta) {
                case 1:
                    soma.somarNumeros(n1, n2);
                    break;

                case 2:
                    subtracao.subtrairNumeros(n1, n2);
                    break;

                case 3:
                    divisao.dividirNumeros(n1, n2);
                    break;

                case 4:
                    multiplicacao.multiplicarNumeros(n1, n2);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (resposta >= 1 && resposta <= 4);

    }
}
