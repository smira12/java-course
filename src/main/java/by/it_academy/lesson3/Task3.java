package by.it_academy.lesson3;

public class Task3 {
    public static void main(String[] args) {
        String password = "Caput Dragonis";
        String greeting = "Welcome";
        String wrong = "Forbidden";
        if (password.equals("Caput Dragonis")) {
            System.out.println(greeting);
        } else {
            System.out.println(wrong);
        }
    }
}
