import java.util.Scanner;

public class D4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        int valor = input.nextInt();
        
        if (valor % 5 != 0) {
            System.out.println("Não é possível realizar o saque com as cédulas disponíveis.");
            return;
        }
        
        int[] cedulas = {100, 50, 20, 10, 5};
        int[] quantidade = new int[cedulas.length];
        int restante = valor;
        
        for (int i = 0; i < cedulas.length; i++) {
            quantidade[i] = restante / cedulas[i];
            restante %= cedulas[i];
        }
        
        if (restante == 0) {
            System.out.println("\nSaque de R$" + valor + ":");
            for (int i = 0; i < cedulas.length; i++){
                if (quantidade[i] > 0) {
                    System.out.println(quantidade[i] + " cédula(s) de R$" + cedulas[i]);
                }
            }
        } else {
            System.out.println("Não é possível realizar o saque com as cédulas disponíveis.");
        }
    }
}
