import java.util.Scanner;
import java.util.Random;

public class D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int maxNumber = 10;

        System.out.println("=== Jogo de Adivinhação ===");
        System.out.println("Escolha a dificuldade:");
        System.out.println("1 - Fácil (de 1 a 10)");
        System.out.println("2 - Médio (de 1 a 50)");
        System.out.println("3 - Difícil (de 1 a 100)");
        int dificuldade = sc.nextInt();

        switch (dificuldade) {
            case 1:
                maxNumber = 10;
                break;
            case 2:
                maxNumber = 50;
                break;
            case 3:
                maxNumber = 100;
                break;
            default:
                System.out.println("Dificuldade inválida. Será considerada a dificuldade Fácil.");
                maxNumber = 10;
        }
        
       
        int numeroSecreto = rand.nextInt(maxNumber) + 1;
        int tentativas = 5;
        boolean acertou = false;
        
        System.out.println("Você tem " + tentativas + " tentativas para adivinhar o número.");
        
        for (int i = 1; i <= tentativas; i++) {
            System.out.print("Tentativa " + i + ": ");
            int palpite = sc.nextInt();
            
            if (palpite == numeroSecreto) {
                System.out.println("Parabéns! Você acertou.");
                acertou = true;
                break;
            } else if (palpite < numeroSecreto) {
                System.out.println("Tente um número maior.");
            } else {
                System.out.println("Tente um número menor.");
            }
        }
        if (!acertou) {
            System.out.println("Você perdeu. O número era " + numeroSecreto + ".");
        }
       
    }
}
