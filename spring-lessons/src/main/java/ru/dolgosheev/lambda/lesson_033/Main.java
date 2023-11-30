package ru.dolgosheev.lambda.lesson_033;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Runner {
    public void run(Executable executable) {
        int a = executable.execute();
        System.out.println(a);
    }
}

interface Executable {
    int execute();
}

public class Main {

    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run(new Executable() {
            @Override
            public int execute() {
                System.out.println("Hello");
                return 1;
            }
        });

        runner.run(() -> 5);

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Goodbye");
        list.add("a");
        list.add("ab");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() > o2.length()) {
//                    return 1;
//                } else if (o1.length() < o2.length()) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });

//        list.sort((o1, o2) -> {
//            if (o1.length() > o2.length()) return 1;
//            else if (o1.length() < o2.length()) return -1;
//            else return 0;
//        });

        list.sort(Comparator.comparingInt(String::length));
        System.out.println(list);
    }
}


