package homeworks.hm11;

import java.util.Scanner;

public class ExerciseAdmin {
    public static void main(String[] args) {
        authorization();
    }

    public static void authorization() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Кто там?");
        String enteredValue = scanner.nextLine();
        if (enteredValue.equals("Админ")) {
            System.out.println("Пароль?");
            enteredValue = scanner.nextLine();
            if (enteredValue.equals("Я Главный")) {
                System.out.println("Здравствуйте");
            } else if (enteredValue.isEmpty()) {
                System.out.println("Отменено");
            } else {
                System.out.println("Неверный пароль");
            }
        } else if (enteredValue.isEmpty()) {
            System.out.println("Отменено");
        } else {
            System.out.println("Я вас не знаю");
        }
    }
}

