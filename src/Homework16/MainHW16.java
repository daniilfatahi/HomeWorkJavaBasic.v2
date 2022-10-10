package Homework16;

import java.util.Scanner;

public class MainHW16 {
    public static void main(String[] args) {

        System.out.println("Sign up to use our fitness App!");
        Scanner s = new Scanner(System.in);
        Person person1 = new Person("Daniil", 2002, "daniil.fatahi@gmail.com", "0631022953",
                "Fatakhi", 75, 140, 10000);
        person1.outPersonInfo();
        System.out.println("Change ur daily steps: ");
        person1.setSteps(s.nextInt());
        person1.outPersonInfo();

        System.out.println();

        Person person2 = new Person("Yaroslav", 1992, "yahoo@yaro.com", "05021883490",
                "Lysohor", 80, 140, 14568);
        person2.outPersonInfo();
        System.out.println("Change your  weight");
        person2.setWeight(s.nextInt());
        person2.outPersonInfo();

        System.out.println();

        Person person3 = new Person("Yevhen", 2000, "yeart@gmail.com", "0688633480",
                "Artamonov", 65, 135, 16000);
        person3.outPersonInfo();
        System.out.println("Change your pressure: ");
        person3.setPressure(s.nextInt());
        person3.outPersonInfo();


    }
}
