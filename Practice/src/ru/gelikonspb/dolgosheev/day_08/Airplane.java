package ru.gelikonspb.dolgosheev.day_08;

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

    public int fillUp(int count) {
        fuel += count;
        return fuel;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + producer + ".\nГод выпуска: " + year + ".\nДлина: " + length + ".\nВес: " + weight + ".\nКоличество топлива в баке: " + fuel + ".";
    }
}
