package lessons.lesson9.override;

public class Main {
    public static void main(String[] args) {
        LittleCat littleCat = new LittleCat();
        littleCat.voice();

        new Dog().aboutDog();
        new Animal().voice();
        new Cat().voice();
    }
}
