package ru.gelikonspb.dolgosheev.day_04;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.length);

        int counter8 = 0;
        for (int j : array) {
            if (j > 8) {
                counter8++;
            }
        }
        System.out.println("Чисел больше 8: " + counter8);

        int counter1 = 0;
        for (int j : array) {
            if (j == 1) {
                counter1++;
            }
        }
        System.out.println("Чисел равных 1: " + counter1);

        int counterOdd = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                counterOdd++;
            }
        }
        System.out.println("Четных чисел: " + counterOdd);
        System.out.println("Нечетных чисел: " + (array.length - counterOdd));
        System.out.println(Arrays.stream(array).sum());
    }
}
