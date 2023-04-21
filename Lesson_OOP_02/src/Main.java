public class Main {
    public static void main(String[] args) {
        String name = "Petya";

        Car car = new Car();
        Billable billable = new Car();
        billable.pay(100);
        spbToMoscow(name, car);
        billed(car, 500);

        Ship ship = new Ship();
        spbToMoscow(name, ship);
        billed(ship, 1000);

        Plane plane = new Plane();
        spbToMoscow(name, plane);
        billed(plane, 10000);

        Bicycle bicycle = new Bicycle();
        spbToMoscow(name, bicycle);
    }

    public static void spbToMoscow(String name, Transferer transferer) {
        transferer.transfer(name, "SBP", "MSC");
    }

    public static void billed(Billable billable, int amount) {
        billable.pay(amount);
    }
}
