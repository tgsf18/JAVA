/******************************************************************************

Jogo-da-velha é um jogo popular, originado na Inglaterra. O nome “velha” surgiu do fato de esse jogo ser praticado,
à época em que foi criado, por senhoras idosas que tinham dificuldades de visão e não conseguiam mais bordar.
 
Esse jogo consiste na disputa de dois adversários que, em um tabuleiro 3×3, devem conseguir alinhar verticalmente, horizontalmente ou na diagonal, 3 peças de formato idêntico.
 
Cada jogador, após escolher o formato da peça (O, X) com a qual irá jogar, coloca uma peça por vez, em qualquer casa do tabuleiro, e passa a vez para o adversário.
 
Vence o primeiro que alinhar 3 peças.

Desenvolver o jogo da velha seguindo as etapas:
a) Inserir o nome dos dois jogadores sendo: 
      X para o jogador 1;
      O para o jogador2 ;

b) Pedir para o jogador 1 começar o jogo, assim ele deverá inserir as posições dentro da matriz. Ex.
     Digite a posição(linha);
     Digite a posição(coluna);

c) Mostrar se já existe uma posição preenchida e retornar a jogada

d) Verificar e exibir o nome do vencedor

*******************************************************************************/
import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        boolean vezJogadorX = true;
        boolean jogoAtivo = true;

        System.out.println("Insira o nome do Jogador X: ");
        String nomeX = ler.nextLine();
        System.out.println("Insira o nome do Jogador O: ");
        String nomeO = ler.nextLine();

        while (jogoAtivo) {
            exibirTabuleiro(matriz);
            if (vezJogadorX) {
                System.out.println(nomeX + " (X), é a sua vez de jogar!");
            } else {
                System.out.println(nomeO + " (O), é a sua vez de jogar!");
            }
            int linha, coluna;
            while (true) {
                System.out.println("Digite a posição da sua jogada (linha 0-2): ");
                linha = ler.nextInt();
                System.out.println("Digite a posição da sua jogada (coluna 0-2): ");
                coluna = ler.nextInt();

                if (linha < 0 || linha >= 3 || coluna < 0 || coluna >= 3) {
                    System.out.println("Posição inválida! Tente novamente :(");
                } else if (matriz[linha][coluna] != 0) {
                    System.out.println("Posição já preenchida!");
                } else {
                    break;
                }
            }

            matriz[linha][coluna] = vezJogadorX ? 1 : 2;

            if (verificarVencedor(matriz)) {
                exibirTabuleiro(matriz);
                if (vezJogadorX) {
                    System.out.println("Parabéns " + nomeX + "! Você venceu!");
                } else {
                    System.out.println("Parabéns " + nomeO + "! Você venceu!");
                }
                jogoAtivo = false;
            } else if (tabuleiroCheio(matriz)) {
                exibirTabuleiro(matriz);
                System.out.println("O jogo empatou!");
                jogoAtivo = false;
            } else {
                vezJogadorX = !vezJogadorX;
            }
        }
        ler.close(); 
    }

    public static void exibirTabuleiro(int[][] matriz) {
        System.out.println("--------- TABULEIRO ----------");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                char simbolo = ' ';
                if (matriz[i][j] == 1) {
                    simbolo = 'X';
                } else if (matriz[i][j] == 2) {
                    simbolo = 'O';
                }
                System.out.print("[ " + simbolo + " ]");
            }
            System.out.println(".");
        }
        System.out.println("------------------------------");
    }

    public static boolean verificarVencedor(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            if ((matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2] && matriz[i][0] != 0) ||
                (matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i] && matriz[0][i] != 0)) {
                return true;
            }
        }

        if ((matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2] && matriz[0][0] != 0) ||
            (matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0] && matriz[0][2] != 0)) {
            return true;
        }
        return false;
    }

    public static boolean tabuleiroCheio(int[][] matriz) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}





















