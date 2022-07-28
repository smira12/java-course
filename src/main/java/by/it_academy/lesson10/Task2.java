package by.it_academy.lesson10;

import java.util.List;

public class Task2 {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17);
        System.out.println(average(numbers));
        printlnRange(numbers, 5, 15);
    }

    private static double average(List<Integer> numbers) {
        double sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    private static void printlnRange(List<Integer> numbers, int lowerLimit, int upperLimit) {
        for (Integer number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }
}
