package lessons.lesson6;


public class ArrayReverse {
    public static void main(String[] args) {
        arrRev();
    }

    public static void arrRev() {
        String[] arr = {"Каждый", "Охотник", "хочет", "знать", "где", "сидит", "фазан"};

        String temp;
        //length / 2
        // arr.length - i - 1

        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i];
            arr[i] = temp;
        }
        for (String s : arr) {
            System.out.print(s + " ");
        }

    }
}
