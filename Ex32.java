import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        int i = 0;

        while (i < 5) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = scanner.nextInt();
            if (num > maior) {
                maior = num;
            }
            i++;
        }
        System.out.println("O maior número é " + maior);
        scanner.close();
    }
}
