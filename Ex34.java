import java.util.Scanner;

public class Ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] produtos = new String[10];
        double[] valores = new double[10];
        double total = 0;
        
        // Leitura dos produtos e valores
        int i = 0;
        do {
            System.out.print("Digite o nome do produto " + (i + 1) + ": ");
            produtos[i] = scanner.next();
            System.out.print("Digite o valor do produto " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
            total += valores[i];
            i++;
        } while (i < 10);

        // Menu de pagamento
        int opcao;
        do {
            System.out.println("\nEscolha a forma de pagamento:");
            System.out.println("1 - À Vista em Dinheiro ou Pix (8% de desconto)");
            System.out.println("2 - À Vista no cartão de crédito (3% de desconto)");
            System.out.println("3 - Parcelado no cartão em 2 vezes (sem juros)");
            System.out.println("4 - Parcelado no cartão em 3 até 10 vezes (10% de juros)");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1: total *= 0.92; break;
                case 2: total *= 0.97; break;
                case 3: total = total; break;
                case 4: total *= 1.10; break;
                default: System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao < 1 || opcao > 4);

        // Mostra produtos comprados e total a pagar
        System.out.println("\nLista de produtos comprados:");
        for (String produto : produtos) {
            System.out.println("- " + produto);
        }
        System.out.printf("Valor total a ser pago: R$ %.2f\n", total);

        scanner.close();
    }
}
