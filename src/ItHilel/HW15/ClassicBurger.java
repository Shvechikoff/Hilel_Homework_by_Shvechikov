package ItHilel.HW15;

public class ClassicBurger extends Burger {
    public ClassicBurger(String bun, String meat, String cheese, String greens, String mayo) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayo = mayo;
    }

    @Override
    public String toString() {
        return "Склад класичного бургеру: " + bun + ", " + meat + ", " + cheese + ", " + greens + ", " + mayo + ".";
    }
}
