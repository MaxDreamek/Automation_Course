package lessons.lesson6;

import java.util.Scanner;

public class PractiseWorldsCount {
    public static void main(String[] args) {
        worldCount();
    }

    public static void worldCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();

        int count = 0;

        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        System.out.println("Количество слов в строке " + count);
    }
}
