package ItHilel.HW17;

public class Androids implements Smartphones, LinuxOS {

    @Override
    public void getInfoAboutOS() {
        System.out.println("U use LinuxOS!");
    }

    @Override
    public void call() {
        System.out.println("Calling...");
    }

    @Override
    public void sms() {
        System.out.println("Texting...");
    }

    @Override
    public void internet() {
        System.out.println("Browsing..");
    }
}