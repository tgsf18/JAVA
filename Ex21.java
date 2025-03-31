import java.util.Scanner;

public class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idadePesoCount = 0, ruivasNaoAzuis = 0, olhosAzuisCount = 0;
        double somaIdadeBaixaAltura = 0;
        int pessoasBaixaAltura = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();
            System.out.print("Digite a altura (m): ");
            double altura = scanner.nextDouble();
            System.out.print("Digite a cor dos olhos (A, P, V, C): ");
            char olhos = scanner.next().toUpperCase().charAt(0);
            System.out.print("Digite a cor dos cabelos (P, C, L, R): ");
            char cabelo = scanner.next().toUpperCase().charAt(0);

            if (idade > 50 && peso < 60) {
                idadePesoCount++;
            }
            if (altura < 1.50) {
                somaIdadeBaixaAltura += idade;
                pessoasBaixaAltura++;
            }
            if (olhos == 'A') {
                olhosAzuisCount++;
            }
            if (cabelo == 'R' && olhos != 'A') {
                ruivasNaoAzuis++;
            }
        }

        System.out.println("Pessoas com idade > 50 anos e peso < 60kg: " + idadePesoCount);
        if (pessoasBaixaAltura > 0) {
            System.out.println("Média das idades das pessoas com altura < 1.50: " + (somaIdadeBaixaAltura / pessoasBaixaAltura));
        } else {
            System.out.println("Nenhuma pessoa com altura < 1.50.");
        }
        System.out.println("Porcentagem de pessoas com olhos azuis: " + (olhosAzuisCount / 20.0) * 100 + "%");
        System.out.println("Pessoas ruivas sem olhos azuis: " + ruivasNaoAzuis);
        scanner.close();
    }
}
