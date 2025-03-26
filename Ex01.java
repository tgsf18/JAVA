import java.util.Scanner;
public class Ex01
{
    public static void main(String[] args) {
    //Declarar variáveis
    double a, b, med;
    Scanner ler = new Scanner(System.in);
    
    System.out.println("Informe a nota de sua primeira prova :");
    a = ler.nextDouble ();
    
    System.out.println("Informe a nota de sua segunda prova :");
    b = ler.nextDouble ();
    
    med = (a + b ) /2;
    
    System.out.println(" Sua média é de " + med);
    }
}
    