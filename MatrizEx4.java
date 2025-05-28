import java.util.Scanner;

public class MatrizEx4 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] transposta = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                matriz[i][j] = scanner.nextInt();

        for (int i = 0; i < matriz.length; i++)
            for (int j = 0; j < matriz[i].length; j++)
                transposta[j][i] = matriz[i][j];

        for (int[] linha : transposta) {
            for (int num : linha) System.out.print(num + " ");
            System.out.println();
        }
    }
}
