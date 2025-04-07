import java.util.Scanner;

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para ver sua tabuada: ");
        int num = scanner.nextInt();

        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }
        scanner.close();
    }
}
