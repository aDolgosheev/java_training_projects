package lesson_02_atomics;

public class Main {

    public static int counter = 0;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            counter++;
        }).start();

        new Thread(() -> {
            counter++;
        }).start();

        System.out.println(counter);
    }
}
