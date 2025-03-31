import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soma1a10 = 0, soma11a20 = 0, soma21a30 = 0, somaAcimaDe31 = 0;
        int count1a10 = 0, count11a20 = 0, count21a30 = 0, countAcimaDe31 = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o peso (kg): ");
            double peso = scanner.nextDouble();

            if (idade >= 1 && idade <= 10) {
                soma1a10 += peso;
                count1a10++;
            } else if (idade >= 11 && idade <= 20) {
                soma11a20 += peso;
                count11a20++;
            } else if (idade >= 21 && idade <= 30) {
                soma21a30 += peso;
                count21a30++;
            } else if (idade > 31) {
                somaAcimaDe31 += peso;
                countAcimaDe31++;
            }
        }

        if (count1a10 > 0) {
            System.out.println("Média dos pesos (1 a 10 anos): " + (soma1a10 / count1a10));
        }
        if (count11a20 > 0) {
            System.out.println("Média dos pesos (11 a 20 anos): " + (soma11a20 / count11a20));
        }
        if (count21a30 > 0) {
            System.out.println("Média dos pesos (21 a 30 anos): " + (soma21a30 / count21a30));
        }
        if (countAcimaDe31 > 0) {
            System.out.println("Média dos pesos (acima de 31 anos): " + (somaAcimaDe31 / countAcimaDe31));
        }
        scanner.close();
    }
}
