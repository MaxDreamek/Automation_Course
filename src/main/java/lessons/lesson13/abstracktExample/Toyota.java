package lessons.lesson13.abstracktExample;

public class Toyota extends Car {
    @Override
    String maxSpeed() {
        return "180";
    }

    @Override
    void drive() {
        System.out.println("Toyota drive");
    }

    @Override
    void brake() {
        System.out.println("Toyota brake");
    }

    public Toyota(String typeFuel) {
        super(typeFuel);
    }
}
