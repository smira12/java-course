package by.it_academy.lesson6;

public class Whistle {
    private String sound;

    public Whistle(String whistleSound) {
        sound = whistleSound;
    }

    public static void main(String[] args) {
        Whistle whistle = new Whistle("music");
        whistle.sound();
    }

    void sound() {
        System.out.println(sound);
    }
}