package by.it_academy.lesson7;

public class FlipLine {
    public static void main(String[] args) {
        String str = "some string";
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr.append(str.charAt(i));
        }
        System.out.println(newStr);
    }
}