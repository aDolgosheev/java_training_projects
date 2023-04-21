import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Petya");
        queue.offer("Olya");
        queue.offer("Tanya");

        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s);
        }
//
//        Deque<String> q = new ArrayDeque<>();
//        q.offerFirst("Petya");
//        System.out.println(q.pollFirst());

//        Deque<String> s = new ArrayDeque<>();
//        s.push("Petya");
//        s.push("Olya");
//        s.push("Tanya");
//
//        while (!s.isEmpty()) {
//            System.out.println(s.pop());
//        }
    }
}
