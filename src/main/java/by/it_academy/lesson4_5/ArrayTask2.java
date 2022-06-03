package by.it_academy.lesson4_5;

public class ArrayTask2 {
    public static void main(String[] args) {
        int[] myArray = new int[]{7, 5, 8, 3, 1};
        for (int i : myArray) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
