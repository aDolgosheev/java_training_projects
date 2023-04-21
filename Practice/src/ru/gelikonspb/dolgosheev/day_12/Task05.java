package ru.gelikonspb.dolgosheev.day_12;

import ru.gelikonspb.dolgosheev.day_12.task_05.MusicBand;
import ru.gelikonspb.dolgosheev.day_12.task_05.MusicArtist;

import java.util.ArrayList;
import java.util.List;

public class Task05 {

    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Ваня Иванов", 21));
        members1.add(new MusicArtist("Коля Сидоров", 23));
        members1.add(new MusicArtist("Петя Петров", 18));

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("Дима Метелкин", 32));

        MusicBand musicBand1 = new MusicBand(2012, "Конча на джинсах", members1);
        MusicBand musicBand2 = new MusicBand(2015, "Спермотоксикоз", members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();

        musicBand2.printMembers();
    }
}
