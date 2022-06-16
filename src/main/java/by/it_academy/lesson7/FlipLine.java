package by.it_academy.lesson7;

public class FlipLine {
    public static void main(String[] args) {
        String str = "some string";
        String[] words = new StringBuilder(str).reverse().toString().split("some string");
        StringBuilder newStr = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--)
            newStr.append(words[i]).append(" ");
        System.out.println(newStr);
    }
}