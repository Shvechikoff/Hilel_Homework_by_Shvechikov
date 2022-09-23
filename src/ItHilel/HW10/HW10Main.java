package ItHilel.HW10;

public class HW10Main {

    public static void main(String[] args) {

        int firstNum = 4;
        int secondNum = 9;
        int counter = 0;

        boolean isRunning = true;

        for (int i = 1; i < 1000 && isRunning; i++) {

            if (i == firstNum) {
                firstNum += 10;
                continue;
            }
            if (i == secondNum) {
                secondNum += 10;
                continue;
            }
            if (i > 39 && i < 50) {
                continue;
            }
            if (i > 89 && i < 99 || i > 139 && i < 149) {
                continue;
            }
            counter++;
            if (counter >= 100) {
                isRunning = false;
            }
            System.out.println(counter + " Shuttle № " + i);
        }
    }
}
