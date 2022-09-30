package ItHilel.HW10;

import java.util.Random;

public class HW10Main {

    public static void main(String[] args) {
        Random random = new Random();
        int counter = 0;

        boolean isRunning = true;

        while (isRunning) {
            int numberShuttle = random.nextInt(1, 200);
            String verifyNum = Integer.toString(numberShuttle);
            if (!verifyNum.contains("4") && !verifyNum.contains("9")) {
                counter++;
                System.out.println(counter + " Shuttle № " + numberShuttle);
            }
            if (counter == 100) {
                isRunning = false;
            }
        }
    }
}
