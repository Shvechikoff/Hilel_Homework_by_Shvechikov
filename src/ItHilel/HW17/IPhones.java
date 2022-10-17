package ItHilel.HW17;

public class IPhones implements Smartphones, IOS {

    @Override
    public void getInfoAboutOS() {
        System.out.println("U use IOS");
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
        System.out.println("Browsing...");
    }
}