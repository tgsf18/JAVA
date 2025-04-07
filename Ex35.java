import java.util.Scanner;

public class Ex35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        int opcao;

        do {
            System.out.println("\nMenu da Conta Corrente:");
            System.out.println("1 - Depósito bancário");
            System.out.println("2 - Saque");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = scanner.nextDouble();
                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente!");
                    }
                    break;
                case 3:
                    System.out.printf("Saldo disponível: R$ %.2f\n", saldo);
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
