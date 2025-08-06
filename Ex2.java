import java.util.ArrayList;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        for (int i = 0; i < 5; i++) nomes.add(sc.nextLine());
        for (int i = nomes.size() - 1; i >= 0; i--) System.out.println(nomes.get(i));
    }
}
