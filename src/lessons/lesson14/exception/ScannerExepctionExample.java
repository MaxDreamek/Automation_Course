package lessons.lesson14.exception;

import java.util.Scanner;

public class ScannerExepctionExample {
    public static void main(String[] args) {
        example3();
    }

    public static void example() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {
            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Недопустимый элемент массива");
        } catch (ArithmeticException a){
            System.out.println("На ноль делить нельзя");
        }
        System.out.println("Программа продолжает свою работу");
    }


    public static void example2() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {
            System.out.println(arr[in] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Что то пошло не так");
        }
        System.out.println("Программа продолжает свою работу");
    }

    public static void example3() {
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        int[] arr = {3, 6, 9};

        try {
            System.out.println(arr[in] / 0);
        } catch (Exception e) {
            System.out.println("Что то пошло не так");
        }
        System.out.println("Программа продолжает свою работу");
    }
}
