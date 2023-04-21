package ru.gelikonspb.dolgosheev.day_06;

import java.util.Random;

public class Teacher {
    private String name;
    private String article;
    private String gradeStr;

    public Teacher(String name, String article) {
        this.name = name;
        this.article = article;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int grade = random.nextInt(2, 5);
        switch (grade) {
            case 2:
                gradeStr = "Неудовлетворительно";
                break;
            case 3:
                gradeStr = "Удовлетворительно";
                break;
            case 4:
                gradeStr = "Хорошо";
                break;
            case 5:
                gradeStr = "Отлично";
                break;
        }
        System.out.printf("Преподаватель %s оценил студента с именем %s по предмету %s на оценку %s.", name, student.getName(), article, gradeStr);
    }
}
