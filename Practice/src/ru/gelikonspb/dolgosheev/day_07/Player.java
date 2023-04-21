package ru.gelikonspb.dolgosheev.day_07;

import java.util.Random;

public class Player {
    private int stamina;
    private static final int MAX_STAMINA = 100;
    private static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player() {
        Random random = new Random();
        this.stamina = random.nextInt(90, MAX_STAMINA);
        if (countPlayers < 6) {
            countPlayers++;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == MIN_STAMINA) {
            return;
        }
        stamina--;
        if (stamina == MIN_STAMINA) {
            countPlayers--;
            System.out.println("Игрок ушел с поля, ему требуется отдых.");
        }
    }

    public static void info() {
        System.out.println(countPlayers < 6 ? "Команды неполные. На поле еще есть еще " + (6 - countPlayers) + " свободных мест" : "На поле нет свободных мест");
    }
}
