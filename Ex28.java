import java.util.Scanner;

public class Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar = "s";

        while (continuar.equalsIgnoreCase("s")) {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();
            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();
            System.out.println("Resultado: " + (num1 + num2));

            System.out.print("Deseja continuar? (s/n): ");
            continuar = scanner.next();
        }
        scanner.close();
    }
}
