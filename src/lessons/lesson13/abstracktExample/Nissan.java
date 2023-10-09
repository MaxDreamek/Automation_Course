package lessons.lesson13.abstracktExample;

public class Nissan extends Car {
    @Override
    String maxSpeed() {
        return "160";
    }

    public Nissan() {
        super("Petrol");
    }

    public Nissan(String typeFuel) {
        super(typeFuel);
    }

    @Override
    void drive() {
        System.out.println("Nissan drive");
    }

    @Override
    void brake() {
        System.out.println("Nissan brake");
    }

}
