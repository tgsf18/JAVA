import java.util.Scanner;

public class D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int voto;
        int votosCandidato1 = 0, votosCandidato2 = 0, votosCandidato3 = 0;

        System.out.println("=== Sistema de Votação ===");
        System.out.println("Digite o número do candidato (1, 2 ou 3) ou 0 para encerrar:");

        while (true) {
            System.out.print("Voto: ");
            voto = sc.nextInt();

            if (voto == 0) {
                break;
            }

            if (voto == 1) {
                votosCandidato1++;
            } else if (voto == 2) {
                votosCandidato2++;
            } else if (voto == 3) {
                votosCandidato3++;
            } else {
                System.out.println("Voto inválido. Tente novamente.");
            }
        }

        System.out.println("\n--- Resultado Final ---");
        System.out.println("Lula: " + votosCandidato1);
        System.out.println("Felipe Neto : " + votosCandidato2);
        System.out.println("Manga : " + votosCandidato3);

       
        int max = Math.max(votosCandidato1, Math.max(votosCandidato2, votosCandidato3));
        int countMax = 0;
        if (votosCandidato1 == max) countMax++;
        if (votosCandidato2 == max) countMax++;
        if (votosCandidato3 == max) countMax++;

        if (countMax > 1) {
            System.out.println("Houve um empate entre os candidatos que receberam " + max + " votos.");
        } else {
            if (votosCandidato1 == max) {
                System.out.println("O Lula  venceu com " + max + " votos.");
            } else if (votosCandidato2 == max) {
                System.out.println("Felipe com " + max + " votos.");
            } else {
                System.out.println("O Manga com " + max + " votos.");
            }
        }
        
    }
}
