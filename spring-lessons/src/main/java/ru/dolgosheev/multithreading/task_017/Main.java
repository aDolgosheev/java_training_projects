package ru.dolgosheev.multithreading.task_017;

public class Main {
    public static void main(String[] args) {
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        MyThread myThread2 = new MyThread();
//        myThread2.start();

        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from Runner " + i);
        }
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from MyThread " + i);
        }
    }
}