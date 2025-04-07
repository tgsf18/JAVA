import java.util.Scanner;

public class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos alunos há na academia? ");
        int qtdAlunos = scanner.nextInt();

        double somaPesos = 0;
        int i = 0;
        while (i < qtdAlunos) {
            System.out.print("Digite o peso do aluno " + (i + 1) + ": ");
            double peso = scanner.nextDouble();
            somaPesos += peso;
            i++;
        }

        System.out.println("Média de peso: " + (somaPesos / qtdAlunos));
        scanner.close();
    }
}
