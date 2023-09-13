package lessons.lesson9.incapsulation.cars;



public class Opel  {
    private String fuel = "petrol";
    private String model = "corsa";

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    private void showModel() {
        System.out.println("Owner model " + this.model);
    }
    public void showAllInfo() {
        System.out.println("Fuel of Skoda " + fuel);
        showModel();
    }

    public String getModel() {
        return model;
    }
}
