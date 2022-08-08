package by.it_academy.lesson17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class userDate {
    public static void main(String[] args) throws IOException {
        List<String> dateFormats = List.of("yyyy-MM-dd", "dd MM yyyy", "yyyyMMdd", "dd/MM/yyyy");
        String date = getDateFormat();
        for (String format : dateFormats) {
            LocalDate localDate = format(DateTimeFormatter.ofPattern(format), date);
            if (localDate != null) {
                System.out.println(localDate);
            }
        }
    }

    private static String getDateFormat() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a date: ");
        return reader.readLine();
    }

    private static LocalDate format(DateTimeFormatter dateTF, String dateStr) {
        try {
            return LocalDate.parse(dateStr, dateTF);
        } catch (DateTimeException e) {
            return null;
        }
    }
}