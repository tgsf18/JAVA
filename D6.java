import java.util.Scanner;

public class D6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Entre com o valor de A: ");
        double A = input.nextDouble();
        System.out.print("Entre com o valor de B: ");
        double B = input.nextDouble();
        System.out.print("Entre com o valor de C: ");
        double C = input.nextDouble();
        
        if (A == 0) {
            System.out.println("Este não é um equação do segundo grau.");
            return;
        }
        
        double delta = Math.pow(B, 2) - 4 * A * C;
        System.out.println("\nValor de delta: " + delta);
        
        if (delta < 0) {
            System.out.println("Não existem raízes reais para esta equação.");
        } else {
            double x1 = (-B + Math.sqrt(delta)) / (2 * A);
            double x2 = (-B - Math.sqrt(delta)) / (2 * A);
            
            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }
    }
}
