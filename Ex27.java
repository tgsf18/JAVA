import java.util.Scanner;

public class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[5];
        int i = 0;

        while (i < 5) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.next();
            i++;
        }

        System.out.println("Nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
      
    }
}
