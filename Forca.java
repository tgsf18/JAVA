import java.util.Scanner;

public class Forca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jogador 1, digite a palavra: ");
        String palavra = sc.nextLine().trim().toUpperCase();
        char[] palavraArray = palavra.toCharArray();
        char[] guessed = new char[palavraArray.length];

        for (int i = 0; i < palavraArray.length; i++) {
            guessed[i] = (Character.isLetter(palavraArray[i])) ? '_' : palavraArray[i];
        }

        int tentativas = 5;
        boolean venceu = false;

        while (tentativas > 0 && !venceu) {
            System.out.println("\nPalavra: " + String.valueOf(guessed));
            desenharPersonagem(tentativas);
            System.out.print("Digite uma letra: ");
            char letra = sc.nextLine().toUpperCase().charAt(0);

            boolean acertou = false;
            for (int i = 0; i < palavraArray.length; i++) {
                if (palavraArray[i] == letra && guessed[i] == '_') {
                    guessed[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativas--;
                System.out.println("Errou! Tentativas restantes: " + tentativas);
            } else {
                System.out.println("Acertou!");
            }

            venceu = new String(guessed).equals(palavra);
        }

        if (venceu) {
            System.out.println("Parabéns! Você adivinhou a palavra: " + palavra);
        } else {
            System.out.println("Game Over! A palavra era: " + palavra);
            desenharPersonagem(0);
        }

        sc.close();
    }

    public static void desenharPersonagem(int tentativas) {
        switch (tentativas) {
            case 5:
                System.out.println("  (ツ)  ");
                break;
            case 4:
                System.out.println("  (ツ)  ");
                System.out.println("   |   ");
                break;
            case 3:
                System.out.println("  (ツ)  ");
                System.out.println("  -|   ");
                break;
            case 2:
                System.out.println("  (ツ)  ");
                System.out.println("  -|-  ");
                break;
            case 1:
                System.out.println("  (ツ)  ");
                System.out.println("  -|-  ");
                System.out.println("  /    ");
                break;
            case 0:
                System.out.println("  (x_x)  "); 
                System.out.println("  -|-  ");
                System.out.println("  / \\  ");
                System.out.println("Game Over...");
                break;
        }
    }
}
