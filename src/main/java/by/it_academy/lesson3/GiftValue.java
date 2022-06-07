package by.it_academy.lesson3;

public class GiftValue {
    public static void main(String[] args) {
        int giftValue = 6000;
        int minTax = 100;
        int raisingMinValue = 8;
        int minValue = 5000;
        int maxValue = 25000;
        if (giftValue <= minValue) {
            System.out.println(minTax);
        } else if (giftValue > minValue || giftValue < maxValue) {
            System.out.println(minTax + (giftValue - minValue) / 100 * raisingMinValue);
        }
    }
}
