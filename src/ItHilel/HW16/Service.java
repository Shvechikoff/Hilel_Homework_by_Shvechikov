package ItHilel.HW16;

public class Service {
    int age;
    private static final int AGE_ROUNDER = 2020;
    public void printAccountInfo(Person person) {
        age = AGE_ROUNDER - person.getDateOfBirth();
        System.out.println(person + " age = " + age);
    }
}
