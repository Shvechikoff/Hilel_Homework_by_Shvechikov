package ItHilel.HW9;

import java.util.Random;
import java.util.Scanner;

public class HW9Main {
    // в случае победы - останавливает. В случае не правильного ответа - даёт 4 попытки.
    public static void main(String[] args) {

        System.out.println("U have 4 chances. Write your number from 0 to 10: ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(0, 10);
        boolean isRunning = true;
        int counter = 1;

        while (isRunning) {
            int number = scanner.nextInt();
            if (number != randomNumber) {
                System.out.println("This is try № " + counter);
                counter++;
            } else {
                System.out.println("You WIN!");
                isRunning = false;
            }
            if (counter == 5) {
                System.out.println("Sorry, out of chance. Magic number: " + randomNumber );
                isRunning = false;
            }
        }
    }
}

