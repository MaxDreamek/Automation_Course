package lessons.lesson17.sorting.comparable;

public class Car implements Comparable<Car> {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

//    @Override
//    public int compareTo(Car newCar) {
//        return Integer.compare(this.year, newCar.year);
//    }
//    public int compareTo(Car newCar) {
//        if(this.year == newCar.year) {
//            return 0;
//        } else if (this.year < newCar.year) {
//            return -1;
//        } else {
//            return 1;
//        }
//    }


    @Override
    public int compareTo(Car newCar) {
       return this.model.compareTo(newCar.model);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
