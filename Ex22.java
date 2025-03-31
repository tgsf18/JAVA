import java.util.Scanner;

public class Ex22{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int somaIdadeHomens = 0, somaIdadeMulheres = 0, totalHomens = 0, totalMulheres = 0;

        for (int i = 0; i < 7; i++) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Di gite o sexo (M/F): ");
            char sexo = scanner.next().toUpperCase().charAt(0);

            if (sexo == 'M') {
                somaIdadeHomens += idade;
                totalHomens++;
            } else if (sexo == 'F') {
                somaIdadeMulheres += idade;
                totalMulheres++;
            }
        }

        int somaTotal = somaIdadeHomens + somaIdadeMulheres;
        System.out.println("Idade média do grupo: " + (somaTotal / 7.0));
        if (totalMulheres > 0) {
            System.out.println("Idade média das mulheres: " + (somaIdadeMulheres / (double) totalMulheres));
        }
        if (totalHomens > 0) {
            System.out.println("Idade média dos homens: " + (somaIdadeHomens / (double) totalHomens));
        }
        scanner.close();
    }
}
