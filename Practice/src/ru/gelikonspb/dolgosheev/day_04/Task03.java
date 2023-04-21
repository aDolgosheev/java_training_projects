package ru.gelikonspb.dolgosheev.day_04;

import java.util.Random;

public class Task03 {

    public static void main(String[] args) {
        Random random = new Random();

        int[][] array = new int[12][8];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }

        int maxSum = 0;
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                index = i;
            }
        }
        System.out.println("Номер строки с максимальной суммой всех элементов: " + index);
    }
}
