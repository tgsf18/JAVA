import java.util.Scanner;

public class Ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int i = 0;

        while (i < 10) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = scanner.nextInt();
            soma += num;
            i++;
        }
        System.out.println("Soma: " + soma + ", Média: " + (soma / 10.0));
        scanner.close();
    }
}
