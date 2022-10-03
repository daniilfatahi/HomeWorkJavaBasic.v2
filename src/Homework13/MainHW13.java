package Homework13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainHW13 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter M and N size: ");
        int m = s.nextInt();
        int n = s.nextInt();
        int[][] arrMatrix = new int[m][n];
        int[][] transposedMatrix = new int[m][n];
        Random r = new Random();
        System.out.println("Original matrix is: ");
        for (int i = 0; i < arrMatrix.length; i++) {
            for (int j = 0; j < arrMatrix.length; j++) {
                arrMatrix[i][j] = r.nextInt(9);
                System.out.print(arrMatrix[i][j]);
            }
            System.out.println();
        }
        System.out.println("Transposed matrix is: ");
        for (int i = 0; i < transposedMatrix.length; i++){
            for (int j = 0; j < transposedMatrix.length; j++){

                transposedMatrix[i][j] = arrMatrix[j][i];
                System.out.print(transposedMatrix[i][j]);
            }
            System.out.println();
        }


    }
}
