package homeworks.hw3;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите одно из чисел: 1, 2, 3");
        int enteredNumber = scanner.nextInt();
        if (enteredNumber == 1) {
            System.out.println("Вы ввели число 1");
        } else if (enteredNumber == 2) {
            System.out.println("Вы ввели число 2");
        } else if (enteredNumber == 3) {
            System.out.println("Вы ввели число 3");
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
