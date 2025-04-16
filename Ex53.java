/******************************************************************************
53.Faça um programa que leia 10 valores reais e os apresente na ordem:
       a) crescente
       b) decrescente
       c) inversa da entrada.
       * pesquisar para obter os valores em ordem crescente e decrescente.

*******************************************************************************/
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ex53 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] valores = new Double[10];

        // Leitura dos valores
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        // Ordem crescente
        Arrays.sort(valores);
        System.out.println("Valores em ordem crescente: " + Arrays.toString(valores));

        // Ordem decrescente
        Arrays.sort(valores, Collections.reverseOrder());
        System.out.println("Valores em ordem decrescente: " + Arrays.toString(valores));

        // Ordem inversa da entrada
        System.out.print("Valores na ordem inversa da entrada: ");
        for (int i = 9; i >= 0; i--) {
            System.out.print(valores[i] + " ");
        }
        System.out.println();
    }
}