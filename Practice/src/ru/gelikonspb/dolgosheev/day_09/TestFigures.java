package ru.gelikonspb.dolgosheev.day_09;

public class TestFigures {

    public static void main(String[] args) {
        Figure[] figures = {
                new Triangle(10, 10, 10, "Red"),
                new Triangle(10, 20, 30, "Green"),
                new Triangle(10, 20, 15, "Red"),
                new Rectangle(5, 10, "Red"),
                new Rectangle(40, 15, "Orange"),
                new Circle(4, "Red"),
                new Circle(10, "Red"),
                new Circle(5, "Blue")
        };

        System.out.println(calculateRedArea(figures));
        System.out.println(calculateRedPerimeter(figures));
    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double totalPerimeter = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                totalPerimeter += figure.perimeter();
            }
        }
        return totalPerimeter;
    }

    public static double calculateRedArea(Figure[] figures) {
        double totalArea = 0;
        for (Figure figure : figures) {
            if (figure.getColor().equals("Red")) {
                totalArea += figure.area();
            }
        }
        return totalArea;
    }
}
