package lessons.lesson12.breakExample;

public class BreakExample {
    public static void main(String[] args) {
        breakForInnerLoop();
    }

    public static void breakForInnerLoop() {
        outer:
        for (int i = 1; i < 4; i++) {
            System.out.println("Я первый цикл и выполняюсь " + i + " раз");
            for (int j = 1; j < 6; j++) {
                System.out.println("Я второй внутренний цикл и выполняюсь " + j + " раз");
                if (j == 2) {
                    break outer;
                }
            }
        }
    }

    public static void breakForWhile() {
        int a = 3;
        int i = 1;
        while (i <= 5) {
            System.out.println("Цикл выполняется " + i + " раз");
            if (i == a) {
                break;
            }
            i++;
        }
    }
}
