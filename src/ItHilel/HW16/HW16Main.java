package ItHilel.HW16;

public class HW16Main {
    public static void main(String[] args) {
        Service service = new Service();

        Person person1 = new Person("Misha", 1963, "Misha@gmail.com", "3805235323456"
                , "Shevchenko", 90, 65, 18_000);
        service.printAccountInfo(person1);

        Person person2 = new Person("Dima", 1948, "dima@gmail.com", "380523539585"
                , "Smith", 90, 65, 10000);
        service.printAccountInfo(person2);

        Person person3 = new Person("Vlad", 1985, "Vlad@gmail.com", "38352353432"
                , "Vasilyev", 100, 120, 20000);
        service.printAccountInfo(person3);

        Person person4 = new Person("Kolya", 1988, "Kolya@gmail.com", "38052353213"
                , "Kage", 90, 65, 5000);
        service.printAccountInfo(person4);

        Person person5 = new Person("Oleg", 1965, "Oleg@gmail.com", "38052234243"
                , "Jonson", 90, 65, 7000);
        service.printAccountInfo(person5);

        person1.setlName("Ivzenko");
        person1.setCountOfSteps(30_000);

        person2.setlName("Shvechikov");
        person2.setCountOfSteps(28_000);

        person3.setlName("Gonchar");
        person3.setCountOfSteps(17_000);

        person4.setlName("Tatochko");
        person4.setCountOfSteps(19_000);

        person5.setlName("Kuplinov");
        person5.setCountOfSteps(41_000);

        System.out.println("Updated info: ");
        service.printAccountInfo(person1);
        service.printAccountInfo(person2);
        service.printAccountInfo(person3);
        service.printAccountInfo(person4);
        service.printAccountInfo(person5);

    }
}

