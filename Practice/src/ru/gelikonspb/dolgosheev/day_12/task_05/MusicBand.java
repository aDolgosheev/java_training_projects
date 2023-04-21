package ru.gelikonspb.dolgosheev.day_12.task_05;

import java.util.List;

public class MusicBand {
    private int year;
    private String name;
    private List<MusicArtist> members;

    public MusicBand(int year, String name, List<MusicArtist> members) {
        this.year = year;
        this.name = name;
        this.members = members;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    public void printMembers() {
        System.out.println(members);
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        musicBand2.getMembers().addAll(musicBand1.getMembers());
        musicBand1.getMembers().clear();
    }
}
