import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Lesson01 {

    public static void main(String[] args) throws InterruptedException {
//        List<Integer> list = new ArrayList<>();
//
//        List<Integer> list2 = Collections.synchronizedList(list);
//
//        new Thread(() -> {
//            list2.add(1);
//            list2.add(2);
//            list2.add(3);
//            list2.add(4);
//        }).start();
//
//        new Thread(() -> {
//            for (int e : list2) {
//                System.out.println(e);
//            }
//        }).start();

        BlockingQueue<String> names = new ArrayBlockingQueue<>(5);

        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                try {
                    names.put("Name " + i);
                    System.out.println("PUT " + i);
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 30; i++) {
                try {
                    System.out.println("TAKE " + names.take());
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }).start();
    }
}
