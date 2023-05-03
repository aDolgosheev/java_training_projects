import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        int[][] teams = {
                { 45, 31, 24, 22, 20, 17, 14, 13, 12, 10 },
                { 31, 18, 15, 12, 10, 8, 6, 4, 2, 1 },
                { 51, 30, 10, 9, 8, 7, 6, 5, 2, 1 }
        };

        int[] nationalTeam = mergeAll(teams);
        System.out.println(Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }

    /** Метод для слияния всех команд в одну национальную */
    public static int[] mergeAll(int[][] teams) {
        // Ваш код
        int[] teamFinal = teams[0];
        if (teams.length == 1) {
            return teamFinal;
        }
        for (int i = 1; i < teams.length; i++) {
            teamFinal = merge(teamFinal, teams[i]);
        }
        return teamFinal;
    }

    /** Метод для слияния двух команд в одну */
    public static int[] merge(int[] teamA, int[] teamB) {
        // Ваш код
        int counterTeamA = 0;
        int counterTeamB = 0;
        int counterTeamC = 0;
        int[] teamC= new int[teamA.length];
        while (counterTeamC < teamC.length) {
            if (teamA[counterTeamA] >= teamB[counterTeamB]) {
                teamC[counterTeamC] = teamA[counterTeamA];
                counterTeamA++;
            } else {
                teamC[counterTeamC] = teamB[counterTeamB];
                counterTeamB++;
            }
            counterTeamC++;
        }
        return teamC;
    }
}