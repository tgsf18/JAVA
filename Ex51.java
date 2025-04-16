/******************************************************************************
51. Desenvolva um algoritmo que preencha aleatoriamente um vetor de 10 posicões com números entre 0 a 100. Calcule e escreva o maior, menor e a média desses números.
*******************************************************************************/
import java.util.Random;

public class Ex51{
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[10];
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        double soma = 0;

        // Preenchendo o vetor com números aleatórios entre 0 e 100
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(101); // Gera número entre 0 e 100
            soma += numeros[i];

            // Verificando maior e menor
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Calculando a média
        double media = soma / numeros.length;

        // Exibindo os resultados
        System.out.println("Números gerados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
        System.out.println("\nMaior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + media);
    }
}