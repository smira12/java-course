package by.it_academy.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Number {
    public static void main(String[] args) throws IOException {
        List<Integer> sorting = numbers().stream()
                .filter(number -> number > 0)
                .filter(number -> number < 6)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(sorting);
    }

    private static List<Integer> numbers() throws IOException {
        List<Integer> listNumber = new ArrayList<>();
        System.out.println(" End at: - 1");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        while (true) {
            if (line.isEmpty()) {
                System.out.println("End");
                break;
            }
            int integer = Integer.parseInt(line);
            if (integer == -1) {
                System.out.println("End");
                break;
            }
            listNumber.add(integer);
        }
        return listNumber;
    }
}