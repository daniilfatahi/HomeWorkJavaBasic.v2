package Homework11;

import java.util.Random;

public class Homework11 {
    public static void main(String[] args) {

        int team1[] = new int[25];
        int team2[] = new int[25];
        int sum1 = 0;
        int sum2 = 0;

        Random r = new Random();
        for (int i = 0; i < team1.length; i++) {
            team1[i] = r.nextInt(22) + 18;
            sum1 += team1[i];
        }
        for (int i = 0; i < team2.length; i++) {
            team2[i] = r.nextInt(22) + 18;
            sum2 += team2[i];
        }
        int team1avg = sum1 / 25;
        int team2avg = sum2 / 25;

        System.out.println("Team 1 average age is: " + team1avg + " and Team 2 average age is: " + team2avg);

    }
}
