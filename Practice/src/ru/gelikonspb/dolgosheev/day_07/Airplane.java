package ru.gelikonspb.dolgosheev.day_07;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getFuel() {
        return fuel;
    }

    public void info() {
        System.out.printf("Изготовитель: %s.%nГод выпуска: %d.%nДлина: %d.%nВес: %d.%nКоличество топлива в баке: %d.%n", producer, year, length, weight, fuel);
    }

    public void fillUp(int count) {
        fuel += count;
    }

    public static void compareAirplanes(Airplane airplane1, Airplane airplane2) {
        if (airplane1.length > airplane2.length) {
            System.out.println("Первый самолет длиннее.");
        } else if (airplane1.length < airplane2.length) {
            System.out.println("Второй самолет длиннее.");
        } else {
            System.out.println("Самолеты равны по длине.");
        }
    }
}
