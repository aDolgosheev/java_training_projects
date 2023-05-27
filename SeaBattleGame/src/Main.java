
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final int SIZE = 10;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Player 1. Enter your name: ");
        String player01Name = scanner.nextLine();
        System.out.print("Player 2. Enter your name: ");
        String player02Name = scanner.nextLine();

        char[][] player01Field = fieldCreate();
        char[][] player02Field = fieldCreate();

//        Arrays.stream(player01Field).map(Arrays::toString).forEach(System.out::println);
        shipsPlacement(player01Name, player02Name, player01Field);
        shipsPlacement(player02Name, player01Name, player02Field);

    }

    private static char[][] fieldCreate() {
        char[][] field = new char[SIZE][SIZE];
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = '⬜';
            }
        }
        return field;
    }

    private static void shipsPlacement(String player, String enemy, char[][] field) {
        System.out.printf("%s, place your ships on the field. %s, look away!", player, enemy);
    }
}
