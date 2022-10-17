package ItHilel.HW18;

public class HW18Main {
    public static void main(String[] args) {

        MusicStyles[] bands = new MusicStyles[3];
        bands[0] = new ClassicMusic();
        bands[1] = new PopMusic();
        bands[2] = new RockMusic();

        for (MusicStyles u : bands) {
            u.playMusic();
        }
    }
}