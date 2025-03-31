import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, maiores = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            soma += idade;
            if (idade >= 18) {
                maiores++;
            }
        }
        System.out.println("Soma das idades: " + soma);
        System.out.println("Média das idades: " + (soma / 20.0));
        System.out.println("Quantidade de maiores de idade: " + maiores);
        scanner.close();
    }
}
