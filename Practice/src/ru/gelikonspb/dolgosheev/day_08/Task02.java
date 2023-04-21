package ru.gelikonspb.dolgosheev.day_08;

public class Task02 {

    public static void main(String[] args) {
        Airplane airplane = new Airplane("Airbus", 1999, 33, 20);
        airplane.fillUp(100);
        System.out.println(airplane);
    }
}
