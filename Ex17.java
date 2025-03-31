import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            soma += scanner.nextInt();
        }
        System.out.println("A soma dos números é: " + soma);
        scanner.close();
    }
}
