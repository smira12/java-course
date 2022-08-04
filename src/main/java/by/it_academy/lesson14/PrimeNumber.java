package by.it_academy.lesson14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class PrimeNumber {
    private static int getLimitUser() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:");
        String limit = reader.readLine();
        return Integer.parseInt(limit);
    }

    private static void primeNumber() throws IOException {
        IntStream.iterate(2, num -> num + 1)
                .limit(getLimitUser())
                .filter(PrimeNumber::isPrime)
                .forEach(System.out::println);
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, number - 1)
                .noneMatch(num -> number % num == 0);
    }

    public static void main(String[] args) throws IOException {
        primeNumber();
    }
}