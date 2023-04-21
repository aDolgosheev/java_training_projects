package ru.gelikonspb.dolgosheev.day_08;

public class Task01 {

    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//
//        String str = "0";
//        for (int i = 0; i < 200000; i++) {
//            str += " " + (i+1);
//        }
//        System.out.println(str);
//        System.out.println(System.currentTimeMillis() - time);

        long time = System.currentTimeMillis();

        StringBuilder str = new StringBuilder("0");
        for (int i = 0; i < 200000; i++) {
            str.append(" ").append(i + 1);
        }
        System.out.println(str);
        System.out.println(System.currentTimeMillis() - time);
    }
}
