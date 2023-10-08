package homeworks.hm12;

import java.util.Arrays;

public class hm12 {
    public static void main(String[] args) {
        int [] arr = new int[20];
        int[] array = {1, 2, 3, 4 ,5, 8, 10, 1, 2, 34, 54, 64, 1231};
        arr = array;
        System.out.println(Arrays.toString(newArray(arr, 11111111)));

    }
    public static int[] newArray(int [] arr, int num) {
        int[] newArray = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        newArray[newArray.length - 1] = num;
        return newArray;
    }
}
