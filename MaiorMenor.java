import java.util.Random;

public class MaiorMenor {
    public static void main(String[] args) {
        int[][] matriz = new int[6][3];
        Random rand = new Random();
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = rand.nextInt(100);
                if (matriz[i][j] > maior) maior = matriz[i][j];
                if (matriz[i][j] < menor) menor = matriz[i][j];
            }
        }
        System.out.println("Maior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);
    }
}
