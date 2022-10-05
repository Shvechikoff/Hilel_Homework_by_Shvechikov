package ItHilel.HW15;

public class DoubleMeat extends Burger {

    String secondMeat;

    public DoubleMeat(String bun, String meat, String secondMeat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.secondMeat = secondMeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
    }

    @Override
    public String toString() {
        return "Склад дабл бургеру: " + bun + ", " + meat + ", " + secondMeat + ", " + cheese + ", " + greens + ", " + mayo + ".";
    }
}
