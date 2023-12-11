package lesson30.streamApi.workingWithObject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Launcher {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Tesla", 2020));
        carList.add(new Car("BMW", 2010));
        carList.add(new Car("Toyota", 2018));
        carList.add(new Car("Opel", 2000));
        carList.add(new Car("Vaz", 1989));
        carList.add(new Car("Nissan", 2005));
        carList.add(new Car("Seat", 2021));

        Stream<Car> carStream = carList.stream()
                .filter(x -> x.getYear() > 2012)
                .filter(x -> !x.getModel().equalsIgnoreCase("BMW"));
//                .filter(x -> !"BMW".equalsIgnoreCase(x.getModel()));
        carStream.forEach(x -> System.out.println(x.getModel()));
    }
}
