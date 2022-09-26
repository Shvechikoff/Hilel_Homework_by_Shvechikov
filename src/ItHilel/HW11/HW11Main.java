package ItHilel.HW11;

import java.util.Random;

public class HW11Main {
    public static void main(String[] args) {
        Random random = new Random();
        int sumA = 0;
        int sumB = 0;
        int counterA = 0;
        int counterB = 0;
        int averageA = 0;
        int averageB = 0;
        int[] teamA = new int[25];
        int[] teamB = new int[25];

        System.out.print("Age of players from teamA: ");
        for (int i = 0; i < teamA.length; i++) {
            sumA += teamA[i] = random.nextInt(18, 40);
            System.out.print(teamA[i] + " ");
            counterA = counterA + 1;
            averageA = sumA / counterA;
        }
        System.out.print("\n" + "Average age of players from TeamA: " + averageA);

        System.out.println(); // line skip

        System.out.print("Age of players from teamB: ");
        for (int i = 0; i < teamB.length; i++) {
            sumB += teamB[i] = random.nextInt(18, 40);
            System.out.print(teamB[i] + " ");
            counterB = counterB + 1;
            averageB = sumB / counterB;
        }
        System.out.print("\n" + "Average age of players from TeamB: " + averageB);
    }
}