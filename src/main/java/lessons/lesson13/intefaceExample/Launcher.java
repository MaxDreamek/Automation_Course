package lessons.lesson13.intefaceExample;

public class Launcher {
    public static void main(String[] args) {
        ICar bmw = new Bmw();
        aboutCar(bmw);
        bmw.getFuel(ICar.TYPE_OF_FUEL);
        bmw.partsPrice(23);
        bmw.otherMethodMethod();
    }

    static void aboutCar(ICar car) {
        System.out.println("Max speed of auto " + car.maxSpeed());
        car.drive();
        car.brake();
    }
}
