package by.it_academy.lesson12;

public class Games {
    private final String raw;

    public Games(String raw) {
        this.raw = raw;
    }

    boolean hasTeam(String team) {
        return firstTeam().equals(team) || secondTeam().equals(team);
    }

    String winner() {
        if (firstTeamScore() > secondTeamScore()) {
            return firstTeam();
        }
        return secondTeam();
    }

    private String[] parts() {
        return raw.split(",");
    }

    private String firstTeam() {
        return parts()[0];
    }

    private String secondTeam() {
        return parts()[1];
    }

    private int firstTeamScore() {
        return Integer.parseInt(parts()[2]);
    }

    private int secondTeamScore() {
        return Integer.parseInt(parts()[3]);
    }
}
