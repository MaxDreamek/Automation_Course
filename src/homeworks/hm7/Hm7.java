package homeworks.hm7;

import java.util.Arrays;

public class Hm7 {
    public static void main(String[] args) {
        randomMaxNumber();
    }

    public static void randomMaxNumber() {
        int arrayMaxValue = Integer.MIN_VALUE;
        int[] intArray = new int[8];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 101);
        }
        for (int maxNum :
                intArray) {
            if (maxNum > arrayMaxValue) {
                arrayMaxValue = maxNum;
            }
        }
        System.out.println("Максимальное значение " + arrayMaxValue);
    }
}
