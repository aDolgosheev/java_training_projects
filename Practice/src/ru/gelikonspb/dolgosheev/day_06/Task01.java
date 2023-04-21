package ru.gelikonspb.dolgosheev.day_06;

public class Task01 {

    public static void main(String[] args) {
        Teacher teacher = new Teacher("МарьИвановна", "Математика");
        Student student = new Student("Вовочка");
        teacher.evaluate(student);

    }
}
