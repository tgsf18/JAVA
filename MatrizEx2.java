import java.util.Scanner;

public class MatrizEx2 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os valores da matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        for (int j = 0; j < 3; j++) {
            int soma = 0;
            for (int i = 0; i < 3; i++) {
                soma += matriz[i][j];
            }
            System.out.println("Soma da coluna " + (j + 1) + " = " + soma);
        }
    }
}
