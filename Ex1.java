import java.util.ArrayList;
public class Ex1 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 1; i <= 10; i++) lista.add(i);
        for (int num : lista) System.out.println(num * 2);
    }
}
