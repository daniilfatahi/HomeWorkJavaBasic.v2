package Homework9;

import java.util.Random;
import java.util.Scanner;

public class Homework9 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean correct = false;
        while (!correct) {

            System.out.println("Enter number from 0 to 10");

            int guess = scanner.nextInt();
            int randomAnswer = r.nextInt(10);
            if (guess != randomAnswer) {

                System.out.println("Try again");

            } else {
                System.out.println("You have won!");
                correct = true;
            }

        }
        System.exit(0);

    }
}
