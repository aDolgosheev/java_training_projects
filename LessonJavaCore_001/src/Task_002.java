import java.util.*;

public class Task_002 {

    public static void main(String[] args) {
//        List<String> cities = Arrays.asList("Мадрид", "Париж", "Москва", "Токио");
//        Collections.sort(cities, new Comparator<String>() {
//            @Override
//            public int compare(String a, String b) {
//                return b.compareTo(a);
//            }
//        });
//
//        Collections.sort(cities, (a, b) -> b.compareTo(a));

        OnDoneListener listener = (v) -> System.out.println(v);
        TestTask_002 testTask002 = new TestTask_002(listener);
        testTask002.execute();

    }
}

@FunctionalInterface
interface OnDoneListener<T> {
    void onDone(T v);
}
