package ru.gelikonspb.dolgosheev.day_07;

public class Task02 {

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        Player player4 = new Player();
        Player player5 = new Player();
        Player.info();
        Player player6 = new Player();
        Player.info();
        Player player7 = new Player();
        Player.info();
        Player player8 = new Player();
        Player.info();

        while (player1.getStamina() >= 0) {
            player1.run();
        }
        Player.info();
    }
}
