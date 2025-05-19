/************
2) Faça um programa que leia uma matriz 3x4 de inteiros,
substitua seus elementos negativos por 0 e imprima a matriz 
original e a modificada.
*********/
public class Matriz3x4 {
    public static void main(String[] args) {
        int [][] matriz = new int [3][4];
        
        matriz[0][0] = 5;
        matriz[0][1] = 3;
        matriz[0][2] = 2;
        matriz[0][3] = 2;
        
        matriz[1][0] = 4;
        matriz[1][1] = 3;
        matriz[1][2] = 6;
        matriz[1][3] = 2;
        
        matriz[2][0] = 7;
        matriz[2][1] = 8;
        matriz[2][2] = 1;
        matriz[2][3] = 2;
        
       
        System.out.println("MATRIZ 3X4: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
            }
        }
    }