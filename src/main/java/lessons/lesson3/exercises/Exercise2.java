package lessons.lesson3.exercises;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввведите число 1");
        int number = scanner.nextInt();
        if (number == 1) {
            System.out.println("Вы ввели число 1");
        } else {
            System.out.println("Вы ввели число не равное 1");
        }
    }
}
