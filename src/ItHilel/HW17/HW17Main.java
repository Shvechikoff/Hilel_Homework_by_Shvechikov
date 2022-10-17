package ItHilel.HW17;

public class HW17Main {

    public static void main(String[] args) {

        Androids androids = new Androids();
        androids.getInfoAboutOS();
        androids.call();
        androids.sms();
        androids.internet();

        System.out.println();

        IPhones iPhones = new IPhones();
        iPhones.getInfoAboutOS();
        iPhones.call();
        iPhones.sms();
        iPhones.internet();

    }
}