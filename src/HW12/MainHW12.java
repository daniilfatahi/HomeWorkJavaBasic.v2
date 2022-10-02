package HW12;
import java.util.Arrays;
import java.util.Random;
public class MainHW12 {
        public static void main(String[] args) {
            int[] arrLoto = new int[7];
            int[] arrUser = new int[7];
            Random r = new Random();
            int countMatch = 0;

            for (int i = 0; i < arrLoto.length; i++) {
                arrLoto[i] = r.nextInt(9 - 1) + 1;
            }
            Arrays.sort(arrLoto);
            System.out.println(Arrays.toString(arrLoto));
            for (int i = 0; i < arrUser.length; i++) {
                arrUser[i] = r.nextInt(9 - 1) + 1;
            }
            Arrays.sort(arrUser);
            System.out.println(Arrays.toString(arrUser));
            for (int i = 0; i < arrLoto.length; i++) {
                if (arrLoto[i] == arrUser[i]) {
                    countMatch++;
                }
            }
            System.out.println(countMatch);

        }
        }

