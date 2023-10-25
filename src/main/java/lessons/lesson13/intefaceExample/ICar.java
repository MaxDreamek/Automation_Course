package lessons.lesson13.intefaceExample;

public interface ICar extends IParts, IOther {
    final static String TYPE_OF_FUEL = "Diesel";

    String maxSpeed();

    void drive();

    void brake();

    default void getFuel(String typeFuel) {
        System.out.println(typeFuel);
    }

    private void utilMethod() {
        // method only for Interface use
    }
}
