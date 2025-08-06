import java.util.ArrayList;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> produtos = new ArrayList<>();
        ArrayList<Double> precos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            produtos.add(sc.nextLine());
            precos.add(Double.parseDouble(sc.nextLine()));
        }
        for (int i = 0; i < produtos.size(); i++) {
            if (precos.get(i) > 50) {
                System.out.println(produtos.get(i) + ": R$" + precos.get(i));
            }
        }
    }
}
