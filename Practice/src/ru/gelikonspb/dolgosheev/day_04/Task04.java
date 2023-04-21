package ru.gelikonspb.dolgosheev.day_04;

import java.util.Arrays;
import java.util.Random;

public class Task04 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int maxSum = 0;
        int index = 0;
        for (int i = 1; i < array.length - 1; i++) {
            int sum = array[i - 1] + array[i] + array[i + 1];
            if (sum > maxSum) {
                maxSum = sum;
                index = i - 1;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(maxSum);
        System.out.println(index);
    }
}
