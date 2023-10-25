package homeworks.hm4;

public class Hw4 {
    public static void main(String[] args) {

    }

    public static void square() {
        int firstNumber = 1;
        while (firstNumber < 513) {
            System.out.print(firstNumber + " ");
            firstNumber *= 2;
        }
    }

    public static void multiplication() {
        int multiplicand = 3;
        for (int i = 1; i < 11; i++) {
            int result = multiplicand * i;
            System.out.println(multiplicand + " * " + i + " = " + result);
        }
    }
}
