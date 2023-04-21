package ru.gelikonspb.dolgosheev.day_12;

import ru.gelikonspb.dolgosheev.day_12.task_03.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task03 {

    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();

        bands.add(new MusicBand(1989, "A"));
        bands.add(new MusicBand(1976, "B"));
        bands.add(new MusicBand(2020, "C"));
        bands.add(new MusicBand(2001, "D"));
        bands.add(new MusicBand(2000, "E"));
        bands.add(new MusicBand(1965, "F"));
        bands.add(new MusicBand(1978, "G"));
        bands.add(new MusicBand(2012, "H"));
        bands.add(new MusicBand(2015, "I"));
        bands.add(new MusicBand(2018, "J"));

        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> groupsAfter2000 = new ArrayList<>();
        for (MusicBand band : bands) {
            if (band.getYear() >= 2000) {
                groupsAfter2000.add(band);
            }
        }
        return groupsAfter2000;
    }
}
