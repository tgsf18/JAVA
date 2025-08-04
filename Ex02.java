import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int a, b, c;
        System.out.print("Informe o primeiro número:");
        a = ler.nextInt();
        System.out.print("Informe o segundo número:");
        b = ler.nextInt();
        System.out.print("Informe o terceiro número:");
        c = ler.nextInt();



    int maior = Math.max(a, Math.max(b,c)) ;
        System.out.println("Resultados:");
        System.out.println( +maior+ " é o maior número:");

    }
}