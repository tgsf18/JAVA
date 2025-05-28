import java.util.Random;

public class SomaMatrizes {
    public static void main(String[] args) {
        int[][] matriz1 = new int[5][2];
        int[][] matriz2 = new int[5][2];
        int[][] matriz3 = new int[5][2];
        Random rand = new Random();
        for (int i = 0; i < matriz1.length; i++)
            for (int j = 0; j < matriz1[i].length; j++) {
                matriz1[i][j] = rand.nextInt(10);
                matriz2[i][j] = rand.nextInt(10);
                matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
                System.out.print(matriz1[i][j] + "+" + matriz2[i][j] + "=" + matriz3[i][j] + "  ");
            }
        System.out.println();
    }
}
