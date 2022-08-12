package by.it_academy.lesson12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Game {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name:");
        String team = scanner.nextLine();
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/by/it_academy/lesson12/data.csv"))) {
            List<Games> gamesList = reader.lines()
                    .map(Games::new)
                    .collect(Collectors.toList());
            int wins = 0;
            int lose = 0;
            for (int index = 0; index < gamesList.size(); index++) {
                Games games = gamesList.get(index);
                if (games.hasTeam(team)) {
                    if (games.winner().equals(team)) {
                        wins++;
                    } else {
                        lose++;
                    }
                }
            }
            System.out.println("wins" + wins);
            System.out.println("lose" + lose);
        }
    }
}