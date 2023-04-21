package ru.gelikonspb.dolgosheev.day_09;

public class Task01 {

    public static void main(String[] args) {
        Student student = new Student("Вася", "Технолог");
        Teacher teacher = new Teacher("МарьИвановна", "физика");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
