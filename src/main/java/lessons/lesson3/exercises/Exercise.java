package lessons.lesson3.exercises;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа");
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Введите ваше Имя ");
        String name = scanner.next();
        int result = number2 + number;
        System.out.printf(name + " " + result);
    }
}
