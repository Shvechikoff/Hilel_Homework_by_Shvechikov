package ItHilel.HW12;

import java.util.Random;

public class HW12Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numberByFirm = new int[7];
        int[] numberByPeople = new int[7];
        int n1 = numberByFirm.length;
        int n2 = numberByPeople.length;
        int temp;
        int counter = 0;

        System.out.print("Lucky numbers from lottery: ");
        for (int i = 0; i < n1; i++) {
            numberByFirm[i] = random.nextInt(0, 9);
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 1; j < (n1 - i); j++) {
                if (numberByFirm[j - 1] > numberByFirm[j]) {
                    temp = numberByFirm[j - 1];
                    numberByFirm[j - 1] = numberByFirm[j];
                    numberByFirm[j] = temp;
                }
            }
        }
        for (int a : numberByFirm) {
            System.out.print(a + " ");
        }
        System.out.print("\n" + "Numbers by Peoples: ");
        for (int i = 0; i < n2; i++) {
            numberByPeople[i] = random.nextInt(0, 9);
        }
        for (int i = 0; i < n2; i++) {
            for (int j = 1; j < (n2 - i); j++) {
                if (numberByPeople[j - 1] > numberByPeople[j]) {
                    temp = numberByPeople[j - 1];
                    numberByPeople[j - 1] = numberByPeople[j];
                    numberByPeople[j] = temp;
                }
            }
        }
        for (int b : numberByPeople) {
            System.out.print(b + " ");
        }
        for (int i = 0; i < numberByFirm.length; i++) {
            if (numberByFirm[i] == numberByPeople[i]) {
                counter++;
            }
        }
        System.out.print("\n" + " Matches: " + counter);

    }
}