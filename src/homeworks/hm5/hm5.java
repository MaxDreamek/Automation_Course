package homeworks.hm5;

public class hm5 {
    public static void main(String[] args) {
        System.out.println(smallerNumber(66, 0));
        printSmallerNumber(-5, 2);
        printStars();
    }

    public static int smallerNumber(int a, int b) {
        if (a > b) {
            return b;
        } else {
            return a;
        }
    }

    public static void printSmallerNumber(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println(secondNumber);
        } else {
            System.out.println(firstNumber);
        }
    }

    public static void printStars() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
