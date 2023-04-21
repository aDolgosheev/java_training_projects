package ru.gelikonspb.dolgosheev.day_04;

import java.util.Random;

public class Task02 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        int minNumber = array[0];
        int maxNumber = array[0];
        int count0 = 0;
        int sumCount0 = 0;

        for (int j : array) {
            if (minNumber > j) {
                minNumber = j;
            }

            if (maxNumber < j) {
                maxNumber = j;
            }

            if (j % 10 == 0) {
                count0++;
                sumCount0 += j;
            }
        }

        System.out.println("Наибольшее число массива: " + maxNumber);
        System.out.println("Наименьшее число массива: " + minNumber);
        System.out.println("Число элементов массива, оканчивающихся на 0: " + count0);
        System.out.println("Сумма всех элементов массива, оканчивающихся на 0: " + sumCount0);
    }
}
