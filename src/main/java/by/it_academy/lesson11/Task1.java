package by.it_academy.lesson11;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("1209");
        string.add("2022");
        string.add("heat");
        for (int i = 0; i < string.size(); i++) {
            try {
                int number = Integer.parseInt(string.get(i));
                System.out.println(number);
            } catch (NumberFormatException e) {
                System.out.println(string.get(i) + "-is not a number");
            }
        }
    }
}
