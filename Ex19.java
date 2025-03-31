import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade da pessoa: ");
            int idade = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer
            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
        System.out.println("A pessoa mais nova é: " + nomeMaisNovo);
        scanner.close();
    }
}
