package by.it_academy.lesson12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter number:");
        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            try{
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("error");
            }
        }
        System.out.println("File name:");
        String fileName = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            for (Integer number : numbers) {
                int cube = number * number * number;
                String cubeString = cube + "";
                writer.write(cubeString);
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
