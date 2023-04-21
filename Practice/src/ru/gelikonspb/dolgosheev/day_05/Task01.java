package ru.gelikonspb.dolgosheev.day_05;

public class Task01 {

    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("Зеленый");
        car.setModel("BMW X5");
        car.setYear(2018);

        System.out.println("Год выпуска: " + car.getYear());
        System.out.println("Модель авто: " + car.getModel());
        System.out.println("Цвет авто: " + car.getColor());

        Motorbike motorbike = new Motorbike(2022, "Черный", "Yamaha");

        System.out.println("Год выпуска: " + motorbike.getYear());
        System.out.println("Модель мото: " + motorbike.getModel());
        System.out.println("Цвет мото: " + motorbike.getColor());
    }
}

class Car {
    private int year;
    private String color;
    private String model;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike(int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
