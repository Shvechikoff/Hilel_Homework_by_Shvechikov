package ItHilel.HW15;

public class BurgerMain {
    public static void main(String[] args) {
        Burger classicBurger = new ClassicBurger("булочка с кунжутом", "котлета з яловичини", "сир чеддер", "листи салату", "майонез");
        Burger dietBurger = new DietBurger("булочка с кунжутом", "котлета з яловичини", "сир чеддер", "листи салату");
        Burger doubleMeat = new DoubleMeat("булочка с кунжутом", "котлета з яловичини", "додаткова котлета", "сир чеддер", "листи салату", "майонез");
        Burger[] arr = {classicBurger, dietBurger, doubleMeat};
        for (Burger menu : arr) {
            System.out.println(menu);
        }
    }
}
