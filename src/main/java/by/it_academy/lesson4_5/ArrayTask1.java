package by.it_academy.lesson4_5;

import java.util.Arrays;

public class ArrayTask1 {
    public static void main(String[] args) {
        int[] myArray = new int[]{5, 1, 3, 4, 2};
        String result = "";
        for (int i = 0; i < myArray.length; i++) {
            result = result + myArray[i];
            if (i != myArray.length - 1) {
                result += ", ";
            }
        }
                System.out.println(result);
    }
}
