package by.it_academy.lesson4_5;

public class ArrayTask3 {
    public static void main(String[] args) {
        int myArray[] = new int[]{5, 1, 3, 4, 2};
        int sum = 0;
        for (int i = 0; i < myArray.length; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}