package ru.gelikonspb.dolgosheev.day_11;

public class Task01 {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        Picker picker = new Picker(warehouse);
        Courier courier = new Courier(warehouse);

        for (int i = 0; i < 1500; i++) {
            picker.doWork();
            courier.doWork();
        }

        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);

        picker.bonus();
        courier.bonus();

        System.out.println(warehouse);
        System.out.println(picker);
        System.out.println(courier);
    }
}
