import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Petya");
        set.add("Olya");
        set.add("Petya");
        System.out.println(set.size());
    }
}
