import java.util.Random;

public class MatrizPar {
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Random rand = new Random();
        int countPar = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = rand.nextInt(100);
                if (matriz[i][j] % 2 == 0) {
                    countPar++;
                }
            }
        }
        for (int[] linha : matriz) {
            for (int num : linha) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("Total de números pares: " + countPar);
    }
}
