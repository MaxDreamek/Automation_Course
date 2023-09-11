package homeworks.hm8;

import java.util.Arrays;

public class Hm8_2 {
    public static void main(String[] args) {
        averageOfArray();
    }

    public static void averageOfArray() {
        double arraySum = 0;
        int[] intArray = new int[10];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * (20 + 1 - 10) + 10);
            arraySum += intArray[i];
        }
        System.out.println("Average of Array is " + arraySum / intArray.length);
    }
}
