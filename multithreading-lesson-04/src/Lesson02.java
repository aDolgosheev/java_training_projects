import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class Lesson02 {

    public static void main(String[] args) {
        Set<String> set = ConcurrentHashMap.newKeySet();
        set.add("Hello");
        set.add("World");
        System.out.println(set.contains("Hello"));
        System.out.println(set.contains("Vanya"));
    }
}
