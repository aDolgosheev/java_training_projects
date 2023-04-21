package ru.gelikonspb.dolgosheev.day_12;

import java.util.ArrayList;

public class Task01 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("BMW");
        array.add("Mercedes");
        array.add("Audi");
        array.add("Opel");
        array.add("KIA");

        System.out.println(array.toString());

        array.add(3, "Toyota");

        System.out.println(array.toString());

        array.remove(2);

        System.out.println(array.toString());
    }
}
