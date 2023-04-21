import java.util.Random;
import java.util.Scanner;

public class Main {
    public static final int SIZE = 8;

    public static void main(String[] args) {
        Random random = new Random();
        int[][] colors = new int[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        System.out.println("Дана следующая матрица:");
        printMatrix(colors);

        int[][] rotatedColors = new int[SIZE][SIZE];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите угол, на который хотите повернуть матрицу:");
        String angle = scanner.nextLine();
        createTurnedMatrix(colors, rotatedColors, angle);
        System.out.println();

        if (angle.equals("90") || angle.equals("180") || angle.equals("270")) {
            System.out.println("Матрица, повернутая на " + angle + " градусов:");
            printMatrix(rotatedColors);
        } else {
            System.out.println("Матрица не создана");
        }
    }

    public static void printMatrix(int[][] colors) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", colors[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void createTurnedMatrix(int[][] colors, int[][] rotatedColors, String angle) {
        switch (angle) {
            case "90":
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - j][i];
                    }
                }
                break;
            case "180":
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[SIZE - 1 - i][SIZE - 1 - j];
                    }
                }
                break;
            case "270":
                for (int i = 0; i < SIZE; i++) {
                    for (int j = 0; j < SIZE; j++) {
                        rotatedColors[i][j] = colors[j][SIZE - 1 - i];
                    }
                }
                break;
            default:
                System.out.println("Неверный угол поворота");
        }
    }
}
