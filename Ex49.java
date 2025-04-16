/******************************************************************************
49. Desenvolva um algoritmo que leia 2 vetores de 10 elementos inteiros
cada. Em seguida, calcule a soma desses vetores, guarde o resultado em um terceiro vetor e escreva o resultado.
*******************************************************************************/

import java.util.Scanner;

public class Ex49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];

        // Leitura do primeiro vetor
        System.out.println("Digite os elementos do primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor1[i] = scanner.nextInt();
        }

        // Leitura do segundo vetor
        System.out.println("Digite os elementos do segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vetor2[i] = scanner.nextInt();
        }

        // Cálculo da soma dos vetores
        for (int i = 0; i < 10; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        // Exibição do resultado
        System.out.println("Soma dos vetores:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento " + (i + 1) + ": " + soma[i]);
        }
    }
}