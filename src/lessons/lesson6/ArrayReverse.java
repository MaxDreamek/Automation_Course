package lessons.lesson6;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        arrRev();
    }

    public static void arrRev() {
        String[] arr = {"Каждый", "Охотник", "хочет", "знать", "где", "сидит", "фазан"};
        int arrLen = arr.length;

        String temp;
        //length / 2
        // a - i - 1

        for (int i = 0; i < arrLen / 2; i++) {
            temp = arr[arrLen - i - 1];
            arr[i] = arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }

    }
}
