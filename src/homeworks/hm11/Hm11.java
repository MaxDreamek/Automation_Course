package homeworks.hm11;

import java.util.Scanner;

public class Hm11 {
    public static void main(String[] args) {
        int firstValue = getInt();
        int secondValue = getInt();
        char operation = getOperation();
        int result = calc(firstValue, secondValue, operation);
        System.out.println(result);
    }

    private static int calc(int firstInteger, int secondInteger, char enteredChar) {
        int result = 0;
        if (enteredChar == '/' && secondInteger == 0) {
            System.out.println("На ноль делить нельзя!!!");
        } else if (enteredChar == '?') {
            System.out.println("Вы ввели некорректную математическую операцию!");
        } else {
            switch (enteredChar) {
                case '*' -> result = firstInteger * secondInteger;
                case '-' -> result = firstInteger - secondInteger;
                case '/' -> result = firstInteger / secondInteger;
                case '+' -> result = firstInteger + secondInteger;
            }
        }
        return result;
    }

    private static char getOperation() {
        System.out.println("Введите желаемую математическую операцию");
        String str = new Scanner(System.in).nextLine();
        return switch (str) {
            case "+" -> '+';
            case "-" -> '-';
            case "/" -> '/';
            case "*" -> '*';
            default -> '?';
        };
    }

    private static int getInt() {
        System.out.println("Введите любое целое число");
        Scanner scanner = new Scanner(System.in);
        int enteredNumber = 0;
        if (scanner.hasNextInt()) {
            enteredNumber = scanner.nextInt();
        }
        return enteredNumber;
    }
}
