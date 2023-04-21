package ru.gelikonspb.dolgosheev.day_12.task_03;

public class MusicBand {
    private int year;
    private String name;

    public MusicBand(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
