import java.util.Scanner;

public class Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int N = scanner.nextInt();

        int i = 0;
        while (i <= N) {
            System.out.println(i);
            i++;
        }
        scanner.close();
    }
}
