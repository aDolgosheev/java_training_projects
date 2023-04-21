package ru.gelikonspb.dolgosheev.day_03;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();

            System.out.println(b == 0 ? "Деление на ноль" : a / b);
            i++;
        }
    }
}
