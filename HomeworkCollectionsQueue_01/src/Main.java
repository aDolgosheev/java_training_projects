import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");
        Queue<String> queue = new LinkedList<>(firstClients);
        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s + " сделала маникюр");
            if (Math.random() < 0.5) {
                queue.add("a friend of " + s);
            }
        }
    }
}
