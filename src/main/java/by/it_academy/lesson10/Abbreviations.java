package by.it_academy.lesson10;

import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private final Map<String, String> map = new HashMap<>();

    public static void main(String[] args) {
        Abbreviations abbreviations = new Abbreviations();
        abbreviations.addAbbreviation("hru", "how are you");
        abbreviations.addAbbreviation("btw", "by the way");
        abbreviations.addAbbreviation("imho", "in my humble opinion");
        abbreviations.addAbbreviation("brb", "be right back");

        System.out.println("abbreviation = " + abbreviations.hasAbbreviation("imho"));
        System.out.println("abbreviation = " + abbreviations.hasAbbreviation("np"));
        System.out.println("explanation = " + abbreviations.findExplanationFor("hru"));
        abbreviations.printAbbreviations();
        System.out.println();
        abbreviations.printAbbreviationsWhere("b");
        System.out.println();
        abbreviations.printExplanationOfAbbreviationsWhere("r");
    }

    void addAbbreviation(String abbreviation, String explanation) {
        map.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        return map.containsKey(abbreviation);
    }

    String findExplanationFor(String abbreviation) {
        return map.get(abbreviation);
    }

    void printAbbreviations() {
        for (String abbreviation : map.keySet()) {
            System.out.println(abbreviation);
        }
    }

    void printAbbreviationsWhere(String text) {
        for (String abbreviation : map.keySet()) {
            if (abbreviation.contains(text)) {
                System.out.println(abbreviation);
            }
        }
    }

    void printExplanationOfAbbreviationsWhere(String text) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey().contains(text)) {
                System.out.println(entry.getValue());
            }
        }
    }
}
