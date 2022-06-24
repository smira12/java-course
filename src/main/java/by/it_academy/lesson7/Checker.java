package by.it_academy.lesson7;

public class Checker {
    public static void main(String[] args) {
        Checker checker = new Checker();
        System.out.println(checker.timeOfDay("16:11:00"));
    }

    boolean timeOfDay(String text) {
        return text.matches("^([0-1]\\d|2[0-3]):([0-5]\\d):([0-5]\\d)$");
    }
}
