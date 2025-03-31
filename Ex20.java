import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entre0e100 = 0, entre101e200 = 0, acimaDe200 = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite um número: ");
            int numero = scanner.nextInt();
            if (numero >= 0 && numero <= 100) {
                entre0e100++;
            } else if (numero >= 101 && numero <= 200) {
                entre101e200++;
            } else if (numero > 200) {
                acimaDe200++;
            }
        }
        System.out.println("Entre 0 e 100: " + entre0e100);
        System.out.println("Entre 101 e 200: " + entre101e200);
        System.out.println("Acima de 200: " + acimaDe200);
        scanner.close();
    }
}
