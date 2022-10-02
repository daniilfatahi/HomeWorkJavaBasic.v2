package Homework10;

public class Homework10 {
    public static void main(String[] args) {
        int counter = 0;
        int i = 0;

        while (counter < 101) {

            String shuttlenumber = Integer.toString(i);
            i++;
            if (shuttlenumber.contains("4") || shuttlenumber.contains("9")) {
                continue;
            }
            counter++;

            System.out.println(counter + " : " + shuttlenumber);
        }

    }
}
