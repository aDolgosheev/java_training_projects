package ru.gelikonspb.dolgosheev.day_03;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {
            String city = scanner.nextLine();
            if (city.equals("Stop")) {
                break;
            }
            switch (city) {
                case ("Москва"), ("Владивосток"), ("Ростов") -> System.out.println("Россия");
                case ("Рим"), ("Милан"), ("Турин") -> System.out.println("Италия");
                case ("Ливерпуль"), ("Манчестер"), ("Лондон") -> System.out.println("Англия");
                case ("Берлин"), ("Мюнхен"), ("Кёльн") -> System.out.println("Германия");
                default -> System.out.println("Неизвестная страна");
            }
        }
    }
}
