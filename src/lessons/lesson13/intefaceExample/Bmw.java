package lessons.lesson13.intefaceExample;

public class Bmw implements ICar, IParts {
    @Override
    public String maxSpeed() {
        return "200";
    }

    @Override
    public void drive() {
        System.out.println("Bmw drive");
    }

    @Override
    public void brake() {
        System.out.println("Bmw brake");
    }

    @Override
    public int choosePart(int number) {
        return 12131;
    }
}
