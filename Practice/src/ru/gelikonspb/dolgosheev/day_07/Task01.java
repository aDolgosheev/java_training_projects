package ru.gelikonspb.dolgosheev.day_07;

public class Task01 {

    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Airbus", 1999, 33, 20);
        Airplane airplane2 = new Airplane("Boeing", 2002, 35, 26);

        airplane1.fillUp(100);
        airplane2.fillUp(50);
        airplane1.fillUp(120);
        airplane2.fillUp(62);

        System.out.println(airplane1.getFuel());
        System.out.println(airplane2.getFuel());

        Airplane.compareAirplanes(airplane2, airplane1);
    }
}
