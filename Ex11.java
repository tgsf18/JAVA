import java.util.ArrayList;
import java.util.List;

public class Ex11 {
    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        lista.add(15);
        lista.add(23);
        lista.add(8);

        for (int i = 1; i <= 10; i++) {
            lista.add(i);
        }

        if (lista.size() > 4) {
            lista.remove(4);
        }

        System.out.println("Lista final:");
        for (int num : lista) {
            System.out.print(num + " ");
        }
    }
}
