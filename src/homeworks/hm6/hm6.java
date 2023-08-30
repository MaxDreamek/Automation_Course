package homeworks.hm6;

public class hm6 {
    public static void main(String[] args) {
        printHerringbone();
        printLessons();
    }

    public static void printHerringbone() {
        String printStar = "*";
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < 6; j++) {
                if (j == i) {
                    System.out.print(printStar);
                    printStar = printStar.concat(" " + "*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void printLessons() {
        for (int i = 1; i < 4; i++) {
            if (i != 3) {
                System.out.println("Это " + i + "-й урок!\n" +
                        "            Я выполнил все домашние задания " + i + "-го урока.");
            } else {
                System.out.println("Это 3-й урок!\n" +
                        "             Я не выполнил домашние задания 3-го урока.");
            }

        }
    }
}