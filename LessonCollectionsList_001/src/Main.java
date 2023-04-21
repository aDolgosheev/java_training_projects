import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Petya");
        list.add("Olya");
        list.add("Tanya");
        System.out.println(list);
        System.out.println(list.size());
        list.set(0, "Vanya");
        System.out.println(list);
        System.out.println(list.get(1));
        list.add(1, "Kolya");
        System.out.println(list);

        System.out.println(list.contains("Olya"));

        for ( String s : list ) {
            System.out.println(list.indexOf(s) + 1);
        }
    }
}
