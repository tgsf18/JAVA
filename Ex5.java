import java.util.ArrayList;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palavras = sc.nextLine().split(" ");
        ArrayList<String> lista = new ArrayList<>();
        for (String p : palavras) lista.add(p);
        long comA = lista.stream().filter(p -> p.toLowerCase().startsWith("a")).count();
        System.out.println("Total de palavras: " + lista.size());
        System.out.println("Começam com A: " + comA);
    }
}
