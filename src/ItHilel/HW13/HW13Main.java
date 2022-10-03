package ItHilel.HW13;

import java.util.Scanner;

public class HW13Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Print value for columns: ");
        int M = scanner.nextInt(); // M - value of columns

        System.out.println("Print value for strings: ");
        int N = scanner.nextInt(); // N - value of strings

        int[][] firstArr = new int[N][M];
        int[][] secondArr = new int[M][N];

        System.out.println("Original matrix:");
        for (int i = 0; i < firstArr.length; i++) {
            for (int j = 0; j < firstArr[i].length; j++) {
                System.out.print(firstArr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < secondArr[i].length; j++) {
                secondArr[i][j] = firstArr[j][i];
            }
        }
        System.out.println("\n" + "New matrix:");
        for (int i = 0; i < secondArr.length; i++) {
            for (int j = 0; j < secondArr[i].length; j++) {
                System.out.print(secondArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}