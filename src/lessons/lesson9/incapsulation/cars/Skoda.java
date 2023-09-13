package lessons.lesson9.incapsulation.cars;

import lessons.lesson9.incapsulation.owners.SkodaOwner;

public class Skoda extends SkodaOwner {
    private String fuel = "diesel";
    private String model = "octavia";

    private void aboutCar() {
        System.out.println("It's Skoda");
        showModel();
    }
    private void showModel() {
        System.out.println("Owner model " + model);
    }
    public void showAllInfo() {
        System.out.println("Fuel of Skoda " + fuel);
        aboutCar();
    }

    public String getModel() {
        return model;
    }
}
