package lessons.lesson3.scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        System.out.println("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Введите вашу фамилию: ");
        String surname = scanner.nextLine();

        System.out.println("Ваше имя и фамилия " + name +" " + surname);

    }
}
