package ItHilel.HW14;

public class HW14Main {
    public static void main(String[] args) {
        Person person = new Person();

        String will = person.personInfo("Will", "Smith", "New York", "2936729462846");

        String jackie = person.personInfo("Jackie", "Chan", "Shanghai", "12312412412");

        String sherlock = person.personInfo("Sherlock", "Holmes", "London", "37742123513");

        System.out.println("a. " + will + "\n" +
                "b. " + jackie + "\n" +
                "c. " + sherlock);
    }
}
