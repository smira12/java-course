package by.it_academy.lesson17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int year = Integer.parseInt(line);
        LocalDate localDate = LocalDate.of(year, 1, 1);
        while (!localDate.equals(LocalDate.now())) {
            if (localDate.getDayOfWeek() == DayOfWeek.FRIDAY && localDate.getDayOfMonth() == 13) {
                System.out.println(localDate);
            }
            localDate = localDate.plusDays(1);
        }
    }
}