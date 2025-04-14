import java.util.Scanner;

public class D5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continuar = "S";
        
        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Digite o valor do empréstimo: ");
            double valorEmprestimo = input.nextDouble();
            System.out.print("Digite o número de parcelas: ");
            int parcelas = input.nextInt();
            
            double taxa = 0.02; // 2% ao mês
            double valorFinal = valorEmprestimo * Math.pow(1 + taxa, parcelas);
            double valorParcela = valorFinal / parcelas;
            
            System.out.printf("\nValor final com juros compostos: R$%.2f\n", valorFinal);
            System.out.printf("Valor de cada parcela: R$%.2f\n", valorParcela);
            
            System.out.print("\nDeseja simular outro empréstimo? (S/N): ");
            continuar = input.next();
            System.out.println();
        }
        
        System.out.println("Programa encerrado.");
    }
}
