package by.it_academy.lesson7;

public class Task1 {
    public static void main(String[] args) {
        String[] array = new String[]{"sebastian,2017", "lucas,2015"};
        int s = 0;
        int year = 0;
        String maxName = null;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            String[] arrayOfPeople = array[i].split(",");
            s += Integer.parseInt(arrayOfPeople[1]);
            if (arrayOfPeople[0].length()>max) {
                max = arrayOfPeople[0].length();
                maxName = arrayOfPeople[0];
            }
        }
        year = s / array.length;
        System.out.println(year);
        System.out.println(maxName);
    }
}