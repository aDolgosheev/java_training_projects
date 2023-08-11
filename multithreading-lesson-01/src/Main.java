public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyThread myThread = new MyThread();
//        myThread.start();
//        myThread.interrupt();

        Runnable logic = () -> {
            for (int i = 0 ; i < 30; i++) {
                System.out.println("Hello from thread!");
            }
        };
        Thread thread = new Thread(logic);

        thread.start();

        while (true) {
            System.out.println("Hello from main!");
            Thread.sleep(300);
        }
    }
}