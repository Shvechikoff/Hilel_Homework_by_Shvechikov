package ItHilel.HW19;

import java.util.Scanner;

import static ItHilel.HW19.Drinks.*;

public class Controller {

    Scanner scanner = new Scanner(System.in);

    public void makerDrinks() {

        boolean isRunning = true;
        int counter = 0;
        int item = 0;
        int totalPrice = 0;

        while (isRunning) {
            counter++;

            System.out.println("Choose your drink: ");

            String drinksFromConsole = scanner.nextLine();
            DrinksMachine drinksMachine = DrinksMachine.valueOf(drinksFromConsole.toUpperCase());

            switch (drinksMachine) {
                case TEA:
                    System.out.println("You choose Tea! Pls wait, it`s making..." + "\n" + "It cost: " + PRICE_OF_TEA + "$.");
                    totalPrice += PRICE_OF_TEA;
                    item++;
                    break;
                case COFFEE:
                    System.out.println("You choose Coffee! Pls wait, it`s making..." + "\n" + "It cost: " + PRICE_OF_COFFEE + "$.");
                    totalPrice += PRICE_OF_COFFEE;
                    item++;
                    break;
                case LEMONADE:
                    System.out.println("You choose Lemonade! Pls wait, it`s making..." + "\n" + "It cost: " + PRICE_OF_LEMONADE + "$.");
                    totalPrice += PRICE_OF_LEMONADE;
                    item++;
                    break;
                case MOJITO:
                    System.out.println("You choose Mojito! Pls wait, it`s making..." + "\n" + "It cost: " + PRICE_OF_MOJITO + "$.");
                    totalPrice += PRICE_OF_MOJITO;
                    item++;
                    break;
                case MINERAL_WATER:
                    System.out.println("You choose Mineral water! Pls wait, it`s making..." + "\n" + "It cost: " + PRICE_OF_MINERAL_WATER + "$.");
                    totalPrice += PRICE_OF_MINERAL_WATER;
                    item++;
                    break;
                case COCA_COLA:
                    System.out.println("You choose Coca cola! Pls wait, it`s making..." + "\n" + "It cost: " + PRICE_OF_COCA_COLA + "$.");
                    totalPrice += PRICE_OF_COCA_COLA;
                    item++;
                    break;
            }
            if (counter == 3) {
                isRunning = false;
            }

        }
        System.out.print("You chose: " + item + " drinks." + "\n"
                + "Total check: " + totalPrice + "$. Waiting for your money :)");
    }
}