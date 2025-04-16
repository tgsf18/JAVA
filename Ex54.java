/******************************************************************************
 * 54.Faça um programa para ler N valores inteiros e armazená-los em um Array. O
programa deve contar quantos valores pares ele possui e multiplicar os valores ímpares.
*******************************************************************************/
import java.util.Scanner;

public class Ex54{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicita ao usuário quantos valores deseja ler
        System.out.print("Quantos valores você deseja ler? ");
        int n = scanner.nextInt();
        
        // Cria um array para armazenar os valores
        int[] valores = new int[n];
        int contagemPares = 0;
        int produtoImpares = 1;
        boolean temImpar = false; // Flag para verificar se há pelo menos um ímpar

        // Leitura dos valores
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextInt();

            // Contando pares e multiplicando ímpares
            if (valores[i] % 2 == 0) {
                contagemPares++;
            } else {
                produtoImpares *= valores[i];
                temImpar = true; // Marca que pelo menos um ímpar foi encontrado
            }
        }

        // Exibindo os resultados
        System.out.println("Quantidade de valores pares: " + contagemPares);
        if (temImpar) {
            System.out.println("Produto dos valores ímpares: " + produtoImpares);
        } else {
            System.out.println("Não há valores ímpares para multiplicar.");
        }
        
        scanner.close(); // Fecha o scanner
    }
}