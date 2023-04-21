package ru.gelikonspb.dolgosheev.day_12;

import ru.gelikonspb.dolgosheev.day_12.task_04.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class Task04 {

    public static void main(String[] args) {
        List<String> members1 = new ArrayList<>();
        members1.add("Ваня Иванов");
        members1.add("Коля Сидоров");
        members1.add("Петя Петров");

        List<String> members2 = new ArrayList<>();
        members2.add("Дима Метелкин");

        MusicBand musicBand1 = new MusicBand(2012, "Конча на джинсах", members1);
        MusicBand musicBand2 = new MusicBand(2015, "Спермотоксикоз", members2);

        MusicBand.transferMembers(musicBand1, musicBand2);

        musicBand1.printMembers();

        musicBand2.printMembers();
    }
}
