package lessons.lesson17.sorting.comparator;

import java.util.TreeSet;

public class Launcher {
    public static void main(String[] args) {
        ComparatorByYear comparatorByYear = new ComparatorByYear();
        TreeSet<Car> carTreeSet = new TreeSet<>(comparatorByYear);
        carTreeSet.add(new lessons.lesson17.sorting.comparator.Car("BMW", 2020));
        carTreeSet.add(new lessons.lesson17.sorting.comparator.Car("Mercedes", 2016));
        carTreeSet.add(new lessons.lesson17.sorting.comparator.Car("Opel", 2010));
        carTreeSet.add(new lessons.lesson17.sorting.comparator.Car("Volvo", 2005));

        for (Car car : carTreeSet) {
            System.out.println(car);
        }


    }
}
