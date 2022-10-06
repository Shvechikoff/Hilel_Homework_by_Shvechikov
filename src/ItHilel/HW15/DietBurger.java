package ItHilel.HW15;

public class DietBurger extends Burger {

    public DietBurger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
    }

    @Override
    public String toString() {
        return "Склад дієтичного бургеру: " + bun + ", " + meat + ", " + cheese + ", " + greens + ".";
    }
}