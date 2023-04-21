package ru.gelikonspb.dolgosheev.day_12;

import java.util.ArrayList;
import java.util.List;

public class Task02 {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        for (int i = 0; i < 31; i++) {
            if (i % 2 == 0) {
                array.add(i);
            }
        }

        for (int i = 300; i < 351; i++) {
            if (i % 2 == 0) {
                array.add(i);
            }
        }

        System.out.println(array.toString());
    }
}
