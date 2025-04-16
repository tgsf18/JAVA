/******************************************************************************
52. Faça um programa que leia 5 idades de pessoas, armazeno-os em um Array, calcule e apresente a soma das idades. Verificar as idades e apresentar se a pessoal é " Melhor idade", " Adulto" ou "Criança".
*******************************************************************************/
import java.util.Scanner;

public class Ex52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] idades = new int[5];
        int soma = 0;

        // Leitura das idades
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();
            soma += idades[i];
        }

        // Exibindo a soma das idades
        System.out.println("Soma das idades: " + soma);

        // Classificação das idades
        for (int idade : idades) {
            if (idade >= 60) {
                System.out.println(idade + " anos: Melhor idade");
            } else if (idade >= 18) {
                System.out.println(idade + " anos: Adulto");
            } else {
                System.out.println(idade + " anos: Criança");
            }
        }
    }
}