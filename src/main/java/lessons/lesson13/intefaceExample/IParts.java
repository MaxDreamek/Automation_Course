package lessons.lesson13.intefaceExample;

public interface IParts {
    int choosePart(int number);

    default double partsPrice(int number) {
        return 33.33 * number * Math.random() * 0.5;
    }
}
