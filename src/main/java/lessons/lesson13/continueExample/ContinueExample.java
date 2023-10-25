package lessons.lesson13.continueExample;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println("Я выполнился " + i + " раз перед continue");
            if (i > 2) continue;
            System.out.println("    " + i + " Я выполнюсь после continue");
        }
    }
}
