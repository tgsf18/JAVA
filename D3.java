import java.util.Scanner;

public class D3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int countNotas = 0;
        int countExcelente = 0, countBom = 0, countRegular = 0, countInsuficiente = 0;
        double somaNotas = 0.0;
        
        while (true) {
            System.out.print("Digite uma nota entre 0 e 10 (-1 para sair): ");
            double nota = input.nextDouble();
            
            if (nota == -1) {
                break; 
            }
            
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Informe um valor entre 0 e 10.");
                continue;
            }
            
            somaNotas += nota;
            countNotas++;
            
            if (nota >= 9) {
                countExcelente++;
                System.out.println("Classificação: Excelente");
            } else if (nota >= 7) {
                countBom++;
                System.out.println("Classificação: Bom");
            } else if (nota >= 5) {
                countRegular++;
                System.out.println("Classificação: Regular");
            } else {
                countInsuficiente++;
                System.out.println("Classificação: Insuficiente");
            }
        }
        
        System.out.println("RESULTADO FINAL:");
        if (countNotas > 0) {
            double media = somaNotas / countNotas;
            System.out.printf("Média geral: %.2f\n", media);
        } else {
            System.out.println("Nenhuma nota foi cadastrada.");
        }
        System.out.println("Contagem de classificações:");
        System.out.println("Excelente: " + countExcelente);
        System.out.println("Bom: " + countBom);
        System.out.println("Regular: " + countRegular);
        System.out.println("Insuficiente: " + countInsuficiente);
    }
}
