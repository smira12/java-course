package by.it_academy.lesson4_5;

public class ArrayTask2 {
    public static void main(String[] args) {
        int[] myArray = new int[]{7, 5, 8, 3, 1};
        for (int i : myArray) {

            for (int a = 0; a < i; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
