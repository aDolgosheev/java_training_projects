package ru.gelikonspb.dolgosheev.day_02;

import java.util.Scanner;

public class Task01 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stages = Integer.parseInt(scanner.nextLine());

        if (stages >= 1 && stages <=4) {
            System.out.println("Малоэтажный дом");
        } else if (stages >= 5 && stages <=8) {
            System.out.println("Среднеэтажный дом");
        } else if (stages >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
        scanner.close();
    }
}
