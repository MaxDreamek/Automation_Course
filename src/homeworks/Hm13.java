package homeworks;

public class Hm13 {
    public static void main(String[] args) {
        happyNumber();
    }

    public static void happyNumber() {
        for (int i = 0; i < 11; i++) {
            if (i == 3) {
                System.out.println("Вот счастливое число!");
                break;
            }
        }
    }
}
