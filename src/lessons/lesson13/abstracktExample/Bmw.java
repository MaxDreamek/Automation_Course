package lessons.lesson13.abstracktExample;

public class Bmw extends Car {
    public Bmw(String typeFuel) {
        super(typeFuel);
    }

    public Bmw() {
        super("Petrol");
    }

    @Override
    String maxSpeed() {
        return "200";
    }

    @Override
    void drive() {
        System.out.println("Bmw drive");
    }

    @Override
    void brake() {
        System.out.println("Bmw brake");
    }

}
