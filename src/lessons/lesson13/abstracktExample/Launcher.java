package lessons.lesson13.abstracktExample;

public class Launcher {
    public static void main(String[] args) {
        Toyota toyota = new Toyota("Diesel");
        aboutCar(toyota);
        Car bmw = new Bmw();
        aboutCar(bmw);
        Car nissan = new Nissan("Diesel");
        aboutCar(nissan);
    }

    static void aboutCar(Car car) {
        System.out.println("Max speed of auto " + car.maxSpeed());
        car.drive();
        car.brake();
    }
}
