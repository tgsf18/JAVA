import java.util.ArrayList;
import java.util.Scanner;
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        for (int i = 0; i < 10; i++) palavras.add(sc.nextLine());
        palavras.removeIf(p -> p.length() < 4);
        System.out.println(palavras);
    }
}
