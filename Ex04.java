import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        System.out.println("inorme o intervalo de tempo :");
        n = ler.nextInt();

        for(int i=0; i<= n ; i++){
            if(i % 2!=0){
                System.out.println("Número " +i);




            }
        }
    }
}